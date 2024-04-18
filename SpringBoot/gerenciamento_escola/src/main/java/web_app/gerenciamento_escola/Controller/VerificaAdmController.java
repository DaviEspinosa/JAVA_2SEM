package web_app.gerenciamento_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import web_app.gerenciamento_escola.Model.AdmModel;
import web_app.gerenciamento_escola.Model.VerificacaoAdmModel;
import web_app.gerenciamento_escola.Repository.AdmRepository;
import web_app.gerenciamento_escola.Repository.VerificacaoAdmRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class VerificaAdmController {

    // atributoss
    boolean acessoInternoNavegacaoAdm = false;


    @Autowired
    private AdmRepository admRepository;
    @Autowired
    private VerificacaoAdmRepository  verificaAdmRepository;

    //métodos
    // "cadastrar-adm" é o nome que se da lá no action do meu form (html)
    @PostMapping("cadastrar-adm")
    public ModelAndView cadastroAdm(AdmModel adm, RedirectAttributes attributes) {

        // Verificando entrada de Cpf
        boolean verificaCpf = verificaAdmRepository.existsById(adm.getCpf());
        // redirecionando para Login do Adm
        ModelAndView mv = new ModelAndView("redirect:/login-adm");
        

        if (verificaCpf) {
            admRepository.save(adm);
            String mensagem = "Cadastro realiado com sucesso";
            System.out.println(mensagem);
            attributes.addFlashAttribute(mensagem);
            attributes.addFlashAttribute("classe", "Vermelho");
        }
        else{
            String mensagem = "Erro ao Cadastrar";
            System.out.println(mensagem);
            mv.setViewName("redirect:cadastro-adm");
        }

        return mv;
    }

    //Pré-Cadastro do adm
    @PostMapping("preCad")
    public ModelAndView precadAdm(VerificacaoAdmModel autadm, RedirectAttributes attributes) {

        ModelAndView mv = new ModelAndView("redirect:/pre-cadastro");

            verificaAdmRepository.save(autadm);
            String mensagem = "Cadastro realizado com sucesso";
            System.out.println(mensagem);
            attributes.addFlashAttribute(mensagem);
            attributes.addFlashAttribute("classe", "Vermelho");

        return mv;
    }
}
    
