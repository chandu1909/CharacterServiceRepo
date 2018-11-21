package com.galvanize.ThanksGivingProject.GenerateCharacter.service;

import com.galvanize.ThanksGivingProject.GenerateCharacter.model.CharacterProfiles;
import com.galvanize.ThanksGivingProject.GenerateCharacter.repository.CharacterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;
    private final Logger slf4jLogger = LoggerFactory.getLogger(CharacterRepository.class);
    

    //private CharacterProfiles characterProfiles;


    public CharacterService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;


    }




    public CharacterProfiles generateCharacter( String name, String anClass) throws InvalidClassNameException {



            CharacterProfiles characterProfiles = new CharacterProfiles();
            ArrayList randomValues = new ArrayList();

            characterProfiles.setAnClass(anClass);
            characterProfiles.setName(name);
            int hit;

            /*filling the arrayList with the random values generated...!!!*/
            for (int i = 0; i < 6; i++) {
                int result = randomValueGenerator();
                randomValues.add(result);
            }
            Collections.sort(randomValues);
            Collections.reverse(randomValues); //all values sorted in order

            characterProfiles.setCon((int) randomValues.get(4));
            characterProfiles.setLocation(4);
            hit = ((int) randomValues.get(4)) * 2;
            characterProfiles.setHitPoints(hit);

            switch (anClass) {

                case "Warrior":
                    //Highest and lowest assignments
                    characterProfiles.setStr((int) randomValues.get(0));
                    characterProfiles.setAnInt((int) randomValues.get(randomValues.size() - 1));

                    //rest of the values
                    characterProfiles.setWis((int) randomValues.get(1));
                    characterProfiles.setCha((int) randomValues.get(2));
                    characterProfiles.setDex((int) randomValues.get(3));
                    return (characterRepository.save(characterProfiles));

                case "Wizard":
                    //Highest and lowest assignment
                    characterProfiles.setAnInt((int) randomValues.get(0));
                    characterProfiles.setStr((int) randomValues.get(randomValues.size() - 1));

                    //rest of the values
                    characterProfiles.setWis((int) randomValues.get(1));
                    characterProfiles.setCha((int) randomValues.get(2));
                    characterProfiles.setDex((int) randomValues.get(3));
                    return (characterRepository.save(characterProfiles));

                case "Archer":
                    //Highest and lowest assignment
                    characterProfiles.setDex((int) randomValues.get(0));
                    characterProfiles.setCha((int) randomValues.get(randomValues.size() - 1));

                    //rest of the values
                    characterProfiles.setWis((int) randomValues.get(1));
                    characterProfiles.setAnInt((int) randomValues.get(2));
                    characterProfiles.setStr((int) randomValues.get(3));
                    return (characterRepository.save(characterProfiles));

                case "Rogue":

                    //Highest and lowest assignment
                    characterProfiles.setCha((int) randomValues.get(0));
                    characterProfiles.setStr((int) randomValues.get(randomValues.size() - 1));

                    //rest of the values
                    characterProfiles.setWis((int) randomValues.get(1));
                    characterProfiles.setAnInt((int) randomValues.get(2));
                    characterProfiles.setDex((int) randomValues.get(3));
                    return (characterRepository.save(characterProfiles));

                default:
                    slf4jLogger.info("Wrong class selected");
                    throw new InvalidClassNameException();

            }


    }

    public int randomValueGenerator(){
        Random random = new Random();
        int low = 8;
        int high = 18;
        int randomNumber = random.nextInt(high-low)+low;
        return randomNumber;
    }
}
