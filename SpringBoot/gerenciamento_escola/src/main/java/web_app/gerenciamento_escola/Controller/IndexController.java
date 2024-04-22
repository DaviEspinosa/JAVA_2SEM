package web_app.gerenciamento_escola.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class IndexController {
    
    @GetMapping("/")
    public String acessoHome() {
        return "index";
    }
    @GetMapping("/cadastro-adm")
    public String acessoPageCadastroAdm() {
        return "cadastro/cadastro-adm";
    }
    @GetMapping("/pre-cadastro")
    public String acessoPagePreCadAdm() {
        return "cadastro/pre-cadastro";
    }
    @GetMapping("/login-adm")
    public String acessoPageLoginAdm() {
        return "login/login-adm";
    }
    
    

}
