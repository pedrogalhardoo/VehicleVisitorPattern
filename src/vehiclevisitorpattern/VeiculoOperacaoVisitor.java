package vehiclevisitorpattern;

public class VeiculoOperacaoVisitor implements VeiculoVisitor {
    
    @Override
    public void visit(Carro carro) {
        // Imprimir dados do carro
        System.out.println("Carro: cor=" + carro.getCor() +
                           ", marca=" + carro.getMarca() +
                           ", modelo=" + carro.getModelo());
        // Mensagem para o dono do carro
        System.out.println("Carro: favor atualizar dados do IPVA");
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        // Imprimir dados da bicicleta
        System.out.println("Bicicleta: cor=" + bicicleta.getCor());
        // Mensagem para o dono da bicicleta
        System.out.println("Bicicleta: comemore no parque o dia do ciclismo");
    }

    @Override
    public void visit(Onibus onibus) {
        // Imprimir dados do ônibus
        System.out.println("Ônibus: lugares=" + onibus.getQuantidadeLugares() +
                           ", ano de fabricação=" + onibus.getAnoFabricacao());
        // Mensagem para o dono do ônibus
        System.out.println("Ônibus: atenção para atualização das licenças");
    }
}