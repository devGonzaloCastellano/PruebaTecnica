import javax.swing.*;
import java.awt.*;

public class TableroAjedrez2 extends JPanel {

    private static final int cuadrado = 10; // Ajustar tamaño del cuadrado si es necesario

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int fila = 0; fila < 1000; fila++) {
            for (int columna = 0; columna < 1000; columna++) {
                // Alternar colores
                if ((fila + columna) % 2 == 0) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLUE);
                }

                // Dibujar cuadrado
                g.fillRect(columna * cuadrado, fila * cuadrado, cuadrado, cuadrado);
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        // Tamaño del panel basado en el número de cuadrados y su tamaño
        return new Dimension(1000 * cuadrado, 1000 * cuadrado);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Tablero de Ajedrez 1000x1000");
        TableroAjedrez2 tablero = new TableroAjedrez2();

        ventana.add(new JScrollPane(tablero)); // Se añade un scroll para manejar el tamaño grande
        ventana.setSize(1000, 1000); // Tamaño inicial de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null); // Centrar ventana
        ventana.setVisible(true);
    }
}
