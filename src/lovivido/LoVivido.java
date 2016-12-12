/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

public static void mostrarDatos(int m, int d, int h, String n) {
 JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +n,JOptionPane.INFORMATION_MESSAGE);
 JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+n,JOptionPane.INFORMATION_MESSAGE);
 JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+n,JOptionPane.INFORMATION_MESSAGE);
}

public static void main(String[] args) {

String n = JOptionPane.showInputDialog ("Escriba su nombre: ");
String e = JOptionPane.showInputDialog ("Escriba su edad: ");
 
int a = Integer.parseInt (e);

int m = (a*12);
int d = (a*365);
int h = (d*24);

LoVivido.mostrarDatos(m, d, h, n);

   System.exit (0);

}
   

}
