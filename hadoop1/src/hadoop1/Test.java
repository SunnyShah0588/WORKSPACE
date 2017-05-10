package hadoop1;
//import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		IDrive sh = new SuperHuman();
		IDrive sr = new Robot();
		
		Start(sh);
		Start(sr);
		
		ObjClassMethod();
	}
	
	public static void Start(IDrive d){
		
		d.StartDriving();
		
	}
 
	public static void ObjClassMethod(){
		ToyotoEngine t1 = new ToyotoEngine();
		ToyotoEngine t2 = new ToyotoEngine();
	  
		 System.out.println("T1 and T2 are EQUALs = "+t1.equals(t2));
	}
}
