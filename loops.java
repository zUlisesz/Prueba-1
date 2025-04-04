import javax.swing.JOptionPane;
public class Loop {
   
    public static void tablas(){
        int answer = 0 ; 
        while( answer != 1 ){
            int integer = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor entero")); 
            String cadena  = ""; 
            for(int  i = 1; i <= 10 ; i++){
                cadena += integer + " x " + i + " = " + integer*i + "\n";
            }
            //System.out.println( cadena); 
            JOptionPane.showMessageDialog(null, cadena);
            answer = JOptionPane.showConfirmDialog(null, "Desea realizar otra operación ?");
        } 
    }
    
    public static void guess(){
        int x = (int) (Math.random() * 100  ); 
        int answer = 0 , timer = 0 ;
        String parameter = "" ; 
        while( answer != x ){
            answer = Integer.parseInt(JOptionPane.showInputDialog(null,parameter + "\nAdivina el número!")); 
            parameter = ( answer >  x) ? "Muy alto" : "Muy bajo"; 
            timer ++; 
        }
        JOptionPane.showMessageDialog(null, "Felicidade después de " + timer + " intentos has conseguido acertar con el número "+ x);
    }
}
