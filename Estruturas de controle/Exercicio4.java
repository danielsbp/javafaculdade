public class Exercicio4 {
    public static void main(String [] args) {
        for(int n = 10; n >= 1; n--){
            long fatorial = n;
            for(int k = n-1; k>=2; k--){
                
                fatorial *= k;
                // Linhas de debug

                //System.out.println("--------");
                //System.out.println("Valor de n: "+n);
                //System.out.println("Valor de k: "+k);
                //System.out.println("Valor de fatorial: "+fatorial);
            }
            System.out.println("Fatorial de "+n+" é "+fatorial);
            
        }
    }
}