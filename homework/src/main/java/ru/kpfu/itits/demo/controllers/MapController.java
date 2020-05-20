package ru.kpfu.itits.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itits.demo.repository.RouteRepository;

@Controller
public class MapController {
    @Autowired
    RouteRepository routeRepository;

    @GetMapping("/map")
    public String getMapPage() {
        return "map";

    }
    @PostMapping("/map")
    public String getBy(Model model, @RequestParam("search") String search){
        model.addAttribute("maps", routeRepository.findAllByFromcountry(search));
        return "route_find";

    }

}
