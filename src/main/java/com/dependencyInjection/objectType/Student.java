package com.dependencyInjection.objectType;

public class Student {

	private int id;
	private MathCheat mCheat;

	public void setId(int id) {
		this.id = id; 
	}

	public void setmCheat(MathCheat mCheat) {
		this.mCheat = mCheat;
	}

	public void cheating() {
		System.out.println("Id of a Student is = " + id);
		mCheat.mathCheat();
	}
}
 