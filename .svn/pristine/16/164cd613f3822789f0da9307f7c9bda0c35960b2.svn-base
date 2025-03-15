package com.trading.platform.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.trading.platform.model.Coin;

public interface CoinRepository extends JpaRepository<Coin,String> {
	
	@Query("SELECT c FROM Coin c ORDER BY c.currentPrice DESC")
	List<Coin> findTop50ByCurrency(PageRequest page);
}
