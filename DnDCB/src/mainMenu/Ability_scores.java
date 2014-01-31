package mainMenu;
import java.util.Scanner; 
import java.util.Random; 
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;

public class Ability_scores { 
	
	Scanner kbd = new Scanner(System.in); 
	int[] attributeArray = {0, 0, 0, 0, 0, 0};
	Random generator = new Random(); 
	
	public Ability_scores() {}
	
	public Ability_scores(int str, int dex, int con, int intel, int wis, int cha) {
		
	}
	
	private int strength = 0;
	private int dexterity = 0; 
	private int constitution = 0; 
	private int intelligence = 0; 
	private int wisdom = 0; 
	private int charisma = 0; 
	
	public int[] generateAttributes(int methodChoice) {
		
		switch (methodChoice) {
			case 1: 								// Method 1 of rolling dice is put into array, other 
					for(int i = 0; i < 6; i++) {      // cases within switch will correspond to other methods of rolling. 
						attributeArray[i] = (generator.nextInt(6) + 1) + (generator.nextInt(6) + 1) + 
											(generator.nextInt(6) + 1); 
					} 
					break; //end case 1
			case 2: 
					for(int z = 0; z < 6; z++) {
						int val1 = (generator.nextInt(6) + 1) + (generator.nextInt(6) + 1) + 
								   (generator.nextInt(6) + 1);
						int val2 = (generator.nextInt(6) + 1) + (generator.nextInt(6) + 1) + 
								   (generator.nextInt(6) + 1);
						
						if(val1 > val2) {
							attributeArray[z] = val1;
						}
							else
								attributeArray[z] = val2; 
						} 
					break; //end case2
						
			case 3:  
				int playerChoice = 0; 
				int[] rolls6 = new int[6];
				
				for(int z = 0; z <= 5; z++){
					rolls6[z] = generator.nextInt(6)+1 + generator.nextInt(6)+1 + generator.nextInt(6)+1;
				}
				
					boolean statCheck = false;  
					
					while(statCheck == false){
					Arrays.sort(rolls6);
					System.out.println("Your rolls are: " + rolls6[0] + ", " + rolls6[1] + ", " + rolls6[2] + ", " + rolls6[3] + ", " + rolls6[4] + ", " + rolls6[5] + "\n");  
					System.out.println("Choose a number to assign to Strength: "); 
					playerChoice = kbd.nextInt();
					
						for(int m = 0; m <= 5; m++){
							if(playerChoice == rolls6[m]){ //assign player's choice of Strength if matches
								attributeArray[0] = playerChoice;
								statCheck = true;
								rolls6[m] = -1; //change to -1 so that rolls can be moved to new array 
								m = 10000; //exit loop 
							}
						}
					
						if(statCheck == false){
							System.out.println("That number was not one of your rolls. Please select a valid number.\n"); 
						}
					}
					
					Arrays.sort(rolls6);
					int[] rolls5 = new int[5]; 
					
						for(int q = 0; q < 5; q++){
							rolls5[q] = rolls6[q+1];
						}
					
					statCheck = false;
					
					while(statCheck == false){
						Arrays.sort(rolls5);
						System.out.println("Your rolls are: " + rolls5[0] + ", " + rolls5[1] + ", " + rolls5[2] + ", " + rolls5[3] + ", " + rolls5[4] + "\n");
						System.out.println("Choose a number to assign to Dexterity: ");
						playerChoice = kbd.nextInt(); 
						
						for(int z = 0; z <= 4; z++){
							if(playerChoice == rolls5[z]){ //assign player's choice of Dexterity if matches
								attributeArray[1] = playerChoice;
								statCheck = true;
								rolls5[z] = -1; //change to -1 so that rolls can be moved to new array 
								z = 10000; //exit loop 
							}
						}
						
						if(statCheck == false){
							System.out.println("The number was not one of your rolls. Please select a valid number.\n"); 
						}
							
					}
					
					Arrays.sort(rolls5);
					int[] rolls4 = new int[4]; 
					
						for(int w = 0; w < 4; w++){
							rolls4[w] = rolls5[w+1];
						}
					
					statCheck = false;
					
					while(statCheck == false){
						Arrays.sort(rolls4);
						System.out.println("Your rolls are: " + rolls4[0] + ", " + rolls4[1] + ", " + rolls4[2] + ", " + rolls4[3] + "\n");
						System.out.println("Choose a number to assign to Constitution: ");
						playerChoice = kbd.nextInt(); 
						
						for(int e = 0; e <= 3; e++){
							if(playerChoice == rolls4[e]){ //assign player's choice of Constitution if matches
								attributeArray[2] = playerChoice;
								statCheck = true;
								rolls4[e] = -1; //change to -1 so that rolls can be moved to new array 
								e = 10000; //exit loop 
							}
						}
						
						if(statCheck == false){
							System.out.println("The number was not one of your rolls. Please select a valid number.\n"); 
						}
							
					}
					
					Arrays.sort(rolls4);
					int[] rolls3 = new int[3]; 
					
						for(int r = 0; r < 3; r++){
							rolls3[r] = rolls4[r+1];
						}
					
					statCheck = false;
					
					while(statCheck == false){
						Arrays.sort(rolls3);
						System.out.println("Your rolls are: " + rolls3[0] + ", " + rolls3[1] + ", " + rolls3[2] + "\n");
						System.out.println("Choose a number to assign to Intelligence: ");
						playerChoice = kbd.nextInt(); 
						
						for(int y = 0; y <= 2; y++){
							if(playerChoice == rolls3[y]){ //assign player's choice of Intelligence if matches
								attributeArray[3] = playerChoice;
								statCheck = true;
								rolls3[y] = -1; //change to -1 so that rolls can be moved to new array 
								y = 10000; //exit loop 
							}
						}
						
						if(statCheck == false){
							System.out.println("The number was not one of your rolls. Please select a valid number.\n"); 
						}
							
					}
					
					Arrays.sort(rolls3);
					int[] rolls2 = new int[2]; 
					
						for(int a = 0; a < 2; a++){
							rolls2[a] = rolls3[a+1];
						}
					
					statCheck = false;
					
					while(statCheck == false){
						Arrays.sort(rolls2);
						System.out.println("Your rolls are: " + rolls2[0] + ", " + rolls2[1] + "\n");
						System.out.println("Choose a number to assign to Wisdom: ");
						playerChoice = kbd.nextInt(); 
						
						for(int u = 0; u <= 1; u++){
							if(playerChoice == rolls2[u]){ //assign player's choice of Wisdom if matches
								attributeArray[4] = playerChoice;
								statCheck = true;
								rolls2[u] = -1; //change to -1 so that rolls can be moved to new array 
								u = 10000; //exit loop 
							}
						}
						
						if(statCheck == false){
							System.out.println("The number was not one of your rolls. Please select a valid number.\n"); 
						}
							
					}
					
					Arrays.sort(rolls2);
					
					System.out.println("Your Charisma score will be: " + rolls2[1] + "\n"); 
					attributeArray[5] = rolls2[1]; 
					
					break;
					
			case 4: //TODO
					break;
			case 5: 
					for(int j = 0; j < 6; j++) {
						int value1 = generator.nextInt(6) + 1;  
						int value2 = generator.nextInt(6) + 1;  
						int value3 = generator.nextInt(6) + 1;   
						int value4 = generator.nextInt(6) + 1;  
						
						int lowVal = Math.min(value1, Math.min(value2, Math.min(value3, value4))); 
						if(lowVal == value1) {
							attributeArray[j] = value2 + value3 + value4; 
						}
						else if(lowVal == value2) {
							attributeArray[j] = value1 + value3 + value4; 
						}
						else if(lowVal == value3) { 
							attributeArray[j] = value1 + value2 + value4; 
						}
						else if(lowVal == value4) { 
							attributeArray[j] = value1 + value2 + value3; 
						}
						
						} 
					break; //end case 5
					
			case 6: 
					System.out.println("Input your Strength: ");
					attributeArray[0] = kbd.nextInt(); 
					
					System.out.println("Input your Dexterity: "); 
					attributeArray[1] = kbd.nextInt(); 
					
					System.out.println("Input your Constitution: ");
					attributeArray[2] = kbd.nextInt(); 
					
					System.out.println("Input your Intelligence: "); 
					attributeArray[3] = kbd.nextInt(); 
					
					System.out.println("Input your Wisdom: "); 
					attributeArray[4] = kbd.nextInt(); 
					
					System.out.println("Input your Charisma: "); 
					attributeArray[5] = kbd.nextInt(); 
					
					break; //end case 6
				
					} 
					
		strength = attributeArray[0]; 
		dexterity = attributeArray[1]; 
		constitution = attributeArray[2]; 
		intelligence = attributeArray[3]; 
		wisdom = attributeArray[4]; 
		charisma = attributeArray[5]; 
		
		return attributeArray; 
	}
	
