package school.sptech;

public class Triangulo extends Figura {
    private Double base;
    private Double altura;


    public Triangulo(){
    }

    @Override
    public Double calcularArea(){
        return (base * altura) / 2;
    }

    @Override
    public String toString(){
        return "Triangulo de base " + this.base + "com a altura de " + this.altura + " com a area " + calcularArea();
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

}
