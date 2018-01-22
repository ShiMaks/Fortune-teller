package by.learning.divination.bean;

public class Bud {
	
	private Leaf[] leaves;
	private String colour;
	private int size;
	private boolean isBloomed;

	public Bud(int size) {
		this.size = size;
		this.colour = "yellow";
	}
	public String printBudSizeAndColour() {
		return "Bud size: "+getSize() +" ,bud colour: " +getColour();
	}
	
	public Leaf[] getLeaves() {
		return leaves;
	}

	public void setLeaves(Leaf[] leaves) {
		this.leaves = leaves;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean isBloomed() {
		return isBloomed;
	}
	public void setBloomed(boolean isBloomed) {
		this.isBloomed = isBloomed;
	}
	
	public void addFreshleaves(int number) {
		if ( leaves != null ) {
			
		}
		else {
			leaves = new Leaf [number];
			for(int i = 0 ; i < number ; ++i) {
				leaves[i] = new Leaf("White","ellipse");
			}
		}
	}
}
