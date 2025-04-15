//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empregado[] empregado = new Empregado[3];
        empregado[0] = new EmpregadoComissionado(1,"GAGA",500,10);
        empregado[1] = new EmpregadoHorista(2,"ENZO",200,180);
        empregado[2] = new EmpregadoComissionado(3,"LUCAS",1000,50);
        for (Empregado e : empregado) {
            System.out.println(e.getDados());
            System.out.println(e.CalcularSalario());
        }

    }
}