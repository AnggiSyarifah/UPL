package JunitUPL;

public class Backpack extends Tas {
	private static int counter = 0;
	private int jumlahKantong;
	
	public Backpack (String warnaDasar, String bahan, int jumlahKantong) {
		super(warnaDasar, bahan);
		this.jumlahKantong = jumlahKantong;
		Backpack.counter++;
	}
	
	public static int getCounterBackpack() {
		return Backpack.counter;
	}
	
	public void setJumlahKantong (int jumlahKantong) {
		this.jumlahKantong = jumlahKantong;
	}
	
	public int getJumlahKantong() {
		return jumlahKantong;
	}
	
	public double hitungDiskon() {
		// asumsi NIM 12345678901234
		// A = 78, B = 34
		return (50/this.jumlahKantong)+(78/34);
	}
}
