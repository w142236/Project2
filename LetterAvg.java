import java.io.IOException;
import java.util.ArrayList;

public class LetterAvg{
MesoInherit MesoObject;	
protected ArrayList<String> MesoList;
protected ArrayList<String> LetterAvgList;
public LetterAvg(char letterAverage) {
	
	this.LetterAvgList = new ArrayList<String>();
	
	try {
		MesoObject = new MesoInherit();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		MesoObject = new MesoInherit();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	MesoList = MesoObject.getMesoList();
	for (int i = 0; i < MesoList.size(); i++) {
		if(MesoList.get(i).charAt(1) == letterAverage) {
			LetterAvgList.add(MesoList.get(i));
		}
	}
}
	public String numberOfStationWithLetterAvg() {
		// TODO Auto-generated method stub
		String str = "";
		for (int i = 0; i < LetterAvgList.size();i++) {
			//str += LetterAvgList.get(i) + "\n";
			System.out.println(LetterAvgList.get(i));
		}
		return str;
	}

}
