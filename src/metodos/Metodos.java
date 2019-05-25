package metodos;

import java.util.Random;
import java.util.Scanner;

public class Metodos {

    public int[] NumeroGanador = new int[4];
    public int[] NumeroQueAdivina = new int[4];
    public int[] auxiliar = new int[10];
    public int B = 0;
    public int R = 0;

    public int[] obtenerNumeroGanador(int[] NumeroGanador, int[] auxiliar) {

        Random r = new Random();
        int res;
        int k = 9;
        for (int i = 1; i <= 9; i++) {

            auxiliar[i] = i + 1;

        }
        for (int i = 0; i <= 3; i++) {
            res = r.nextInt(k);
            this.NumeroGanador[i] = auxiliar[res];
            auxiliar[res] = auxiliar[k - 1];
            k--;

        }
        return this.NumeroGanador;
    }

    public int[] obtenerNumeroQueAdivina(int[] NumeroQueAdivina) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {

            this.NumeroQueAdivina[i] = sc.nextInt();

        }
        return this.NumeroQueAdivina;
    }

    public void compararNumeros(int[] NumeroGanador, int[] NumeroQueAdivina, int B, int R) {
        for (int i = 0; i <= 3; i++) {

            if (NumeroGanador[i] == NumeroQueAdivina[i]) {
                //     System.out.println("Nro correcto, lugar correcto ");
                B++;
            } else if (NumeroGanador[0] == NumeroQueAdivina[i]
                    || NumeroGanador[1] == NumeroQueAdivina[i]
                    || NumeroGanador[2] == NumeroQueAdivina[i]
                    || NumeroGanador[3] == NumeroQueAdivina[i]) {
                //    System.out.println("Nro correcto, lugar incorrecto");

                R++;
            } else {
                //    System.out.println("Nro incorrecto, lugar incorrecto");
            }
        }

        System.out.println(B + "B " + R + "R");

    }

    public void juegoGanado(int B, int R) {
        if (B == 4 && R == 0) {
            System.out.println("Ganaste!!!:)");

        }
    }

}
