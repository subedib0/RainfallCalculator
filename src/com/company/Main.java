package com.company;

import java.util.Scanner;
// How Much water runs off a roof in a rain storm?
//To calculate the runoff from any given rainfall: Take the dimensions of the footprint of the rooof and convert them to inches. (so a 50'*20' roof is 600"*240). Multiply the roof dimensions by
//the number of inches of rainfall. in this example, 600"*240"*1"=144,000 cubic inches of water. Devid that result by 231 to get the number of gallons (because
//1 gallon= 231 cubic inches). (144,000/231=623.38).
//create a new project called RainfallCalculator. This will be a console application like those you've looked at so far.
//Implement your algorithm for calculating the amount of rainfall that runs off my roof. Prompt the user to enter the length and width of the roof along with any other veriables you need.
//your solution must Implement atleast one method.





public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//defining veriable
        double rainFall;
        boolean result = true;
        double roofLength;
        double roofWidth;
        double length = 0;
        double width = 0;
        double rain = 0;
        double nGallon;
        System.out.println(header());

 //loop to find the amount of different rainfall
        while (result) {
//            break;

            System.out.println("Enter a length of roof :");
            roofLength = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter a width of the roof:");
            roofWidth = scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter a amount of rain fall:");
            rain = scan.nextDouble();
            scan.nextLine();
//user input calculate the windChill

            length = roofLength * 12;
            System.out.println("roof Length in inches" + length);

            width = roofWidth * 12;
            System.out.println("roof Width in inches" + width);

            rainFall = length * width * rain;
            System.out.println("Rain Fall is:" + rainFall);

            nGallon = (length * width * rain) / (231);
            System.out.println("Gallon of water:" + nGallon);

            System.out.println("Do you have another Rainfall Calculation? (y/n)");
            //user able to type the y or n from the scan.nextLine
            String nextRainFall = scan.nextLine();

            if (nextRainFall.equals("y")) {
                result = true;


            } else {
                result = false;
                System.out.println();
            }
        }
        System.out.println(footer());
    }
    //Header Method added

    public static String header() {

        return "Welcome to the Rain Fall Calculation";


    }

    //footer Method added
    public static String footer() {
        return "Good Bye";


    }
}