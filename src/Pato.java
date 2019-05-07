public class Pato implements Voador {


    private int energia;


    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {
        energia = energia - 5;
        System.out.println("Estou voando como um pato");

    }
}
