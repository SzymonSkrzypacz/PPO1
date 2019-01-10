package Dashboard;

import java.util.concurrent.atomic.AtomicInteger;

public class Post {

	private static final AtomicInteger number = new AtomicInteger(0);
	private int postID;
	private String content;
	
	Post (String content)
	{
		this.postID = number.incrementAndGet();
		this.content=content;
	}
	
	
	public int getPostID()
	{
		return postID;
	}
	
	public String getContent()
	{
		return content;
	}
	
	
	
}
