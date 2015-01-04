package e9;

public class GitMaster {
	
	CommitNodeList commitNodes = new CommitNodeListImpl();
	int lastID = 0;
	CommitNode[] branchList = new CommitNode[4];
	String[] branchNames = new String[4];
	CommitNode HEAD;
	int currentBranch=0;
	
	public void commit(String desc)
	{
		if (lastID == 0)
		{
			branchList[0] = new CommitNode(lastID + 1, desc);
			lastID++;
			commitNodes.add(branchList[0]);
			branchNames[0] = "MASTER";
			HEAD = branchList[0];
			
		}
		else if (branchList[currentBranch].equals(HEAD))
		{
			CommitNode newNode = new CommitNode(lastID + 1, desc);
			lastID++;
			newNode.addParent(HEAD);
			HEAD = newNode;
			branchList[currentBranch] = newNode;
		}
		else
		{
			System.out.println("Error: HEAD and current Branch not the same node");
		}
	}
	
	public void checkout(int ID)
	{
		CommitNode newNode = commitNodes.getNodeWithID(ID);
		
		if (newNode == null) System.out.println("Error: ID cannot be found.");
		else HEAD = newNode;
	}
	
	public void createBranch(String name)
	{
		if (!branchNameExist(name))
		{
			extendArrays();
			
			int i=0;
			while (branchList[i] != null) i++;
			
			branchNames[i] = name;
			branchList[i] = HEAD;
		}
		else System.out.println("Error: Branch name already exists.");
	}
	
		private boolean branchNameExist(String name)
		{
			for (String branchName : branchNames)
			{
				if (name.equals(branchName)) 
				{
					return true;
				} 
			}
			return false;
		}
		
	private void extendArrays()
	{
		int length = branchList.length;
		if (branchList[length - 1] != null) 
		{
			CommitNode[] newList = new CommitNode[length * 2];
			String[] newNames = new String[length * 2];
			
			for (int i = 0; i < length; i++)
			{
				newList[i] = branchList[i];
				newNames[i] = branchNames[i];
			}
			
			branchList = newList;
			branchNames = newNames;
		}
	}
	
	public void changeBranch(String name)
	{
		if (branchNameExist(name))
		{
			int i = 0;
			while (!branchNames[i].equals(name)) i++;
			
			currentBranch = i;
			HEAD = branchList[i];
		}
		else System.out.println("Error: Branch name doesnt exist");
	}
	
	public void merge(String desc, String[] branches) //This doesn't delete branches as this was not in description so assumed not point of exercise
	{
		if (branchList[currentBranch].equals(HEAD))
		{
			commit(desc);
			for (String branch: branches)
			{
				if (branchNameExist(branch) && !branchNames[currentBranch].equals(branch))
				{
					int i=0;
					while (!branchNames[i].equals(branch)) i++;
					HEAD.addParent(branchList[i]);
					branchList[i] = HEAD;
				}
				else if (!branchNameExist(branch)) System.out.println("Error: branch name doesnt exist");
			}
		}
	}
	
	public String getCurrentNodeSummary()
	{
		return HEAD.provideSummary();
	}
	

}
