package exercicios;
import java.util.Scanner;

public class ExercicioDataCor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String data;
        String resultado;

        System.out.print("Digite o dia da semana: ");
        data = sc.nextLine();

        try {

            int numero = Integer.parseInt(data);

        switch (numero) {
            case 1:
                resultado = "Domingo";
                break;
            case 2:
                resultado = "Segunda";
                break;
            case 3:
                resultado = "Terça";
                break;
            case 4:
                resultado = "Quarta";
                break;
            case 5:
                resultado = "Quinta";
                break;
            case 6:
                resultado = "Sexta";
                break;
            case 7:
                resultado = "Sabado";
                break;

            default:
                resultado = "Valor Inválido!";
                break;
        }
    } catch (NumberFormatException e) {

            switch (data) {
                case "Domingo":
                    resultado = "1";
                break;
                case "Segunda":
                    resultado = "2";
                    break;
                case "Terça":
                    resultado = "3";
                    break;
                case "Quarta":
                    resultado = "4";
                    break;
                case "Quinta":
                    resultado = "5";
                    break;
                case "Sexta":
                    resultado = "6";
                    break;
                case "Sabado":
                    resultado = "7";
                    break;
            }
        }


        System.out.printf("Hoje é %s , Boa Semana!", resultado);

        sc.close();
    }
}
