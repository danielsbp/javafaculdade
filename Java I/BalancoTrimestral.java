public class BalancoTrimestral {
    public static void main(String [] args) {
       
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        float media = gastosTrimestre/3;

        System.out.println("Gasto trismestral: "+gastosTrimestre);
        System.out.println("Média por mês: "+media);
    }
}