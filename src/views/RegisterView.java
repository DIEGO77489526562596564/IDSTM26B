package views;

import controller.RegisterController;
import model.RegistroModel;

public class RegisterView {

    private RegisterController controller;
    private RegistroModel model;

    public RegisterView(RegisterController controller, RegistroModel model) {
        this.controller = controller;
        this.model = model;
    }

    public void registerView() {
        System.out.println("Registro abierto");
    }
}