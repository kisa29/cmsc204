import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCodeConverter {

	private static MorseCodeTree tree=new MorseCodeTree();


	public MorseCodeConverter() 
	{

	}


	public static java.lang.String printTree()
	{
		ArrayList <String> data=new ArrayList<>();
		String display="";
		data= tree.toArrayList();

		System.out.println(data);
		for(int i=0; i<data.size(); i++) 
		{

			display+= data.get(i)+" ";
		}
		System.out.println(display);

		return display;

	}

	public static java.lang.String convertToEnglish(java.lang.String code)
	{ 
		// split through word
		System.out.println(code);
		String wordList[]=code.split("/");
		String [] letter;
		String str="";

		System.out.println(wordList);
		// loop through the word
		for (int i=0; i<wordList.length; i++) 
		{ System.out.println(wordList);

		wordList[i]=wordList[i].trim();
		letter=wordList[i].split(" ");
		System.out.println(letter);
		for (int k=0; k<letter.length; k++) 
		{
			str+=tree.fetch(letter[k]);
		}
		str=str+" ";
		}
		System.out.println(str);
		str=str.trim();
		return str;

	}

	public static java.lang.String convertToEnglish(java.io.File codeFile) throws java.io.FileNotFoundException
	{


		if (codeFile.length()==0) {
			throw new FileNotFoundException();
		}
		Scanner input = new Scanner(codeFile);
		String str="";
		System.out.print(codeFile);
		//read through line by line
		while(input.hasNextLine()) 
		{
			str+=input.nextLine()+"\n";
			//str=convertToEnglish(str);
			System.out.println(str);
		} 
		input.close();
		System.out.println(str);
		return convertToEnglish(str.trim());



	}





}



























/*String letter[];
		String word[]; 
		String str="";
		ArrayList<String> list= new ArrayList<>();
		Scanner input = new Scanner(codeFile);

		while(input.hasNext()==true) 
		{
			//str.
			input.nextLine();
			list.add(input.nextLine());

		}
		input.close();



		for (int i=0; i<list.size(); i++) 
		{
			System.out.println(list.get(i));
			word=list.get(i).split("/");

			for(int k=0; k<word.length;k++) 
			{  System.out.println(word[k]);
				letter=word[k].split(" ");


				for(int j=0; j<letter.length; j++) 
				{
					System.out.println(word[j]);
					str+= tree.fetch(letter[j]);
				}
				 str+=" ";
				 break;
			}
			break;

		}

		str=str.trim();


		return str;
 */




























/*
if (codeFile.length()==0) {
	  throw new FileNotFoundException();
}
Scanner input = new Scanner(codeFile);
String str="";
while(input.hasNext()) 
{
	str=input.nextLine();
	str=convertToEnglish(str);
}
input.close();
return str;


 */



//str+= convertToEnglish(codeFile);










/*
String letter[];
String wordList[]= code.split("/");
String str="";
String s="";


for (int i=0; i<wordList.length; i++) 
{
	System.out.println("*"+wordList[i]+"*");
	s=wordList[i].trim();
	letter= s.split(" ");


	for (int k=0; k<letter.length; k++)
	{

		System.out.println(letter[k]);
		str+=tree.fetch(letter[k]);
	}

		str+=" ";

}

	str=str.trim();

return str;
 */



