package pythonjava4teachers.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PlanetFactFile {

	public static void main(String[] args) {
		
		while (true) {
			String planetFile;
			
			System.out.println("\n\n --- PLANET FACT FILE ---");
			System.out.println("1) Mercury");
			System.out.println("2) Venus");
			System.out.println("3) Earth");
			System.out.println("4) Mars");
			System.out.println("5) Jupiter");
			System.out.println("6) Saturn");
			System.out.println("7) Uranus");
			System.out.println("8) Neptune");
			
			Scanner userInputObj = new Scanner(System.in);
			System.out.println("Enter the name of the planet: ");
			String planet = userInputObj.nextLine();
			planetFile = planet.toLowerCase() + ".txt";
			
			factFile(planetFile);	
		}
			
		
	}
		
	public static void factFile(String planetFile) {
		
		
		Map<String, String> dictionary = new HashMap<String, String>();
		
		try {
			File fileObj = new File(planetFile);
			Scanner scannerObj = new Scanner(fileObj);
			
			while (scannerObj.hasNextLine()) {
				String data = scannerObj.nextLine();
				//System.out.println(data);
				String[] tempLine = data.split(": ");
				dictionary.put(tempLine[0],tempLine[1]);
				
			}
			scannerObj.close();
			String planetName = dictionary.get("planetName");
			String radius = dictionary.get("radius");
			String orbitalPeriod = dictionary.get("orbitalPeriod");
			String distanceToSun = dictionary.get("distanceToSun");
			String surfaceArea = dictionary.get("surfaceArea");
			String lengthOfDay = dictionary.get("lengthOfDay");
			String density = dictionary.get("density");
			String description = dictionary.get("description");
			String funFact = dictionary.get("funFact");
			
			
			// Display Fact File
			
			System.out.println("\n --- " + planetName + " --- \n");
			System.out.println("# " + description + "\n");
			
			System.out.println(" --- How far from the sun? ---");
			System.out.println("# " + planetName + " is " + distanceToSun + " from the sun.\n");
			
			System.out.println(" --- Boring Maths Info --- ");
			System.out.println("# It has a surface area of " + surfaceArea);
			System.out.println("# It has a radius of " + radius);
			System.out.println("# It has a density of " + density);
			
			System.out.println("\n --- Extra Info ---");
			System.out.println("# The days are " + lengthOfDay + " long. 1 year is the same as " + orbitalPeriod);
			System.out.println("# " +funFact);
			
			Scanner pressEnter = new Scanner(System.in);
			System.out.println("\n-- Press enter to continue --");
			pressEnter.nextLine();
			
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occured");
			//e.printStackTrace();
		}
		
	}
		
		
		
	
	
}
