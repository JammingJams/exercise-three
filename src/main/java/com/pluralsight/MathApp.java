package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        double bobSalary = 20000.00;
        double garySalary = 40000.00;
        double highestSalary = (Math.max(bobSalary, garySalary));
        double truckPrice = 10000.00;
        double carPrice = 12000.00;
        double radiusOfCircle = 7.25;
        double squareRootVariable = 5.0;
        double x1Variable = 5.0;
        double x2Variable = 85.0;
        double y1Variable = 10.0;
        double y2Variable = 50.0;
        double temp = ((x2Variable - x1Variable) * (x2Variable - x1Variable) + (y2Variable - y1Variable) *  (y2Variable - y1Variable));
        double absoluteNumber = -3.9;
        int min = 1;
        int max = 0;
        if (min > max) {
            int temps = min;
            min = max;
            max = temps;
        }


        System.out.println("The highest saalary is ... " + highestSalary);
        System.out.println("The cheapest vehicle is ... " + Math.min(truckPrice, carPrice));
        System.out.println("The radius of this circle is ... " + Math.PI * radiusOfCircle);
        System.out.println("The square root of this equation is ... " + Math.sqrt(squareRootVariable));
        System.out.println("The distance between points is... " + Math.sqrt(((x2Variable - x1Variable) * (x2Variable - x1Variable) + (y2Variable - y1Variable) *  (y2Variable - y1Variable))));
        System.out.println("The absolute value of this number is... " + Math.abs(absoluteNumber));
        int randomInt = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("Random integer between " + min + " and " + max + ": " + randomInt);


    }
}
