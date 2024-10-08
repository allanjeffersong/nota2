import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uber u = new Uber();

        System.out.println("Vamos Calcular o valor final da sua corrida");

        System.out.println("Digite a distancia percorrida: ");
        u.setDistancia(sc.nextDouble());

        System.out.println("Digite a Tarifa Base da sua corrida: ");
        u.setTarifaBase(sc.nextDouble());

        System.out.println("Digite o tempo(em minutos) de espera:");
        u.setTempoEspera(sc.nextInt());

        System.out.println("Digite o fator demanda: ");
        u.setFatorDemanda(sc.nextDouble());

        u.calcularValor();
        u.exibirDetalhesCorrida();


    }
}