package mainMenu;
import java.util.Scanner; 

public class Alignment {

	
private String alignment = ""; 
private String alignments[] = {"Lawful Good", "Lawful Neutral", "Lawful Evil", "Neutral Good", "True Neutral",
							   "Neutral Evil", "Chaotic Good", "Chaotic Neutral", "Chaotic Evil"}; 

	public void alignmentChoice(){
		
		Scanner kbd = new Scanner(System.in); 
		System.out.println("Choose your alignment:\n" +
				"1. Lawful Good\n" +
				"2. Lawful Neutral\n" +
				"3. Lawful Evil\n" +
				"4. Neutral Good\n" +
				"5. True Neutral\n" +
				"6. Neutral Evil\n" +
				"7. Chaotic Good\n" +
				"8. Chaotic Neutral\n" +
				"9. Chaotic Evil\n");
			
		int choice = kbd.nextInt(); 
	
		for(int i = 1; i <= 9; i++){
			if(i == choice)
			{
				alignment = alignments[choice-1]; 
			}
		}
	}
	
	public boolean checkAlignment(String playerClass){
		
		if(playerClass.equalsIgnoreCase("paladin")){
			if(alignment.equalsIgnoreCase(alignments[0])) { //lawful good
				return true;
			}
			else{
				System.out.println("Your class cannot be this alignment.\n"); 
				return false; 
			}
		}
		
		if(playerClass.equalsIgnoreCase("ranger")){
			if( (alignment.equalsIgnoreCase(alignments[0])) || (alignment.equalsIgnoreCase(alignments[3])) || (alignment.equalsIgnoreCase(alignments[6])) ) { //good alignments
				return true; 
			}
			else{
				System.out.println("Your class cannot be this alignment.\n"); 
				return false; 
			}
			
		}
			
		if(playerClass.equalsIgnoreCase("druid")){
			if( (alignment.equalsIgnoreCase(alignments[1])) || (alignment.equalsIgnoreCase(alignments[4])) || (alignment.equalsIgnoreCase(alignments[7])) ) { //any neutral alignment
				return true; 
			}
			else {
				System.out.println("Your class cannot be this alignment.\n"); 
				return false; 
			}
		
		}
		
		if(playerClass.equalsIgnoreCase("thief")){
			if( (alignment.equalsIgnoreCase(alignments[0]))){ //lawful good
				System.out.println("Your class cannot be this alignment.\n"); 
				return false; 
			}
			else{
				return true; 
			}
		}
		
		return true; 
	}
	
	public void setAlignment(String option){
		alignment = option; 
	}

	public String getAlignment(){
		return alignment; 
	}

}
