package edu.uhu.monopoly;

public interface IOwnable {

	Player getOwner();

	void setProprietary(Player owner);

	boolean isAvailable();

}