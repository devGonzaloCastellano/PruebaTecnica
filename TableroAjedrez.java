import javax.swing.*;
import java.awt.*;

public class TableroAjedrez extends JPanel {

    private static final int cuadrado = 50; // Tamaño de cada cuadrado

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
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
        // Tamaño del panel basado en el número de cuadros y su tamaño
        return new Dimension(8 * cuadrado, 8 * cuadrado);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Tablero de Ajedrez");
        TableroAjedrez tablero = new TableroAjedrez();

        ventana.add(tablero);
        ventana.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null); // Centrar ventana
        ventana.setVisible(true);
    }
}



