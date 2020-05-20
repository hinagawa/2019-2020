package ru.kpfu.itits.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itits.demo.service.AdminRouteService;

@Controller
public class RouteController {

    @Qualifier("adminRouteServiceImpl")
    @Autowired
    AdminRouteService ars;
    @RequestMapping(value = "/routes", method = RequestMethod.GET)
   public String getRoutesPage(Model model){
        System.out.println(model.addAttribute("routes", ars.getAllRoutes()));
        model.addAttribute("routes", ars.getAllRoutes());
        return "routes";

    }
}
