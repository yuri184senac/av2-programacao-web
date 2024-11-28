package fila.banco.itau.services;

import fila.banco.itau.dto.SenhaDTO;
import fila.banco.itau.entities.Senha;
import fila.banco.itau.repositories.SenhaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SenhaService {

    private final SenhaRepository senhaRepository;

    public SenhaService(final SenhaRepository senhaRepository) {

        this.senhaRepository = senhaRepository;
    }

    @Transactional
    public SenhaDTO adicionarSenha(final SenhaDTO senhaDTO) {
        Senha senha = new Senha(senhaDTO);
        senhaRepository.save(senha);
        return senhaDTO;
    }

    public List<Senha> listarSenhas() {

        return this.senhaRepository.findAll();
    }
}
