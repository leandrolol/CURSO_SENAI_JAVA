import java.util.Scanner;
/**Uma operadora de telefonia cobra R$ 79.30 por um plano básico que dá
 * direito a 100 minutos de telefone. Cada minuto que exceder a franquia de
 * 100 minutos custa R$ 2.30. Fazer um programa para ler a quantidade de
 * minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
*/

 public class ExPlanoCelular {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor, minuto, valorMin, total;
        int minutosUsados;

        valor = 79.30;
        valorMin = 2.30;
        minuto = 100;

        System.out.print("Digite quantos minutos você utilizou: ");
        minutosUsados = sc.nextInt();

        total = (minutosUsados * valorMin) + valor;

        if (minutosUsados > minuto){
            System.out.println("Valor da conta: " + total);
        } else {
            System.out.println("Valor da conta: " + valor);
        }

    sc.close();
    }
}