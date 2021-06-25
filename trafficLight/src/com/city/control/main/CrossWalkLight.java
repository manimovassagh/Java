package com.city.control.main;

import com.city.control.enumCollection.CrossWalkLightColors;
import com.city.control.enumCollection.CrosserType;

/**
 * define This Class to make a Cross Walk Light obviously!
 * 
 * @author Mani Movassagh
 *
 */
public class CrossWalkLight {

	CrossWalkLightColors light;

	public CrossWalkLight(CrossWalkLightColors light) {
		super();
		this.light = light;
	}

	/**
	 * Define to show the STOP Shield in Console To user
	 */
	public void stopThePassenger() {
		System.out.println(CrosserType.PASSENGER + " The Light Is Red Please " + CrossWalkLightColors.STOP);

	}

	/**
	 * Define to show the WALK Shield in Console To user
	 */
	public void passengerCanWalk() {
		System.out.println(CrosserType.PASSENGER + " The Light Is Green Please " + CrossWalkLightColors.WALK);

	}

	/**
	 * Define to show the DANGER Shield in Console To user
	 */
	public void PassengerBetterToStopm() {
		System.out.println(CrosserType.PASSENGER + " The Light Is Yellow and you might be in  "
				+ CrossWalkLightColors.DANGER + " Stop Please!!");

	}
}
