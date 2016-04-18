package com.example.buildermodel;

public class MacBuilder implements Builder {
	private Computer mComputer = new MacComputer();

	public void buildBoard(String board) {
		// TODO Auto-generated method stub
		mComputer.setmBoard(board);
	}

	public void buildDisplay(String display) {
		// TODO Auto-generated method stub
		mComputer.setmDisplay(display);
	}

	public void buildOS() {
		// TODO Auto-generated method stub
		mComputer.setmOs();
	}

	public Computer creteComputer() {
		// TODO Auto-generated method stub
		return mComputer;
	}

	

}
