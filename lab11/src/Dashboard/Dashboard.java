package Dashboard;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

final public class Dashboard {

	 ArrayList<Post> posts = new ArrayList<>();
    public void run() {
        Scanner scanner = new Scanner(System.in);
       
        try {
            while (true) {
                System.out.println();
                System.out.println("What would you like to do?");
                String method = scanner.nextLine();
               if (method.equals("run"))
               {
            	   System.out.println("Dashoboard is running");
               }
               else
               {
            	   this.findMethod(method);
               }
                
            }
        } catch (Throwable exception) {
            System.out.println(exception.getMessage());
        }
    }

    private void findMethod(String method) throws Throwable {
        try {
            Method reflectedMethod = this.getClass().getDeclaredMethod(method);
            
            reflectedMethod.setAccessible(true);
            reflectedMethod.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException exception) {
            System.out.println("There's no method like " + method);
        } catch (InvocationTargetException exception) {
            throw new Exception(exception.getTargetException().getMessage());
        }
    }


    private void quit() throws Exception {
        this.stop();
    }

    private void stop() throws Exception {
        throw new Exception("Dashboard stopped.");
    }
    
    private void create() throws Exception{
    	System.out.println("Enter the content of the post");
    	Scanner scanner = new Scanner(System.in);
		String content = scanner.nextLine();
    	Post post = new Post(content);
    	posts.add(post);

    }
    

    private void list() throws Exception{
    	
    	posts= PostGenerator.generate();
    	System.out.println("List of posts has been generated.");
    }

    
    private void show() throws Exception
    {
    	System.out.println("Which post do you want to show? Enter a number of the post ");
    	Scanner scanner = new Scanner(System.in);
		int postID = scanner.nextInt();
		boolean whetherIsPost=false;
		
		for (Post post: posts)
		{
			if (post.getPostID()==postID) {
				System.out.println(post.getContent());
				whetherIsPost=true;	
			}
		}		
		
		if (whetherIsPost==false)
		{
			System.out.println("There's no post of number " + postID +" yet.");
		}
	
    }
    
    
    private void random() throws Exception
    {
    	Random rand = new Random();
    	if (posts.size()<=0)
    	{
    		System.out.println("List of posts is empty");
    	}
    	else
    	{
    		int n = rand.nextInt(posts.size());
        	System.out.println(n);
        	System.out.println(posts.get(n).getContent());
    	}
    	
    }
    
    
    private void delete() throws Exception {
    	
    	System.out.println("Which post(s) do you want to delete? (all, last, selectedpost)");
    	
    	Scanner scanner = new Scanner(System.in);
		String whatToDelete = scanner.nextLine();
    	
		if (whatToDelete.equals("all"))
		{
			posts.clear();
		}
		
		 if (whatToDelete.equals("last"))
		{
				posts.remove(posts.size()-1);
		}
    	
		 if (whatToDelete.equals("selectedpost"))	
		 {
			 System.out.println("Enter number of selected post");
				int whatToDeleteIndex=scanner.nextInt();
				if (whatToDeleteIndex > 0 && whatToDeleteIndex <posts.size())
				posts.remove(whatToDeleteIndex-1);
				else 
				{
					System.out.println("Wrong number of post");
				}		
		}
		 
		else 
		{
			System.out.println("Wrong operation or list of posts is empty");
		}
		 	
    }
}


