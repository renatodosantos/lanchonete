package br.com.lanchonete.controle;

import br.com.lanchonete.servico.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CardapioController {

    @Autowired
    CardapioService cardapio;

    @GetMapping("/cardapio")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("lanches", cardapio.getLanches());
        return "cardapio";
    }

}