	public int rollingMethod() {
		
		int choice = 0;  
		
		System.out.println("Which method of rolling would you like to use to generate your abilities?\n" +
				"1. Method I - Roll 3d6 - Scores are assigned to Strength, Dexterity, Constitution, " +
				"Intelligence, Wisdom, and Charisma (in that order).\n" +
				"2. Method II - Roll 3d6 twice - Note the total of each roll. " +
				"Use whichever result you prefer for your character's Strength score. " +
				"Repeat this for Dexterity, Constitution, Intelligence, Wisdom, and Charisma. " +
				"This allows you to pick the best score from each pair, " +
				"generally ensuring that your character does not have any really low ability scores.\n" +
				"3. Method III - Roll 3d6 six times - Jot down the total for each roll. " +
				"Assign the scores to your character's six abilities however you want. " +
				"This gives you the chance to custom-tailor your character, " +
				"although you are not guaranteed high scores.\n" +
				"4. Method IV - Roll 3d6 twelve times - Jot down all twelve totals. " +
				"Choose six of these rolls (generally the six best rolls) " +
				"and assign them to your character's abilities however you want. \n" +
				"5. Method V - Roll four six-sided dice (4d6). " +
				"Discard the lowest die and total the remaining three. " +
				"Repeat this five more times, then assign the six numbers to the character's abilities" +
				" however you want. \n" +
				"6. Method VI - I want to roll my dice outside of the creator" +
				" and input my abilities.");
		
	//	choice = kbd.nextInt(); 
		return choice; 
	}
	
