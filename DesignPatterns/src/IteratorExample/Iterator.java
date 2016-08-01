package IteratorExample;


public interface Iterator {


    boolean hasNext();  // возвращает флаг который указывает, остались ли в коллекции елементы
    Object next();      // возвращает след елемент
}
