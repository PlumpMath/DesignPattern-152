package StateExample;


public class СandyMachine extends State{


    // Каждое состояние представлено целым числом
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;


    // а эта переменная для хранения текущего состояния
    int state = SOLD_OUT;
    int countOfGum = 0;

    public СandyMachine(int countOfGum) {
        this.countOfGum = countOfGum;
        if(countOfGum > 0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if(state == HAS_QUARTER){

            System.out.println("You can't insert another quarter");

        } else if(state == NO_QUARTER){

            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");

        } else if(state == SOLD_OUT){

            System.out.println("You can't insert a quarter, the machine is sold out");

        } else if(state == SOLD){

            System.out.println("Please wait, we're already giving you a gumball");

        }

    }
}
