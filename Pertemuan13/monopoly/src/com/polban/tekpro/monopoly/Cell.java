package com.polban.tekpro.monopoly;

public abstract class Cell {
	private String name;
	protected Player owner;

	public String getName() {
		return name;
	}

	public Player getPlayer() {
		return owner;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	void setName(String name) {
		this.name = name;
	}

	public void setPlayer(Player player) {
		this.owner = player;
	}
    
    public String toString() {
        return name;
    }

	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
}
