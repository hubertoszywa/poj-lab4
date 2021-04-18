package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Point{

    double x;
    double y;
    double ab;
    double bc;
    double ca;
    Scanner sc = new Scanner(System.in);


    Point() {}

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


    public double countCircuit(){
        return ab + bc + ca;
    }



    public double countArea(Point p1, Point p2, Point p3){
        double temp = (p2.x - p1.x) * (p3.y - p1.y) - (p2.y - p1.y) * (p3.x - p1.x);
        return Math.abs(temp) / 2;
    }



    public String kindOfTriangle() {

        if (ab == bc && ab == ca && bc == ca)
            return "Równoboczny";
        else {
            double sqa = Math.pow(ab, 2);
            double sqb = Math.pow(bc, 2);
            double sqc = Math.pow(ca, 2);

            if (sqa == sqb + sqc || sqb == sqc + sqa || sqc == sqa + sqb) {
                return "Prostokątny";
            } else if (sqa > sqc + sqb || sqb > sqa + sqc || sqc > sqa + sqb) {
                return "Rozwartokątny";
            } else {
                return "Ostrokątny";
            }
        }

    }


    public boolean checkTriangle(Point p1, Point p2, Point p3) {
        ab = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
        bc = Math.sqrt(Math.pow(p3.x - p2.x, 2) + Math.pow(p3.y - p2.y, 2));
        ca = Math.sqrt(Math.pow(p3.x - p1.x, 2) + Math.pow(p3.y - p1.y, 2));

        return !(ab >= (bc + ca)) && !(ca >= (bc + ab)) && !(bc >= (ab + ca));
    }
}