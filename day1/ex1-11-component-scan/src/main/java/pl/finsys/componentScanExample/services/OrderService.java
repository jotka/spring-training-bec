package pl.finsys.componentScanExample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.finsys.componentScanExample.dao.OrderDAO;

@Service
public class OrderService {

    @Autowired
    OrderDAO orderDAO;

	@Override
	public String toString() {
		return "OrderService [orderDAO = " + orderDAO + " ]";
	}

    public OrderDAO getOrderDAO() {
        return orderDAO;
    }
}
