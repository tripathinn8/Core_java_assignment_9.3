import java.util.*;
public class HDTV {
	String brandname;
	int size;
	
	public HDTV(String brandname,int size)
	{
		this.brandname=brandname;
		this.size=size;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String toString()
	{
		return this.brandname+ " "+size ;
	}
	
	public static Comparator<HDTV> mytv= new Comparator<HDTV>()
	{
		public int compare(HDTV t1, HDTV t2)
		{
			int sz1= t1.getSize();
			int sz2=t2.getSize();
			
			return sz1-sz2;
		}};
}

