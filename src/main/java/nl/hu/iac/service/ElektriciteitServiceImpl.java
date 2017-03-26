package nl.hu.iac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElektriciteitServiceImpl {
	private List<Elektriciteit> elektriciteits = new ArrayList<Elektriciteit>();

	public void setElektriciteits(List<Elektriciteit> elektriciteits) {
		this.elektriciteits = elektriciteits;
	}

	public ElektriciteitServiceImpl() {
		elektriciteits.add(new Elektriciteit(1, "The Doors", "Light My Fire", 1967, "www.youtube.com/watch?v=M_yWyBjDEaU"));
		elektriciteits.add(new Elektriciteit(2, "Rolling Stones", "Angie", 1974, "www.youtube.com/watch?v=RcZn2-bGXqQ"));
		elektriciteits.add(new Elektriciteit(3, "Kraftwerk", "The model", 1978, "www.youtube.com/watch?v=BdZDhpkDziE"));
		elektriciteits.add(new Elektriciteit(4, "Pixies", "Monkey Gone to Heaven", 1989, "www.youtube.com/watch?v=mK3iSglbZUM"));
		elektriciteits.add(new Elektriciteit(5, "St germain", "Rose Rouge", 2000, "https://www.youtube.com/watch?v=yRpKKBmeqV4"));
		elektriciteits.add(new Elektriciteit(6, "Lilly Wood & The Prick", "Prayer In C (Robin Schulz Remix)", 2014,
				"https://www.youtube.com/watch?v=fiore9Z5iUg"));
	}

	public Elektriciteit getTrackById(int id) {
		for (Elektriciteit elektriciteit : elektriciteits) {
			if (elektriciteit.getId() == id) {
				return elektriciteit;
			}
		}
		return null;
	}

	public List<Elektriciteit> getElektriciteits() {
		return elektriciteits;
	}

	public boolean remove(int id) {
		return elektriciteits.remove(findTrack(id));
	}

	public Elektriciteit add(Elektriciteit elektriciteit) {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000);
		elektriciteit.setId(randomInt);
		if (elektriciteits.add(elektriciteit)) {
			elektriciteits.add(elektriciteit);
			return elektriciteit;
		} else {
			return null;
		}
	}

	private Elektriciteit findTrack(int id) {
		for (Elektriciteit elektriciteit : elektriciteits) {
			if (elektriciteit.getId() == id) {
				return elektriciteit;
			}

		}
		return null;
	}

}
