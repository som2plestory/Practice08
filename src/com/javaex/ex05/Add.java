package com.javaex.ex05;

public class Add {
    
    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    	System.out.println(">> "+(a+b));
    }

    public int calculate() {
    	return a+b;
    }

}
