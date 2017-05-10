package mongo;

import com.mongodb.*;
import java.util.*;

public class Mongo {
	
	

	public static void main(String[] args) {
		
		try{
		
			MongoClient client = new MongoClient("localhost",27017);
		
			 DB db = client.getDB("JDBC");
			 
			 DBCollection coll = db.createCollection("jdb",null);
			 coll = db.getCollection("jdb");
			 Scanner input = new Scanner(System.in);
			 int choice =0;
			do{ 
				System.out.println("ENTER 1 OR 2");
				choice = input.nextInt();
				
			  switch(choice){
			  
			  case 1:
				  
				  BasicDBObject doc = new BasicDBObject("LAST","MONEY").append("SEE", 112);
				  BasicDBObject doc3 = new BasicDBObject("first","MOvdvvY").append("BEE", 782);
				  coll.insert(doc);
				  coll.insert(doc3);
				  
				  DBCursor cur = coll.find();
				  int a=1;
				  while(cur.hasNext()){
					  
					  System.out.println("SEE DOC"+a);
					  System.out.println(cur.next());
					  a++;
					  
				  }
				  
				  
				  
				  break;
			  case 2:
				     BasicDBObject doc1 = new BasicDBObject("SEE",112);
				     BasicDBObject doc2 = new BasicDBObject("SEE",100);
				     BasicDBObject update = new BasicDBObject();
				          update.put("$set",doc2);
				          coll.update(doc1, update, false, true);
				          DBObject mydoc = coll.findOne();
				          coll.remove(mydoc);
				        
				          DBCursor cur1 = coll.find();
				          
				          int k=1;
					         while(cur1.hasNext()){
					        	 System.out.println("REMAINING DOCUMENT : "+ k);
					        	 System.out.println(cur1.next());
					        	 k++;
					         }
			  
			  
			  }
			 
			}while(choice>0&&choice<3); 
		
		}catch(Exception e){
			
			System.err.println(e.getClass().getName()+":"+e.getMessage());
		}
		

	}

}
