import java.io.IOException;
import java.util.LinkedList;

public class CourseDBStructure implements CourseDBStructureInterface {

	//create two fields
	int size;
	LinkedList <CourseDBElement> hashTable[];

	//create constructor that pass in an int variable
	public CourseDBStructure(int size)
	{
		this.size=size;
		hashTable=new LinkedList[size];

	}

	//parameterized constructor that pass in a string and an int
	public CourseDBStructure( String Testing, int size)
	{
		this.size=size;
		hashTable=new LinkedList[size];

	}


		//create a new add to the hashtable or create a new one.

	@Override
	public void add(CourseDBElement element) 
	{
		// TODO Auto-generated method stub

		int i= element.hashCode()%size; 

		if(hashTable[i]==null) 
		{
			hashTable[i]=new LinkedList <>();

		}
		hashTable[i].add(element);	


	}

	@Override
	public CourseDBElement get(int crn) throws IOException {
		// TODO Auto-generated method stub
		String s= String.valueOf(crn);
		int i =s.hashCode()%size;
		if (hashTable[i]==null)
		{
			throw new IOException();
		}
		else
		{
			for (int j=0; j<size; j++) 
			{
				CourseDBElement CDE= hashTable[i].get(j);
				
				if(CDE.getCRN()==crn)
				{
					return CDE;
				}
			}



		}

		return null;
	}
	
	//return table size

	@Override
	public int getTableSize() {
		// TODO Auto-generated method stub
		return size;
	}




}





