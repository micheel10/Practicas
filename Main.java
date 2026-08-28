//Metodo Main

public class Main {
    public static void main(String[] args) {
        // Ejecución de la interfaz gráfica en el hilo de despacho de eventos de Swing
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Practica2 ventana = new Practica2();
                ventana.setVisible(true);
            }
        });
    }
}
    

