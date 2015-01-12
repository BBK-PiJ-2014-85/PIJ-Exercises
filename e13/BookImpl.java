package e13;

public class BookImpl implements Book{

	final private String authorName;
	final private String title;
	
	public BookImpl(String name, String title)
	{
		authorName = name;
		this.title = title;
	}

	@Override
	public String getAuthorName() {
		return authorName;
	}

	@Override
	public String getTitle() {
		return title;
	}
	
	
	
}
