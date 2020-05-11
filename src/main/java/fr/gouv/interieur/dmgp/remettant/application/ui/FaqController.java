package fr.gouv.interieur.dmgp.remettant.application.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FaqController {

    @GetMapping("/faq")
    public String afficherFaq(Model model) {
        return "faq";
    }
}
