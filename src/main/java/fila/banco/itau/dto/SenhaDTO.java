package fila.banco.itau.dto;

public class SenhaDTO {
    private String nome;
    public SenhaDTO() {

    }
    public SenhaDTO(final String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
