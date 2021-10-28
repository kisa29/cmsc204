

public class CourseDBElement implements Comparable {

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	  //declare variables
	 private int CRN, numOfCredits;
	 private String roomNumber, instructorName, courseID;
	
	 //instialize the variable
	public CourseDBElement()
	{
		CRN =0;
		numOfCredits=0;
		roomNumber="";
		instructorName= "";
		courseID= "";
	
	}
	
	
		//pass in 5 varaibles and set the fields to equal them
	public CourseDBElement(String id, int crn,int credits,String roomNum, String instructor) 
	{
		CRN=crn;
		numOfCredits=credits;
		roomNumber=roomNum;
		instructorName=instructor;
		courseID=id;
		
		
	}

	//set the course number
	public void setCRN(int crn) 
	{
		// TODO Auto-generated method stub
		//CRN=crn;
		CRN=crn;
		 
	}
	 //get the course number
	public int getCRN() 
	{
		
		return CRN;
	}
	
	
	public String toString() 
	{
		String s=  "\nCourse:" + courseID+ " CRN:" + CRN + " Credits:" + numOfCredits + " Instructor:" + instructorName + " Room:" + roomNumber;
		return s;
		
	}


}
