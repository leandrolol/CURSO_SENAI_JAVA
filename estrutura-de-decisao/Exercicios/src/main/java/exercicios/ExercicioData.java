 package exercicios;
import java.util.Scanner;
/**  Precisando fazer tratamento de datas, uma empresa de celulares precisa que quando a
 * pessoa entre com um número, transforme ele no dia da semana referente:
 1 - Domingo
 2 - Segunda …
*/
public class ExercicioData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int data;

        System.out.print("\nDigite o dia da semana de Hoje: ");
        data = sc.nextInt();

        if(data == 1) {
            System.out.println("Hoje é Domingo");
        } else if (data == 2){
            System.out.println("Hoje é Segunda");
        } else if (data == 3) {
            System.out.println("Hoje é Terça");
        } else if (data == 4){
            System.out.println("Hoje é Quarta");
        } else if (data == 5) {
            System.out.println("Hoje é Quinta");
        } else if (data == 6){
            System.out.println("Hoje é Sexta-feira, boa semana ");
            System.out.println("Ufaaa!! Estamos no fim!! ^-^");
        } else if (data == 7){
            System.out.println("Hoje é Sábado");
        } else {
            System.out.println("O dia digitado é INVÁLIDO!");
        }
    }
}
