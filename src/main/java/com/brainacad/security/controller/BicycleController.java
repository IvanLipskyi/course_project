package com.brainacad.security.controller;

import com.brainacad.security.dao.BicycleRepository;
import com.brainacad.security.entity.Bicycle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.beans.Transient;

@Controller
public class BicycleController {
private final BicycleRepository bicycleRepository;

    public BicycleController(BicycleRepository bicycleRepository) {
        this.bicycleRepository = bicycleRepository;
    }

    @RequestMapping(value = {"/bicycles"}, method = RequestMethod.GET)
    public String bicyclesPage(Model model){
        model.addAttribute("title", "Bicycles");
        model.addAttribute("bicycles", bicycleRepository.findAll());
        return "bicyclesPage";
    }

    @GetMapping("/new")
    public String showSignUpForm( Model model) {
        model.addAttribute("bicycleAdd", new Bicycle());
        return "add-bicycle";
    }

    @PostMapping("/add")
    public String addBicycle(@Valid Bicycle bicycle,
                            BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-bicycle";
        }
        bicycleRepository.save(bicycle);
        Iterable<Bicycle> bicycles = bicycleRepository.findAll();
        model.addAttribute("bicycles", bicycles);
        return "bicyclesPage";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Bicycle bicycle = bicycleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid bicycle Id:" + id));
        model.addAttribute("bicycle", bicycle);
        return "update-bicycle";
    }

    @PostMapping("/update/{id}")
    public String updateBicycle(@PathVariable("id") long id,
                               @Valid Bicycle bicycle, BindingResult result, Model model) {
        if (result.hasErrors()) {
            bicycle.setId(id);
            return "update-bicycle";
        }
        bicycleRepository.save(bicycle);
        model.addAttribute("bicycles", bicycleRepository.findAll());
        return "bicyclesPage";
    }

    @Transient
    @GetMapping("/delete/{id}")
    public String deleteClient(@PathVariable("id") long id, Model model) {
        bicycleRepository.deleteById(id);
        model.addAttribute("bicycles", bicycleRepository.findAll());
        return "bicyclesPage";
    }

}
