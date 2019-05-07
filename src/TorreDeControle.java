import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

    private List<Voador> listaVoadores = new ArrayList();

    public void adicionarVoadores(Voador umVoador){

        listaVoadores.add(umVoador);
    }

    public void voemTodos(){

        for(Voador umVoador: listaVoadores){
            umVoador.voar();
            System.out.println("_______________________");
        }
    }

}
