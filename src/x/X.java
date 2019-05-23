package x;

import java.util.Scanner;

public class X {

    public static void main(String[] args) {
        int v1[] = {1, 2, 3, 4};
        int v2[] = {3,5,4,8};
        int B = 0;
        int R = 0;
        int h = 4;
        Scanner sc = new Scanner(System.in);
        //ingresar el nro

          
            //VER BIEN
            for (int i = 0; i <= 3; i++) {

                if (v1[i] == v2[i]) {

                    //         System.out.println("son iguales ");
                    B++;
                } else {
                    //         System.out.println("diferentes");

                }

            }

            System.out.println(B + "B");

            //VER REGULARES
            for (int i = 0; i <= 3; i++) {

                if (v1[0] == v2[i]
                        || v1[1] == v2[i]
                        || v1[2] == v2[i]
                        || v1[3] == v2[i]) {
                    System.out.println("Nro correcto, lugar incorrecto");

                    R++;
                } else {
                    System.out.println("Nro incorrecto, lugar incorrecto");
                }

            }
            System.out.println(R + "R");
      
    }
}
