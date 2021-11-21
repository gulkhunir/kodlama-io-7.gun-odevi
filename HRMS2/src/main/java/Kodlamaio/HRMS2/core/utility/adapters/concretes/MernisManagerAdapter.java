package Kodlamaio.HRMS2.core.utility.adapters.concretes;

import java.rmi.RemoteException;

import Kodlamaio.HRMS2.core.utility.adapters.abstracts.MernisServiceAdapter;
import Kodlamaio.HRMS2.entities.concretes.Candidates;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManagerAdapter implements MernisServiceAdapter{

	@Override
	public boolean CheckIfRealPerson(Candidates candidates) {
		System.out.println("Mernis calisti..");
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean returnType=false;
		try {
			returnType =client.TCKimlikNoDogrula(Long.parseLong(candidates.getIdentify_number()), candidates.getFirst_name(), candidates.getLast_name(), candidates.getBirth_of_year());
		}catch(RemoteException e){
			e.printStackTrace();
		}
		
		return returnType;
	}

}
