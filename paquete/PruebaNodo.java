package paquete;
import java.util.Scanner;

public class PruebaNodo {

    public static void main(String[] args) {
        ListaEnlazada lista=new ListaEnlazada();
        Scanner sc = new Scanner(System.in);
        String sionocompa = "si";
        int a = 0;
        boolean r = true;
        do{
         System.out.println("Escriba el nodo pues: "); 
         a = sc.nextInt();
         lista.agregarNodo(a);
         lista.recorrerLista();
         System.out.println("Quieres hacer otro nodo?"); 
         sionocompa = sc.next();
         }while(sionocompa.equals("si"));
         System.out.println("Bueno bai"); 

    }
   
}

