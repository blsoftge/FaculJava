/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video5.fibonacci;

import java.util.Scanner;

/**
 *
 * @author BLSoft
 */
public class Main {

    public static void main(String[] args) {

        //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,...]
        Scanner scanner = new Scanner(System.in);
        long atual = 1;
        long auxiliar = 0;
        long anterior = 0;
        int iteracaoMaxima = 0;

        System.out.println("Informe o número de interações:");
        iteracaoMaxima = scanner.nextInt();

        System.out.println("pos 1: " + anterior);
        System.out.println("pos 2: " + atual);

        for(int i = 2; i < iteracaoMaxima; i++){
            auxiliar = atual;
            atual = atual + anterior;
            anterior = auxiliar;
            System.out.println("pos " +i + ": " + atual);
        }

        scanner.close();

    }
}
