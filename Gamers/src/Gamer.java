import java.sql.Date;
import java.util.*;

public class Gamer  {

	private long _natonalityNumber;
	private String _firstName;
	private String _lastName;
	private int _birtday;

	public long get_natonalityNumber() {
		return _natonalityNumber;
	}

	public void set_natonalityNumber(long natonalityNumber) {
		this._natonalityNumber = natonalityNumber;
	}

	public String get_firstName() {
		return _firstName;
	}

	public void set_firstName(String firstName) {
		this._firstName = firstName;
	}

	public String get_lastName() {
		return _lastName;
	}

	public void set_lastName(String lastName) {
		this._lastName = lastName;
	}

	public int get_birtday() {
		return _birtday;
	}

	public void set_birtday(int birtday) {
		this._birtday = birtday;
	}

	
}
