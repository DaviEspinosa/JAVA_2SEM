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
import web_app.gerenciamento_escola.Model.ProfessorModel;
import web_app.gerenciamento_escola.Repository.AlunoRepository;
import web_app.gerenciamento_escola.Repository.ProfessorRepository;

@Controller
public class VerificarProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;
    @Autowired
    private AlunoRepository alunoRepository;

    ModelAndView mv = new ModelAndView();

    // "cadastrar-aluno" é o nome que se da lá no action do meu form (html)
    @PostMapping("cadastrar-professor")
    public ModelAndView cadastroProfessor(ProfessorModel professor, RedirectAttributes attributes) {

        // redirecionando para Login do Adm
        ModelAndView mv = new ModelAndView("redirect:interna-adm");

        professorRepository.save(professor);
        String mensagem = "Cadastro realizado com sucessoooooooooooo";
        System.out.println(mensagem);
        attributes.addFlashAttribute(mensagem);
        attributes.addFlashAttribute("mensagem", "Cadastro de Aluno realizado com sucesso");

        return mv;
    }

    @PostMapping("loginProfessor")
    public ModelAndView loginProfessor(ProfessorModel professor, RedirectAttributes attributes) {

        ModelAndView mv = new ModelAndView("redirect:interna-professor");
        // booleana para verificar existencia de cpf no bd
        boolean verificaCpf = professorRepository.existsByCpf(professor.getCpf());
        // booleana para verificar existencia de senha no bd
        boolean verificaSenha = professorRepository.existsBySenha(professor.getSenha());
        // booleana para verificar existencia de nomeProfessor no bd
        // boolean verificaNome = professorRepository.existsByProfessor(professor.getProfessor());
        // // String nomeProfessor = verificaNome ? professor.getProfessor() : "Não";

        // Verificando se não está vazio
        if (!professor.getCpf().isEmpty() || !professor.getSenha().isEmpty()) {

            // se houver dados no bando de dados
            if (verificaCpf && verificaSenha) {
                mv.setViewName("redirect:interna-professor");
                // attributes.addFlashAttribute("nomeUsuario", nomeProfessor);
            } else {
                attributes.addFlashAttribute("mensagemErro", "Ops! Parece que você não tem cadastro ");
                mv.setViewName("redirect:loginAP");
            }

        } else {
            attributes.addFlashAttribute("mensagemErro", "Ops! Por favor preencha os campos corretamente");
            mv.setViewName("redirect:loginAP");
        }
        return mv;
    }
    

    // @PostMapping("/interna-professor")
    // public String nomeProfessor(Model model, ProfessorModel profModel) {
    //     model.addAttribute("professor", professorRepository.findByProfessor(profModel.getProfessor()));
    //     return "interna/interna-professor";
    // }
}
