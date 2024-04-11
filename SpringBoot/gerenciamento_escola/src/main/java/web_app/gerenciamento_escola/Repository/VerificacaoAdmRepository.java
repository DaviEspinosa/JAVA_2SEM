package web_app.gerenciamento_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import web_app.gerenciamento_escola.Model.VerificacaoAdmModel;



public interface VerificacaoAdmRepository extends CrudRepository<VerificacaoAdmModel, String>{
    
    VerificacaoAdmModel findByCpf(String cpf);

}
