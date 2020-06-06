/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video4.calculadora;

import java.util.Scanner;

/**
 *
 * @author BLSoft
 */
public class Main {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        String operacao;
        boolean sair = false;
        
        do{
            
            resultado = 0;
            
            System.out.println("------------------------------------");
            System.out.println("--JAVA CONSOLE ULTIMATE CALCULATOR--");
            System.out.println("------------------------------------");
            
            System.out.println("Informe o primeiro número:");
            numero1 = scanner.nextDouble();
            
            System.out.println("Informe a operacao: (+ - * /");
            operacao = scanner.next();
            
            System.out.println("Informe o segundo número:");
            numero2 = scanner.nextDouble();
            
            switch(operacao){
                
                case "+":
                    resultado = numero1 + numero2;
                    break;
                    
                case "-":
                    resultado = numero1 - numero2;
                    break;
                    
                case "*":
                    resultado = numero1 * numero2;
                    break;
                    
                case "/":
                    if(numero2 == 0){
                        System.err.println("Divisão por Zero não permitida,"
                                + " na história da humanidade!");
                    }else{
                        resultado = numero1 / numero2;
                    }
                    break;
            }
            
            System.out.println("------------------------------------");
            System.out.println("Resultado: " + resultado);
            System.out.println("PARA SAIR DIGITE 0\n\nPARA CONTINUAR DIGITE 1");
            if(scanner.nextInt() == 0){
                sair = true;
            }
            
        }while(sair == false);
        scanner.close();
        
    }
}
