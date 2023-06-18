package utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

	public static List<String[]> read(String file)
	{
		List<String[]>data=new LinkedList<String[]>(); 	
		String DataRow;
			try {
				BufferedReader br=new BufferedReader(new FileReader(file));
				while((DataRow=br.readLine())!=null)
				{					
				String DataRecords[]=DataRow.split(",");
				data.add(DataRecords);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Could Not Find File");
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Could Not FInd File");
				e.printStackTrace();
			}
		return data;	
	}
	

}
