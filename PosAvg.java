import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class PosAvg {
	protected String id;
	private ArrayList<String> MesoList;
	private MesoInherit MesoObject;
	private int index;
	
	public PosAvg(String id) {
		this.id = id;
		try {
			MesoObject = new MesoInherit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MesoList = MesoObject.getMesoList();
	}
	public int indexOfStation() {
		for (int i = 0; i < MesoList.size();i++) {
			if(MesoList.get(i).trim().equals(id)) {
				this.index = i;
			}
		}
		this.index -= 119;
		//this.index+=1;
		//System.out.println(index);
		return this.index;
	}
	public MesoInherit getMesoObject() {
		return MesoObject;
	}
	public void setMesoObject(MesoInherit mesoObject) {
		MesoObject = mesoObject;
	}
	@Override
	public String toString(){
		String string = "This index is average of ";
		ArrayList<Integer> pairs = new ArrayList<Integer>();
		//int baseline = 0; //wnat to shift the start position of comparison to the right after each outer loop completes
		int midpoint = index;
		//System.out.println(midpoint);
		//for (int i = midpoint; i < MesoList.size();i++)
		int i = 0;
		while (midpoint+i < (MesoList.size()/2))
		{
			if (((midpoint + i) + (midpoint - i))/2 == midpoint) {
			//System.out.println("pass");
			//pairs.add(index-i);
			//pairs.add(index+i);
			string += MesoList.get(midpoint-i).trim() + " and " + MesoList.get(midpoint+i).trim() + ", ";
			//string += "a";
			}
			i++;
		}
			
		/*for (int i = 0; i < MesoList.size(); i++) {
			string += MesoList.get(i).trim() + " and " + MesoList.get(i);
		}*/
		return string;
	}
	public char returnChar() {
		return (char) index;
	}
}
