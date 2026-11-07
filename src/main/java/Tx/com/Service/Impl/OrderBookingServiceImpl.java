package Tx.com.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Tx.com.DTO.bookingDTO;
import Tx.com.Entity.Feedback;
import Tx.com.Entity.Payment;
import Tx.com.Entity.Product;
import Tx.com.Entity.User;
import Tx.com.Repository.paymentRepo;
import Tx.com.Repository.productRepo;
import Tx.com.Repository.userRepo;
import Tx.com.Service.OrderBookingService;
import Tx.com.Service.feedbackService;
import jakarta.transaction.Transactional;

@Service
public class OrderBookingServiceImpl implements OrderBookingService{

	@Autowired
	userRepo userRepo;
	
	@Autowired
	paymentRepo paymentRepo;
	
	@Autowired
	productRepo productRepo;
	
	@Autowired
	feedbackService feedbackService;
	
	@Override
	@Transactional
	public String bookingProduct(bookingDTO bookingDTO) {
		User user = createUser(bookingDTO);
		userRepo.save(user);
		
		Product product = createProduct(bookingDTO);
		productRepo.save(product);
		
		Payment payment = createPayment(bookingDTO, user, product);
		paymentRepo.save(payment);
		
		Feedback feedback= createFeedback(bookingDTO, user);
		feedbackService.feedback(feedback);
		
		return "Product Booking Successfully.......";
	}

	private Feedback createFeedback(bookingDTO bookingDTO, User user) {
		Feedback feedback = new Feedback();
		feedback.setFeedback(bookingDTO.getFeedback());
		feedback.setRating(bookingDTO.getRating());
		feedback.setUserId(user.getId());
		return feedback;
	}

	private Payment createPayment(bookingDTO bookingDTO, User user, Product product) {
		Payment payment = new Payment();
		payment.setAmount(bookingDTO.getPaymentAmount());
		payment.setOrderDate(payment.getOrderDate());
		payment.setOrderTime(payment.getOrderTime());
		payment.setUserId(user.getId());
		payment.setPaymentId(payment.getPaymentId());
//		payment.setUser(user);
//		payment.setProduct(product);
		return payment;
	}

	private Product createProduct(bookingDTO bookingDTO) {
		Product product = new Product();
		product.setProductName(bookingDTO.getProductName());
		product.setPrice(bookingDTO.getProductPrice());
		product.setQuantity(bookingDTO.getProductQuantity());
		return product;
	}

	private User createUser(bookingDTO bookingDTO) {
		User user = new User();
		user.setName(bookingDTO.getUserName());
		user.setEmail(bookingDTO.getUserEmail());
		user.setAddrress(bookingDTO.getUserAddrress());
		user.setAge(bookingDTO.getUserAge());
		user.setGender(bookingDTO.getUserGender());
		user.setMobNo(bookingDTO.getUserMobNo());
		return user;
	}

}
