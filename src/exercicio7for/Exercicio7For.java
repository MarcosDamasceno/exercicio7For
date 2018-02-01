/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7for;

/**
 *
 * @author meumd
 */
public class Exercicio7For {

    /**
     * @param args the command line arguments
     * 
     * Escreva um programa que, dada uma
     * variavel x com algum valor inteiro, temos um novo x de acordo com a
     * seguinte regra se x for par, x = x/2 se x for impar, x = 3*x+1 imprime x
     * O programa deve parar quando x tiver o valor final de 1. Por ex, x = 13, saída:
     * 40, 20, 10, 5, 16, 8, 4, 2, 1
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 7;

        for (int i = 0; x > 1; i++) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
            System.out.print(x + ", ");
        }

        /* método do while
        do {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
            System.out.print(x + ", ");
        } while (x > 1);
         */
    }

}
