package mainMenu;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;  

import javax.swing.text.StyledEditorKit.BoldAction;

public class Character {
	
	public Character() {}

	private Ability_scores charScores = new Ability_scores();
	private Race charRace = new Race();
	private Class charClass = new Class(); 
	
	public void assignAttributes() {
		charScores.generateAttributes(charScores.rollingMethod()); 
	}
	
	public void createCharacter() {
		
		charScores.generateAttributes(charScores.rollingMethod()); 	
		
		System.out.println("Strength: " + charScores.getStrength());
		System.out.println("Dexterity: " + charScores.getDexterity()); 
		System.out.println("Constitution: " + charScores.getConstitution()); 
		System.out.println("Intelligence: " + charScores.getIntelligence()); 
		System.out.println("Wisdom: " + charScores.getWisdom()); 
		System.out.println("Charisma: " + charScores.getCharisma() + "\n"); 
		
		//Player will pick their race
		//As well as check their attributes against the race
	
		boolean checkValueAttributes = false; 
		
			while(checkValueAttributes == false){
				checkValueAttributes = charRace.raceCheck(charRace.raceSelection(), charScores.getAttributes()); 
					if(checkValueAttributes == false){
						System.out.println("Your character does not meet the minimum attributes to be that race. Please choose again.\n"); 
					}
					
					if(checkValueAttributes == true){
						System.out.println("Your character will be a/an: " + charRace.getRace() + "\n"); 
					}
			}
			
			charScores.setAttributes(charScores.raceBonus(charRace.getRaceNumber())); 
			
			System.out.println("After your racial bonuses, your stats are: \n"); 
			this.printStats();
			charRace.genderSelection(); 
			
			boolean checkValueClass = false; 
			
			while(checkValueClass == false){
				charClass.classChoice();
		
				if(charClass.checkMinimumRace(charRace.getRace(), charClass.getClassName()) == true)
					if(charClass.checkMinimumAttributes(charClass.getPlayerClassNumber(), charScores.getAttributes()) == true){
						checkValueClass = true; 
					}
				
					else{
						System.out.println("You do not meet the minimum attributes for that class. Please choose again. \n"); 
					}
				
				else{
					System.out.println("Your race does not allow you to become that class.\n"); 
				}
			}
			
			System.out.println("You have chosen: " + charClass.getClassName() + "\n");
			
			Alignment alignment = new Alignment();
			boolean alignmentInd = false;
			
			while(alignmentInd == false){
			
				alignment.alignmentChoice();
				if(alignment.checkAlignment(charClass.getCharacterClass()) == true){
					System.out.println("You have chosen: " + alignment.getAlignment() + "\n"); 
					alignmentInd = true;
				}
				
			}

		}
			
	public void printStats() {
				
		System.out.println("Strength: " + charScores.getStrength());
		System.out.println("Dexterity: " + charScores.getDexterity()); 
		System.out.println("Constitution: " + charScores.getConstitution()); 
		System.out.println("Intelligence: " + charScores.getIntelligence()); 
		System.out.println("Wisdom: " + charScores.getWisdom()); 
		System.out.println("Charisma: " + charScores.getCharisma() + "\n"); 
			
	}
	
}

	
	


