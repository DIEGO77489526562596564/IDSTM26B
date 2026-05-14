package views;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

import controller.UsersController;
import model.User;

public class UsersView {

    private UsersController usersController;

    private JFrame ventana;

    private JTable tabla;

    private DefaultTableModel modelo;

    public UsersView(UsersController usersController) {

        this.usersController = usersController;

    }

    public void TableView() {

        ventana = new JFrame();

        ventana.setSize(1200,700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Usuarios");
        ventana.getContentPane().setBackground(Color.decode("#03579E"));
        ventana.setLayout(null);

        JPanel users = new JPanel();

        users.setSize(1000, 500);
        users.setLocation(70, 30);
        users.setBackground(Color.white);
        users.setLayout(null);

        ventana.add(users);

        JLabel titulo = new JLabel("USUARIOS");
        titulo.setBounds(400, 40, 200, 40);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        users.add(titulo);
        
        JButton export = new JButton("Exportar"); 
        export.setBounds(50, 90, 100, 40); 
        users.add(export);

        JButton add = new JButton("Añadir");
        add.setBounds(160, 90,100, 40);
        users.add(add);

        String columnas[] = {
                "ID",
                "Correo",
                "Nombre"
        };
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(columnas);
        tabla = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(50, 150, 850, 250);
        users.add(scrollPane);
        cargarTabla();
        add.addActionListener(e -> {
            addUserForm();
        });
        ventana.setVisible(true);

    }

    public void cargarTabla() {
        modelo.setRowCount(0);
        
        ArrayList<User> listaUsuarios = usersController.obtenerUsuarios();

        for (User user : listaUsuarios) {
            Object fila[] = {
                    user.getId(),
                    user.getUsername(),
                    user.getNombreCompleto()
            };
            modelo.addRow(fila);
        }
    }

    public void addUserForm() {
    	    JFrame form = new JFrame();
    	    form.setSize(1200,700);
    	    form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    form.setLocationRelativeTo(null);
    	    form.setTitle("Añadir Usuario");
    	    form.getContentPane().setBackground(Color.decode("#03579E"));
    	    form.setLayout(null);

    	    JPanel panel = new JPanel();
    	    panel.setBounds(70,30,1000,500);
    	    panel.setBackground(Color.WHITE);
    	    panel.setLayout(null);
    	    form.add(panel);

    	    JLabel titulo = new JLabel("AÑADIR USUARIO");
    	    titulo.setBounds(350,40,300,40);
    	    titulo.setFont(new Font("Arial",Font.BOLD,24));
    	    panel.add(titulo);

    	    JLabel correoLabel = new JLabel("Correo");
    	    correoLabel.setBounds(250,150,100,30);
    	    panel.add(correoLabel);

    	    JTextField correo = new JTextField();
    	    correo.setBounds(250,180,500,40);
    	    panel.add(correo);

    	    JLabel nombreLabel = new JLabel("Nombre completo");
    	    nombreLabel.setBounds(250,240,150,30);
    	    panel.add(nombreLabel);

    	    JTextField nombre = new JTextField();
    	    nombre.setBounds(250,270,500,40);
    	    panel.add(nombre);

    	    JLabel passwordLabel = new JLabel("Contraseña");
    	    passwordLabel.setBounds(250,330,150,30);
    	    panel.add(passwordLabel);

    	    JPasswordField password = new JPasswordField();
    	    password.setBounds(250,360,500,40);
    	    panel.add(password);

    	    JButton cancelar = new JButton("Cancelar");
    	    cancelar.setBounds(520,430,150,40);
    	    panel.add(cancelar);
    	    
    	    JButton guardar = new JButton("Guardar");
    	    guardar.setBounds(350,430,150,40);
    	    panel.add(guardar);
    	    guardar.addActionListener(e->{

    	        String correoTexto = correo.getText().trim();
    	        String nombreTexto = nombre.getText().trim();
    	        String passwordTexto = new String(password.getPassword());

    	        if(nombreTexto.isEmpty() ||
    	           nombreTexto.isEmpty() ||
    	           passwordTexto.isEmpty()) {

    	            JOptionPane.showMessageDialog(
    	                null,
    	                "Todos los campos son obligatorios"
    	            );

    	            return;
    	        }

    	        if(!correoTexto.contains("@")) {
    	            JOptionPane.showMessageDialog(
    	                null,
    	                "Correo inválido"
    	            );
    	            return;
    	        }

    	        if(passwordTexto.length() < 6) {
    	            JOptionPane.showMessageDialog(
    	                null,
    	                "La contraseña debe tener mínimo 6 caracteres"
    	            );
    	            return;
    	        }
    	        
    	        boolean registrado = usersController.addUser(
    	            correoTexto,
    	            passwordTexto,
    	            nombreTexto
    	        );

    	        if(registrado) {
    	            JOptionPane.showMessageDialog(
    	                null,
    	                "Usuario registrado correctamente\n\n"+
    	                "Nombre: " + nombreTexto + "\n" +
    	                "Correo: " + correoTexto + "\n",
    	                "Exitoso",
    	                JOptionPane.INFORMATION_MESSAGE
    	            );
    	            form.dispose();
    	            TableView();

    	        } else {
    	            JOptionPane.showMessageDialog(
    	                null,
    	                "Error al registrar usuario"
    	            );
    	        }
    	        
    	    });

    	    cancelar.addActionListener(e->{
    	        form.dispose();
    	        TableView();
    	    });

    	    form.setVisible(true);
    	    
    }
}