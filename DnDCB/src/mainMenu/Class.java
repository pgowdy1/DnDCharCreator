package mainMenu;
import java.util.*;

public class Class {

Scanner kbd = new Scanner(System.in);
private int playerClassNumber = 0; 
private String characterClass = ""; 
private String[] classes = {"Fighter", "Paladin", "Ranger", "Mage", "Abjurer", "Conjurer", "Diviner", "Enchanter", "Illusionist",
		"Invoker", "Necromancer", "Transmuter", "Cleric", "Druid", "Thief", "Bard"};
private int[] minimumStats;

	public void classChoice()
	{
		int playerClass = 0; 
		System.out.println("Choose your class: \n" +
			"1. Fighter\n"+
			"2. Paladin\n"+
			"3. Ranger\n\n" +
			
			"4. Mage \n" +
			"5. Abjurer\n" +
			"6. Conjurer\n" +
			"7. Diviner\n" +
			"8. Enchanter\n" +
			"9. Illusionist\n" +
			"10. Invoker\n" +
			"11. Necromancer\n" +
			"12. Transmuter\n\n" +	
			
			"13. Cleric\n" +
			"14. Druid\n\n" +
	
			"15. Thief\n" +
			"16. Bard\n"); 
		
			playerClassNumber = kbd.nextInt();
			characterClass = classes[playerClassNumber-1]; 
	}
		
	public String getClassName()
	{ 
	    String returnMessage = "That class does not exist."; 
		
		for(int i = 0; i < 16; i++)
		{
			if(i == (playerClassNumber - 1))
			{
				characterClass = classes[i];
				return classes[i];
			}
		}
		
		return returnMessage; 
		
	}
	
	public int getPlayerClassNumber()
	{
		return playerClassNumber; 
	}
	
	public boolean checkMinimumAttributes(int key, int[] attributes) 
	{
		boolean classOK = false;
		
		switch (key) 
		{
		case 1: classOK = (attributes[0] >= 9); //Fighter
			break; //Strength >= 9
		
		case 2: classOK = ((attributes[0] >= 12) && (attributes[2] >= 9) && (attributes[4] >= 13) && (attributes[5] >= 17)); //Paladin
			break; //Strength >= 12, Constitution >= 9, Wisdom >= 13, Charisma >= 17
		
		case 3: classOK = ((attributes[0] >= 13) && (attributes[1] >= 13) && (attributes[2] >= 14) && (attributes[4] >= 14)); //Ranger
			break; //Strength >= 13, Dexterity >= 13, Constitution >= 14, Wisdom >= 14
		
		case 4: classOK = (attributes[3] >= 9); //Mage
			break; //Intelligence >= 9
		
		case 5: classOK = ((attributes[3] >= 9) && (attributes[4] >= 15)); //Abjurer
			break; //Intelligence >= 9, Wisdom >= 15
		
		case 6: classOK = ((attributes[3] >= 9) && (attributes[2] >= 15)); //Conjurer
			break; //Intelligence >= 9, Constitution >= 15
		
		case 7: classOK = ((attributes[3] >= 9) && (attributes[4] >= 16)); //Diviner
			break; //Intelligence >= 9, Wisdom >= 15
		
		case 8: classOK = ((attributes[3] >= 9) && (attributes[5] >= 16)); //Enchanter
			break; //Intelligence >= 9, Charisma >= 16
				
		case 9: classOK = ((attributes[3] >= 9) && (attributes[1] >= 16)); //Illusionist
			break; //Intelligence >= 9, Dexterity >= 16
				
		case 10: classOK = ((attributes[3] >= 9) && (attributes[2] >= 16)); //Invoker
			break; //Intelligence >= 9, Constitution >= 16
				
		case 11: classOK = ((attributes[3] >= 9) && (attributes[4] >= 16)); //Necromancer
			break; //Intelligence >= 9, Wisdom >= 16
				
		case 12: classOK = ((attributes[3] >= 9) && (attributes[1] >= 15)); //Transmuter
			break; //Intelligence >= 9, Dexterity >= 15
		
		case 13: classOK = (attributes[4] >= 9); //Cleric
			break; //Wisdom >= 9
			
		case 14: classOK = ((attributes[4] >= 12) && (attributes[5] >= 15)); //Druid
			break; //Wisdom >= 12, Charisma >= 15
			
		case 15: classOK = (attributes[1] >= 9); //Thief
			break; //Dexterity >= 9
			
		case 16: classOK = ((attributes[1] >= 12) && (attributes[3] >= 13) && (attributes[5] >= 15)); //Bard
			break; //Dexterity >= 11, Intelligence >= 13, Charisma >= 15
		}
		
		return classOK; 
	}
	
	public boolean checkMinimumRace(String race, String classChosen) 
	{
		
		if(race.equalsIgnoreCase("dwarf"))
		{
			for(int i = 1; i < 12; i++) //checks Ranger, Paladin, and all types of wizards
			{
				if(classChosen.equalsIgnoreCase(classes[i]))
				{
					return false; 
				}
			}
			
			if(classChosen.equalsIgnoreCase(classes[13]) || classChosen.equalsIgnoreCase(classes[15])) //Druid and Bard
			{
				return false; 
			}
			
		}
		
		else if (race.equalsIgnoreCase("elf"))
		{
			for(int m = 4; m < 7; m++)
			{
				if(classChosen.equalsIgnoreCase(classes[m]))
				{
					return false;
				}
			}
			
			for(int n = 8; n < 12; n++)
			{
				if(classChosen.equalsIgnoreCase(classes[n]))
				{
					return false; 
				}
			}
			
				if((classChosen.equalsIgnoreCase(classes[1])) || (classChosen.equalsIgnoreCase(classes[13])) || (classChosen.equalsIgnoreCase(classes[15]))) //Paladin Druid and Bard
				{
					return false; 
				}
		}

		else if (race.equalsIgnoreCase("gnome"))
		{
			for(int k = 1; k < 8; k++)
			{
				if(classChosen.equalsIgnoreCase(classes[k])) //Paladin, Ranger, Specialist Wizard except for Illusionist
				{
					return false; 
				}
			}
			
			if( (classChosen.equalsIgnoreCase(classes[10])) || (classChosen.equalsIgnoreCase(classes[11])) || (classChosen.equalsIgnoreCase(classes[12])) //Specialist Wizards, Druid, Bard
					|| (classChosen.equalsIgnoreCase(classes[13])) || (classChosen.equalsIgnoreCase(classes[15])) )
				{
					return false; 	
				}
		}
		
		else if (race.equalsIgnoreCase("half-elf"))
		{
			
			for(int v = 8; v < 11; v++)
			{
				if(classChosen.equalsIgnoreCase(classes[v])) //Few Specialist Wizards
				{
					return false; 
				}
			}
			
			if( (classChosen.equalsIgnoreCase(classes[1])) || (classChosen.equalsIgnoreCase(classes[4])) ) //Paladin and Abjurer
			{
				return false; 
			}
		}
		
		else if (race.equalsIgnoreCase("halfling"))
		{
			for(int c = 1; c < 12; c++) 
			{
				if(classChosen.equalsIgnoreCase(classes[c])) //Paladin, Ranger, and all Wizards
				{
					return false; 
				}
			}
			
			if( (classChosen.equalsIgnoreCase(classes[13])) || (classChosen.equalsIgnoreCase(classes[15]))) //Bard and Druid
			{
				return false; 
			}
		}
				
		return true; 
	}	
	

	public void setCharacterClass(String Cclass){
		characterClass = Cclass; 
	}
	
	public String getCharacterClass(){
		return characterClass; 
	}

}


