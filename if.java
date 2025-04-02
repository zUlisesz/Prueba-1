package javaapp;
import javax.swing.JOptionPane;

public class JavaApp{
    
    static int calif, porcentaje; 
    static boolean proyectos; 
    public static void main(String[] args) {
        calif = requestCalif(); 
        proyectos = requestProjects(); 
        porcentaje = requestPercent() ;
        
        printStatus();
    }  
    
    public static int requestCalif(){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu calificación en formato entero"));
        return x; 
    }
    
    public static boolean requestProjects(){
        boolean x =  Boolean.parseBoolean(JOptionPane.showInputDialog("Has esntregado todos los proyectos?"));
        return x ;
    }
    
    public static int requestPercent(){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el procentaje de tud asisteia en formato de entero"));
        return x ; 
    }
    
    public static void printStatus(){
        if( calif >= 6 && ( proyectos == true ) && (porcentaje >= 80 )){
            JOptionPane.showMessageDialog(null, "Felicidades, has aprobado tu curso con éxito","Status", 1);
        }else if( calif >= 6 && ( proyectos == true )){
            JOptionPane.showMessageDialog(null, "Tienes derecho a entregar un trabajo extra","Status", 1);
        }else if( calif < 6 || porcentaje < 80 ){
            JOptionPane.showMessageDialog(null, "No has arpbado la materia","Status", 1);
        }
    }
}
