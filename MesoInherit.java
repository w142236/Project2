import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MesoInherit extends MesoAbstract {//Implements the calAverage behavior in the abstract class and can therefore be instantiated
	/*
	 * You need this class to generate intended output  
	 * from lines 3 to 6
	 * Here you must inherit the abstract class/method as necessary
	 */
	String filename = "C:/Users/Will/eclipse-workspace/Project_2/src/Mesonet.txt";
	private static ArrayList<String> MesoList = new ArrayList<String>();
	private MesoStation mesoStation;
	
	
	public MesoInherit(MesoStation mesoStation) throws IOException {
		this.mesoStation = mesoStation;//object comparison
		read(filename);
		}
	public MesoInherit() throws IOException {//a subclass that has its own specific behaviors
		read(filename);
	}
	
	
	
	public void read(String filename) throws IOException { 
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String line;
		
		line = br.readLine();
		line = br.readLine();
		line = br.readLine();
		line = br.readLine();	
		while (line != null) {
			String str = "";
			for (int i = 0; i < 5; i++) {
				str += line.charAt(i);
			}
			line = str;
			MesoList.add(line);//Works
			line = br.readLine();
		}
		 br.close();
	}
	public ArrayList<String> getMesoList() {
		return MesoList;
	}
	@Override	
	public int[] calAverage() {
		// TODO Auto-generated method stub
		int floor;
		int ceiling;
		double average=0;
		String station = mesoStation.getStID();
		for (int i = 0; i < 4; i++) {
			average+= (int) station.charAt(i);
		}
		floor = (int) Math.floor(average/4);
		ceiling = (int) Math.ceil(average/4);
		average = Math.round(average/4);
		int[] averages = new int[3];
		averages[0] = ceiling;
		averages[1] = floor;
		averages[2] = (int) average;
		
		return averages;
	}

	@Override
	char letterAverage() {
		// TODO Auto-generated method stub
		double average = 0.0;
		for (int i = 0; i < mesoStation.getStID().length();i++) {
			average += (int) mesoStation.getStID().charAt(i);
		}
		average = Math.round(average/4);
		return (char) average;
	}
	
}
