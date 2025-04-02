package javaapp;
import javax.swing.JOptionPane;

public class JavaApp{
    
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, checkLevel()); 
    }  

    public static String checkLevel(){
        String cadena ; 
        int n = Integer.parseInt((JOptionPane.showInputDialog("Ingresa un número entero del 1 al 5 que represente tu nivel al programar")));
        switch(n){
            case 1:
                cadena = "Reto: Desarrolla tu primer prograa de Java";
                break ; 
            case 2:
                cadena = "Reto: Crea una calculadora simple usando Java";
                break ; 
            case 3:
                cadena = "Reto: Implementa un algorítmo de busqueda eficiente"; 
                break ; 
            case  4:
                cadena = "Reto: Crea una aplicación web usando Sping Boot"; 
                break ; 
            case 5: 
                cadena = "Reto: Desarrolla un ainteligencia artificial que resuelva problemas complejos de programación"; 
                break ; 
            default  :
                cadena = "El número que ingresó no se encuentra entre el intervalo 1 - 5";
        }
        return cadena; 
    }
        
    
}
