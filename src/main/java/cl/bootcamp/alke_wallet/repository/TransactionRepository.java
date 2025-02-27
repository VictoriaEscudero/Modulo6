package cl.bootcamp.alke_wallet.repository;

import cl.bootcamp.alke_wallet.model.Transaction;
import cl.bootcamp.alke_wallet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUser(User user);
}
