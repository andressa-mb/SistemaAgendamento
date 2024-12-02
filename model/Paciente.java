package Atividade3.model;

public class Paciente {

    private String nome;
    private String telefone;
    private String cpf;
    private String dataConsulta;
    private boolean ehCliente;
    private boolean consultaRealizada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public boolean getEhCliente() {
        return ehCliente;
    }

    public void setEhCliente(boolean ehCliente) {
        this.ehCliente = ehCliente;
    }

    public boolean getConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(boolean consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

}
