package com.galvanize.ThanksGivingProject.GenerateCharacter;

import com.galvanize.ThanksGivingProject.GenerateCharacter.controller.CharacterController;
import com.galvanize.ThanksGivingProject.GenerateCharacter.model.CharacterProfiles;
import com.galvanize.ThanksGivingProject.GenerateCharacter.service.CharacterService;
import com.galvanize.ThanksGivingProject.GenerateCharacter.service.InvalidClassNameException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GenerateCharacterApplicationTests {

    @Mock
    private CharacterService mockService;

	@Test
	public void contextLoads() {
	}

	//testing if its creating a new character with its respective class and randomly generated values
	@Test
	public void testGenerateCharacter()throws InvalidClassNameException {
		//assertTrue(true);

        //SetUp
        String name = "Ben";
        String className = "Warrior";
        CharacterProfiles expectedResult = new CharacterProfiles();
        CharacterController characterController = new CharacterController(mockService);
        when(mockService.generateCharacter(name,className)).thenReturn(expectedResult);

        //Execute
        CharacterProfiles actualResult = characterController.generateCharacter(name,className);

        //Assert
        assertEquals(expectedResult,actualResult);
        //TearDown

	}

}
