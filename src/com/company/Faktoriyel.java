package com.company;

import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    System.out.print("Faktoriyel hesaplanacak sayıyı girin: ");
	    int number = sc.nextInt();
        int result =1;
        for(int i=1; i<=number; i++){
            result=result*i;
        }
        System.out.println(result);
    }
}
