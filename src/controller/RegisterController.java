package controller;

import model.RegistroModel;
import views.RegisterView;


public class RegisterController {

    private RegisterView vista;
    private RegistroModel modelo;

    public RegisterController() {
        modelo = new RegistroModel();
        vista = new RegisterView(this, modelo);
    }

    public void showRegister() {
        vista.registerView();
    }

    public boolean register(String user, String bio) {
        return modelo.registrar(user, bio);
    }
}