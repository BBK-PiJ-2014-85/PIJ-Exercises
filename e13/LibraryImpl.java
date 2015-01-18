package e13;

public class LibraryImpl implements Library{

	String name;
	int maxBooks;
	String[] names = new String[1];
	int namesInList;
	
	
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
	
	
}
