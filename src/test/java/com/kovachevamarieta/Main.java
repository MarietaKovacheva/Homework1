package com.kovachevamarieta;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("homework");
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Choose your hobby:");
        System.out.println("yoga");
        System.out.println("hikking");
        System.out.println("reading");
        System.out.println("Enter your choice:");
        Scanner scanner1 = new Scanner(System.in);
        String hobby = scanner1.next();
        if(hobby.equals("yoga")){
            System.out.println(name +"! The " +hobby +"is great hobby:");
        }
        if(hobby.equals("hikking")){
            System.out.println(name +"! The " +hobby +"is a great hobby:");
        }
        if(hobby.equals("reading")){
            System.out.println(name +"! The " +hobby +"is a great hobby:");
        }
    }

}
