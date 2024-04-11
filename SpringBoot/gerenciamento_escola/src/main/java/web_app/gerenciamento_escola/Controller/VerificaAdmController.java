package web_app.gerenciamento_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import web_app.gerenciamento_escola.Repository.AdmRepository;
import web_app.gerenciamento_escola.Repository.VerificacaoAdmRepository;

@Controller
public class VerificaAdmController {

    // atributoss
    boolean acessoInternoNavegacaoAdm = false;

    @Autowired
    private AdmRepository admRepository;
    @Autowired
    private VerificacaoAdmRepository  verificaAdmRepository;

    //métodos
    
    
}
