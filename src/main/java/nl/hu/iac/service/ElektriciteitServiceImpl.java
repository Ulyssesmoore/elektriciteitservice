package nl.hu.iac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElektriciteitServiceImpl {
	private List<Prijs> prijss = new ArrayList<Prijs>();

	public void setPrijss(List<Prijs> prijss) {
		this.prijss = prijss;
	}

	public ElektriciteitServiceImpl() {
		prijss.add(new Prijs(20032017, "Eneco", 30.1));
		prijss.add(new Prijs(21032017, "Eneco", 30.2));
		prijss.add(new Prijs(22032017, "Eneco", 30.3));
		prijss.add(new Prijs(23032017, "Eneco", 30.4));
		prijss.add(new Prijs(24032017, "Eneco", 30.5));
		prijss.add(new Prijs(25032017, "Eneco", 30.6));
	}

	public Prijs getTrackById(int id) {
		for (Prijs prijs : prijss) {
			if (prijs.getDatum() == id) {
				return prijs;
			}
		}
		return null;
	}

	public List<Prijs> getPrijss() {
		return prijss;
	}

	public boolean remove(int id) {
		return prijss.remove(findTrack(id));
	}

	public Prijs add(Prijs prijs) {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000);
		prijs.setDatum(randomInt);
		if (prijss.add(prijs)) {
			prijss.add(prijs);
			return prijs;
		} else {
			return null;
		}
	}

	private Prijs findTrack(int id) {
		for (Prijs prijs : prijss) {
			if (prijs.getDatum() == id) {
				return prijs;
			}

		}
		return null;
	}

}
