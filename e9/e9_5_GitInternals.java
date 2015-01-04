package e9;

public class e9_5_GitInternals {

	public static void main(String[] args)
	{
		GitMaster gm = new GitMaster();
		gm.commit("First");
		gm.createBranch("First Branch");
		System.out.println(gm.getCurrentNodeSummary()); // should be "first"
		gm.commit("My second commit to Master.");
		System.out.println(gm.getCurrentNodeSummary()); // should be "My second... with Parents 1"
		gm.changeBranch("First Branch");
		System.out.println(gm.getCurrentNodeSummary()); // should be "First"
		gm.changeBranch("Non existant branch so shouldn't change"); // should be branch doesn't exist
		System.out.println(gm.getCurrentNodeSummary()); // should be "My second... with Parents 1"
		gm.commit("A first commit on the first branch.");
		gm.commit("And a second commit on the first branch");
		System.out.println(gm.getCurrentNodeSummary()); // should be "And a second..."
		gm.merge("Merging MASTER to First Branch", new String[] {"MASTER"});
		System.out.println(gm.getCurrentNodeSummary()); // should be "Merging MASTER ... " and with parent from both branches
		gm.changeBranch("MASTER");
		System.out.println(gm.getCurrentNodeSummary()); // should be same as previous
		gm.checkout(2); //switch back to "My second commit to Master"
		System.out.println(gm.getCurrentNodeSummary());
		
	}
	
}
