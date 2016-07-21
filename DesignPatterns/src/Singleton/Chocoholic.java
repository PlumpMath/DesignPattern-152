package Singleton;

public class Chocoholic {
    private boolean empty;
    private boolean boiled;
    private static  Chocoholic uniqueInstance;

    private Chocoholic(){
        empty = true;
        boiled = false;
    }

    public static Chocoholic getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Chocoholic();
        }return uniqueInstance;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            // some methods
            boiled = true;
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            boiled = false;
        }
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }


}
