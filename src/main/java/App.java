/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int len = sc.nextInt();
        System.out.print("What is the wid of the room in feet? ");
        int wid = sc.nextInt();
        System.out.println("You entered dimensions of " + len + " feet by " + wid + " feet");
        int area = len * wid;
        float conv = (float) (area * .09290304);
        float metric = (conv);
        System.out.printf("The area is\n%d square feet\n%.3f square meters\n", area, metric);
    }
}
