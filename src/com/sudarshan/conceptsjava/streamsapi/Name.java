package com.sudarshan.conceptsjava.streamsapi;

public class Name implements Comparable<Name> {
    public static Integer counter =0;
    private String firstName;
    private String lastName;
    private int index;
    public Name() {
    }

    public Name(String firstName, String lastName) {
        index = getCounter()+1;
        setCounter(index);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public static Integer getCounter() {
        return counter;
    }

    public static void setCounter(Integer counter) {
        Name.counter = counter;
    }

    @Override
    public int compareTo(Name o) {
        if (this.getFirstName().length() < o.getFirstName().length()) {
            return -1;
        } else if(this.getFirstName().length() > o.getFirstName().length()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", index=" + index +
                '}';
    }
}
