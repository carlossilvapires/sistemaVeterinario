package sistemaveterinaria.model;

public class Funcionario extends Pessoa{
    
    private String cargo;
    private String ctps;
    private float salario;

    public Funcionario(String cargo, String ctps, float salario, String nome, String cpf, String sexo, String email, String telefone) {
        super(nome, cpf, sexo, email, telefone);
        this.cargo = cargo;
        this.ctps = ctps;
        this.salario = salario;
    }
    
    public Funcionario(){
        super();
    }

    public String getCargo() {
        return cargo;
    }

    public String getCtps() {
        return ctps;
    }

    public float getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
