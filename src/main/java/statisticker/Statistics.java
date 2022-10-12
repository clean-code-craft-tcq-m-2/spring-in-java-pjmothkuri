package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics {

	public static Stats getStatistics(final List<Float> numbers) {

		return new Statistics().new Stats(numbers);
	}

	class Stats {

		Float average;
		Float min;
		Float max;

		public Stats(final List<Float> numbers) {
			min = Collections.min(numbers);
			max = Collections.max(numbers);
			average = average((Float[]) numbers.toArray(), numbers.size());
		}

		static Float average(final Float a[], final int n) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += a[i];
			}
			return (float) sum / n;
		}

	}

}