package web_app.gerenciamento_escola.Repository;

import org.springframework.data.repository.CrudRepository;

import web_app.gerenciamento_escola.Model.AdmModel;


// Está classe simplifica a criação de métodos CRUD (save, update etc...) 
public interface AdmRepository extends CrudRepository<AdmModel, String> {
    
    AdmModel findBySenha(String senha);
    AdmModel findByEmail(String email);

    boolean existsBySenha(String senha);
    boolean existsByEmail(String email);
    //...
}
