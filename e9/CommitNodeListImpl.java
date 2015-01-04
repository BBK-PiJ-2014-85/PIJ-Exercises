package e9;

public class CommitNodeListImpl implements CommitNodeList {

	CommitNode[] list = new CommitNode[10];
	private int numberInList =0;
	
	@Override
	public void add(CommitNode newCommit) {
		extendArray();
		list[numberInList] = newCommit;
		numberInList++;
	}
	
	public void extendArray()
	{
		int length = list.length;
		if (list[length - 1] != null) 
		{
			CommitNode[] newList = new CommitNode[length * 2];
			
			for (int i = 0; i < length; i++)
			{
				newList[i] = list[i];
			}
			
			list = newList;
		}
	}

	@Override
	public CommitNode getNodeWithID(int ID) {
		
		for (CommitNode node : list)
		{
			if (node.getID() == ID) return node;
		}

		return null;
	}
	
	public String toString()
	{
		String output = "";
		for (int i=0; i < numberInList; i++)
		{
			output += list[i].getID() + (numberInList - i != 1 ? ", " : " ");
		}
		return output;
	}
	

}
