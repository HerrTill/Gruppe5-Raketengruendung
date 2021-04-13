package main;

public class Controller {
    private static Model model;
    private static View view;

    public static void main(String[] args) {
        model = Model.factory();
        view = new View(model);
    }

    public static Model getModel() {
        return model;
    }

    public static View getView() {
        return view;
    }
}
