package ru.itis.kpfu.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itis.kpfu.demo.dto.PostDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
public class HelloController {
    private List<PostDto> pDtos = new ArrayList<>();
    List<PostDto> findNotes = new ArrayList<>();
    String optimizedSearch = " ";


    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @PostMapping("/note")
    public String write(@ModelAttribute PostDto pdto) {
        pDtos.add(pdto);
        return "redirect:note";
    }

    @GetMapping("/note")
    public String getAdd() {
        return "note";
    }

    @GetMapping("/allnote")
    public String showAll( @RequestParam(defaultValue = "1", required = false) int page, Model model) {


            int pages = (int) Math.ceil((double) pDtos.size() / 5);
            if (pages == page) {
                model.addAttribute("pages", pages);
                model.addAttribute("notes", pDtos.subList(page * 5 - 5, pDtos.size()));
            } else if (pages > page && page > 0) {
                model.addAttribute("pages", pages);
                model.addAttribute("notes", pDtos.subList(page * 5 - 5, page * 5));
            } else {
                model.addAttribute("pages", 1);
                model.addAttribute("notes", pDtos.subList(0, 5));
            }

        return "allnotes";
    }

}