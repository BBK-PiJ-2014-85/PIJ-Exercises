package e8;

public interface SimpleMap2 {
		/**
		* Puts a new String in the map.
		*/
		void put(int key, String name); //this was returning a string, which i assume is an error as it doesn't look to make sense
		/**
		* Returns all the names associated with that key,
		* or null if there is none.
		*/
		String[] get(int key);
		/**
		* Removes a name from the map.
		*/
		void remove(int key, String name);
		/**
		* Returns true if there are no workers in the map,
		* false otherwise
		*/
		boolean isEmpty();
}
