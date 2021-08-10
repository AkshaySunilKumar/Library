


import java.util.Scanner;


public class Library {

    public static int size;
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.out.println("Enter the limit-bound of Books to be added");
        Scanner Scan=new Scanner(System.in);
         size = Scan.nextInt();
        String BookName[] = new String[size];
        System.out.println("Enter the Book Name in order:: ");
        for(int i=0; i<size; i++)
        {
        	;
       BookName[i] =Scan.nextLine();
        }
       
        
       Favorite F=new Favorite();
       PrintFavoriteBooks P=new PrintFavoriteBooks();
        F.FavoriteBooks(BookName);
       
        P.PrintfavoriteBooks();
        }
   
 
    
    }