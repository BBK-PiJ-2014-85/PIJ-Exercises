package e8;

public class MySimpleMap implements SimpleMap{

	MapItem firstItem;
	@Override
	public void put(int key, String name) {
		
		MapItem item = new MapItem(key,name);
		
		if (firstItem == null) firstItem = item;
		else
		{	
			MapItem currentItem = firstItem;
			
			if (firstItem.getKey() < key)
			{
				MapItem temp = firstItem;
				firstItem = item;
				firstItem.setNextItem(temp);
			}
			else
			{
				currentItem = firstItem;
				while (currentItem.getNextItem() != null && currentItem.getNextItem().getKey() > key)
				{
					currentItem = currentItem.getNextItem();
				}
				
				if (currentItem.getKey() != key)
				{
				if (currentItem.getNextItem() == null) currentItem.setNextItem(item);
				else
				{
					MapItem temp = currentItem.getNextItem();
					currentItem.setNextItem(item);
					item.setNextItem(temp);
				}
				}
			}
		}
	}

	@Override
	public String get(int key) {
		
		if (isEmpty()) return "Error: List is empty so key cannot be found";
		else return recGet(key, firstItem);
	}
	
	private String recGet(int key, MapItem item)
	{
		if (item.getKey() == key) return (String) item.getObject();
		else if (item.getNextItem() == null) return "Error: Key not found in map";
		else return recGet(key, item.getNextItem());
	}

	@Override
	public void remove(int key) {
		if (!isEmpty()) 
		{
		if (firstItem.getKey() == key) firstItem=firstItem.getNextItem();
		else recRemove(key, firstItem);
		}
	}
	
	private void recRemove(int key, MapItem item)
	{
		if (item.getNextItem() != null && item.getNextItem().getKey() == key) item.setNextItem(item.getNextItem().getNextItem());
		else recRemove(key, item.getNextItem());
	}

	@Override
	public boolean isEmpty() {
		if (firstItem == null) return true;
		return false;
	}

}
