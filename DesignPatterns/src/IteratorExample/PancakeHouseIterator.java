package IteratorExample;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
    ArrayList items;
    int position = 0 ;

    public PancakeHouseIterator(ArrayList items) {
        this.items = items;
    }


    @Override
    public boolean hasNext() {
        if(position >= items.size()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = items.get(position);
        position++;
        return object;
    }
}
