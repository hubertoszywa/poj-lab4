package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Start {

    int userChoice;
    static boolean isTriangle = true;



    public static void pointsCoordinates() {

        System.out.println("-----------------------------------------------------");
        System.out.println("Podaj współrzędne kolejnych wierzchołków: ");
        System.out.println("-----------------------------------------------------");
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        System.out.print("P1: x = "); p1.setX();
        System.out.print("    y = "); p1.setY();
        System.out.print("P2: x = "); p2.setX();
        System.out.print("    y = "); p2.setY();
        System.out.print("P3: x = "); p3.setX();
        System.out.print("    y = "); p3.setY();

        isTriangle = p1.checkTriangle(p1, p2, p3);

        if(isTriangle){
            System.out.println("Obwód trójkąta jest równy: " + p1.countCircuit());
            System.out.println("Pole trójkąta jest równe: " + p1.countArea(p1, p2, p3));
            System.out.println("Rodzaj trójkąta: " + p1.kindOfTriangle());
        } else {
            System.out.println("Z podanych wierzchołków nie uda się zbudować trójkąta!");
        }
    }




    public static void sideLengths() {

        System.out.println("-----------------------------------------------------");
        System.out.println("Podaj długości odcinków trójkąta: ");
        System.out.println("-----------------------------------------------------");
        Length l1 = new Length();

        System.out.print("|AB|: = "); l1.setAb();
        System.out.print("|BC|: = "); l1.setBc();
        System.out.print("|CA|: = "); l1.setCa();

        isTriangle = l1.checkTriangle();

        if(isTriangle){
            System.out.println("Obwód trójkąta jest równy: " + l1.countCircuit());
            System.out.println("Pole trójkąta jest równe: " + l1.countArea());
            System.out.println("Rodzaj trójkąta: " + l1.kindOfTriangle());
        } else {
            System.out.println("Z podanych długości boków nie uda się zbudować trójkąta!");
        }



    }



    public Start() {
        Scanner sc = new Scanner(System.in); // System.in jest standardowym źródłem wejścia

        System.out.println("-----------------------------------------------------");
        System.out.println("Obliczanie pola, obwodu i określenie rodzaju trójkąta");
        System.out.println("-----------------------------------------------------");
        System.out.println("Wprowadź informacje o trójkącie: ");
        System.out.println("1. Podaj współrzędne wierzchołków trójkąta ");
        System.out.println("2. Podaj długości boków trójkąta ");
        System.out.println("3. Zakończ pracę programu ");
        System.out.print("Wybierz opcję: ");


        while (true) {
            try {
                userChoice = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.print("Podałeś dziwną wartość :/ Spróbuj jeszcze raz: ");
                sc.next();
            }
        }


        while(true)
        {
            switch (userChoice) {
                case 1:
                    pointsCoordinates();



                    break;
                case 2:
                    sideLengths();


                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Spróbuj jeszcze raz! Wybierz opcję: ");
                    while (true) {
                        try {
                            userChoice = sc.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.err.print("Podałeś dziwną wartość :/ Spróbuj jeszcze raz: ");
                            sc.next();
                        }
                    }
            } //end switch
        } //end while

    } //end constructor

} // end class
