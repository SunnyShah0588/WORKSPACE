import com.mongodb.*;
import java.util.*;

public class JDBCtoMongoDB {

	public static void main(String[] args) {
		
		
		
		try{
			// Connect to MongoDB server with localserver and port no
			MongoClient mongoClient=new MongoClient("localhost",27017);
			
			//Connect to your database if not creates
			DB db = mongoClient.getDB("JDBC");
			System.out.println("CONNECTING TO DATABASE SUCCESSFULL");
			
			//to create collection 
			//DBCollection collection = db.getCollection("test"); 
			DBCollection coll = db.createCollection("jdbc",null);
			System.out.println("CoLLECTION CREATED SUCCESSFULL");
			
			//select the given collection
			coll = db.getCollection("jdbc");
			System.out.println("COLLECTION SELECTED SUCESS");
			
			int ch;
			Scanner sc = new Scanner(System.in);
	
	while(true){
		System.out.println("\n1. INSERT DOCUMENT\n2. UPDATE DOCUMENT\n3. DELETE DOCUMENT\n4. RETRIEVE DOCUMENT\n5. EXIT\n\t\tENTER YOUR CHOICE : ");
		ch =sc.nextInt();
		
		switch(ch){
		case 1:  
			    //A basic implementation of BSON object that is MongoDB specific. A DBObject can be created as follows, using this class: 
			    //Add a key/value pair to this object for append(key,value)
			     BasicDBObject doc = new BasicDBObject("Book Name"," Let Us C").append("Type", "Programming").append("Likes",6000).append("URL","http://www.letusc.com");
	
			     coll.insert(doc);
			 System.out.println("NEW DOCUMENT INSERTED IN COLLECTION");
			 
			 DBCursor cursor = coll.find();
			
	int i=1;
	
	//cursor.hasNext: Returns true if the cursor has documents and can be iterated.
	         while(cursor.hasNext()){
	        	 System.out.println("INSERTED DOCUMENT: "+i);
	        	//cursor.next: Returns the next document in a cursor.
	        	//cursor.pretty(): Configures the cursor to display results in an easy-to-read format.
	        	 System.out.println(cursor.next());
	        	 i++;
	         }
	   System.out.println("DOCUMENT INSERT TOTAL SUCESS");    
	         
	     break;
	     
		case 2:
			    BasicDBObject query = new BasicDBObject("Likes",6000);
			    BasicDBObject temp = new BasicDBObject("Likes",10000);
			    BasicDBObject dupdate = new BasicDBObject();
			    dupdate.put("$set", temp);
			    coll.update(query,dupdate,false,true);
			    cursor = coll.find();
	int j=1;
	
	         while(cursor.hasNext()){
	        	 System.out.println("UPDATE DOCUMENT: "+j);
	        	 System.out.println(cursor.next());
	        	 j++;
     }
	         System.out.println("DOCUMENT UPDATE SUCCESS");
	         //other method for update
	         /* while (cursor.hasNext()) { 
            DBObject updateDocument = cursor.next();
            updateDocument.put("likes","200")
            col1.update(updateDocument); 
         }*/
	     break;
	     
		case 3:
			   DBObject mydoc = coll.findOne();
			   coll.remove(mydoc);
			   cursor = coll.find();
	int k=1;
	         while(cursor.hasNext()){
	        	 System.out.println("REMAINING DOCUMENT : "+ k);
	        	 System.out.println(cursor.next());
	        	 k++;
	         }
	         System.out.println("DOCUMENT DELETED SUCESS");
	     break;
	    	 
		case 4:
			   DBCursor cursor1 = coll.find();
	int l=1;
		while(cursor1.hasNext()){
				System.out.println("DOCUMENT  : "+ l);
				System.out.println(cursor1.next());
				l++;
     }
		break;
		case 5:  
			      return;
		default: System.out.println("\nPLEASE ENTER CORRECT CHOICE FROM THE OPTIONS ........:   \n  ");
		
	
	    	}
    	}
	
	}	catch(Exception e)	
		{
		System.err.println(e.getClass().getName() + ":" + e.getMessage());
		}

	}

}
