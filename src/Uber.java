import java.util.Scanner;
public class Uber {
    Scanner sc = new Scanner(System.in);
    private double tarifaBase, fatorDemanda, distancia, valorFinal;

    public void setTarifaBase(double tarifaBase){
        this.tarifaBase = tarifaBase;
    }
    public void setFatorDemanda(double fatorDemanda){
        this.fatorDemanda = fatorDemanda;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }



    private int tempoEspera;

    public void setTempoEspera(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera(){
        return tempoEspera;
    }


    public void calcularValor(){
        valorFinal = distancia * 2 + tempoEspera * 0.5 + tarifaBase * fatorDemanda;
    }

    public void exibirDetalhesCorrida(){
        System.out.println("o valor final da sua corrida foi:" + valorFinal);
        System.out.println("Distancia da corrida: " + distancia);
        System.out.println("Tempo de espera: " + tempoEspera);
        System.out.println("Tarifa Base: " + tarifaBase);
        System.out.println(" e o fator demanda: " + fatorDemanda );
    }



}
