package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        
        for(int i=0; i<3; i++) {
        	String friendInfo1 = sc.nextLine();
        	String[] fInfoArr1 = friendInfo1.split(" ");
        	Friend f_i = new Friend(fInfoArr1[0],fInfoArr1[1],fInfoArr1[2]);
        	friendArray[i] = f_i;
        }
        	
        
      for(int i=0; i<friendArray.length; i++) {
        	friendArray[i].showInfo();
      }
        
        
        sc.close();
	}

}
