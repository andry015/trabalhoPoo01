public class Teste{

    public static void main(String [] args){

        BoloDeChocolate bolo = new BoloDeChocolate(400, 014, 010);

        System.out.println("bolo de chocolate:");

        bolo.setValidade(14);
        bolo.setDataAtual(06);
        bolo.setPeso(400);

        bolo.imprimir();

    }
    
}
