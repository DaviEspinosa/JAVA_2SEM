package web_app.gerenciamento_escola.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import web_app.gerenciamento_escola.Model.AdmModel;
import web_app.gerenciamento_escola.Model.AlunoModel;
import web_app.gerenciamento_escola.Repository.AlunoRepository;

@Controller
public class VerificaAlunoController {
    
    private AlunoRepository alunoRepository;
    ModelAndView mv = new ModelAndView();

    // "cadastrar-aluno" é o nome que se da lá no action do meu form (html)
    @PostMapping("cadastrar-aluno")
    public ModelAndView cadastroAdm(AlunoModel aluno, RedirectAttributes attributes) {

        // Verificando entrada de Cpf
        boolean verificaRa = alunoRepository.existsByRa(aluno.getRa());
        //Verificando se existe senha
        boolean verificaSenha = alunoRepository.existsBySenha(aluno.getSenha());
        // redirecionando para Login do Adm
        ModelAndView mv = new ModelAndView("redirect:interna-adm");
        

        if (verificaRa && verificaSenha) {
            alunoRepository.save(aluno);
            String mensagem = "Cadastro realiado com sucessoooooooooooo";
            System.out.println(mensagem);
            attributes.addFlashAttribute(mensagem);
            attributes.addFlashAttribute("mensagem", "Cadastro de Aluno realizado com sucesso");
        }
        else{
            String mensagem = "Erro ao Cadastrar";
            System.out.println(mensagem);
            mv.setViewName("redirect:interna-adm");
        }

        return mv;
    }
}
