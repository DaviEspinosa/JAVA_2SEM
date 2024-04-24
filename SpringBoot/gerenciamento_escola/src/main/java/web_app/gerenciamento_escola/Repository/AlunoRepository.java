package web_app.gerenciamento_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import web_app.gerenciamento_escola.Model.AlunoModel;
import java.util.List;


public interface AlunoRepository extends CrudRepository<AlunoModel, String> {
    
    AlunoModel findByRa(String ra);
    AlunoModel findBy(String senha);

    boolean existsByRa(String ra);
    boolean existsBySenha(String senha);

}
