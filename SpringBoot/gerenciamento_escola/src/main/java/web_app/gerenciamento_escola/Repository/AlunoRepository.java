package web_app.gerenciamento_escola.Repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import web_app.gerenciamento_escola.Model.AlunoModel;


public interface AlunoRepository extends CrudRepository<AlunoModel, String> {

    // @Query("SELECT aluno FROM aluno_model aluno")
    // List<AlunoModel> findByIdList();
    
    AlunoModel findByRa(String ra);
    AlunoModel findBySenha(String senha);

    boolean existsByRa(String ra);
    boolean existsBySenha(String senha);

       // Método para buscar alunos pela disciplina (contendo uma parte do disciplina)
    List<AlunoModel> findByDisciplinaContaining(String disciplina);

}
