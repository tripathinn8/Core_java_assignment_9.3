import java.util.*;

public class TV {

	public static void main(String[] args) {
		ArrayList<HDTV> tv1=new ArrayList<HDTV>();
		tv1.add(new HDTV("sony",36));
		tv1.add(new HDTV("samsung",42));
		tv1.add(new HDTV("videocon",52));
		Collections.sort(tv1, HDTV.mytv);
 for(HDTV t:tv1)
	{
		System.out.println(t);
	}
ListIterator<HDTV> lis =tv1.listIterator();
System.out.println();
System.out.println("Output using list iterator-");
System.out.println();
while(lis.hasNext())
{
	System.out.println(lis.next());
}
	
	}

}
