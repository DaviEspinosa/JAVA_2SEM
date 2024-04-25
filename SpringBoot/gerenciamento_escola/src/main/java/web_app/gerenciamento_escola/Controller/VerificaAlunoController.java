package web_app.gerenciamento_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import web_app.gerenciamento_escola.Model.AlunoModel;
import web_app.gerenciamento_escola.Repository.AlunoRepository;




@Controller
public class VerificaAlunoController {
    
    @Autowired
    private AlunoRepository alunoRepository;

    ModelAndView mv = new ModelAndView();

    // "cadastrar-aluno" é o nome que se da lá no action do meu form (html)
    @PostMapping("cadastrar-aluno")
    public ModelAndView cadastroAluno(AlunoModel aluno, RedirectAttributes attributes) {

        // redirecionando para Login do Adm
        ModelAndView mv = new ModelAndView("redirect:interna-adm");
        
            alunoRepository.save(aluno);
            String mensagem = "Cadastro realizado com sucessoooooooooooo";
            System.out.println(mensagem);
            attributes.addFlashAttribute(mensagem);
            attributes.addFlashAttribute("mensagem", "Cadastro de Aluno realizado com sucesso");

        return mv;
    }

    // @PostMapping("listar-alunos")    
    // public String listaAlunos(AlunoModel aluno, RedirectAttributes attributes) {
    //     attributes.addFlashAttribute("alunos", alunoRepository.findAll());
    //     return "lista-alunos";
    // }
    
}
