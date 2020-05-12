import java.util.*;

public class arrayList
{
	public static void main(String args[])
	{
		ArrayList<String> a= new ArrayList<String>();	
		a.add("B");
		a.add("A");
		a.add("D");
		a.add(2,"C");
		a.remove("A");
		for(int i=2;i>=0;i--)
			System.out.println(a.get(i));
		
		Collections.sort(a);
		System.out.println(a);
	}
}