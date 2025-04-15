import java.text.DecimalFormat;

public class EmpregadoHorista extends Empregado{
    private int totalDeHorasTrabalhadas;
    private double valorDaHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
        super(matricula, nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    public double CalcularSalario(){
        return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
    }
    public String getDados(){
        DecimalFormat fp = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de horas trabalhadas: " +totalDeHorasTrabalhadas +"\n";
        aux += "Valor da hora trabalhada:  R$" +fp.format(valorDaHoraTrabalhada) +"\n";
        return aux;
    }

    public int getTotalDeHorasTrabalhadas() {
        return totalDeHorasTrabalhadas;
    }

    public void setTotalDeHorasTrabalhadas(int totalDeHorasTrabalhadas) {
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
    }

    public double getValorDaHoraTrabalhada() {
        return valorDaHoraTrabalhada;
    }

    public void setValorDaHoraTrabalhada(double valorDaHoraTrabalhada) {
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }
}
