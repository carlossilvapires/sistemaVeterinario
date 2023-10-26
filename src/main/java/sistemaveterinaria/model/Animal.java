package sistemaveterinaria.model;


public class Animal {
    
    private String nome;
    private String sexo;
    private String especie;
    private int identificador;
    private Cliente dono;
    private String restricoesMedicamentos;
    private String sintomas;

    public Animal(String nome, String sexo, String especie, int identificador, Cliente dono, String restricoesMedicamentos, String sintomas) {
        this.nome = nome;
        this.sexo = sexo;
        this.especie = especie;
        this.identificador = identificador;
        this.dono = dono;
        this.restricoesMedicamentos = restricoesMedicamentos;
        this.sintomas = sintomas;
    }

    public String getSintomas() {
        return sintomas;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdentificador() {
        return identificador;
    }

    public Cliente getDono() {
        return dono;
    }

    public String getRestricoesMedicamentos() {
        return restricoesMedicamentos;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public void setRestricoesMedicamentos(String restricoesMedicamentos) {
        this.restricoesMedicamentos = restricoesMedicamentos;
    }
}
