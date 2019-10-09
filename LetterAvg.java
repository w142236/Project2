import java.util.ArrayList;

public class LetterAvg extends PosAvg{
private MesoInherit mesoObject;
private ArrayList<String> MesoList;
private ArrayList<Integer> Pairs;
public LetterAvg(char letterAverage) {
	super("NRMN");
	Pairs = this.getPairs();
}
	public String numberOfStationWithLetterAvg() {
		// TODO Auto-generated method stub
		String str = "";
		for (int i = 0; i < pairs.size();i++) {
			str += pairs.get(i) + "\n";
		}
		return str;
	}

}
