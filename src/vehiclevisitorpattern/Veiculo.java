package vehiclevisitorpattern;

public abstract class Veiculo {
    public abstract void accept(VeiculoVisitor visitor);
}