package com.sudarshan.conceptsjava.generics;

public interface Mist<T> {
    public void add(T object);

    public T get(int index);

    public boolean isEmpty();

    public boolean isFull();

}
