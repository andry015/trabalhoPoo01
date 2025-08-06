public class Carro extends Veiculo{

    private int gasolina;
    private int portas;
    private int bateria;

    protected static final String MODELO_PADRAO = "Honda";
    protected static final int VELOCIDADE_PADRAO = 80;


    public int getGasolina(){

        return this.gasolina;

    }

    public int getPortas(){

        return this.portas;

    }

    public void setPortas(int portas){

        if(portas >= 2){

            this.portas = portas;

        } else{

            System.out.println("ERRO: numero de portas insuficiente ou inválido.");

        }

    }

    public int getBateria(){

        return this.bateria;

    }

    @Override
    public void exibir(){

        super.exibir();
        System.out.println("-> Numero de portas: " + this.portas);
        System.out.println("-> Porcentagem da bateria: " + this.bateria + "%");
        System.out.println("-> Nível de gasolina no tanque: " + this.gasolina);

    }
    
}
