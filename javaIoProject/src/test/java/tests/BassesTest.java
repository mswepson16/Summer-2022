package tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.opencsv.CSVReader;

public class BassesTest {
	
	@Test
	public void canGetModelInfo(){
		

		String file = "basses.csv";
		
		try {
			CSVReader csvReader = new CSVReader(new FileReader(file));
		
			Map <String, Bass> BassMap = new HashMap <String, Bass>();
		
			String[] nextRecord;

			while ((nextRecord = csvReader.readNext()) != null) {
				for (int i = 0; i < 22; i += 3) {
					Bass bass = new Bass();
					BassMap.put(nextRecord[i],bass);
					BassMap.put(nextRecord[i += 1], bass);
				
				}
				System.out.println(BassMap);
			}
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();;
		}

	}
	
}
