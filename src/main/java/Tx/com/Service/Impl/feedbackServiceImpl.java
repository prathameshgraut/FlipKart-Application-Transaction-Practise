package Tx.com.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import Tx.com.Entity.Feedback;
import Tx.com.Repository.feedbackRepo;
import Tx.com.Service.feedbackService;
//import jakarta.transaction.Transactional;
//import jakarta.transaction.Transactional.TxType;

@Service
public class feedbackServiceImpl implements feedbackService{

	@Autowired
	feedbackRepo feedbackRepo;
	
	@Override
//	@Transactional(value = TxType.REQUIRES_NEW)
	
	@Transactional(isolation = Isolation.READ_COMMITTED)
	public void feedback(Feedback feedback) {
		try {
			feedbackRepo.save(feedback);
		} catch (Exception e) {
		}
		
	}

}
