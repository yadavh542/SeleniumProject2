import java.util.ArrayList;
import java.util.stream.Stream;

public class Java_Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adan");
		names.add("Ram");
		
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual=names.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
			
		}
		System.out.println(count);
		
		//Test2
		public void streamFilter() {
			ArrayList<String> names =new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Don");
			names.add("Alekhya");
			names.add("Adan");
			names.add("Ram");
			
			Long c = names.stream().filter(s->s.startsWith("A"));
			
			Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
			{
				s.startsWith("A"));
			    return false;
			    
			}).count();
			System.out.println(c);
			
			names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		}
		
		
	}

}
