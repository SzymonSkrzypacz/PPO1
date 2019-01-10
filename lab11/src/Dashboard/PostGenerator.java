package Dashboard;

import java.util.ArrayList;

public class PostGenerator {

	public static  ArrayList<Post> posts = new ArrayList<>();
	

	public static ArrayList<Post> generate() {
			
		final int NUMBER_OF_GENERATED_POSTS = 5;

		
		for (int i=0; i < NUMBER_OF_GENERATED_POSTS; i++)
		{
			posts.add(new Post(randomAlphaNumeric(256)));
		}
		
		return posts;

	}
	
	
private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
public static String randomAlphaNumeric(int count) {
	StringBuilder builder = new StringBuilder();
	while (count-- != 0) {
		int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
		builder.append(ALPHA_NUMERIC_STRING.charAt(character));
	}	
	return builder.toString();
	}


}
