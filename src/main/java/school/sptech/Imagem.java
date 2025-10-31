package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();

    public Imagem() {
    }

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double total = 0.0;
        for (int i = 0 ; i < figuras.size(); i++){
            total += figuras.get(i).calcularArea();
        }
        return total;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasEncontradas = new ArrayList<>();
        for (int i = 0 ; i < figuras.size(); i++){
            if (figuras.get(i).calcularArea() > 20.0){
                figurasEncontradas.add(figuras.get(i));
            }
        }
        return figurasEncontradas;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> Quadrados = new ArrayList<>();

        for(Figura figura : figuras){
            if (figura instanceof Quadrado){
                Quadrados.add(figura);
            }
        }
        return Quadrados;
    }

}
