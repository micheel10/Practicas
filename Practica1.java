/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Practica1 extends JFrame {
    
    // Objetos de la ventana
    JLabel usuario, contrasenia;
    JTextField tusuario;
    JPasswordField pcontrasenia;
    JButton nuevo, acceder;
    
    // Constructor de la ventana
    public Practica1() {
        setTitle("Practica1");
        setSize(400, 300);
        setLayout(null); 
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        componentes();
        setVisible(true);
    }

    // Creación de los objetos
    public void componentes() { 
        usuario = new JLabel("Usuario");
        usuario.setBounds(50, 50, 100, 30);

        contrasenia = new JLabel("Contrasena"); 
        contrasenia.setBounds(50, 100, 100, 30); 

        tusuario = new JTextField();
        tusuario.setBounds(150, 50, 150, 30);

        pcontrasenia = new JPasswordField();
        pcontrasenia.setBounds(150, 100, 150, 30);

        nuevo = new JButton("Nuevo");
        nuevo.setBounds(80, 180, 100, 30); 

        acceder = new JButton("Acceder");
        acceder.setBounds(200, 180, 100, 30);

        // Agregar objetos a la ventana
        add(usuario);
        add(contrasenia);
        add(tusuario);
        add(pcontrasenia); 
        add(nuevo);
        add(acceder);
    }
}