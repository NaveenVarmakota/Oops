package abstraction_programs;

public class MainApp 
{
    public static void main(String[] args) 
    {
		Sample s1=Demo.getObject();
		s1.walk();
		s1.gym(0);
		int res1=s1.cycle();
		boolean res2=s1.hike("hello");		
	}
}
