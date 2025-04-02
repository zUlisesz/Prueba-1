package javaapp;
import javax.swing.JOptionPane;

public class JavaApp{
    
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, checkDay() ); 
    }  
    
    
    
    public static String checkDay(){
        String cadena ; 
        int n = Integer.parseInt((JOptionPane.showInputDialog("Ingresa un número entero del 1 al 7")));
        switch(n){
            case 1:
                cadena = "Has elegido el día Lunes";
                break ; 
            case 2:
                cadena = "Has elegido el día Martes";
                break ; 
            case 3:
                cadena = "Has elegido el día Miércoles"; 
                break ; 
            case  4:
                cadena = "Has elegido el día Jueves"; 
                break ; 
            case 5: 
                cadena = "Has elegido el día Viernes"; 
                break ; 
            case 6: 
                cadena = "Has elegido el día Sábado"; 
                break; 
            case 7:
                cadena = "Has elegido el día Domingo"; 
                break ; 
            default  :
                cadena = "El número que infresó no se encuentra entre el intervalo 1 - 7";
        }
        return cadena; 
    }
        
    
}
