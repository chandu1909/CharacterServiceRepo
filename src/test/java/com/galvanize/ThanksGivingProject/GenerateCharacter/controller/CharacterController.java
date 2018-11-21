package com.galvanize.ThanksGivingProject.GenerateCharacter.controller;

import com.galvanize.ThanksGivingProject.GenerateCharacter.service.CharacterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/character/gen/")
public class CharacterController {


    private final CharacterService characterService;
    private final Logger slf4jLogger = LoggerFactory.getLogger(CharacterController.class);

    public CharacterController(CharacterService service){
        characterService = service;
    }

}
