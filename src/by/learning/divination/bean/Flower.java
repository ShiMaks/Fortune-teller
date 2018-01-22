package by.learning.divination.bean;

public class Flower {
	private int numberOfLeaves;
	private String title;
	private Bud bud;
	private Stem stem;
	private boolean isWithered;
	
	public Flower(String title) {
		this.title = title;
		bud = new Bud(2);
		stem = new Stem(10,1);
	}

	public void bloom() {
		if (bud.isBloomed() != true)
		{
			bud.setSize(bud.getSize()*2);
			bud.setColour("Yellow");
			this.numberOfLeaves = (int) ((Math.random()*13) + 21);
			bud.addFreshleaves(numberOfLeaves);
		}
		bud.setBloomed(true);
	}
	
	public void grow() {
		this.stem.setHeight(28);
		this.stem.setWidth(2);
		this.bud.setSize(8);
	}
	
	public void wither() {
		if (isWithered != true)
		{
			bud.setColour("Grey");
			bud.setLeaves(new Leaf[0]);
			isWithered = true;
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Bud getBud() {
		return bud;
	}

	public void setBud(Bud bud) {
		this.bud = bud;
	}

	public Stem getStem() {
		return stem;
	}

	public void setStem(Stem stem) {
		this.stem = stem;
	}
	
	public int getNumberOfLeaves() {
		return numberOfLeaves;
	}

	public void setNumberOfLeaves(int numberOfLeaves) {
		this.numberOfLeaves = numberOfLeaves;
	}
}
