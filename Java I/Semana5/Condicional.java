import java.util.Scanner;
public class Condicional {
    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x = sc.nextInt();
        
        while(x!=1){
            
            boolean isPar = x%2==0;
            
            if(isPar){
                x = x/2;
            } 
            else {
                x = 3*x+1;
            }
            System.out.println("Valor de x: "+x);
        }

        
    }
}