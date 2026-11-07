package Tx.com.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Tx.com.Entity.Payment;

@Repository
public interface paymentRepo extends JpaRepository<Payment, Short>{
	Optional <Payment> findByUserId(short userId);
}


