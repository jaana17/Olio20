
public class Auto {
	String v�ri;
	int nopeus;
	int tankinTilavuus;
	public String toString() {
		return "Auto [v�ri=" + v�ri + ", nopeus=" + nopeus + ", tankinTilavuus=" + tankinTilavuus + "]";
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto Ferrari = new Auto();
		Auto Mazda = new Auto();
		Auto Volvo = new Auto();
		Ferrari.v�ri = "Punainen";
		Ferrari.nopeus = 140;
		Ferrari.tankinTilavuus = 100;
		Mazda.v�ri = "Sininen";
		Mazda.nopeus = 80;
		Mazda.tankinTilavuus = 60;
		Volvo.v�ri = "musta";
		Volvo.nopeus = 120;
		Volvo.tankinTilavuus = 80;
		System.out.println(Ferrari.v�ri);
		System.out.println(Ferrari.nopeus);
		System.out.println(Ferrari.tankinTilavuus);
		System.out.println(Mazda.v�ri);
		System.out.println(Mazda.nopeus);
		System.out.println(Mazda.tankinTilavuus);
		System.out.println(Volvo.v�ri);
		System.out.println(Volvo.nopeus);
		System.out.println(Volvo.tankinTilavuus);
		System.out.println(Ferrari);
	}

			}


