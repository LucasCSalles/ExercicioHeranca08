public class Controle {
   private Empregado[] list = new Empregado[5];
   private int indx=0;

    public void inserir(Empregado empregado){
    this.list[indx++]= empregado;
    }

    public Empregado pesquisar(long matricula){
        for (int i = 0; i < indx; i++) {
            if (matricula == list[i].matricula){
                return list[i];
            }
        }
        return null;
    }

    public String listar(){
        String aux = "";
        for (int i = 0; i < indx; i++) {
            aux += list[i].getDados();
        }
        return aux;
    }

}
