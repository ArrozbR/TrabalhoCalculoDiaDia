public class ConversaoMoeda extends Calculo{
    double valorReal;
    double cambioDolar = 5.37;
    double cambioEuro = 6.26;
    double cambioIene = 0.035;
    double cotacao;
    Moedas moedas;

    public ConversaoMoeda(double valorReal, Moedas moedas) {
        this.valorReal = valorReal;
        this.moedas = moedas;
    }

    public ConversaoMoeda(double valorReal, double cotacao) {
        this.valorReal = valorReal;
        this.cotacao = cotacao;
    }

    @Override
    public void executar(){
        if(this.moedas == moedas.dolar){
            System.out.println("O Valor em Dolares para R$" + String.format("%.2f", valorReal) + " sera: " + String.format("%.2f", valorReal / cambioDolar));
        } else if(this.moedas == moedas.euro){
            System.out.println("O Valor em Euro para R$" + String.format("%.2f", valorReal) + " sera: " + String.format("%.2f", valorReal / cambioEuro));
        }
        else if(this.moedas == moedas.iene){
            System.out.println("O Valor em Iene para R$" + String.format("%.2f", valorReal) + " sera: " + String.format("%.2f", valorReal / cambioIene));
        }
        else{
            System.out.println("O Valor para R$" + String.format("%.2f", valorReal) + " (utilizando a Cotacao "+ String.format("%.2f", cotacao) + ") sera: " + String.format("%.2f", valorReal / cotacao));
        }
    }
}