	public int[] raceBonus(int raceNumber) {
		if(raceNumber == 1) {  //Dwarf
			attributeArray[2] = attributeArray[2] + 1; //+1 to Constitution 
			attributeArray[5] = attributeArray[5] - 1; //-1 to Charisma
		}
		
		else if(raceNumber == 2) { //Elf
			attributeArray[1] = attributeArray[1] + 1; //+1 to Dexterity
			attributeArray[2] = attributeArray[2] - 1; //-1 to Constitution
		}
		
		else if(raceNumber == 3) { //Gnome
			attributeArray[3] = attributeArray[3] + 1; //+1 to Intelligence
			attributeArray[4] = attributeArray[4] - 1; //-1 to Dexterity
		}
		
		else if(raceNumber == 5) { //Halfling
			attributeArray[1] = attributeArray[1] + 1; //+1 to Dexterity
			attributeArray[0] = attributeArray[0] - 1; //-1 to Strength
		}
		
		return attributeArray; 
	}
	
	public void setStrength(int strInput) {
		strength = strInput; 
	}

	public int getStrength(){
		return strength; 
	}
	
	public void setDexterity(int dexInput) {
		dexterity = dexInput; 
	}
	
	public int getDexterity(){
		return dexterity; 
	}
	
	public void setConstitution(int conInput) {
		constitution = conInput; 
	}
	
	public int getConstitution(){
		return constitution; 
	}
	
	public void setIntelligence(int intInput) {
		intelligence = intInput; 
	}
	
	public int getIntelligence() {
		return intelligence; 
	}
	
	public void setWisdom(int wisInput) {
		wisdom = wisInput;
	}
	
	public int getWisdom() {
		return wisdom; 
	}
	
	public void setCharisma(int chaInput){
		charisma = chaInput; 
	}
	
	public int getCharisma() {
		return charisma; 
	}
	
	public int[] getAttributes() {
		return attributeArray; 
	}
	
	public void setAttributes(int[] attArray) {
		strength = attArray[0];
		dexterity = attArray[1];
		constitution = attArray[2];
		intelligence = attArray[3];
		wisdom = attArray[4];
		charisma = attArray[5]; 
	}
	
	public int[] moveValueToFront(int value, int[] array, int sizeOfArray){
		for(int n = 0; n < sizeOfArray; n++){
			if(array[n] == value){
				int temp = array[0];
				array[0] = array[n]; 
				array[n] = temp; 
			}
		}
		return array; 
	}
	
}
