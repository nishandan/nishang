package com.nishan.pavi.test.singtel.q1;

import com.nishan.pavi.test.singtel.q1.inter.Flyable;
import com.nishan.pavi.test.singtel.q1.inter.Singable;
import com.nishan.pavi.test.singtel.q1.inter.Walkable;

public class Bird implements Flyable, Singable, Walkable {

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void sing() {
		System.out.println("I am Singing");
	}

}
