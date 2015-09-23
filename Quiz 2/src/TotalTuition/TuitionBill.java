package TotalTuition;

public class TuitionBill {
	private double tuitioncost;
	private double percentin;
	private double apr;
	private double term;

	public double getTuitioncost() {
		return tuitioncost;
	}

	public double getPercentin() {

		return percentin;
	}

	public double getApr() {

		return apr;
	}

	public double getTerm() {

		return term;
	}

	public TuitionBill(double tuitioncost, double percentin, double apr, double term) {
		this.tuitioncost = tuitioncost;
		this.percentin = percentin;
		this.apr = apr;
		this.term = term;
	}

	public double fullTuition() {
		double fullcost = tuitioncost;
		double increase = tuitioncost;
		for (int year = 1; year < 5; year++) {

			if (year > 1) {
				increase = increase + (increase * (percentin));
				fullcost = fullcost + increase;
			}

		}
		fullcost = fullcost + (((fullcost / term) * apr) * term);
		fullcost = Math.floor(fullcost * 100) / 100;
		return fullcost;
	}
}
