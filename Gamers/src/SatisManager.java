
public class SatisManager implements SatisInterface {

	@Override
	public void sat(Gamer gamer, Game[] game) {
		
		for (Game games : game) {
			System.out.println(gamer.get_firstName()+ " "+ gamer.get_lastName()+  games.get_gameName()+"Oyununu satýn aldý...");
		}
		
		
	}

	@Override
	public void kampanyaliSat(Gamer gamer, Game[] game) {
		for (Game games : game) {
			System.out.println(gamer.get_firstName()+ " "+gamer.get_lastName()+" "+games.get_gameName()+" oyununu indirimli aldý...");
		}
		
	}

	

	

}
