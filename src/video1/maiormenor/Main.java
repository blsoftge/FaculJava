/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video1.maiormenor;

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

        int maior = 0;
        int menor = 0;
        int qteNumerosDigitados;
        int arrayValores[];
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa recebe numeros inteiros e calcula o maior e o menor");
        System.out.println("\nInforme quantos numeros pretende digitar: ");
        qteNumerosDigitados = sc.nextInt();

        arrayValores = new int[qteNumerosDigitados];

        for (int i = 0; i < qteNumerosDigitados; i++) {

            System.out.println("\nInforme o " + (i + 1) + "º  valor e aperte Enter para continuar: ");
            arrayValores[i] = sc.nextInt();

            maior = arrayValores[i];
            menor = arrayValores[i];
        }

        for (int i = 0; i < qteNumerosDigitados; i++) {
            
            if(arrayValores[i] > maior){
                maior = arrayValores[i];
            } else if(arrayValores[i] < menor){
                menor = arrayValores[i];
            }
            
        }
        
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();

    }

}
