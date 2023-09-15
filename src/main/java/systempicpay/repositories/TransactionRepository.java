package systempicpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import systempicpay.domain.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
