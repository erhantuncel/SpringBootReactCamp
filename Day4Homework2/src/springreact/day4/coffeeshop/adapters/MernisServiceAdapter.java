package springreact.day4.coffeeshop.adapters;

import java.rmi.RemoteException;

import springreact.day4.coffeeshop.abstracts.CustomerCheckService;
import springreact.day4.coffeeshop.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName(), 
					customer.getLastName(),
					customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (RemoteException e) {
			System.out.println("RemoteException");
		}
		
		return result;
	}

}
