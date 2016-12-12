/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    static String n, e;
    static int a, m, d, h;

    public static void mostrarDatos(int m, int d, int h, String n) {
        JOptionPane.showMessageDialog(null, "Meses: " + m, "Numero de meses vividos de " + n, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Días: " + d, "Numero de días vividos de " + n, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Horas: " + h, "Numero de horas vividos de " + n, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void pedirDatos() {
        n = JOptionPane.showInputDialog("Escriba su nombre: ");
        e = JOptionPane.showInputDialog("Escriba su edad: ");
    }
    public static void calcular() {
        a = Integer.parseInt(e);
        m = (a * 12);
        d = (a * 365);
        h = (d * 24);
    }

    public static void main(String[] args) {
        LoVivido.pedirDatos();
        LoVivido.calcular();
        LoVivido.mostrarDatos(m, d, h, n);
        System.exit(0);
    }

}
