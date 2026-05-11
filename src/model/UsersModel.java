package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsersModel {

    private Connection conn;

    public UsersModel() {

        try {

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/programacion",
                    "root",
                    "educadex2026"
            );


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public ArrayList<User> obtenerUsuarios() {

        ArrayList<User> listaUsuarios = new ArrayList<>();

        try {

            String sql = "SELECT * FROM usuarios";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                User user = new User();

                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setNombreCompleto(rs.getString("nombre_completo"));

                listaUsuarios.add(user);

            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaUsuarios;

    }

}