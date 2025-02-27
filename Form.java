import java.util.*;
public class Form {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	String doj=sc.next();
	String addr=sc.next();
	float cgpa=sc.nextFloat();
	String[]university= {"IIT Madras","IIT hyderabad ","KSR","anna university","SSM"};
	String[]branch= {"cse","IT","ece","eee","mech"};
	int l=university.length;
	int[]rank= {1,2,3,4,5};
	System.out.println("name:"+name);
	System.out.println("doj:"+doj);
	System.out.println("addr:"+addr);
	System.out.println("cgpa:"+cgpa);
	if (6<=cgpa && cgpa<7)
	{
		System.out.println(university[l-1]+" "+branch[l-1]+" "+rank[l-1]);
	}
	else if(7<=cgpa && cgpa<8)
	{
		System.out.println(university[l-2]+" "+branch[l-2]+" "+rank[l-2]);
	}
	else if(8<=cgpa && cgpa<9)
	{
		System.out.println(university[l-3]+" "+branch[l-3]+" "+rank[l-3]);
	}
	else if(9<=cgpa && cgpa<10)
	{
		System.out.println(university[l-4]+" "+branch[l-4]+" "+rank[l-4]);
	}
	else
	{
		System.out.println(university[l-5]+" "+branch[l-5]+" "+rank[l-5]);
	}
}
}