package edu.uhu.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player proprietary;
	private boolean available = true;
	public String getName() {
		return name;
	}

	@Override
	public Player getOwner() {
		return proprietary;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	void setName(String name) {
		this.name = name;
	}

	@Override
	public void setProprietary(Player owner) {
		this.proprietary = owner;
	}
    
    public String toString() {
        return name;
    }

	@Override
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available, CardCell cardCell) {
		this.available = available;
	}
}
