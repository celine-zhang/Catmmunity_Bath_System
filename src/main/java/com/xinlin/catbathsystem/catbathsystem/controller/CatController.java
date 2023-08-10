package com.xinlin.catbathsystem.catbathsystem.controller;

import com.xinlin.catbathsystem.catbathsystem.entity.Cat;
import com.xinlin.catbathsystem.catbathsystem.service.CatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CatController {
    private CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    //handler method
    @GetMapping("/catsbathing")
    public String listCats(Model model){
        model.addAttribute("cats",catService.getAllCats());
        return "cats";

    }
    @GetMapping("/cats/new")

    public String createNewAppointment(Model model){
        Cat cat = new Cat();
        model.addAttribute("cat",cat);
        return "create_cat";

    }

    @PostMapping("/cats")
    public String saveCats(@ModelAttribute("cat") Cat cat){
        catService.saveCat(cat);
        return "redirect:/catsbathing";
    }

    @GetMapping("/cats/edit/{id}")
    public String eidtCatForm(@PathVariable Long id, Model model){
        model.addAttribute("cat",catService.getCatById(id));
        return "edit_cat";
    }

    @PostMapping("/cats/{id}")
    public String updateCat(@PathVariable  Long id, @ModelAttribute("cat") Cat cat, Model model){
        Cat existingCat = catService.getCatById(id);
        existingCat.setId(id);
        existingCat.setName(cat.getName());
        existingCat.setBreed(cat.getBreed());
        existingCat.setEmail(cat.getEmail());
        //save
        catService.updateCat(existingCat);
        return "redirect:/catsbathing";
    }

    @GetMapping("/cats/{id}")
    public String deleteCat(@PathVariable Long id){
        catService.deleteCatById(id);
        return "redirect:/catsbathing";
    }


}
