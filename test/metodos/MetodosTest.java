/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import org.junit.Test;


public class MetodosTest {  
    @Test
    public void testCompararNumeros_0B_0R() {
        System.out.println("compararNumeros_0B_0R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {5,6,7,8};
        Metodos instance = new Metodos();
       instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
        
    }
    @Test
    public void testCompararNumeros_0B_1R() {
        System.out.println("compararNumeros_0B_1R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {4,8,9,7};
        Metodos instance = new Metodos();
        instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
    }
    
      @Test
    public void testCompararNumeros_0B_2R() {
        System.out.println("compararNumeros_0B_2R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {4,5,1,7};
        Metodos instance = new Metodos();
        instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
    }
         @Test
    public void testCompararNumeros_0B_3R() {
        System.out.println("compararNumeros_0B_3R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {4,8,1,3};
        Metodos instance = new Metodos();
        instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
    }
    @Test
    public void testCompararNumeros_0B_4R() {
        System.out.println("compararNumeros_0B_4R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {3,4,1,2};
        Metodos instance = new Metodos();
       instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
        
    }
      @Test
    public void testCompararNumeros_1B_0R() {
        System.out.println("compararNumeros_1B_0R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {1,7,8,9};
        Metodos instance = new Metodos();
       instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
        
    }
    @Test
    public void testCompararNumeros_1B_1R() {
        System.out.println("compararNumeros_1B_1R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {5,2,1,7};
        Metodos instance = new Metodos();
        instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
    }
    
      @Test
    public void testCompararNumeros_1B_2R() {
        System.out.println("compararNumeros_1B_2R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {4,2,1,5};
        Metodos instance = new Metodos();
        instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
    }
         @Test
    public void testCompararNumeros_1B_3R() {
        System.out.println("compararNumeros_1B_3R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {4,2,1,3};
        Metodos instance = new Metodos();
        instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
    }
    
    @Test
    public void testCompararNumeros_2B_0R() {
        System.out.println("compararNumeros_2B_0R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {5,2,3,4};
        Metodos instance = new Metodos();
       instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
       
    }
    
      @Test
    public void testCompararNumeros_2B_1R() {
        System.out.println("compararNumeros_2B_1R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {4,2,3,5};
        Metodos instance = new Metodos();
        instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
    }
         @Test
    public void testCompararNumeros_2B_2R() {
        System.out.println("compararNumeros_2B_2R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {1,2,4,3};
        Metodos instance = new Metodos();
        instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
    }
    @Test
    public void testCompararNumeros_3B_0R() {
        System.out.println("compararNumeros_3B_0R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {1,2,3,7};
        Metodos instance = new Metodos();
        instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
    }
    
      @Test
    public void testCompararNumeros_4B_0R() {
        System.out.println("compararNumeros_4B_0R");
        int[] NumeroGanador = {1,2,3,4};
        int[] NumeroQueAdivina = {1,2,3,4};
        Metodos instance = new Metodos();
        instance.compararNumeros(NumeroGanador, NumeroQueAdivina, 0, 0);
    }
         
  
    
    
}
