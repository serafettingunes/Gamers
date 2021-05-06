import java.sql.Date;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		Long tc = Long.valueOf("47080467668");
		boolean kampanya=true;
		
		Gamer gamer1 = new Gamer();
		try {
			SimpleDateFormat dt = new SimpleDateFormat("YYYY.MM.dd");
			SimpleDateFormat year = new SimpleDateFormat("YYYY");
			String date = "1992.11.21";

			java.util.Date d = dt.parse(date);
			int yil = Integer.parseInt(year.format(d));

			gamer1.set_birtday(yil);
			gamer1.set_firstName("þerafettin".toUpperCase());
			gamer1.set_lastName("Güneþ".toUpperCase());
			gamer1.set_natonalityNumber(tc);

			BaseClass baseClass = new GamerManager(new CheckIn());
			baseClass.add(gamer1);

		} catch (Exception e) {
			System.out.println(" hata");
		}

		System.out.println("-------------------------");
		Game game = new Game(1, " eFootball PES 2021 SEASON UPDATE ");
		Game game2 = new Game(2, " EA SPORTS™ FIFA 21 ");
		Game game3 = new Game(3, " Cyberpunk 2077 ");
		Game game4 = new Game(4, " Assassins Creed Valhalla ");

		Game[] gameDizi = { game, game2, game3, game4 };

		GameManager gameManager = new GameManager();
		for (Game games : gameDizi) {
			gameManager.add(games);
		}

		System.out.println("-------------------------");
		SatisManager satisManager = new SatisManager();
		if (new CheckIn().checkIn(gamer1)) {
			if (kampanya) {
				satisManager.kampanyaliSat(gamer1, gameDizi);
				
			}
			else {
				satisManager.sat(gamer1, gameDizi);
			}
			
			
			
		} else {
			System.out.println("Kullanýcý kaydedilmediði için oyun satýn alamaz!!!");
		}

	}

}
