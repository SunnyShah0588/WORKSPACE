/*import java.util.ArrayList;

public class GenArray {

	public static void main(String[] args) {
		String name1 ="ABC";
		int x = 10;
		ArrayList<Student> list = new ArrayList<Student>();
		GenArray outer = new GenArray();
		for (int i=0;i<10;i++){
			
			GenArray.Student e = outer.new Student();
			list.add(e);
			
		}
		
		//list.add(name1);
		//list.add(x);
		
		
		for(Student student : list){
			try{
				Student e = student;
				System.out.println(e.name);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}

	}
	public class Student{
		String name="Sunny";
		int Age=10;
		
		
	}

}
*/