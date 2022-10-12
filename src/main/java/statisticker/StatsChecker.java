/**
 * <copyright>
 *
 * Copyright (c) 2022 ETAS GmbH. All rights reserved.
 *
 * </copyright>
 */
package statisticker;

/**
 *
 */
public class StatsChecker {

	private final float maxThreshold;
	private final IAlerter[] alerters;

	public StatsChecker(final float maxThreshold, final IAlerter[] alerters) {
		this.maxThreshold = maxThreshold;
		this.alerters = alerters;
	}

	/**
	 * @param numbers
	 */
	public void checkAndAlert(final Float[] numbers) {

		for (Float number : numbers) {
			if (maxThreshold < number) {
				EmailAlert emailAlert = (EmailAlert) alerters[0];
				emailAlert.emailSent = true;
				LEDAlert ledAlert = (LEDAlert) alerters[0];
				ledAlert.ledGlows = true;
			}
		}

	}

}
