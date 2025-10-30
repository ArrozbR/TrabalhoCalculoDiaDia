public class SalarioLiquido extends Calculo{
    double salarioBruto;
    double salarioLiquido;
    double INSS;
    double outros = 0;

    public SalarioLiquido(double salarioBruto, double INSS) {
        this.salarioBruto = salarioBruto;
        this.INSS = INSS;
    }

    public SalarioLiquido(double salarioBruto, double INSS, double outros) {
        this.salarioBruto = salarioBruto;
        this.INSS = INSS;
        this.outros = outros;
    }

    @Override
    public void executar() {
        if(this.outros != 0){
            salarioLiquido = salarioBruto - (salarioBruto * INSS) - outros;
            System.out.println("Seu Salario Liquido sera: R$" + String.format("%.2f", salarioLiquido));
        }
        else{
            salarioLiquido = salarioBruto - (salarioBruto * INSS);
            System.out.println("Seu Salario Liquido sera: R$" + String.format("%.2f", salarioLiquido));
        }
    }
}
