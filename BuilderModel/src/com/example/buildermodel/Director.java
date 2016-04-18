package com.example.buildermodel;

public class Director {

	private Builder mBuilder = null;

	public Director(Builder mBuilder) {
		super();
		this.mBuilder = mBuilder;
	}
	public void construct(String board,String display){
		mBuilder.buildBoard(board);
		mBuilder.buildDisplay(display);
		mBuilder.buildOS();
	}
}
