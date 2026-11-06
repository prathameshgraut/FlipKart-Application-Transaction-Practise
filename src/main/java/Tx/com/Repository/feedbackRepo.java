package Tx.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Tx.com.Entity.Feedback;

@Repository
public interface feedbackRepo extends JpaRepository<Feedback, Short>{

}
