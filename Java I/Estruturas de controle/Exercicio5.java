public class Exercicio5 {
    public static void main(String [] args) {
        int x = 5;
        
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