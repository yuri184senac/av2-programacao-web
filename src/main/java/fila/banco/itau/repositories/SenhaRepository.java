package fila.banco.itau.repositories;



import fila.banco.itau.entities.Senha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SenhaRepository extends JpaRepository<Senha, Long> {

}
