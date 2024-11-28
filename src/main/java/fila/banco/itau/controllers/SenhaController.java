package fila.banco.itau.controllers;


import fila.banco.itau.dto.SenhaDTO;
import fila.banco.itau.entities.Senha;
import fila.banco.itau.services.SenhaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/senhas")
public class SenhaController {
    private final SenhaService senhaService;

    public SenhaController(final SenhaService senhaService) {
        this.senhaService = senhaService;
    }

    @GetMapping
    public ResponseEntity<List<Senha>> listarSenhas() {
        List<Senha> senha = senhaService.listarSenhas();
        return ResponseEntity.ok(senha);
    }

    @PostMapping
    public ResponseEntity<SenhaDTO> adicionarSenha(@RequestBody SenhaDTO senhaDTO) {
        SenhaDTO novaSenha = senhaService.adicionarSenha(senhaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaSenha);
    }
}
