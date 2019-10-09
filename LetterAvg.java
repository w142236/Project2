import java.util.ArrayList;

public class LetterAvg{
private MesoInherit mesoObject;
private ArrayList<String> MesoList;
public LetterAvg(char letterAverage) {
	for (int i = 0; i < mesoObject.getMesoList().size(); i++) {
		if(mesoObject.getMesoList().get(i).charAt(0)==letterAverage) {
			//MesoList.add(MesoInherit.getMesoList().get(i));
		}
	}
}
	public String numberOfStationWithLetterAvg() {
		// TODO Auto-generated method stub
		String str = "";
		for (int i = 0; i < MesoList.size();i++) {
			str += MesoList.get(i) + "\n";
		}
		return str;
	}

}
