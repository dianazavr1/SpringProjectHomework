package org.example.spring_project.controller;
import org.example.spring_project.scopes.PrototypeScopedBean;
import org.example.spring_project.scopes.SingletonScopedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScopeController {

    @Autowired
    private SingletonScopedBean singletonBean;

    @Autowired
    private PrototypeScopedBean prototypeBean;

    @GetMapping("/scopes")
    public String scopes(Model model){
        model.addAttribute("singleton", singletonBean.getId());
        model.addAttribute("prototype", prototypeBean.getId());
       // model.addText("singleton");
       // model.addText("prototype");
        return "scopes";
    }
}
