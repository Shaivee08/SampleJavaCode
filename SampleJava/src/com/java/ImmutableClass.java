package com.java;
public final class ImmutableClass {
    private String i;
    ImmutableClass(String i){
        this.i=i;
    }
    public String getI() {
        return i;
    }

    public static void main(String[] args) {
        ImmutableClass immutCls = new ImmutableClass("5");
        System.out.println(immutCls.getI());
    }
}
