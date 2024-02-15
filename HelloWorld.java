import java.security.KeyStore.Entry;
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        try{
            System.out.println("Mayor menor");
            Scanner entrada = new Scanner(System.in);
            System.out.println("Numero 1");
            int num1 = entrada.nextInt(); 
            System.out.println("Numero 2");
            int num2 = entrada.nextInt();
            if (num1 > num2) {
                System.out.println("El primer número: " + num1 +  " es el mayor");
            } else {
                System.out.println("El segundo número: " + num2 +  " es el mayor");
            }
        }finally{
            //entrada.close();
        }     
    }
}