package com.example.firstfx1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Shape;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static com.example.firstfx1.Rectangles.readRecs;


public class HelloController {
    @FXML
    TextField fileName;

    @FXML
    TextField recsList;

    @FXML
    VBox vBox1;

    @FXML
    Shape rec;




    public void loadFromFile() throws FileNotFoundException {
        String file="recs.txt";
        ArrayList<Rectangles> recs=new ArrayList<Rectangles>();
        recs=readRecs(file);
        String s= String.valueOf(readRecs(file));
        fileName.setText(file);
        recsList.setText(String.valueOf(recs));
        for (Rectangles r : recs) {
            rec=new Shape() {
                @Override
                public boolean hasProperties() {
                    rec.
                    return super.hasProperties();
                }
            };
                        vBox1.getChildren().add(rec);

                  }
        }
}

