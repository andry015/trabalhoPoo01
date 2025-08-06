import java.util.ArrayList;

public class Teste {

    public static void main (String [] args){

        ArrayList<Veiculo> veiculo = new ArrayList<Veiculo>();

        Carro carro = new Carro();
        carro.setModelo("Honda");
        carro.setPortas(4);

        Moto moto = new Moto();
        moto.setModelo("honda");
        moto.setGasolina(0);

        System.out.println("exibindo o carro...");
        carro.exibir();
        System.out.println();

        System.out.println("exibindo a moto...");
        moto.exibir();
        System.out.println();

        System.out.println("imprimindo o arraylist:");
        veiculo.add(carro);
        veiculo.add(moto);

        System.out.println(veiculo);

    }
    
}
