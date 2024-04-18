package web_app.gerenciamento_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import web_app.gerenciamento_escola.Model.AdmModel;
import java.util.List;




// Está classe simplifica a criação de métodos CRUD (save, update etc...) 
public interface AdmRepository extends CrudRepository<AdmModel, String> {
    
    AdmModel findByCpf(String cpf);
    AdmModel findBySenha(String senha);
    AdmModel findByEmail(String email);
}
