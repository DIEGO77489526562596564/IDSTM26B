package controller;

import java.util.ArrayList;

import model.User;
import model.UsersModel;
import views.UsersView;

public class UsersController {

    private UsersView vista;
    private UsersModel modelo;

    public UsersController() {

        modelo = new UsersModel();
        vista = new UsersView(this);

    }

    public void showUsers() {

        vista.TableView();

    }

    public ArrayList<User> obtenerUsuarios() {

        return modelo.obtenerUsuarios();

    }

    public boolean addUser(String correo, String password, String nombre) {

        User u = new User();

        u.setUsername(correo);
        u.setPassword(password);
        u.setNombreCompleto(nombre);

        return modelo.registrarUsuario(u);

    }

}