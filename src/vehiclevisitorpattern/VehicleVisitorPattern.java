package vehiclevisitorpattern;

public class VehicleVisitorPattern {

    public static void main(String[] args) {
        Veiculo carro = new Carro("Vermelho", "Ford", "Mustang");
        Veiculo bicicleta = new Bicicleta("Azul");
        Veiculo onibus = new Onibus(42, 2001);

        VeiculoVisitor operacao = new VeiculoOperacaoVisitor();

        carro.accept(operacao);
        bicicleta.accept(operacao);
        onibus.accept(operacao);
    }
}

