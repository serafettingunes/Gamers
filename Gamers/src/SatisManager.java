
public class SatisManager implements SatisInterface {

	@Override
	public void sat(Gamer gamer, Game[] game) {
		
		for (Game games : game) {
			System.out.println(gamer.get_firstName()+ " "+ gamer.get_lastName()+  games.get_gameName()+" "+games.getFiyat()+"TL Oyununu sat�n ald�...");
		}
		
		
	}

	
	@Override
	public void kampanyaliSat(Gamer gamer, Game[] game ,Kampanya kampanya) {
		for (Game games : game) {
			System.out.println(gamer.get_firstName()+ " "+gamer.get_lastName()+" "+games.get_gameName()+" " +(games.getFiyat()*kampanya.getIndirimOrani()/100)+"TL  Oyununu sat�n ald�...");
		}
		
	}

	

	

}
