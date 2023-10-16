package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        int nr = Integer.parseInt(scanner.next());  
        for(int i = 1; i<=nr ; i++)
            System.out.println(i * i);
    }
}
