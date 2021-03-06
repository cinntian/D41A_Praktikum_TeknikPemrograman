package com.polban.tekpro.monopoly;

public abstract class OwnedCell extends Cell {
	protected Player owner;
	
	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player player) {
		this.owner = player;
	}

	private boolean available = true;

	public OwnedCell() {
		super();
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}