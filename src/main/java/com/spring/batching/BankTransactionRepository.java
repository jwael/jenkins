package com.spring.batching;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankTransactionRepository extends JpaRepository <BankTransaction ,Long> {
}
