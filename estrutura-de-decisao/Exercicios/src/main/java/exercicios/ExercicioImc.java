package exercicios;
import java.util.Scanner;

public class ExercicioImc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     String nome, classificacao;
     double peso, altura, imc;



        System.out.println("--------Calcule seu IMC--------\n");

        System.out.print("Por favor informe seu nome: ");
        nome = sc.nextLine();

        System.out.printf("Olá %s, vamos calcular seu IMC\n", nome);
        System.out.print("Informe seu Peso: ");
        peso = sc.nextDouble();

        System.out.printf("Agora %s precisamos da sua ", nome);
        System.out.print("altura: ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        if(imc < 18.5) {
            classificacao = "MAGREZA";
        } else if(imc >= 18.5 && imc < 24.9) {
            classificacao = "NORMAL";
        } else if ( imc >= 25 && imc < 29.9){
            classificacao = "SOBREPESO";
        } else if (imc >= 30 && imc < 34.9) {
            classificacao = "OBESIDADE GRAU 1";
        } else if (imc >= 35 && imc < 39.9) {
            classificacao = "OBESIDADE GRAU 2";
        } else if (imc > 40) {
            classificacao = "OBESIDADE GRAU 3";
        } else {
            classificacao = "REVISE OS DADOS INFORMADOS!";
        }

            System.out.printf("Obrigado por utilizar o programa, seu IMC é igual a %.1f e sua classificação é: %s", imc, classificacao);

        sc.close();
    }
}
