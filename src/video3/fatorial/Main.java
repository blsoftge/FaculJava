/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video3.fatorial;

import java.util.Scanner;

/**
 *
 * @author blsoft
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        long numeroInformado;
        long fatorialAtual;

        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa recebe numero inteiro e calcula o fatorial");
        System.out.println("\nInforme o número: ");
        numeroInformado = sc.nextInt();
        System.out.println("\n\n");

        fatorialAtual = numeroInformado * (numeroInformado - 1);
        System.out.println(fatorialAtual);

        for (long i = (numeroInformado - 1); i > 1; i--) {
            fatorialAtual *= (i - 1);
            System.out.println(fatorialAtual);
        }
        System.out.println("\n--------------\nFATORIAL = " + fatorialAtual);
        sc.close();
    }

}
