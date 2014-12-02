package e10;

public class Guitar {
	MusicalInstrument m= new MusicalInstrument();
	WoodenObject w = new WoodenObject();
	
	//TODO is there a better way of doing this
	
	public void play()
	{
		m.play();
	}
	
	public void burn()
	{
		w.burn();
	}

}
