/*
Solorzano Trejo Brandon Uriel
3S11
Colas 1.1
 */

package cola1.pkg1;
import java.util.Random;
import java.util.Scanner;
public class Programa3 {
 
    int pila[] = new int[100];
    int tope = 0;
    int pi1, pi2, pi3;
    
    
    public void llenar(){
     Random numaleatorio = new Random();
     pi1 = 1 + numaleatorio.nextInt(100);
     pila[tope]=pi1;
     pi1++;
     tope++;
      
     pi2 = 101 + numaleatorio.nextInt(200);
     pila[tope]=pi2;
     pi2++;
     tope++;
     }
   
     public void mostrar() {
     for (int i = tope - 1; i >= 0; i--) {
     System.out.print("\nEl numero de la pila es:  " + pila[i]);
     }
     }
    
     public void eliminar() {
     tope--;
     System.out.println("Se elimino el dato");
     }
    
     public void sumar(){
     pi3= pi1 + pi2;
     System.out.println("Resultado de la pila 3 es:"+pi3);
     }
    
    
     public static void main(String[] args) {
     Programa3 c = new Programa3();
     Scanner sc = new Scanner(System.in);
     int opt;
        
        do {
            System.out.println("\n**Escribe la opcion que deseas ejecutar**\n"
                    + "1 llenar\n"
                    + "2 mostrar\n"
                    + "3 eliminar\n"
                    + "4 Sumar\n"
                    + "5 salir\n");
            
            switch (opt = sc.nextInt()) {
                case 1:
                c.llenar();
                System.out.println("Las pilas se han llenado correctamente");
                break;
                
                case 2:
                c.mostrar();
                break;
                    
                case 3:
                c.eliminar();
                break;
                
                case 4:
                c.sumar();
                break;
               }
        } while (opt != 5);
        }
        }
        
    
    



