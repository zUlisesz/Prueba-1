import java.util.Scanner; 
public class JavaApp{
    
    static float[] exams = new float[4];
    static float[] pracs = new float[4];
    static float[] proyectos = new float[2];
    static Scanner keyboard = new Scanner(System.in) ; 
    
    public static void main(String[] args) {
       pedirExamenes() ; 
       pedirPracticas(); 
       pedirProyectos(); 
       
       System.out.println("TConsiderando todas tus calificaciones tu promedio final es: " + promediar()) ; 
    } 
    public static void pedirExamenes(){
        for(int i =  0; i <= 3; i++){
            System.out.println("Ingresa la calificación de tu examen número "+ (i+1));
            exams[i] = keyboard.nextFloat(); 
        }
    }
    
    public static void pedirPracticas(){
        for( int i = 0; i <= 3; i++){
            System.out.println("Ingresa la calificación de la práctica número " + (i +1));
            pracs[i] = keyboard.nextFloat(); 
        }
    }
    
    public static void pedirProyectos(){
        for(int i = 0 ; i <= 1; i++){
            System.out.println("Ingresa la calificación del prpoyecto número " + (i+1));
            proyectos[i] = keyboard.nextFloat(); 
        }
    }
   
    public static float promediarArray(float[] paquete){
        float dot  = 0; 
        for(int i = 0; i <= paquete.length - 1 ; i++ ){
            dot = dot + paquete[i]; 
        }
        return dot / paquete.length ; 
    }
    
    public static float promediar(){
        float porcentajeExamen = (float) (promediarArray(exams ) * 0.30); 
        float porcentajePracticas = (float) (promediarArray(pracs ) * 0.30); 
        float porcentajeProyectos = (float) (promediarArray(proyectos ) * 0.40); 
        
        return porcentajeExamen + porcentajePracticas + porcentajeProyectos; 
    }
            
}
