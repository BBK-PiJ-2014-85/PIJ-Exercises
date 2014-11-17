package e8;

public class HashTable implements SimpleMap2{
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

	@Override
	public String[] get(int key) {
		
		if(isEmpty()) return new String[] {"Error: List is empty so key cannot be found"};
		
		int count = getKeyCount(key);
		
		if (count == 0) return new String[] {"Error: Key not found in map"};
		else
		{
			MapItem currentItem = firstItem;
			while (currentItem.getKey() != key) currentItem = currentItem.getNextItem();
			
			String[] output = new String[count];
			for (int i=0; i<count; i++)
			{
				output[i] = (String) currentItem.getObject();
				currentItem = currentItem.getNextItem();
			}
			return output;
		}
	}
	
	private int getKeyCount(int key)
	{
		int c=0;
		MapItem currentItem = firstItem;
		while (currentItem != null)
		{
			if (currentItem.getKey() == key) c++;
			currentItem = currentItem.getNextItem();
		}
		return c;
	}

	@Override
	public void remove(int key, String name) {
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
