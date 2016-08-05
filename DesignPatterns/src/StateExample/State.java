package StateExample;


public class State {


    // Каждое состояние представлено целым числом
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;


    // а эта переменная для хранения текущего состояния
    int state = SOLD_OUT;
}
