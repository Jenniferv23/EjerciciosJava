
package coche1;

//1.Crea una clase coche
public class Coche {
   
    //2.Dentro de la clase coche, una variable numerica que almacene el numero de puertas que tiene
    
    int numeroP=0;   
    


//3. Una funcion que incremente el numero de puerta que tiene el coche

public void agregarP() {
    numeroP++;
}

//5. Mostrar el numero de puertas que tiene el objeto

public void mostrarP() {
    System.out.println("La cantidad de puertas es:"+numeroP);

}

}