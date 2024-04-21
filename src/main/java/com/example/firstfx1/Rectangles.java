package com.example.firstfx1;

import javafx.scene.paint.Paint;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rectangles {
    double a;
    double b;
    String colorSimply;
    Paint color;

    public Rectangles(double a, double b, String colorSimply, Paint color) {
        this.a=a;
        this.b=b;
        this.colorSimply=colorSimply;;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", color='" + colorSimply + '\'' +
                '}';
    }


    public static ArrayList<Rectangles> readRecs(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        ArrayList<Rectangles> recs = new ArrayList<>();
        while(scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            String colorSimply=scanner.next();
            Paint color= Paint.valueOf(colorSimply);
            Rectangles r = new Rectangles(a, b, colorSimply,color);
            recs.add(r);
        }
        return recs;

    }


       }
