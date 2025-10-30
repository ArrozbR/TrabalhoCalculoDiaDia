public class IMC extends Calculo{
    double peso;
    double altura;
    double resultadoIMC;

    public IMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public void executar() {
        resultadoIMC = peso / (altura * altura);
        System.out.println("Seu IMC: " + String.format("%.2f", resultadoIMC));
    }
}
