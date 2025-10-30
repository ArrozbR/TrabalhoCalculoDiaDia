public class ConsumoEnergia extends Calculo implements Calculavel{
    double consumo;
    double potencia;
    double tempoUso;

    public ConsumoEnergia(double potencia, double tempoUso) {
        this.potencia = potencia;
        this.tempoUso = tempoUso;
    }

    @Override
    public void executar(){
        consumo = (potencia * tempoUso) / 1000;
        System.out.println("O Consumo de Energia foi: " + String.format("%.2f", consumo) + " kWh");
    }

    @Override
    public void calculavel(){
        System.out.println("Essa operacao e Calculavel!");
    }
}
