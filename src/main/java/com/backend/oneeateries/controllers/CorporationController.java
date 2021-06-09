package com.backend.oneeateries.controllers;

import com.backend.oneeateries.Model.Corporation;
import com.backend.oneeateries.Repositories.CorporationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/corporation/")

public class CorporationController {
    @Autowired
    private CorporationRepository repository;
    @GetMapping("/")
    public List<Corporation> getAllCorporations(){
        log.info(repository.corporationList.toString());
        return repository.corporationList;
    }
    @PostMapping("/")
    public void addCorporation(@Validated @RequestBody Corporation corporation){
        log.info(repository.addCorporation(corporation));
    }

}
