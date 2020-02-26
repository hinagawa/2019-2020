package ru.kpfu.itis.demo_1_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.demo_1_jpa.actions.AddAction;
import ru.kpfu.itis.demo_1_jpa.actions.AddActionImpl;
import ru.kpfu.itis.demo_1_jpa.dto.PostDto;
import ru.kpfu.itis.demo_1_jpa.jpa.Repo;

@Controller
public class HelloController {
    private AddAction addAction;
    AddActionImpl addActionImpl;
    Repo repo;
    @Autowired
    public HelloController(AddAction addAction, Repo repo,AddActionImpl addActionImpl){
        this.addAction=addAction;
        this.repo=repo;
        this.addActionImpl=addActionImpl;
    }
    @GetMapping("/allnote")
    public String showAll( @RequestParam(defaultValue = "1", required = false) int page, Model model) {

        int pages = (int) Math.ceil((double) repo.findAll().size() / 5);
        if (pages == page) {
            model.addAttribute("pages", pages);
            model.addAttribute("notes", repo.findAll().subList(page * 5 - 5, repo.findAll().size()));
        } else if (pages > page && page > 0) {
            model.addAttribute("pages", pages);
            model.addAttribute("notes", repo.findAll().subList(page * 5 - 5, page * 5));
        } else {
            model.addAttribute("pages", 1);
            model.addAttribute("notes", repo.findAll().subList(0, 5));
        }

        return "allnotes";
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
    @GetMapping("/note")
    public String addNote(){
        return "note";
    }
    @PostMapping ("/note")
    public String addNote(PostDto pdto){
        addAction.addNote(pdto);
        return "note";
    }

}
