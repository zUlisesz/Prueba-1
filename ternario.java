package javaapp;
import javax.swing.JOptionPane;

public class JavaApp{
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, checkLevel()); 
    }  

    public static String checkLevel(){
        int n = Integer.parseInt((JOptionPane.showInputDialog("Qué semestre estás estudiando? ")));
        String nivel = ( n >4 ) ? "Nivel de estudio avanzado" : "Nivel de estudio bajo";  
        return nivel ;  
    }
           
}
