package exercicios;

public class Exercicio {

    public static void main(String[] args){

        String gameRPG = "Hogwarts Legacy";
        String gameIndie = "Hollow Knight";

        int age = 35;
        int code = 2367;
        char gender = 'M';

        double priceRPG = 107.80;
        double priceIndie = 46.99;

        double media = (priceRPG + priceIndie) /2;


        System.out.println("Produtos: ");
        System.out.println(gameRPG + ", está custando R$" + priceRPG);
        System.out.println(gameIndie + ", está custando R$" + priceIndie);

        System.out.printf("%nO comprador tinha %d anos, code %d e genero: %s%n", age, code, gender);
        System.out.printf("Media de valor de R$ %f%n", media);
        System.out.printf("Média de valor de arredondado: %.2f%n", media);
        System.out.println("Média de valor de arredondado no padrão americano: " + media);
    }
}