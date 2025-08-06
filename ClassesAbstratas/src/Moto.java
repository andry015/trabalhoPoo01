public class Moto extends Veiculo{

    private boolean eletrica;
    private int gasolina;
    
    public boolean getEletrica(){

        return this.eletrica;

    }

    public boolean setEletrica(){

        if(getGasolina() == 0){

            System.out.println("A moto é eletrica pois não usa gasolina");

            return true;

        } else{

            System.out.println("A moto não é eletrica pois usa gasolina");

            return false;

        }

    }

    public int getGasolina(){

        return this.gasolina;

    }

    public void setGasolina(int gasolina){

        this.gasolina = gasolina;

    }

    @Override
    public void exibir(){

        super.exibir();
        System.out.println("-> Esta moto é eletrica? " + setEletrica());

    }
    
}
