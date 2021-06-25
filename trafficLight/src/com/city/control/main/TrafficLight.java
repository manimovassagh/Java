package com.city.control.main;

import com.city.control.enumCollection.CrosserType;
import com.city.control.enumCollection.TrafficLighColors;

/**
 * define This Class to make a TrafficLight obviously!
 * 
 * @author Mani Movassagh
 *
 */
public class TrafficLight {

	TrafficLighColors trafficLight;

	public TrafficLight(TrafficLighColors trafficLight) {
		super();
		this.trafficLight = trafficLight;
	}

	/**
	 * This is a Method to Stop the Cars
	 */
	public void stopTheCars() {
		System.out.println(
				CrosserType.AUTOMOBILE + " The Light Is " + TrafficLighColors.RED + " You Must Stop your Car!! ");

	}

	/**
	 * This is a Method to let the Cars Drive
	 */
	public void driveTheCars() {
		System.out.println(CrosserType.AUTOMOBILE + " The Light Is " + TrafficLighColors.GREEN + " You Can Drive!! ");

	}

	/**
	 * This is a Method to alarm the Cars to stop
	 */
	public void alarmTheCars() {
		System.out.println(
				CrosserType.AUTOMOBILE + " The Light Is " + TrafficLighColors.YELLOW + "  Recommend Not to Drive!! ");

	}

}
