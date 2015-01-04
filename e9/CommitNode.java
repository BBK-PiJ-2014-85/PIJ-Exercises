package e9;

public class CommitNode {
	private int ID;
	private String description;
	private CommitNodeList parentList = new CommitNodeListImpl();
	
	public CommitNode(int ID, String desc)
	{
		this.ID = ID;
		this.description = desc;
	}
	
	public void addParent(CommitNode parent)
	{
		parentList.add(parent);
	}

	public String getDescription() {return description;}
	public int getID() {return ID;}
	
	public String provideSummary()
	{	
		return description + " (ID: " + ID + "). Parents " + parentList.toString();
		
	}
	

}
