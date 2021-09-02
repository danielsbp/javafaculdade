import java.util.Scanner;
public class Principal {
    public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Qual método executar?");
       System.out.println("1 - Fatorial");
       System.out.println("2 - Condicional");
       System.out.println("3 - Tabela");
       int n = sc.nextInt();
       if(n==1){
           Fatorial fatorial = new Fatorial();
           fatorial.iniciar();
       }
       else if(n==2) {
           Condicional condicional = new Condicional();
           condicional.iniciar();
       }
       else if(n==3) {
           Tabela tabela = new Tabela();
           tabela.iniciar();
       }
       else {
           System.out.println("Número digitado inválido!");
       }

    }
}