package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 hudson millar
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "What's your age?" );
        int age = scan.nextInt();
        String msg = "";
        if(age>=16){
           msg = "You are old enough to drive";
        }
        else{
            msg = "You are too young to drive";
        }
        System.out.println(msg);
    }
}
