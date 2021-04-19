package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {

    private double ab;
    private double bc;
    private double ca;


    // --- konstruktory - tworzenie trójkąta ---
    public Triangle(){}

    public Triangle(Point p1, Point p2, Point p3){

        ab = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
        bc = Math.sqrt(Math.pow(p3.x - p2.x, 2) + Math.pow(p3.y - p2.y, 2));
        ca = Math.sqrt(Math.pow(p3.x - p1.x, 2) + Math.pow(p3.y - p1.y, 2));
    }

//    public Triangle(double a, double b, double c){
//
//        ab = a;
//        bc = b;
//        ca = c;
//    }




    // --- settery ---
    private double setTriangleSide() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.err.print("Podałeś dziwną wartość :/ Spróbuj jeszcze raz: ");
                sc.next();
            }
        }
    }

    public void setAb() {
        ab = setTriangleSide();
    }

    public void setBc() {
        bc = setTriangleSide();
    }

    public void setCa() {
        ca = setTriangleSide();
    }





    // --- sprawdzanie możliwości utworzenia trójkąta na podstawie punktów lub długości odcinków ---
    public boolean checkTriangle() {

        return !(ab >= (bc + ca)) && !(ca >= (bc + ab)) && !(bc >= (ab + ca));
    }



    // --- obliczanie obwodu trójkąta  ---
    public double countPerimeter(){

        return ab + bc + ca;
    }


    // --- obliczanie pola trójkąta  ---
    public double countArea(){

        double p = (ab + bc + ca) / 2;
        return Math.sqrt(p*(p - ab) * p*(p - bc) * p*(p - ca));
    }


    // --- klasyfikowanie trójkąta  ---
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

}
