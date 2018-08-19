/**
 * 
 */
package com.nishan.pavi.test.singtel.q2;

import com.nishan.pavi.test.singtel.q1.inter.Singable;
import com.nishan.pavi.test.singtel.q1.inter.Swimable;

/**
 * @author WCCTTI-NISHAN
 *
 */
public class Duck implements Singable, Swimable {

	/* (non-Javadoc)
	 * @see org.transinfo.cacis.billing.exam.q1.inter.Singable#sing()
	 */
	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}

	@Override
	public void swim() {
		System.out.println("I'm swiming");
		}

}
