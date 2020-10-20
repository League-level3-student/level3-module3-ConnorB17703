package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double aT = (population * growthRate) * (growthRate * 2);
		return aT;
	}

}
