import java.sql.*;
import java.util.*;

public class JDBCtoMySQL{ 
	
	//step1:Write Address of driverClass and URL
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //driver class for MySQL db  
	   static final String DB_URL = "jdbc:mysql://localhost/";//connection url
	                                 //API.db://source/ip/port/database
	   
	   static final String USER = "root";
	   static final String PASS = "Infinium7";

	   //Start of Main program
	   
	   public static void main(String [] args) throws ClassNotFoundException{
		  
		   Connection conn=null;
		   Statement stmt=null; //allows to execute statement in sql and return result in ResultSet
		   int choice=0;
		   
		   try{
      //step2:Register JDBC driver
	 //to register driver class and dynamically load the driver class 
	//When a Driver class is loaded, it should create an instance of itself and register it with the DriverManager. 
   //This means that a user can load and register a driver by calling
  //driver class:The interface that every driver class must implement. 
//Without context, it's hard to tell. Is it talking about a JDBC driver, perhaps? 
/*If so, the driver class is responsible for implementing the <A href="http://java.sun.com/javase/6/docs/api/java/sql/Driver.html" 
rel="nofollow">java.sql.Driver</A> interface for a particular database, so that 
clients can write code in a db-agnostic way. The JDBC infrastructure works out 
which driver to use based on the connection string.
 //The Java SQL framework allows for multiple database drivers.*/ 
			   Class.forName("com.mysql.jdbc.Driver");
			   
	  //step3:open a connection 
			   System.out.println("Connecting to database...");
	 //once the connection is established with DriverManager you can obtain connection instance by calling
			      conn = DriverManager.getConnection(DB_URL, USER, PASS);
			      
			      do
			      {
		System.out.println("\n\n*****JDBC: MYSQL : FOR SHOPS*****");
		System.out.println("1.Create Shop Branch (Create Database)");
		System.out.println("2.Create Item Category (Create Table)");
		System.out.println("3.Insert Item Records (Insertion in Tables)");
		System.out.println("4.Display Items (Display Table)");
		System.out.println("5.Update Items (Update Records)");
		System.out.println("6.Delete Items (Delete Records)");
		System.out.println("7.Exit");
		System.out.println("Enter Your choice");
			    	  
			    	  Scanner input = new Scanner(System.in);
			    	  choice=input.nextInt();
			    	  String sql=null;
			    	  String sql0="USE SHOP123";
			    	  switch(choice)
			    	  {
			    	  //step4:Execute query
			    	  
			    	  case 1:
			    		  System.out.println("Creating Database");
			    		  stmt=conn.createStatement();
			    		  
			    		  
			    		  sql="Create Database SHOP123";
			    		  stmt.executeUpdate(sql);
			    		  
	System.out.println("Shop Branch Added Succesfully : 	Database created successfully");
			    		  break;
			    		  
			    		  
			    	  case 2:
					System.out.println("Create Item Categories (Table) in given database]");
			    		  stmt=conn.createStatement();
			    		  stmt.executeUpdate(sql0);
			    		
			    		  
			    		  String sql1="CREATE TABLE ENTRY0" +
				                   "(id INTEGER not NULL, " +
				                   " name VARCHAR(255), " + 
				                   " type VARCHAR(255), " + 
				                   " price INTEGER, " + 
				                   " PRIMARY KEY ( id ))";
			    		  
			    		  stmt.executeUpdate(sql1);
			    		  System.out.println("Created Item Categories (Table) in given database");
			    		  break;
			    		  
			    	  case 3:
			    		  System.out.println("Inserting record onto table-------");
			    		  stmt=conn.createStatement();
			    		  stmt.executeUpdate(sql0);
			    		  
			    		  
			    		  sql= "Insert into ENTRY0 VALUES(1,'Dairy Milk','Chocolates',10)";
			    		  stmt.executeUpdate(sql);
			    		  sql= "Insert into ENTRY0 VALUES(2,'Five Star','Chocolates',12)";
			    		  stmt.executeUpdate(sql);
			    		  sql= "Insert into ENTRY0 VALUES(3,'Lays','Crisps',10)";
			    		  stmt.executeUpdate(sql);
			    		  sql= "Insert into ENTRY0 VALUES(4,'Kurkure','Crisps',20)";
			    		  stmt.executeUpdate(sql);
					      sql= "Insert into ENTRY0 VALUES(5,'Fine Grip','Pens',5)";
			    		  stmt.executeUpdate(sql);
					      sql= "Insert into ENTRY0 VALUES(6,'Cello Gripper','Pens',8)";
			    		  stmt.executeUpdate(sql);
					      sql= "Insert into ENTRY0 VALUES(7,'TATA Salt','Groceries',25)";
			    		  stmt.executeUpdate(sql);
					      sql= "Insert into ENTRY0 VALUES(8,'Aashirwaad Aata','Groceries',200)";
			    		  stmt.executeUpdate(sql);
					      sql= "Insert into ENTRY0 VALUES(9,'Amul Butter','Dairy',30)";
			    		  stmt.executeUpdate(sql);
					      sql= "Insert into ENTRY0 VALUES(10,'Amul Cheese','Crisps',60)";
			    		  stmt.executeUpdate(sql);
			    		  
			    		  
			    		  
				   System.out.println("Inserted records into the table...");
				   break;
				   
				   
			    	  case 4:
			    		  System.out.println("CREATING STATEMENT .");
			    		  stmt=conn.createStatement();
			    		  stmt.executeUpdate(sql0);
			    		  
			    		  String sql3;
			    		  sql="SELECT id, name, type, price FROM ENTRY0";
			    		  
			    		 /* stmt.executeUpdate(sql);*/
			    		
			    		  ResultSet rs = stmt.executeQuery(sql);
			    		  
			    		 //step5:Extract data from result set
			    		  while(rs.next()){
			    		         //Retrieve by column name
			    		         int id  = rs.getInt("id");
			    		         int price = rs.getInt("price");
			    		         String name = rs.getString("name");
			    		         String type = rs.getString("type");
			    		         //Display values
			    		         System.out.print("ID: " + id);
			    		         System.out.print(", Price: " + price);
			    		         System.out.print(", Name: " + name);
			    		         System.out.println(", Type: " + type);
			    		      }
			    		      rs.close();
						   break;
						   
			    	  case 5:
						 System.out.println("Creating statement...");
						   stmt=conn.createStatement();
				    		  stmt.executeUpdate(sql0);
				    		  
				 sql="UPDATE ENTRY0 SET price=65 WHERE ID =10";
				    		  stmt.executeUpdate(sql);
				    		  System.out.println("RECORD UPDATED");
				    		  break;
				    		  
			    	  case 6:  
			    		  System.out.println("Creating statement");
			    		  stmt=conn.createStatement();
			    		  stmt.executeUpdate(sql0);
			    		  
			    		  
			    		  sql="DELETE FROM ENTRY0 WHERE ID =2";
			    		  stmt.executeUpdate(sql);
			    	  System.out.println("RECORD SUCCESSSFULLY DELETED");
			    		  
			    		  
			    		  break;
			    		  
			    	  case 7:
			    		  sql="System exit";
			    		  stmt.executeUpdate(sql);

			    	  }//end of switch
			    									  
			    	  		
			      }while(choice>0&&choice<8);//end of do=while
		   }catch(SQLException se){
			   //Handle error for JDBC
			   se.printStackTrace();}catch(Exception e){
				   
			   //Handle error for for class.forname
			   
			   e.printStackTrace();
			   
			   
		   }finally{
			   //Finally block used to close resourses
		try{
			if(stmt!=null)
				stmt.close();
			
		}catch(SQLException se2){
			
		}//nothing we can do
		try{
			if(conn!=null)
				conn.close();
			
		}catch(SQLException se){
			se.printStackTrace();
			
		}//end finally try
		   }//end try
		   System.out.println("Goodbye");
	//end of main
		   }
	   
}
