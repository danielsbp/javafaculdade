public class Fatorial {
    public void iniciar() {
        for(long n = 40; n >= 1; n--){
            long fatorial = n;
            for(long k = n-1; k>=2; k--){
                
                fatorial *= k;
                
            }
            System.out.println("Fatorial de "+n+" é "+fatorial);
            
        }
    }
    /*O erro acontece porque os tipos de variáveis int e long não aguentam números enormes.*/
}