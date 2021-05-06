
public  class GameManager extends BaseClass2 {

	@Override
	public   void add(Game game) {
		System.out.println(game.get_gameName()+" "+game.getFiyat()+"TL Eklendi...");
	}
	
	@Override
	public void update(Game game) {
		System.out.println(game.get_gameName()+" Güncellendi...");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.get_gameName()+" Silindi...");
		
	}

}
