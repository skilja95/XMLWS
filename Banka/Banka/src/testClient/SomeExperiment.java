package testClient;

import java.util.ArrayList;
import java.util.Comparator;

import dbModels.StavkaDB;

public class SomeExperiment {

	
	public SomeExperiment() {
		// TODO Auto-generated constructor stub
		
		
		ArrayList<StavkaDB> stavke= new ArrayList<StavkaDB>();
		
		StavkaDB s1 = new StavkaDB();
		s1.setId(2);
		StavkaDB s2 = new StavkaDB();
		s2.setId(1);
		StavkaDB s3 = new StavkaDB();
		s3.setId(5);
		StavkaDB s4 = new StavkaDB();
		s4.setId(3);
		StavkaDB s5 = new StavkaDB();
		s5.setId(6);
		StavkaDB s6 = new StavkaDB();
		s6.setId(4);
		
		stavke.add(s1);
		stavke.add(s2);
		stavke.add(s3);
		stavke.add(s4);
		stavke.add(s5);
		stavke.add(s6);
		
		for(StavkaDB st: stavke)
		{
			System.out.println("ST id: "+st.getId());
		}
		
		System.out.println("------------------");
		
		stavke.sort(new Comparator<StavkaDB>() {

			@Override
			public int compare(StavkaDB o1, StavkaDB o2) {
				// TODO Auto-generated method stub
				if(o1.getId()<o2.getId())
				{
					return -1;
				}
				if(o1.getId()==o2.getId())
				{
					return 0;
				}
				if(o1.getId() > o2.getId())
				{
					return 1;
				}
				return 0;
			}
		});
		
		for(StavkaDB st: stavke)
		{
			System.out.println("ST id: "+st.getId());
		}
		
	}
	
	public static void main(String[] args) {
		SomeExperiment se = new SomeExperiment();
	}
	
	
}
