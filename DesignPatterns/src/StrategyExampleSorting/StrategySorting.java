package StrategyExampleSorting;

class StrategySorting{
    Sorting strategy;
    public void setStrategy(Sorting strategy){
        this.strategy = strategy;
    }
    public void performSort(int [] arr){
        strategy.sort(arr);
    }
}
