/*
Solorzano Trejo Brandon Uriel
3S11
Colas 1.1
 */

package cola1.pkg1;
import java.util.Scanner;
public class Programa4 {
   
    char  cantidad = 26, rango = 'A';
    char pila[] = new char[cantidad];
    int cima = 0 ;
    
    // Variables Ordenar
    int letra = 0;
    char letras = 'A';
    
    
    //Metodo tamaño
        public Programa4(int tamaño){
        pila = new char[tamaño];
        cima = 0;
        }
    
        //Metodo insertar
        public void  llenar(){
        for(int i=1; i<cantidad; i++){
        pila[i] = (char) (Math.random()*26+ 'A');
        for(char j=0; j<i; j++){
        if(pila[i]==pila[j]){
        i--;
        }
        }
        }
        }
    
        public void mostrar(){
        for(int i=cantidad-1; i>=0; i--){
        System.out.print(" "+pila[i]);
        }
        }
        
        public void Eliminar(){
        cima--;
        cantidad--;
        letras--;
        System.out.println("Datos eliminado");
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

        public void  Ordenar(){
        if(letra==0){
        for(letras = 'A'; letras<='Z';letras++) {
        System.out.print(" "+letras) ;
        }  
        }else{
        letras='A';
        while(letra<26){
        pila[letra]=letras;
        }
        }
        }
        
        public void agregar(char w) {
        pila[cima] = w;
        cima++;
        System.out.println("dato agregado..");
        }
       
        
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Digita el tamaño de esta pila");
        
        int tamaño = leer.nextInt();
        int opc;
       
        Programa4 a = new Programa4(tamaño);
        
        do{
            System.out.println("\n*******************************\n");
            System.out.println("Que deseas hacer");
            System.out.println("1. Ingresar dato en desorden");
            System.out.println("2. Mostrar dato");
            System.out.println("3. Eliminar dato");
            System.out.println("4.Saber si esta vacia");
            System.out.println("5.Tamaño de la pila");
            System.out.println("6.Ordenar");
            System.out.println("7.Agregar");
            System.out.println("8.Salir");
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
                System.out.println(a.vacio());
                System.out.println("");
                break;
                    
                case 5:
                System.out.println(a.Tamaño());
                break;  
                    
                case 6:
                a.Ordenar();
                break;
                    
                case 7:
                System.out.println("ingresa el dato");
                char w=sc.next().charAt(0);
                a.agregar(w);
            }
            
            
        }while (opc!= 8);
        }
        }


