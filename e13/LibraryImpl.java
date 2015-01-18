package e13;

public class LibraryImpl implements Library{

	String name;
	int maxBooks;
	
	public LibraryImpl(String name)
	{
		this.name = name;
	}
	
	@Override
	public String getLibrary()
	{
		return name;
	}

	@Override
	public void setMaxBooks(int num) {
		maxBooks = num;
	}

	@Override
	public int getMaxBooks() {
		return maxBooks;
	}
	
	@Override 
	public int getID(String name)
	{
		return 0;
	}
	
	
}
