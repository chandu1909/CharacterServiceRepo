package com.galvanize.ThanksGivingProject.GenerateCharacter.service;

import com.galvanize.ThanksGivingProject.GenerateCharacter.repository.CharacterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;
    private final Logger slf4jLogger = LoggerFactory.getLogger(CharacterRepository.class);

    public CharacterService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }
}
