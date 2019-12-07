package com.java.thread.safety;

public final class ImmutableClass {

    // Final variables
    private final String name;

    public ImmutableClass(String name){
        this.name = name;
    }

    // No setter methods

    public void printName(){
        System.out.println("Name is "+this.name);

    }

    public static void main(String[] args) {

    ImmutableClass immutableObj = new ImmutableClass("testname");
    immutableObj.printName();
    }
}
