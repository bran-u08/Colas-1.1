/*
Solorzano Trejo Brandon Uriel
3S11
Colas 1.1
 */

package cola1.pkg1;
import java.util.Scanner;
public class Programa1 {
   
char pila[] = new char[26];
int cima = 0;
   
    public Programa1(int tamaño){
    pila = new char[tamaño];
    cima=0;
    }
    
        
    //Metodo insertar
    public void  llenar(){
    char letra = 'A'; 
    for (int i = 0; i < 26; i++) {
    if (cima < 26) {
    pila[cima] = letra;
    letra++;
    cima++;
    } else {
    System.out.println("pila llena");
    break;
    }
    }  
    }
    
    public void mostrar(){
    for(int i=cima-1; i>=0; i--){
    System.out.print(" "+pila[i]);
    }
    }
        
    public void Eliminar(){
    cima--;
    System.out.println("Datos eliminado");
    }
    
    public void agregar(char w) {
    pila[cima] = w;
    cima++;
    System.out.println("dato agregado..");
    }
            
    public boolean vacio(){
    if (cima==0){
    return true;
    }else{
    return false;
    }
    }
        
    public int Tamaño(){
    return pila.length ;
    }

           
    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    System.out.println("Bienvenido");
    System.out.println("Digita el tamaño de esta pila");
        
    int tamaño = leer.nextInt();
    int opc;
       
     Programa1 a = new Programa1(tamaño);
        
    do{
            System.out.println("\n Que deseas hacer");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Eliminar dato");
            System.out.println("4. Agregar dato");
            System.out.println("5. Saber si esta vacia");
            System.out.println("6. Tamaño de pila");
            System.out.println("7.Salir");
            opc = leer.nextInt();
            
            switch (opc){
                case 1:
                a.llenar();
                break;
                    
                case 2:
                a.mostrar();
                break;
                    
                case 3:
                a.Eliminar();
                break;
                    
                case 4:
                System.out.println("ingresa el dato");
                char w=sc.next().charAt(0);
                a.agregar(w);
                break;
                    
                case 5:
                System.out.println(a.vacio());
                System.out.println("");
                break;
                    
                case 6:
                System.out.println(a.Tamaño());
                break;  
                }
                }while (opc!= 7);
                }
                }






