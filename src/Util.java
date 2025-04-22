import javax.swing.*;

public class Util {
   private Controle controle = new Controle();

    public void menu(){
    int option;
    String selecao = "1- Inserir Empregado\n 2- Pesquisar funcionário\n 3- Listar funcionários\n 4- Encerrar programa";
    do {
        option = Integer.parseInt(JOptionPane.showInputDialog(null, selecao));
        if(option>4 || option<1){
            JOptionPane.showMessageDialog(null,"Opção inválida.");
        } else {
            switch (option){
                case 1:
                    inserirEmpregado();
                    break;
                case 2:
                    pesquisar();
                    break;
                case 3:
                    listar();
                    break;
            }
        }
    }while (option!=4);
    }
    private void inserirEmpregado(){
        long matricula;
        String nome;
        double totalDeVendas;
        double comissao;
        int horasTrab;
        double valorHora;
        int option;
        String selecao = "1- Empregado Comissionado\n 2 - Empregado Horista\n 3- Sair";

        while(true){
            option = Integer.parseInt(JOptionPane.showInputDialog(null,selecao));
            if (option==3){
                break;

            }
            if (option==1 || option==2){
                nome = JOptionPane.showInputDialog(null,"Nome do empregado: ");
                matricula = Long.parseLong(JOptionPane.showInputDialog(null,"Matricula do empregado"));
                if(option ==1 ){
                    totalDeVendas = Double.parseDouble(JOptionPane.showInputDialog(null,"Total de vendas do empregado: "));
                    comissao = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor da comissao do empregado"));
                    controle.inserir(new EmpregadoComissionado(matricula,nome,totalDeVendas,comissao));
                } else {
                    horasTrab = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de horas trabalhadas: "));
                    valorHora = Double.parseDouble(JOptionPane.showInputDialog(null,"valor da hora trabalhada."));
                    controle.inserir(new EmpregadoHorista(matricula,nome,horasTrab,valorHora));
                }
            }

        }

    }
    private void pesquisar(){
        long matricula;
        matricula = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero do RM a ser pesquisado: "));
        Empregado empregado = controle.pesquisar(matricula);
        if(empregado == null){
            JOptionPane.showMessageDialog(null,"Usuario não encontrado.");
        } else {
            JOptionPane.showMessageDialog(null, empregado.getDados());
        }

    }
    private void listar(){

        String aux = controle.listar();
        JOptionPane.showMessageDialog(null, aux);
    }
}
