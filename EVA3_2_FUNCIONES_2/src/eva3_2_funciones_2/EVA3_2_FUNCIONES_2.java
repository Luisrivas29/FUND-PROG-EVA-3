package eva3_2_funciones_2;

// import java.util.Scanner;


public class EVA3_2_FUNCIONES_2 {

   // static int x = 100;
    public static void main(String[] args) {
      
       // Scanner input = new Scanner(System.in);
        
       // EVA3_2_FUNCIONES_2 objeto = new EVA3_2_FUNCIONES_2();
        int num1 = 100, num2 = 200;
        //SE USA EL VALOR DIRECTAMENTE DE LA FUNCION
         // System.out.println(objeto.x);
        // System.out.println(buscarMax(100, 200));
        int valor = buscarMax(num1, num2);
        //GUARDAMOS EL VALOR DEVUELTO PARA SU USO POSTERIOR
        System.out.println(valor);
        //SE EJECUTA LA FUNCION, PERO IGNORAMOS EL RESULTADO
        buscarMax(num1, num2);
       
       
      
 }
    
    public static int buscarMax(int val1, int val2) {
        
       /* int resu;
        
        if(val1 > val2)
            resu = val1;
        else
            resu = val2;
        
        return = resu; */
       
       if(val1 > val2)
           return val1;
       else
           return val2;
        
    
    }
    
}
