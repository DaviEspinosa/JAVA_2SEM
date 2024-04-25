package web_app.gerenciamento_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import web_app.gerenciamento_escola.Model.ProfessorModel;


public interface ProfessorRepository extends CrudRepository<ProfessorModel, String> {
    
    ProfessorModel findByCpf(String cpf);
    ProfessorModel findBySenha(String senha);
    ProfessorModel findByProfessor(String professor);

    boolean existsByCpf(String cpf);
    boolean existsBySenha(String senha);
    boolean existsByProfessor(String professor);



}
