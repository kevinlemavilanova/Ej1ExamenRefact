/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    static String nombre, edad;
    static int años, meses, dias, horas;

    public static void mostrarDatos(int m, int d, int h, String n) {
        JOptionPane.showMessageDialog(null, "Meses: " + m, "Numero de meses vividos de " + n, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Días: " + d, "Numero de días vividos de " + n, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Horas: " + h, "Numero de horas vividos de " + n, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void pedirDatos() {
        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");
    }
    public static void calcular() {
        años = Integer.parseInt(edad);
        meses = (años * 12);
        dias = (años * 365);
        horas = (dias * 24);
    }

    public static void main(String[] args) {
        LoVivido.pedirDatos();
        LoVivido.calcular();
        LoVivido.mostrarDatos(meses, dias, horas, nombre);
        System.exit(0);
    }

}
