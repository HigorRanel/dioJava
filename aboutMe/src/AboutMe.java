import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        
    try{
        Scanner tcd = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = tcd.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = tcd.next();

        System.out.println("Digite sua idade");
        int idade  =tcd.nextInt();

        System.out.println("Digite sua altura");
        double altura = tcd.nextDouble();

        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println(("Minha altura é " + altura + "cm"));
        tcd.close();
    }
    catch(InputMismatchException e){
        System.err.println("Os campos idade e altura precisam ser numéricos");
    }

    }
}
