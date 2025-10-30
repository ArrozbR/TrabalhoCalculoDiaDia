public class JurosSimples extends Calculo implements Calculavel{
    double juros = 0;
    double capitalInicial;
    double taxaJuros;
    double tempoAplicacao;

    public JurosSimples(double capitalInicial, double taxaJuros, double tempoAplicacao) {
        this.capitalInicial = capitalInicial;
        this.taxaJuros = taxaJuros;
        this.tempoAplicacao = tempoAplicacao;
    }

    @Override
    public void executar(){
        juros = capitalInicial * taxaJuros * tempoAplicacao;
        System.out.println("O Juros Simples sera: R$" + String.format("%.2f", juros));
    }

    @Override
    public void calculavel(){
        System.out.println("Essa operacao e Calculavel!");
    }
}
