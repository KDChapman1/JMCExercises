package com.company;

import java.util.Scanner;

public class Main {
    private static int EXERCISE_NUMBER = 32;

    public static void main(String[] args) {

        switch (EXERCISE_NUMBER) {
            case 27:
                inputThenPrintSumAndAverage();
                break;

            case 28:
                System.out.println("buckets = " + getBucketCount(-3.4, 2.1, 1.5, 2));
                System.out.println("buckets = " + getBucketCount(3.4, 2.1, 1.5, 2));
                System.out.println("buckets = " + getBucketCount(2.75, 3.25, 2.5, 1));
                System.out.println("buckets = " + getBucketCount(-3.4, 2.1, 1.5));
                System.out.println("buckets = " + getBucketCount(3.4, 2.1, 1.5));
                System.out.println("buckets = " + getBucketCount(7.25, 4.3, 2.35));
                System.out.println("buckets = " + getBucketCount(3.4, 1.5));
                System.out.println("buckets = " + getBucketCount(6.26, 2.2));
                System.out.println("buckets = " + getBucketCount(3.26, 0.75));
                break;

            case 29:
                SimpleCalculator calculator = new SimpleCalculator();
                calculator.setFirstNumber(10);
                calculator.setSecondNumber(2.5);
                System.out.println(calculator.getFirstNumber() + " + "
                        + calculator.getSecondNumber() + " = "
                        + calculator.getAdditionResult());
                System.out.println(calculator.getFirstNumber() + " - "
                        + calculator.getSecondNumber() + " = "
                        + calculator.getSubtractionResult());
                System.out.println(calculator.getFirstNumber() + " x "
                        + calculator.getSecondNumber() + " = "
                        + calculator.getMultiplicationResult());
                System.out.println(calculator.getFirstNumber() + " / "
                        + calculator.getSecondNumber() + " = "
                        + calculator.getDivisionResult());
                break;

            case 30:
                Person bob = new Person();
                bob.setFirstName("Robert");
                bob.setLastName("Dylan");
                bob.setAge(100);
                System.out.println("firstname: " + bob.getFirstName());
                System.out.println("lastname: " + bob.getLastName());
                System.out.println("fullname: " + bob.getFullName());
                System.out.println("bobs age is: " + bob.getAge());
                System.out.println("bob is a teen: " + bob.isTeen());
                break;

            case  31:
                Wall wall = new Wall(12, 10);
                System.out.println("height: " + wall.getHeight());
                System.out.println("width: " + wall.getWidth());
                System.out.println("area: " + wall.getArea());
                wall.setHeight(-1);
                System.out.println("height: " + wall.getHeight());
                System.out.println("width: " + wall.getWidth());
                System.out.println("area: " + wall.getArea());
                wall.setHeight(10);wall.setWidth(0);
                System.out.println("height: " + wall.getHeight());
                System.out.println("width: " + wall.getWidth());
                System.out.println("area: " + wall.getArea());
                wall.setHeight(10);wall.setWidth(0);
                Wall wall1 = new Wall(-1, -.000001);
                System.out.println("height: " + wall1.getHeight());
                System.out.println("width: " + wall1.getWidth());
                System.out.println("area: " + wall1.getArea());
                break;

            case 32:
                Point first = new Point(6,5);
                Point second = new Point(3,1);
                System.out.println("distance(0,0): " + first.distance());
                System.out.println("distance(second): " + first.distance(second));
                System.out.println("distance(2,2): " + first.distance(2,2));
                Point point = new Point();
                System.out.println("distance(0,0): " + point.distance());
                break;

            default:
                break;
        }
    }

    //    exercise 27
    //
    public static void inputThenPrintSumAndAverage() {

        int sum = 0, count = 0;
        long avg = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
            if (count == 1) {
                avg = sum;
            }
            scanner.nextLine();
        }

        if (count > 1) {
            avg = Math.round((double) sum / count);
        }


        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }

    // exercise 28
    //
    public static int getBucketCount(double width, double height, double areaPerBucket,
                                     int extraBuckets) {

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }

        double buckets = ((width * height) / areaPerBucket) - extraBuckets;

        return (int) Math.ceil(buckets);

    }


    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        return (int) Math.ceil((width * height) / areaPerBucket);

    }


    public static int getBucketCount(double area, double areaPerBucket) {

        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);

    }
}
