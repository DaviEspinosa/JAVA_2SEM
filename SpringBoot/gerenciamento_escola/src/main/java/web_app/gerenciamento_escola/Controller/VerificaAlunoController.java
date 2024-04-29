package web_app.gerenciamento_escola.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ModelAndView cadastroAluno(AlunoModel alunos, RedirectAttributes attributes) {

        // redirecionando para Login do Adm
        ModelAndView mv = new ModelAndView("redirect:interna-adm");
        
            alunoRepository.save(alunos);
            String mensagem = "Cadastro realizado com sucessoooooooooooo";
            System.out.println(mensagem);
            attributes.addFlashAttribute(mensagem);
            attributes.addFlashAttribute("mensagem", "Cadastro de Aluno realizado com sucesso");

        return mv;
    }

    @GetMapping("/interna-professor")    
    public String listaAlunos(Model model) {
        model.addAttribute("alunos", alunoRepository.findAll());
        return "interna/interna-professor";
    }

    
    // @GetMapping("pesquisarAlunos")
    // public String pesquisarAlunos(@RequestParam String alunos, Model model) {
    //     // Realiza a pesquisa de alunos por nome
    //     List<AlunoModel> alunoPes = alunoRepository.findByAlunoContaining(alunos);
    //     model.addAttribute("alunosPes", alunoPes);
    //     return "interna/interna-professor";
    // }
}
