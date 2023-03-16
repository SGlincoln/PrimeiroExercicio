import java.util.Scanner;

import static java.lang.System.*;

public class PrimeiroExercicio {
    public static void main(String[]args) {

        Scanner Entrada =new Scanner(in);

        out.println("Digite seu nome:");
        String Nome = Entrada.nextLine();
        
        System.out.println("Digite sua Idade:");
        int Idade = Entrada.nextInt();

        System.out.println("Digite o Ano em que Estamos:");
        int Ano = Entrada.nextInt();

        System.out.print(Nome +" voce nasceu no Ano ");
        out.println(Ano-Idade);

        Entrada.close();
    }
}
