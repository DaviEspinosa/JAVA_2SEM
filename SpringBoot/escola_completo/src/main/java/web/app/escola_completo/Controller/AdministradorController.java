package web.app.escola_completo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import web.app.escola_completo.Model.Administrador;
import web.app.escola_completo.Repository.AdministradorRepository;


@Controller
public class AdministradorController {

    @Autowired
    private AdministradorRepository ar;
    
    @PostMapping("cadastro-adm")
    public String postCadastroAdm(Administrador adm) {
        //TODO: process POST request
        System.out.println("Cadastro Realizado com sucesso");
        return "login";
    }
    

}
