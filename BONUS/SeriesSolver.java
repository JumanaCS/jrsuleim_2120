import java.math.BigDecimal;
import java.lang.InterruptedException;

/**
 * Utility class that computes approximations of series.
 */
public class SeriesSolver {
	
	/**
	 * Computes the series sequentially using only one thread.
	 *
	 * @param series The Series to solve.
	 * @param a The min n value to iterate to.
	 * @param b The max n value to iterate to.
	 * @return The sum of the series from a to b.
	 */
	private static BigDecimal computeSum(final Series series, final int a, final int b){
		if (a > b){
			throw new IllegalArgumentException("a cannot be greater than b.");
		}
		BigDecimal sum = new BigDecimal(0);
		for (int n = a; n <= b; n++){
			sum = sum.add(series.computeValue(n));
		}
		return sum;
	}
	
	/**
	 * Computes the series using multiple threads.
	 *
	 * @param series The Series to solve.
	 * @param a The min n value to iterate to.
	 * @param b the max n value to iterate to.
	 * @param threads The number of threads to use (can be less if b-a is small).
	 * @return The sum of the series from a to b.
	 */
	private static BigDecimal computeSum(final Series series, final int a, final int b, final int threads){
		if (a > b){
			throw new IllegalArgumentException("a cannot be greater than b.");
		}
		if (threads <= 0){
			throw new IllegalArgumentException("Number of threads must be positive.");
		}
		//Fill in this implementation.
		int sum = (b - a)/threads;
		private int a;
		private int b;
		private BigDecimal partial;
		private Series series;
		public SumThread(final Series series, int a, int b) {
			this.a = a;
			this.b = b;
			this.series = series;
		}

		public BigDecimal getPartial(){
			return this.partial;
		}

		SumThread[] summationThreads = new SumThread[threads];


        BigDecimal total = BigDecimal.ZERO;
        for (SumThread sum1 : sumThreads) {
        	total = total.add(sum1.getPartial());
        }
        return total;
	}

}