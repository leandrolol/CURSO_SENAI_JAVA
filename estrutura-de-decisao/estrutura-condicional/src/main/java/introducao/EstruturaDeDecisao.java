package introducao;

public class EstruturaDeDecisao {

    public static void main(String[] args) {

        double n1, n2, n3, media;

        n1 = 8.5;
        n2 = 6;
        n3 = 4.4;

        media = (n1 + n2 + n3) / 3;

        if(media > 7.0) {
            System.out.printf("%nSua média foi %.1f e você foi APROVADO.%n", media);
        } else if(media > 5.0 && media <= 7.0) {
            System.out.printf("%nSua média foi %.1f e você esta de RECUPERAÇÃO.%n", media);
        } else {
            System.out.printf("%nSua média foi %.1f e você foi REPROVADO.%n", media);
        }

        System.out.println("Muito obrigado por tirar à média CONOSCO!");
    }

}
