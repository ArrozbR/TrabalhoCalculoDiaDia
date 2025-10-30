public class JurosComposto extends Calculo{
    double juros;
    double capitalInicial;
    double taxaJuros;
    double tempoAplicacao;

    public JurosComposto(double capitalInicial, double taxaJuros, double tempoAplicacao) {
        this.capitalInicial = capitalInicial;
        this.taxaJuros = taxaJuros;
        this.tempoAplicacao = tempoAplicacao;
    }

    @Override
    public void executar(){
        juros = (capitalInicial * Math.pow((1 + taxaJuros), tempoAplicacao)) - capitalInicial;
        System.out.println("O Juros Composto sera: R$" + String.format("%.2f", juros));
    }
}
