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

        ArrayList<User> listaUsuarios = modelo.obtenerUsuarios();

        vista.TableView(listaUsuarios);

    }

}