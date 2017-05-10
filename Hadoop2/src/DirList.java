/*import java.io.*;

public class DirList {
 
	public static void main(String [] sean) throws IOException {

		DataOutputStream dout = new DataOutputStream(new BufferedOutputStream (new FileOutputStream("dataIO.dat")));
		try {
			  dout.writeDouble(99.2);
			  dout.writeInt(10000);
			  dout.writeBoolean(true);
			  
		}
		catch (FileNotFoundException e){
			System.out.println("CANNOT OPEN OUTPUT FILE");
			return;
			
		}catch(IOException e){
			System.out.println("IO EXCEPTION" + e);
		}finally
		{
			dout.close(); 
			}
		
		DataInputStream din = new DataInputStream(new BufferedInputStream (new FileInputStream("dataIO.dat")));
	try	{
		  double d = din.readDouble();
		  int i = din.readInt();
		  boolean b = din.readBoolean();
		  System.out.println("HERE ARE THE VALUES     "+ d+" " + i+" " + b );
		  
			
		}catch (FileNotFoundException e){
			System.out.println("CANNOT OPEN OUTPUT FILE");
			return;
			
		}catch(IOException e){
			System.out.println("IO EXCEPTION" + e);
		}finally
		{
			din.close(); 
			}
		
		
		}
	
}*/
