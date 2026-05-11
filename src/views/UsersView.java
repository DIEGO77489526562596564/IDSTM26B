package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.UsersController;
import model.User;

public class UsersView {

    private UsersController usersController;

    public UsersView(UsersController usersController) {

        this.usersController = usersController;

    }

    public void TableView(ArrayList<User> data_users) {

        JFrame ventana = new JFrame();

        ventana.setSize(1200,700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Usuarios");
        ventana.getContentPane().setBackground(Color.decode("#03579E"));
        ventana.setLayout(null);
        ventana.setVisible(true);

        JPanel users = new JPanel();

        users.setSize(1000, 500);
        users.setLocation(70, 30);
        users.setBackground(Color.white);
        users.setLayout(null);

        ventana.add(users);

        JLabel users_title = new JLabel("USUARIOS");

        users_title.setBounds(400, 40, 200, 40);
        users_title.setHorizontalAlignment(JLabel.CENTER);
        users_title.setFont(new Font("Arial", Font.BOLD, 22));

        users.add(users_title);

        JButton export = new JButton("Exportar");
        export.setBounds(50, 90, 100, 40);

        users.add(export);

        JButton add = new JButton("Añadir");
        add.setBounds(160, 90,100, 40);

        users.add(add);

        String columnas[] = {
                "ID",
                "Username",
                "Nombre completo"
        };

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnas);

        for (User user : data_users) {

            Object fila[] = {

                    user.getId(),
                    user.getUsername(),
                    user.getNombreCompleto()

            };

            model.addRow(fila);

        }

        JTable users_table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(users_table);

        scrollPane.setBounds(50, 150, 850, 250);

        users.add(scrollPane);

        users.repaint();

    }

}