package helloworldmvc.main;

import java.io.IOException;

import org.helloworldmvc.view.View;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;

public class Main {
    public static Controller controller;
    public static View       view;
    public static Model      model;

    public static void main(String[] args) throws IOException {
        view = new View();
        model = new Model();
        controller = new Controller(view, model);
        controller.run();
    }

}
