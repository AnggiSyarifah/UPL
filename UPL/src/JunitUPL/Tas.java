package JunitUPL;

public class Tas {
	private static int counter = 0;
	protected String warnaDasar;
	protected String bahan;
	
	public Tas (String warnaDasar, String bahan) {
		this.warnaDasar = warnaDasar;
		this.bahan = bahan;
		Tas.counter++;
	}
	
	public static int getCounterTas() {
		return Tas.counter;
	}
	
	public void setWarnaDasar(String warnaDasar) {
		this.warnaDasar = warnaDasar;
	}
	
	public String getwarnaDasar() {
		return warnaDasar;
	}
	
	public void setBahan(String bahan) {
		this.bahan = bahan;
	}
	
	public String getBahan() {
		return bahan;
	}
	public double hitungDiskon() {
		return 0;
	}
	
	public double hitungHargaJual() {
		return 500-this.hitungDiskon();
	}
}	
