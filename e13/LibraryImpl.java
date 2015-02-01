package e13;

public class LibraryImpl /*implements Library*/{
/*
	String name;
	int maxBooks;
	String[] names = new String[1];
	int namesInList;

	Book[] booksIn = new Book[1];
	Book[] booksOut = new Book[1];
	
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
		int loc = getNameLocation(name);
		
		if (loc == -1) return addNewID(name);
		
		return (loc + 1);
	}
	
	private int getNameLocation(String name)
	{
		for (int i=0; i< namesInList; i++)
		{
			if (names[i].equals(name)) return i;  
		}
		
		return -1;
	}
	
	private int addNewID(String name)
	{
		if (namesInList == names.length) extendArray();
		
		names[namesInList] = name;
		namesInList++;
		return namesInList;
	}
	
	private void extendArray()
	{
		String[] newArray = new String[namesInList * 2];
		for (int i=0; i<namesInList; i++) newArray[i] = names[i];
		names = newArray;
	}

	@Override
	public void addBook(String title, String author) {
		Book newBook = new BookImpl(title,author);
		addToList(booksIn,newBook);
	}

	@Override
	public Book takeBook(String title) {
		if inList(booksIn,title)
		{
			Book outBook = removeFromList(booksIn,title);
			addToList(booksOut, outBook);
			return outBook;
		}
		return null;
	}

	@Override
	public void returnBook(Book book) {
		if inList(booksOut, book) 
		{
			removeFromList(booksOut,book);
			addToList(booksIn,book);
		}
	}
	
	private Book removeFromList(Book[] list, Book book)
	{
		
		return book;
	}
	
	private void bookEquals()
	{
		
	}
*/	
}
