package controller;

import model.AuthModel;
import views.AuthView;

public class AuthController {

    private AuthView vista;
    private AuthModel modelo;

    public AuthController() {
        modelo = new AuthModel();
        vista = new AuthView(this, modelo);
    }

    public void showLogin() {
        vista.loginView();
    }

    public boolean login(String user, String pass) {
        return modelo.acces(user, pass);
    }
}
