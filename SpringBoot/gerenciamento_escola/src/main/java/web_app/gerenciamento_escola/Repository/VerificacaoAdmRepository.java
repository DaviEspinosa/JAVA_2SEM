package web_app.gerenciamento_escola.Repository;

import org.springframework.data.repository.CrudRepository;


import web_app.gerenciamento_escola.Model.VerificacaoAdmModel;



public interface VerificacaoAdmRepository extends CrudRepository<VerificacaoAdmModel, String>{
    
    //Pegando os atributos do Model para fazer a verificação
    VerificacaoAdmModel findByCpf(String cpf);
    VerificacaoAdmModel findBySenha(String senha);

    boolean existsByCpf(String cpf);
    boolean existsBySenha(String senha);

}
