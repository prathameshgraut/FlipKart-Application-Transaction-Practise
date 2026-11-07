package Tx.com.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Tx.com.Entity.Product;

@Repository
public interface productRepo extends JpaRepository<Product, Short>{
	Optional<Product> findByUserId(short userId);
}
