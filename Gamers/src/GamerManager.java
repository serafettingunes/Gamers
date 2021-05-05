
public class GamerManager extends BaseClass {

	private MernisCheckInterface _checkInterface;

	public GamerManager(MernisCheckInterface checkInterface) {

		this._checkInterface = checkInterface;
	}

	private CheckIn _checkIn;

	public GamerManager(CheckIn checkIn) {

		this._checkIn = checkIn;
	}

	public GamerManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Gamer gamer) {
		try {
			if (_checkIn.checkIn(gamer)) {
				System.out.println(gamer.get_firstName() +" "+ gamer.get_lastName() + " kullanýcýsý baþarýyla kaydedildi...");
						
			}
			else {
				System.out.println("Kullanýcý kaydedilmedi...");
			}
		} catch (Exception e) {
			System.out.println("hata");
		}

	}

}
