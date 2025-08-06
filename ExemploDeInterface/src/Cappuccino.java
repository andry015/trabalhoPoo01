public class Cappuccino implements Cafes{

    private int cafeSoluvel;
    private int acucar;

    public int getCafeSoluvel(){

        return this.cafeSoluvel;

    }

    public void setCafeSoluvel(int cafeSoluvel){

        if(cafeSoluvel > 0){

            this.cafeSoluvel = cafeSoluvel;

        } else{ 

            System.out.println("erro: não existe café.");

        }

    }

    public int getAcucar(){

        return this.acucar;

    }

    public void setAcucar(int acucar){

        if(acucar >0){

            this.acucar = acucar;

        } else{ 

            System.out.println("erro: não existe açúcar nesse café.");

        }

    }

    public boolean prepararCafe(){

        if(cafeSoluvel > acucar){

            return true;

        } else{

            return false;

        }

    }

    public void imprimir(){

        System.out.println("quantidade de café: " + this.cafeSoluvel + "g");
        System.out.println("quantidade de açúcar: " + this.acucar + "g");

    }

    @Override
    public void creme(String leiteVaporizado){

        if(prepararCafe() == true){

            System.out.println("adicionando o creme ao café...");

        } else{

            System.out.println("não será possível finalizar o cappuccino.");

        }

    }
    
}
