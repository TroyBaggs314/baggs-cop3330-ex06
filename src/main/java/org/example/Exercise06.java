/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.time.Year;
import java.util.Scanner;
class Retire
{
    int age;
    int retirementAge;
}

public class Exercise06
{
    public static void main( String[] args )
    {
        Retire r = new Retire();
        r = inputs(r);
        int curYear = Year.now().getValue(); //apparently java.util.Date and Calendar is "troublesome,confusing,and flawed" and it is recommended to use this instead.
        System.out.println("You have " + (r.retirementAge-r.age) + " years left until you can retire.\nIt's " + curYear + ", you can retire in " + (curYear + (r.retirementAge-r.age)));
    }

    public static Retire inputs(Retire r)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your current age?");
        r.age = sc.nextInt();
        System.out.println("At what age would you like to retire?");
        r.retirementAge = sc.nextInt();
        return r;
    }
}
