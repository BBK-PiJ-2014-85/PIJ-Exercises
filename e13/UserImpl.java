package e13;


public class UserImpl implements User{

	final private String name;
	private int libraryID;
	private LibraryImpl lib;
	
	public UserImpl(String name)
	{
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getID() {
		return libraryID;
	}

	@Override
	public void setID(int id) {
		libraryID = id;
		
	}

	@Override
	public void register(LibraryImpl lib) {
		this.lib = lib;
		if (lib != null) setID(lib.getID());
		else setID(0);
	}

	@Override
	public LibraryImpl getLibrary() {
		//if (lib == null) return null;
		return lib;
	}

}
