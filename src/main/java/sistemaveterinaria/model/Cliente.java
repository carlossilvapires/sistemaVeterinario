package sistemaveterinaria.model;

import java.util.ArrayList;

public class Cliente {
    
    private int qtdeTratamentos;
    private ArrayList<Animal> listaAnimais = new ArrayList<>();

    public Cliente(int qtdeTratamentos) {
        this.qtdeTratamentos = qtdeTratamentos;
    }
    
    public Cliente(){}

    public int getQtdeTratamentos() {
        return qtdeTratamentos;
    }

    public ArrayList<Animal> getListaAnimais() {
        return listaAnimais;
    }

    public void setQtdeTratamentos(int qtdeTratamentos) {
        this.qtdeTratamentos = qtdeTratamentos;
    }

    public void setListaAnimais(ArrayList<Animal> listaAnimais) {
        this.listaAnimais = listaAnimais;
    }
}
