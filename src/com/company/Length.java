package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Length {
    double ab;
    double bc;
    double ca;
    Scanner sc = new Scanner(System.in);

    public void setAb() {
        while (true) {
            try {
                ab = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.err.print("Podałeś dziwną wartość :/ Spróbuj jeszcze raz: ");
                sc.next();
            }
        }
    }

    public void setBc() {
        while (true) {
            try {
                bc = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.err.print("Podałeś dziwną wartość :/ Spróbuj jeszcze raz: ");
                sc.next();
            }
        }
    }

    public void setCa() {
        while (true) {
            try {
                ca = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.err.print("Podałeś dziwną wartość :/ Spróbuj jeszcze raz: ");
                sc.next();
            }
        }
    }





    public double countArea(){
        double p = (ab + bc + ca) / 2;
        return Math.sqrt(p*(p - ab) * p*(p - bc) * p*(p - ca));
    }

    public double countCircuit(){
        return  ab + bc + ca;
    }


    public String kindOfTriangle() {
        boolean obtuse = false;
        boolean rectangular = false;

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

    public boolean checkTriangle() {
        if(ab >= (bc+ca) || ca >= (bc+ab) || bc >= (ab+ca)) {
            return false;
        } else {
            return true;
        }
    }
}
