public class Exercicio3 {
    public static void main(String [] args) {
        for(int n = 1; n <= 100; n++){
            
            boolean isMultipleOf3 = n%3==0;

            if(isMultipleOf3){
                System.out.println(n);
            }
        }
    }
}