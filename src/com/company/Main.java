package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double rainFall;
        boolean result = true;
        double roofLength;
        double roofWidth;
        double length = 0;
        double width = 0;
        double rain = 0;
        double nGallon;
        System.out.println(header());


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