package com.java;

class CloneDeep implements Cloneable{
    int i;

    public Object Clone() throws CloneNotSupportedException {
       return super.clone();
    }
}
public class DeepCloning {
    public static void main(String[] args) {
        CloneDeep cloneDeep = new CloneDeep();
        cloneDeep.i=10;
        try {
            CloneDeep cloneDeep1 = (CloneDeep) cloneDeep.Clone();
            cloneDeep1.i=15;
            System.out.println("deep"+cloneDeep.i);
            System.out.println("deep1"+cloneDeep1.i);
            System.out.println(cloneDeep == cloneDeep1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // Comparing two objects just after deep copying
        // Returning true for shallow(by default) copying
        // Returning false for deep copying

    }
}
