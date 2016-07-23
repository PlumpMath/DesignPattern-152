package StrategyExampleDuckBehavior;

public class StrategyExample1 {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performfly();
        duck.display();

        Duck duck1 = new ModelDuck();
        duck1.performfly();
        duck1.setFlyBehavior(new FlyRocketPowered());
        duck1.performfly();

        Duck duck2 = new SignalDuck();
        duck2.display();
        duck2.performQuack();

        Duck duck3 = new RedHeadDuck();
        duck3.display();
        duck3.performfly();


        DuckList list = new DuckList(5);
        list.add(duck,0);
        list.add(duck1,1);
        list.add(duck2,2);
        list.add(duck3,3);


//        TurkeyWild turkeyWild = new TurkeyWild();
//        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkeyWild);
//        turkeyAdapter.performfly();
//        turkeyAdapter.performQuack();

        System.out.println("\n-------------------------------\n");
        Duck [] donalds = new Duck[10];
        for (int i = 0; i < donalds.length; i++) {
            donalds[i] = Ducks.randomDuck();
            donalds[i].display();
            donalds[i].performfly();
//            System.out.println(" ");
            donalds[i].setFlyBehavior(new FlyRocketPowered());
            donalds[i].performfly();
            System.out.println(" ");
        }

    }



}

class Ducks{

    public static Duck randomDuck(){
        int i = (int) (Math.random()*5);
        switch (i) {
            case 0 :
                return new MallardDuck();
//               break;
            case 1 :
                return new ModelDuck();
            //               break;
            case 2 :
                return new SignalDuck();
//                break;
            case 3 :
                return new RedHeadDuck();
//                break;
            case 4 :
                return new TurkeyAdapter(new TurkeyWild());
            default:
                return null;
        }
    }



}



