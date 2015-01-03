package e9;

public class ListIntSortedList extends ListIntSet implements IntSortedList {

	public ListIntSortedList(int num) {
		super(num);
	}

	@Override
	public void add(int num) {
		if (next != null) next.add(num);
		else if (next == null) next = new ListIntSortedList(num);
	}


}
