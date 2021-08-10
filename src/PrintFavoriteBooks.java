
public class PrintFavoriteBooks extends Favorite{

	public void PrintfavoriteBooks()
	{
	       
 System.out.println("The added list of Favorite-Books are:");
 for(int i=0;i<size;i++)
 {
 	if(FavoriteBook[i]!=null)
 	{
 		System.out.println(FavoriteBook[i]);
 	}
 	
 }
	}
}
