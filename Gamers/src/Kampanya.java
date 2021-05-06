
public class Kampanya {
	private String kampanyaAdi;
	private int indirimOrani;

	

	public Kampanya(String kampanyaAdi, int indirimOrani) {
		super();
		this.kampanyaAdi = kampanyaAdi;
		this.indirimOrani = indirimOrani;
	}

	public int getIndirimOrani() {
		return indirimOrani;
	}

	public void setIndirimOrani(int indirimOrani) {
		this.indirimOrani = indirimOrani;
	}

	public String getKampanyaAdi() {
		return kampanyaAdi;
	}

	public void setKampanyaAdi(String kampanyaAdi) {
		this.kampanyaAdi = kampanyaAdi;
	}
}
