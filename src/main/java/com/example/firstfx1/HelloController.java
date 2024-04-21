package com.example.firstfx1;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static com.example.firstfx1.Rectangles.readRecs;


public class HelloController {

    @FXML
    VBox vBox1;

    @FXML
    Rectangle rec;

    @FXML
    Label space;
    @FXML
    Label caption;

    @FXML
    ComboBox<String> fileName;
    ;

    public void initialize() {
        fileName.getItems().setAll("recs1.txt", "recs2.txt", "recs3.txt");
    }

    public void loadFromFile() throws FileNotFoundException {
        vBox1.getChildren().clear();
        String file = fileName.getValue();
        ArrayList<Rectangles> recs = new ArrayList<Rectangles>();
        recs = readRecs(file);
        String s = String.valueOf(readRecs(file));
        int counter = 0;
        for (Rectangles r : recs) {
            counter++;
            caption = new Label("Rectangle #" + counter + " " + r.a + "x" + r.b + " of " + r.colorSimply + " color");
            rec = new Rectangle(r.a, r.b, r.color);
            space = new Label();
            vBox1.getChildren().add(caption);
            vBox1.getChildren().add(rec);
            vBox1.getChildren().add(space);

        }
    }
}

