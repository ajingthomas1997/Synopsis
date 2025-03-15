package com.trading.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.platform.model.Watchlist;

public interface WatchlistRepository extends JpaRepository<Watchlist,Long> {

    Watchlist findByUserId(Long userId);

}
