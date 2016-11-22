package tpe.testate.fixkomma;

public class Festkommazahl {
	long vor, nach;
	Festkommazahl(long vor, long nach) {
		this.vor=Math.abs(vor);
		while  (nach >= 100){
			nach = nach/10;
		}
		this.nach=Math.abs(nach * 100);
	}

	public Festkommazahl addiere(Festkommazahl z2) {
		return new Festkommazahl(z2.vor + vor + Math.round((z2.nach + nach)/10000), (z2.nach + nach)/100%100);
	}

	public Festkommazahl subtrahiere(Festkommazahl z2) {
		return new Festkommazahl(z2.vor - vor - Math.round((z2.nach - nach)/10000), (z2.nach - nach)/100%100);
	}

	public long getZahl(){
		long zahl = (vor * 10000 + nach * 100)/100;
		System.out.println(zahl);
		return zahl;
	}

	public long getVorkommaStellen(){
		return vor;
	}

	public long getNachkommaStellen(){
		return nach /100;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (nach ^ (nach >>> 32));
		result = prime * result + (int) (vor ^ (vor >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Festkommazahl other = (Festkommazahl) obj;
		if (nach != other.nach)
			return false;
		if (vor != other.vor)
			return false;
		return true;
	}

	@Override
	public String toString() {
		long temp = nach/100;
		Math.round(temp);
		String ausg;
		if(temp < 10){
			ausg = vor + ",0" + temp;

		} else {
			ausg = vor + "," + temp;

		}
		return ausg;
	}




}
