/*
Solorzano Trejo Brandon Uriel
3S11
Colas 1.1
 */

package cola1.pkg1;
import java.util.Scanner;
public class Cola {
public static void main(String[] args) {
        
    
Scanner lector =new Scanner (System.in);
int opc;



do{
System.out.println("Que programa se ejecutara");
System.out.println("1. Pila 1.1");
System.out.println("2. Pila 1.2");
System.out.println("3. Pila 1.3");
System.out.println("4. Pila 1.4");
System.out.println("5. Salir");

    

opc=lector.nextShort();
switch(opc){
    case 1:
    Programa1.main(args); 
    break;
    
    case 2:
    Programa2.main(args);
    break;
    
    case 3:
    Programa3.main(args);
    break;
    
    case 4:
    Programa4.main(args);
    break;
    }

    }while(opc!= 5);
    }
    }
  
    

