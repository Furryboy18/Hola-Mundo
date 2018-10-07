
package paquete;

public class ListaEnlazada {
    Nodo raiz;
    Nodo puntero;
    
    public void agregarNodo(int valor){
        Nodo nuevo=new Nodo(valor);
        if (raiz == (null)) { //La lista esta vacia
            raiz = nuevo;
        }else{//La lista tiene a menos un elemento
            puntero = raiz;
            while(puntero.siguiente != (null)){
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nuevo;
        }
    }
    
    public void recorrerLista(){
        puntero = raiz;
        while(puntero.siguiente != (null)){
            System.out.println("El valor es"+puntero.valor);
            puntero = puntero.siguiente;
        }
        System.out.println("El valor es"+puntero.valor);
    }
}
