package Tx.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Tx.com.Entity.User;

@Repository
public interface userRepo extends JpaRepository<User, Short> {

}
