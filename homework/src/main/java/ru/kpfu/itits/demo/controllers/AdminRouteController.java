package ru.kpfu.itits.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itits.demo.dto.RouteDto;
import ru.kpfu.itits.demo.service.AdminRouteService;
@Controller
public class AdminRouteController {
    @Qualifier("adminRouteServiceImpl")
    @Autowired
    private AdminRouteService service;

    @RequestMapping(value = "/adminRoutes", method = RequestMethod.GET)
    public String getAdminRoutePage() {
        return "admin_routes";
    }

    @RequestMapping(value = "/adminRoutes", method = RequestMethod.POST)
    public String AdminRoutePage(@Validated RouteDto form) {
        service.AdminRoute(form);
        return "redirect:/routes";
    }
}
