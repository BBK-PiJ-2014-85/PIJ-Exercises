package e13;

public class UserImpl implements User{

	final private String name;
	private int libraryID;
	
	public UserImpl(String name)
	{
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getLibraryID() {
		return libraryID;
	}

	@Override
	public void setLibrayID(int id) {
		libraryID = id;
		
	}

}
