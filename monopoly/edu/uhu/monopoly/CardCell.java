package edu.uhu.monopoly;

public class CardCell extends Cell {
    private int type;
	private boolean available = true;
	private boolean available = true;
    
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public void playAction() {
    }
    
    public int getType() {
        return type;
    }
}
