
public class Game {

	private int _Id;
	private String _gameName;

	public Game(int _Id, String _gameName) {
		super();
		this._Id = _Id;
		this._gameName = _gameName;
	}

	public int get_Id() {
		return _Id;
	}

	public void set_Id(int _Id) {
		this._Id = _Id;
	}

	public String get_gameName() {
		return _gameName;
	}

	public void set_gameName(String _gameName) {
		this._gameName = _gameName;
	}

}
