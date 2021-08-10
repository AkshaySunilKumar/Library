

public class Favorite extends Library {
	
public static String FavoriteBook[]=new String[size];
	        

	 public  String[] FavoriteBooks(String[] BookName) 
	    {      
		    
	    	
	    	for(int i=0;i<size;i++)
	    	{
	    		Boolean t=BookName[i].contains("great")||BookName[i].contains("Great");
	    		if(t==true)
	    		{
	        System.out.println(BookName[i]+" Book name contains word 'Great'::Book name rejected");
	        
	           }
	    		else
	    		{
	    			
	    			FavoriteBook[i]=BookName[i];
	    			
	    		}
	    		
	    	}
	    	
	   return FavoriteBook;
	 
	    }
		       
	
	 
}
	    	
	    
