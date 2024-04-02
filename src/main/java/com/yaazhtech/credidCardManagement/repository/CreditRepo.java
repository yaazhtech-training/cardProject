package com.yaazhtech.credidCardManagement.repository;

import com.yaazhtech.credidCardManagement.data.CreditData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepo extends JpaRepository<CreditData, Long> {
}
