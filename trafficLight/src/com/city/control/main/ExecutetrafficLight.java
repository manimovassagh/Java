package com.city.control.main;

public class ExecutetrafficLight {
	public static void main(String[] args) {
		/**
		 * define two new object instances to use here as main objects
		 *  mainzCrossWalkLight shows The Cross Walk Light in Mainz Status
		 *  mainzTrafficLight shows  The Traffic Light Status on Mainz for Automobiles
		 */
		CrossWalkLight mainzCrossWalkLight = new CrossWalkLight(null);
		TrafficLight mainzTrafficLight = new TrafficLight(null);

		/**
		 * define synchorise timeouts for Cross Walk Lights
		 */
		setTimeoutSync(() -> mainzCrossWalkLight.passengerCanWalk(), 3000);
		setTimeoutSync(() -> mainzCrossWalkLight.PassengerBetterToStopm(), 3000);
		setTimeoutSync(() -> mainzCrossWalkLight.stopThePassenger(), 3000);

		/**
		 * define synchorise timeouts for Traffic Lights
		 */
		setTimeoutSync(() -> mainzTrafficLight.stopTheCars(), 3000);
		setTimeoutSync(() -> mainzTrafficLight.alarmTheCars(), 3000);
		setTimeoutSync(() -> mainzTrafficLight.driveTheCars(), 3000);

	}
/**
 * 
 * @param runnable
 * @param delay
 * Define a Method to make a synchorisable Timeout 
 * if you want to make it asynchorise you can add start at end.
 */
	public static void setTimeoutSync(Runnable runnable, int delay) {
		try {
			Thread.sleep(delay);
			runnable.run();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
