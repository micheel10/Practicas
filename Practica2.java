/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Practica2 extends JFrame {

    // Componentes de la ventana
    JMenuBar menuBar;
    JMenu menuArchivo, menuEditar, menuReporte, menuSalir;
    JMenuItem itemNuevo, itemConsultar, itemEliminar;
    JMenuItem itemModificar;
    JMenuItem itemArchivoPDF, itemArchivoTxt;
    JLabel labelFondo;

    // Constructor de la ventana
    public Practica2() {
        setTitle("Práctica 2");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        componentes();
        setVisible(true);
    }

    // Creación y configuración de los componentes
    public void componentes() {
        // Creación del JMenuBar
        menuBar = new JMenuBar();

        // 1. Menú Archivo y sus subelementos
        menuArchivo = new JMenu("Archivo");
        itemNuevo = new JMenuItem("Nuevo");
        itemConsultar = new JMenuItem("Consultar");
        itemEliminar = new JMenuItem("Eliminar");

        menuArchivo.add(itemNuevo);
        menuArchivo.add(itemConsultar);
        menuArchivo.add(itemEliminar);

        // 2. Menú Editar y su subelemento
        menuEditar = new JMenu("Editar");
        itemModificar = new JMenuItem("Modificar");
        menuEditar.add(itemModificar);

        // 3. Menú Reporte y sus subelementos
        menuReporte = new JMenu("Reporte");
        itemArchivoPDF = new JMenuItem("Archivo PDF");
        itemArchivoTxt = new JMenuItem("Archivo txt");

        menuReporte.add(itemArchivoPDF);
        menuReporte.add(itemArchivoTxt);

        // 4. Menú Salir con JOptionPane al hacer clic
        menuSalir = new JMenu("Salir");
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JOptionPane.showMessageDialog(null, "Saliendo de la aplicación");
                System.exit(0);
            }
        });

        // Agregar los menús a la JMenuBar
        menuBar.add(menuArchivo);
        menuBar.add(menuEditar);
        menuBar.add(menuReporte);
        menuBar.add(menuSalir);

        // Asignar el JMenuBar a la ventana
        setJMenuBar(menuBar);

        // Etiqueta de Fondo
        labelFondo = new JLabel("Fondo");
        labelFondo.setBounds(200, 150, 150, 50);
        
        // Agregar objetos a la ventana
        add(labelFondo);
    }
}