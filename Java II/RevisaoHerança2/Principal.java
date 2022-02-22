public class Principal {
    public static void main(String[] args) {
        Imovel imovel1 = new Imovel();
        imovel1.setEndereco("Rua Quadrado, 444");
        imovel1.setPreco(200000);

        Novo imovel2 = new Novo();
        imovel2.setEndereco("Rua Retângulo, 555");
        imovel2.setPreco(300000);
        imovel2.setAdicional(2000);

        Velho imovel3 = new Velho();
        imovel3.setEndereco("Rua Losângulo, 777");
        imovel3.setPreco(1500000);
        imovel3.setDesconto(20000);

        System.out.println(String.format("Imóvel Velho - \n Endereço: %s, Preço: R$ %f, Desconto: R$ %f", imovel3.getEndereco(), imovel3.getPreco(), imovel3.getDesconto()));
        System.out.println(String.format("Imóvel Novo - Endereço: %s, Preço: R$ %f, Adicional: R$ %f", imovel2.getEndereco(), imovel2.getPreco(), imovel2.getAdicional()));
        System.out.println("Nome: " + "João");
    }
}
