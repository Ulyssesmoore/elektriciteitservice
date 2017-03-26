package nl.hu.iac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElektriciteitServiceImpl {
	private List<Prijs> prijzen = new ArrayList<Prijs>();

	public void setPrijzen(List<Prijs> prijzen) {
		this.prijzen = prijzen;
	}

	public ElektriciteitServiceImpl() {
		prijzen.add(new Prijs(20032017, "Eneco", 30.1));
		prijzen.add(new Prijs(21032017, "Eneco", 30.2));
		prijzen.add(new Prijs(22032017, "Eneco", 30.3));
		prijzen.add(new Prijs(23032017, "Eneco", 30.4));
		prijzen.add(new Prijs(24032017, "Eneco", 30.5));
		prijzen.add(new Prijs(25032017, "Eneco", 30.6));
	}

	public Prijs getPrijsBijDatum(int id) {
		for (Prijs prijs : prijzen) {
			if (prijs.getDatum() == id) {
				return prijs;
			}
		}
		return null;
	}

	public List<Prijs> getPrijzen() {
		return prijzen;
	}

	public boolean remove(int id) {
		return prijzen.remove(findPrijzen(id));
	}

	public Prijs add(Prijs prijs) {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000);
		prijs.setDatum(randomInt);
		if (prijzen.add(prijs)) {
			prijzen.add(prijs);
			return prijs;
		} else {
			return null;
		}
	}

	private Prijs findPrijzen(int id) {
		for (Prijs prijs : prijzen) {
			if (prijs.getDatum() == id) {
				return prijs;
			}

		}
		return null;
	}

}
