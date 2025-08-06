public class BoloDeChocolate {

    private int peso;
    private int tempoParaConsumo;
    private int preco;
    private int recheio;
    private int gotasDeChocolate;
    private int validade;
    private int dataAtual;

    public int getRecheio(){

        return this.recheio;

    }

    public int getGotasDeChocolate(){

        return this.gotasDeChocolate;

    }

    public void setGotasDeChocolate(int gotasDeChocolate){

        if(gotasDeChocolate < 0){

            System.out.println("o bolo não possui gotas de chocolate");

        } else{

            this.gotasDeChocolate = gotasDeChocolate;

        }

    }

    public int getDataAtual(){

        return this.dataAtual;

    }

    public void setDataAtual(int dataAtual){

        if(dataAtual > 0){

            this.dataAtual = dataAtual;

        } else{

            System.out.println("erro: data inválida");

        }

    }

    public int getValidade(){

        return this.validade;

    }

    public void setValidade(int validade){

        if(validade > 0){

            this.validade = validade;

        } else{

            System.out.println("erro: validade inválida");

        }

    }

    public int getPeso(){

        return this.peso;

    }

    public void setPeso(int peso){

        if(peso > 0){

            this.peso = peso;

        } else{

            System.out.println("peso inválido");

        }

    }

    public BoloDeChocolate(int peso, int validade, int gotasDeChocolate){

        setPeso(peso);
        setValidade(validade);
        setGotasDeChocolate(gotasDeChocolate);

    }

    public int montandoOBolo(int peso,int gotasDeChocolate, int recheio){

        return this.preco = (peso + gotasDeChocolate + recheio) / 2;

    }

    public int montandoOBolo(int dataAtual, int validade){

        return this.tempoParaConsumo = validade - dataAtual;

    }

    public void imprimir(){

        System.out.println("-> peso: " + this.peso);
        System.out.println("-> preco: " + this.preco);
        System.out.println("-> validade: " + this.validade);
        System.out.println("-> tempo de consumo indicado: " + this.tempoParaConsumo);

    }

}
