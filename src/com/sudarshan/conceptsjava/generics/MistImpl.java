package com.sudarshan.conceptsjava.generics;

public class MistImpl<T> implements Mist<T> {

    private T array[];
    private int size;
    private int currentSize;

    public MistImpl(int size) {
        array = (T[]) new Object[size];
        this.size = size;
        currentSize = -1;
    }

    @Override
    public void add(T object) {
        array[currentSize+1] = object;
        currentSize = currentSize+1;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public boolean isEmpty() {
        return currentSize==-1;
    }

    @Override
    public boolean isFull() {
        return currentSize==size-1;
    }
}
