package Tx.com.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Tx.com.DTO.bookingDTO;
import Tx.com.Service.OrderBookingService;

@RestController
@RequestMapping("/flipkart")
public class BookingController {

	@Autowired
	OrderBookingService OrBookingService;
	
	@PostMapping("/booking")
	public ResponseEntity<String> bookingProduct(@RequestBody bookingDTO bookingDTO){
		return new ResponseEntity<String>(OrBookingService.bookingProduct(bookingDTO),HttpStatus.CREATED);
	}
}
