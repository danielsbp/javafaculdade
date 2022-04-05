import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setSenha(1234);
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Digite a senha do gerente: ");
        if (gerente.autenticacao(sc.nextInt())) {
            System.out.println("Senha correta, acesso liberado.");
            gerente.setSalario(2000);
            System.out.println("Salário do Gerente: "+gerente.getSalario());
            System.out.println("Salário do Gerente com bonificação: " + gerente.bonificacao(100));
        }
        else {
            System.out.println("Senha incorreta, acesso inválido");
        }
    }
}
