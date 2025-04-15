import java.text.DecimalFormat;

public class EmpregadoComissionado extends Empregado{
    private double totalVendas;
    private double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalVendas, double comissao) {
        super(matricula, nome);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public double CalcularSalario(){
        return (totalVendas *comissao/100);
    }
    public String getDados(){
        DecimalFormat fp = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de vendas: R$" +fp.format(totalVendas) +"\n";
        aux += "Comissao: " +fp.format(comissao) +"%\n";
        return aux;
    }

}
