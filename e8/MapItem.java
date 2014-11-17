package e8;

public class MapItem {

	private int key;
	private Object value;
	private MapItem nextItem;
	
	public int getKey(){ return key;}
	public Object getObject(){return value;}
	public MapItem getNextItem() {return nextItem;}
	
	public void setNextItem(MapItem item) {nextItem = item;}
	
	public MapItem (int key, Object value)
	{
		this.key = key;
		this.value = value;
	}
	
}
