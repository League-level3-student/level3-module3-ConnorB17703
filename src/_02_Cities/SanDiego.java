package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double aT  =population * growthRate;
		aT += 1000000;
		return aT;
	}
}
