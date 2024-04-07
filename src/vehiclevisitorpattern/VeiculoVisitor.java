package vehiclevisitorpattern;

public interface VeiculoVisitor {
    void visit(Carro carro);
    void visit(Bicicleta bicicleta);
    void visit(Onibus onibus);
}