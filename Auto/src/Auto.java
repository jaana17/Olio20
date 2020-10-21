
public class Auto {
	String väri;
	int nopeus;
	int tankinTilavuus;
	public String toString() {
		return "Auto [väri=" + väri + ", nopeus=" + nopeus + ", tankinTilavuus=" + tankinTilavuus + "]";
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto Ferrari = new Auto();
		Auto Mazda = new Auto();
		Auto Volvo = new Auto();
		Ferrari.väri = "Punainen";
		Ferrari.nopeus = 140;
		Ferrari.tankinTilavuus = 100;
		Mazda.väri = "Sininen";
		Mazda.nopeus = 80;
		Mazda.tankinTilavuus = 60;
		Volvo.väri = "musta";
		Volvo.nopeus = 120;
		Volvo.tankinTilavuus = 80;
		System.out.println(Ferrari.väri);
		System.out.println(Ferrari.nopeus);
		System.out.println(Ferrari.tankinTilavuus);
		System.out.println(Mazda.väri);
		System.out.println(Mazda.nopeus);
		System.out.println(Mazda.tankinTilavuus);
		System.out.println(Volvo.väri);
		System.out.println(Volvo.nopeus);
		System.out.println(Volvo.tankinTilavuus);
		System.out.println(Ferrari);
	}

			}


