package Tx.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Tx.com.Entity.Payment;

@Repository
public interface paymentRepo extends JpaRepository<Payment, Short>{

}
