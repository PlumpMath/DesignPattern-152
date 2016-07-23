package StrategyExampleDuckBehavior;

public class DuckList {

    Duck [] ducksArray;
    int countDuck;

    public DuckList(int size){

        ducksArray = new Duck[size];
        countDuck = 0;
    }

    private void resize() {
        Duck[] tempList = new Duck[ducksArray.length + ducksArray.length / 2];
        for (int j = 0; j < ducksArray.length; j++) {
            tempList[j] = ducksArray[j];
        }
        ducksArray = tempList;
    }

    public void add(Duck duck, int i) {
        if (i >= ducksArray.length) this.resize();
        this.ducksArray[i] = duck;
    }

}
