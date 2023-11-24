package eva3_3_factorial;



public class EVA3_3_FACTORIAL {

    
    public static void main(String[] args) {
      
        System.out.println("El factorial de 5 = " + calcularFactorial(5));
        
        System.out.println("5 eleado a la 3 = " +  calcularPotencia(5, 3));
    }
    
    public static int calcularFactorial(int num){
    //factorial de 5 : 1 x 2 x 3 x 4 x 5 = 120
    //usar ciclos
    //regresar el valor calculado
     
   
    int resu = 1;
    
        for (int i = 1; i <= num; i++){
            resu *= i; //resu = resu * i;
            
        }
            return resu;
    
    }
    
    //crear una funcion que calcule la potencia de un numero entero
    public static int calcularPotencia(int base, int exp){
    
        int resu = 1;
        
          for (int i = 0; i < exp; i++){
            
              resu *= base; //resu = resu * base
              
        }
     return resu;
    }
    
    
}
