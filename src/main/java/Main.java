public class Main {
    public static void main(String[] args) {
        SalarioLiquido salarioLiquido1 = new SalarioLiquido(5000, 0.14, 258);
        SalarioLiquido salarioLiquido2 = new SalarioLiquido(5000, 0.14);
        salarioLiquido1.executar();
        salarioLiquido2.executar();
        System.out.println();

        IMC imc1 = new IMC(83, 1.75);
        imc1.executar();
        System.out.println();

        ConversaoMoeda conversaoMoeda1 = new ConversaoMoeda(20, Moedas.dolar);
        ConversaoMoeda conversaoMoeda2 = new ConversaoMoeda(20, Moedas.euro);
        ConversaoMoeda conversaoMoeda3 = new ConversaoMoeda(20, Moedas.iene);
        ConversaoMoeda conversaoMoeda4 = new ConversaoMoeda(20, 5);
        conversaoMoeda1.executar();
        conversaoMoeda2.executar();
        conversaoMoeda3.executar();
        conversaoMoeda4.executar();
        System.out.println();

        JurosSimples jurosSimples1 = new JurosSimples(1000, 0.12,3);
        JurosComposto jurosComposto1 = new JurosComposto(2500, 0.01, 12);
        jurosSimples1.executar();
        jurosComposto1.executar();
        System.out.println();

        ConsumoEnergia consumoEnergia1 = new ConsumoEnergia(1000, 0.5);
        consumoEnergia1.executar();
    }
}