import javax.swing.*;

public class Practica2 extends JFrame {

    // Componentes públicos de la GUI
    public JMenuBar menuBar;
    public JMenu menuArchivo, menuEditar, menuReporte, menuSalir;
    public JMenuItem itemNuevo, itemConsultar, itemEliminar;
    public JMenuItem itemModificar;
    public JMenuItem itemArchivoPDF, itemArchivoTxt;
    public JLabel labelFondo;

    public Practica2() {
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        // Configuración básica de la ventana
        setTitle("Prática 2");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

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
        add(labelFondo);
    }
}