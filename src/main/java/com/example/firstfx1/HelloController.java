package com.example.firstfx1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static com.example.firstfx1.Rectangles.readRecs;


public class HelloController {
    @FXML
    TextField fileName;

    @FXML
    VBox vBox1;

    @FXML
    Rectangle rec;


    public void loadFromFile() throws FileNotFoundException {
        vBox1.getChildren().clear();
        String file = fileName.getText();
        ArrayList<Rectangles> recs = new ArrayList<Rectangles>();
        recs = readRecs(file);
        String s = String.valueOf(readRecs(file));
        fileName.setText(file);
        for (Rectangles r : recs) {
            rec = new Rectangle(r.a, r.b, r.color);
            vBox1.getChildren().add(rec);

        }
    }
}

