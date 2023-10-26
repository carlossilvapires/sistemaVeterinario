package sistemaveterinaria.controller;
import java.util.ArrayList;
import sistemaveterinaria.model.Funcionario;

public class FicharioPessoas {
    
    private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    private ArrayList<Funcionario> listaClientes = new ArrayList<>();

    public FicharioPessoas() {}

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public ArrayList<Funcionario> getListaClientes() {
        return listaClientes;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public void setListaClientes(ArrayList<Funcionario> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    
    
    
}
