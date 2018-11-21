package com.galvanize.ThanksGivingProject.GenerateCharacter.controller;

import com.galvanize.ThanksGivingProject.GenerateCharacter.model.CharacterProfiles;
import com.galvanize.ThanksGivingProject.GenerateCharacter.service.CharacterService;
import com.galvanize.ThanksGivingProject.GenerateCharacter.service.InvalidClassNameException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/character/gen/")
public class CharacterController {


    private final CharacterService characterService;
    private final Logger slf4jLogger = LoggerFactory.getLogger(CharacterController.class);

    public CharacterController(CharacterService characterService){
        this.characterService = characterService;
    }

    //Endpoint to create a new Character
    @PostMapping("/{name}/{anClass}")
    public CharacterProfiles generateCharacter(@PathVariable String name, @PathVariable String anClass) throws InvalidClassNameException {
        try {
            return characterService.generateCharacter(name,anClass);
        }catch (InvalidClassNameException e){
            throw new InvalidClassNameException();
        }


    }


}
