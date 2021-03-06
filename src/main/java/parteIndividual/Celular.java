package parteIndividual;

public class Celular implements Precedable<Celular> {
    private int numero;
    private String titular;

    public Celular() {
    }

    public Celular(String titular, int numero) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public int precedeA(Celular celular) {
        if (this.numero == celular.getNumero()){
            return 0;
        }
        if (this.numero < celular.getNumero()){
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Titular celular: " + titular + " Numero celular: " + numero;
    }

}
