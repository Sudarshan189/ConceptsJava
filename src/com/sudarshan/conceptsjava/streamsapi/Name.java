package com.sudarshan.conceptsjava.streamsapi;

public class Name implements Comparable<Name> {
    private String firstName;
    private String lastName;

    public Name() {
    }

    public Name(String firstName, String lastName) {
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



    @Override
    public int compareTo(Name o) {
        if (this.getFirstName().length() < o.getFirstName().length()) {
            return -1;
        } else if(this.getFirstName().length() > o.getFirstName().length()) {
            return 1;
        }
        return 0;
    }
}
