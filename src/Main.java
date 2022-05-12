import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        CalculoLente calculoLente1 = new CalculoLente();

        double eD, eE, cD, cE;


        System.out.println("Informe o grau esférico do olho direito: ");
        eD = scan.nextDouble();
        System.out.println("Informe o grau esférico do olho esquerdo: ");
        eE = scan.nextDouble();
        System.out.println("Informe o grau cilíndrico do olho direito: ");
        cD = scan.nextDouble();
        System.out.println("Informe o grau cilíndrico do olho esquerdo: ");
        cE = scan.nextDouble();



        System.out.println(calculoLente1.calculaLente(eD, eE, cD, cE));

    }
}
