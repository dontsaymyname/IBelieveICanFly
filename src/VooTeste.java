public class VooTeste {
    public static void main(String[] args) {

        Pato pato = new Pato();
        pato.setEnergia(10);

        Aviao aviao = new Aviao();
        aviao.setHorasDeVoo(0);

        SuperMan superMan = new SuperMan();
        superMan.setExperiencia(10);


        System.out.println("Energia: " + pato.getEnergia());
        System.out.println("Horas de voo: " + aviao.getHorasDeVoo());
        System.out.println("Experiencia: " + superMan.getExperiencia());


        System.out.println("________________________");
        TorreDeControle torreDeControle = new TorreDeControle();
        torreDeControle.adicionarVoadores(pato);
        torreDeControle.adicionarVoadores(aviao);
        torreDeControle.adicionarVoadores(superMan);
        torreDeControle.voemTodos();

        System.out.println("Energia: " + pato.getEnergia());
        System.out.println("Horas de voo: " + aviao.getHorasDeVoo());
        System.out.println("Experiencia: " + superMan.getExperiencia());

    }
}
