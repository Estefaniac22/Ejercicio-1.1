package main;

import java.util.Arrays;

import metodos.Metodos;

public class Main {

    
    public static void main(String args[]) {
        
        Metodos pp = new Metodos ();
      
        int contador = 0;
        System.out.println(Arrays.toString(pp.obtenerNumeroGanador(pp.NumeroGanador, pp.auxiliar)));

        do {

            System.out.println("Ingrese un número: ");
            pp.obtenerNumeroQueAdivina(pp.NumeroQueAdivina);
            
            pp.compararNumeros(pp.NumeroGanador, pp.NumeroQueAdivina, pp.B, pp.R);

            pp.juegoGanado(pp.B,pp.R);
            contador++;

        } while (contador < 7);
    }

}
