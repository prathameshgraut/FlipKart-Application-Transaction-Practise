package Tx.com.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Tx.com.DTO.bookingDTO;
import Tx.com.Repository.paymentRepo;
import Tx.com.Repository.productRepo;
import Tx.com.Repository.userRepo;
import Tx.com.Service.OrderBookingService;

@Service
public class OrderBookingServiceImpl implements OrderBookingService{

	@Autowired
	userRepo userRepo;
	
	@Autowired
	paymentRepo paymentRepo;
	
	@Autowired
	productRepo productRepo;
	
	@Override
	public void bookingProduct(bookingDTO bookingDTO) {
		// TODO Auto-generated method stub
		
	}

}
