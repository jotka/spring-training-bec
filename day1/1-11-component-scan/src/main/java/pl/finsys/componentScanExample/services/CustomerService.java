package pl.finsys.componentScanExample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.finsys.componentScanExample.dao.CustomerDAO;

@Service
public class CustomerService {

    @Autowired
    CustomerDAO customerDAO;

	@Override
	public String toString() {
		return "CustomerService [customerDAO = " + customerDAO + " ]";
	}
		
}
