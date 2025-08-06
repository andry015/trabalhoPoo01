public abstract class Veiculo {

    protected int velocidade;
    protected String modelo;

    public int getVelocidade(){

        return this.velocidade;

    }

    public String getModelo(){

        return this.modelo;

    }

    public void setModelo(String modelo){

        if(modelo.isEmpty()){

            System.out.println("ERRO: modelo inválido");

        } else{

            this.modelo = modelo;

        }

    }

    public void exibir(){

        System.out.println("->velocidade:" + this.velocidade);
        System.out.println("->modelo:" + this.modelo);

    }

}