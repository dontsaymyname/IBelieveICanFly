public class SuperMan implements Voador {


    private int experiencia;


    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void voar() {
        experiencia = experiencia + 3;
        System.out.println("Estou voando como um campeão");

    }
}
