public abstract class Empregado {
    protected long matricula;
    protected String nome;

    public abstract double CalcularSalario();


    public String getDados(){
    String aux ="";
    aux += "\n" +"Matricula: " +matricula +"\n";
    aux += "Nome: " +nome +"\n";
        return aux;
    }

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
}
