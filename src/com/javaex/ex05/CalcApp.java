package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
	    	System.out.print(">> ");
	    	String cal = sc.nextLine();
	    	if(cal.equals("/q")) {
	    		System.out.println("종료합니다.");
	    		break;
	    	}else {
		    	String[] calArr = cal.split(" ");
		    	int[] num = new int[2];
		    	num[0] = Integer.parseInt(calArr[0]);
		    	num[1] = Integer.parseInt(calArr[2]);
		    	switch(calArr[1]) {
		    		case "+":
		    			Add add = new Add();
		    			add.setValue(num[0],num[1]);
		    			break;
		    		case "-":
		    			Sub sub = new Sub();
		    			sub.setValue(num[0],num[1]);
		    			break;
		    		case "*":
		    			Mul mul = new Mul();
		    			mul.setValue(num[0],num[1]);
		    			break;
		    		case "/":
		    			Div div = new Div();
		    			div.setValue(num[0],num[1]);
		    			break;
		    		default:
		    			System.out.println("알 수 없는 연산입니다.");
		    	}
	    	}
    	}
    	sc.close();
    }
}
