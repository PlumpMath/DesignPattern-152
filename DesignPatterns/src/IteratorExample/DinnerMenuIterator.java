package IteratorExample;


public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;



    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
