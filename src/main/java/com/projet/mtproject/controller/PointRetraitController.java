package com.projet.mtproject.controller;

import com.projet.mtproject.model.PointRetrait;
import com.projet.mtproject.service.PointRetraitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/point-retrait")
@CrossOrigin
public class PointRetraitController {
    @Autowired
    private PointRetraitService pointRetraitService;

    @PostMapping("/ajout")
    public @ResponseBody Boolean save(@RequestBody PointRetrait pointRetrait){
        return pointRetraitService.save(pointRetrait);
    }

    @GetMapping("/liste")
    public @ResponseBody
    List<PointRetrait>list(){
        return pointRetraitService.liste();
    }
}
