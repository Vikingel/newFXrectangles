package com.example.firstfx1;

import javafx.scene.paint.Paint;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rectangles {
    double a;
    double b;
    Paint color;

    public Rectangles(double a, double b, Paint color) {
        this.a=a;
        this.b=b;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", color='" + color + '\'' +
                '}';
    }


    public static ArrayList<Rectangles> readRecs(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        ArrayList<Rectangles> recs = new ArrayList<>();
        while(scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            Paint color= Paint.valueOf(scanner.next());
            Rectangles r = new Rectangles(a, b, color);
            recs.add(r);
        }
        return recs;

    }


       }
