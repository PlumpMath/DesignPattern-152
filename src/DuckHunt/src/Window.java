package DuckHunt.src;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;


public class Window extends JFrame {

    JFrame frame = null;
    JPanel duckPanel;
    JLabel hunter;
    Random random;

    private ConcurrentLinkedQueue<Duck> ducks;
    int H, W;
    int hunterH = 200, hunterW = 311;

    class Duck extends Thread {
        boolean killed = false;
        JLabel duck;
        int h = 150, w = 127;
        Integer x;
        // = random.nextInt(W - w);
        Integer y = random.nextInt(H - h - 200);
        Integer dx, dy = 1;

        int tempX = 0, tempY = 0;
        boolean direction;
        public Duck(int speed) {
            dx = speed;
            if (random.nextBoolean()){
                dx *= -1;
                duck = new JLabel(new ImageIcon("duck1.gif"));
                direction = true;
                x = W - w-30;
            }
            else {
                direction = false;
                duck = new JLabel(new ImageIcon("duck2.gif"));
                x = 0;
            }
            if (random.nextBoolean()) dy *= -1;
            duck.setLocation(x, y);
            duck.setSize(h, w);
            duck.addMouseListener(new MouseListener() {
                                      @Override
                                      public void mouseClicked(MouseEvent e) {
                                          killed = true;
                                      }

                                      @Override
                                      public void mousePressed(MouseEvent e) {

                                      }

                                      @Override
                                      public void mouseReleased(MouseEvent e) {

                                      }

                                      @Override
                                      public void mouseEntered(MouseEvent e) {

                                      }

                                      @Override
                                      public void mouseExited(MouseEvent e) {

                                      }
                                  }

            );
            duckPanel.add(duck);
        }

        public void kill(){
            killed = true;
        }

        public void run () {
            boolean flag = true;
            while (flag) {
                if (!killed) {
                    tempX = x + dx;
                    tempY = y + dy;

                    if (tempX < 0 || tempX + w >= W-25) {
                        dx *= -1;
                        if(direction) {
                            direction = false;
                            duck.setIcon(new ImageIcon("duck2.gif"));
                            //duckPanel.repaint();
                        }
                        else{
                            direction = true;
                            duck.setIcon(new ImageIcon("duck1.gif"));
                            //duckPanel.repaint();
                        }
                    }

                    if (tempY < 0 || tempY + h >= H - 200) {
                        dy *= -1;
                    }

                    x = tempX;
                    y = tempY;
                    duck.setLocation(x, y);
                    try {
                        sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else{
                    flag = false;
                    duck.setIcon(new ImageIcon("dead.png"));
                    try {
                        this.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    duckPanel.remove(duck);
                    duckPanel.repaint();
                    ducks.remove(this);
                    int s = 1+random.nextInt(3);
                    Duck duck = new Duck(s);
                    ducks.add(duck);
                    duck.start();
                }
            }

        }
    }

    public class Bullet extends Thread{
        JLabel bullet;
        int h = 20, w = 20;
        int x, y;
        Bullet (int x, int  y) {
            this.x = x;
            this.y = y;
            bullet = new JLabel(new ImageIcon("bullet.png"));
            bullet.setLocation(x, y);
            bullet.setSize(h, w);
            duckPanel.add(bullet);
        }
        public void run() {
            int dy = 1;
            while (!interrupted()) {
                for(Duck d : ducks) {
                    synchronized (d) {
                        if (intersect(d.x, d.y, d.x + d.w, d.y + d.h/2, x, y, x+w, y+h)) {
                            duckPanel.remove(bullet);
                            duckPanel.repaint();
                            d.kill();
                            this.interrupt();
                            break;

                        }
                    }
                }
                int tempY = y-dy;
                if(tempY== 0) {
                    duckPanel.remove(bullet);
                    duckPanel.repaint();
                    break;

                }
                y = tempY;
                bullet.setLocation(x, y);
                try {
                    Thread.currentThread().sleep(2);
                } catch (InterruptedException e) {
                    interrupt();
                }

            }

        }

        boolean intersect(int a, int b, int c, int d) {
            if (a > c)
                return intersect(c, d, a, b);
            return c <= b;
        }
        boolean intersect(int x11, int y11, int x12, int y12, int x21, int y21, int x22, int y22) {
            return intersect(x11, x12, x21, x22) && intersect(y11, y12, y21, y22);
        }
    }
    
    public Window()  {
        random = new Random();
        ducks = new ConcurrentLinkedQueue<Duck>();
        frame = new JFrame("Duck hunt");
        W = 1220;
        H = 700;
        frame.setBounds(70, 10, W, H);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new JLabel(new ImageIcon("background.png")));
        frame.setVisible(true);

        duckPanel = new JPanel();

        int x = 610;
        int y = H - hunterH - 20;
        hunter = new JLabel(new ImageIcon("hunter.png"));
        hunter.setLocation(x, y);
        hunter.setSize(hunterH, hunterW);
        duckPanel.add(hunter);
        duckPanel.addKeyListener(new KeyListener() {
                                     @Override
                                     public void keyTyped(KeyEvent e) {
                                     }

                                     @Override
                                     public void keyPressed(KeyEvent e) {
                                         if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                                             System.out.println("shoot");
                                             Bullet b = new Bullet(hunter.getX()+97, hunter.getY()+2);
                                             b.start();
                                         }
                                         if(e.getKeyCode() == KeyEvent.VK_RIGHT){

                                             if(hunter.getX()+5 <= W-hunterW/2){
                                             hunter.setLocation(hunter.getX()+5, hunter.getY());
                                             }
                                         }
                                         if(e.getKeyCode() == KeyEvent.VK_LEFT){

                                             if(hunter.getX()-5 >= -60){
                                                 hunter.setLocation(hunter.getX()-5, hunter.getY());
                                             }
                                         }
                                     }

                                     @Override
                                     public void keyReleased(KeyEvent e) {

                                     }
                                 }

        );
        duckPanel.setSize(W, H);
        duckPanel.setLocation(0,0);
        duckPanel.setLayout(null);
        frame.add(duckPanel);
        duckPanel.setOpaque(false);
        duckPanel.setFocusable(true);
        duckPanel.requestFocusInWindow();

        for (int i=0; i<6; i++){
            int s = 1+random.nextInt(5);
            System.out.println(s);
            Duck duck = new Duck(s);
            ducks.add(duck);
            duck.start();
        }
    }

}
