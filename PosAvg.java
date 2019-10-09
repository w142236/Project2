import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class PosAvg {
	protected String id;
	protected ArrayList<String> MesoList;
	protected MesoInherit MesoObject;
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
		
		this.index+=1;
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
		int midpoint = index - 1;
		for (int i = 1; i < 3; i ++) 
		{
			
			if (((midpoint + i) + (midpoint - i))/2 == midpoint) {
			string += MesoList.get(midpoint-i).trim() + " and " + MesoList.get(midpoint+i).trim() + ", ";
			System.out.println(midpoint - i);
			System.out.println(midpoint + i);
			}
		
		}
		return string;
	}
	public char returnChar() {
		return (char) index;
	}
}
