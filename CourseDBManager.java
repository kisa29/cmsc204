import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class CourseDBManager implements CourseDBManagerInterface{

	//create an object of the course structure class
	CourseDBStructure CDS=new CourseDBStructure(10);
	String ID;
	int CRN;
	String instructor;
	String roomNum;
	int credits;

	
	
 // create a new element and add it to the course structure
	@Override
	public void add(String id, int crn, int credits, String roomNum, String instructor) {
		// TODO Auto-generated method stub
		CourseDBElement newCDE= new CourseDBElement(id,crn,credits,roomNum,instructor);
		CDS.add(newCDE);

	}


    //get the course number. 
	@Override
	public CourseDBElement get(int crn) {
		// TODO Auto-generated method stub

		try {
			return CDS.get(crn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
	//read from the file
	@Override
	public void readFile(File input) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {

			BufferedReader br= new BufferedReader(new FileReader(input));
			while ( (ID=br.readLine()) != null  ) ///hashCode()) 
			{

				CRN=br.read();
				instructor=br.readLine();
				roomNum=br.readLine();
				credits=br.read();
				add(ID,CRN, credits,roomNum, instructor);


			}

			br.close();

		}
		//throw a file not found exception if the file is not found
		catch(FileNotFoundException e) 
		{
			System.out.print("file not found");
		}
		// throw a IOexception if the input is invalid.
		catch(IOException e) 
		{
			System.out.print("IOException reading data");
		}

	}

	@Override
	public ArrayList<String> showAll() {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < CDS.hashTable.length; i++) 
		{ 
			LinkedList<CourseDBElement> list = CDS.hashTable[i];
			if(list != null) 
			{
				for(int j = 0; j < list.size(); j++) 
				{ 
					CourseDBElement cdeElement = list.get(j);
					arr.add(cdeElement.toString());

				}
			}
		}
		return arr;
	}






}
