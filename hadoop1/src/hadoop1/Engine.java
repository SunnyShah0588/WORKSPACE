package hadoop1;

public class Engine {

	  String make ="Simple";
	  int year = 2000;
	  
	   public Engine (String make,int year){
		   this.make=make;
		   this.year=year;
		   
	   }
	   public void Run(){
		   System.out.format("Driving %s %d \n",make,year);
		      
	   }
	  @Override
	   public boolean equals (Object that){
		   Engine eng2 =(Engine)that;
		   if(this.make==eng2.make && this.year==eng2.year)
		   {return true;}
		   else{
			   return false;
			   
		   }
	   }
	
}
