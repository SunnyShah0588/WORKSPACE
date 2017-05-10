package hadoop1;

public class Robot implements IDrive{
	
	public void StartDriving(){
		Car c = new Car();
		Engine e1 = new ToyotoEngine();
		Engine e2 = new HondaEngine();
		c.Ingition(e1);
		c.Ingition(e2);
 	

}
}
