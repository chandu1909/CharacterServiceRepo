package com.galvanize.ThanksGivingProject.GenerateCharacter.repository;

import com.galvanize.ThanksGivingProject.GenerateCharacter.model.CharacterProfiles;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<CharacterProfiles, Long> {

}
