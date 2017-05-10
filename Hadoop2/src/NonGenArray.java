/*import java.util.ArrayList;

public class NonGenArray {

	public static void main(String[] args) {
		String name1 ="ABC";
		int x = 10;
		ArrayList list = new ArrayList();
		NonGenArray outer = new NonGenArray();
		for (int i=0;i<10;i++){
			
			NonGenArray.Student e = outer.new Student();
			list.add(e);
			
		}
		
		list.add(name1);
		list.add(x);
		
		
		for(Object obj : list){
			try{
				Student e = (Student)obj;
				System.out.println(e.name);
				System.out.println(name1);
				System.out.println(x);
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