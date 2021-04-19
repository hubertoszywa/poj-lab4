package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Point {

    protected double x;
    protected double y;
    Scanner sc = new Scanner(System.in);

    // --- konstruktor - tworzenie punktu ---
    Point() {}


    // --- settery ---
    public void setX(){
        while (true) {
            try {
                x = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.err.print("Podałeś dziwną wartość :/ Spróbuj jeszcze raz: ");
                sc.next();
            }
        }
    }

    public void setY(){
        while (true) {
            try {
                y = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.err.print("Podałeś dziwną wartość :/ Spróbuj jeszcze raz: ");
                sc.next();
            }
        }
    }

}