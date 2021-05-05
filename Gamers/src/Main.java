import java.sql.Date;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		Long tc = Long.valueOf("40040040040");
		try {
			SimpleDateFormat dt = new SimpleDateFormat("YYYY.MM.dd");
			SimpleDateFormat year = new SimpleDateFormat("YYYY");
			String date = "1992.11.21";

			java.util.Date d = dt.parse(date);
			int yil = Integer.parseInt(year.format(d));
			Gamer gamer1 = new Gamer();
			gamer1.set_birtday(yil);
			gamer1.set_firstName("Þerafettin".toUpperCase());
			gamer1.set_lastName("Güneþ".toUpperCase());
			gamer1.set_natonalityNumber(tc);

			BaseClass baseClass = new GamerManager(new CheckIn());
			baseClass.add(gamer1);
			

		} catch (Exception e) {
			System.out.println(" hata");
		}
			
		
	}

}
