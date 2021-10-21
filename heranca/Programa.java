public class Programa {
    public static void main(String args[]){
        // Variável:
        // Espaço apelidado da memória de um computador que guarda dados.
        // Em sua declaração, falamos sobre o tipo, seu nome e o valor para o computador
        // em linguagens de programação de tipagem forte.
        //  Ex:
        int nome = "Daniel";
        // Objeto:
        // É um tipo de variável especial que pode armazenar atributos e métodos, que são basicamente
        // variáveis e funções respectivamente. Todo objeto é instanciado por uma classe,
        // porém, algumas linguagens permitem a criação de objetos sem instanciamento.
        // No java, primeiro escrevemos uma classe como o Atributo.java e depois instanciamos
        // ela na classe principal do projeto ou em um método de outra classe.
        //  Ex:
        Atributo at = new Atributo();
        // Atributo:
        // Basicamente, é uma váriavel dentro de um objeto. No java, ela possui uma declaração diferente,
        // graças ao conceito de encapsulamento. 
        // Ex: private int nome = "Daniel";
        // Para acessar um atributo, devemos usar a seguinte sintaxe:
        // objeto.atributo;
        // Este uso, retornará o valor que foi atribuido à ele.
        System.out.print(at.numero1);
    }
}