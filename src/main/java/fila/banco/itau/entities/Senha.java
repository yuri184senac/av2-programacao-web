package fila.banco.itau.entities;


import fila.banco.itau.dto.SenhaDTO;
import jakarta.persistence.*;

@Entity
@Table(name= "senha")

public class Senha {

    public Senha() {

    }
    public Senha(SenhaDTO senhaDTO) {
        this.nome = senhaDTO.getNome();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long idSenha;

    @Column(name="nome", nullable = false)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdSenha() {
        return idSenha;
    }

    public void setIdSenha(Long idSenha) {
        this.idSenha = idSenha;
    }
}
