import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CheckIn implements MernisCheckInterface {

	@Override
	public boolean checkIn(Gamer gamer) {

		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		try {
			return proxy.TCKimlikNoDogrula(gamer.get_natonalityNumber(), gamer.get_firstName(), gamer.get_lastName(),
					gamer.get_birtday());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			return false;
		}

	}

}
