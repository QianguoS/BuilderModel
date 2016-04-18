package com.example.buildermodel;

public abstract class Computer {

	protected String mBoard;
	protected String mDisplay;
	protected String mOs;
	public void setmBoard(String mBoard) {
		this.mBoard = mBoard;
	}
	public void setmDisplay(String mDisplay) {
		this.mDisplay = mDisplay;
	}
	public abstract void setmOs();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "mBoard"+mBoard+"mDisplay"+mDisplay+"mOs"+mOs;
	}
	
}
