package nl.hu.iac.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Prijs {
	private int datum;
	private String company;
	private double prijs;

	public Prijs(){super();}

	public Prijs(int datum, String company, double prijs) {
		this.datum = datum;
		this.company = company;
		this.prijs = prijs;
	}

	public int getDatum() {
		return datum;
	}

	public void setDatum(int datum) {
		this.datum = datum;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Prijs prijs1 = (Prijs) o;

		if (getDatum() != prijs1.getDatum()) return false;
		if (Double.compare(prijs1.getPrijs(), getPrijs()) != 0) return false;
		return getCompany().equals(prijs1.getCompany());
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = getDatum();
		result = 31 * result + getCompany().hashCode();
		temp = Double.doubleToLongBits(getPrijs());
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "Prijs{" +
				"datum=" + datum +
				", company='" + company + '\'' +
				", prijs=" + prijs +
				'}';
	}
}
