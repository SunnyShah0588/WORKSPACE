package hadoop1;

public class ToyotoEngine extends Engine {
	public ToyotoEngine (){
		super("TOYOTO",2012);
	}
	@Override
	public void Run(){
		super.Run();
		System.out.format("Happy Driving THE TOYOTO CAR\n\t");
	}
	
	

}
