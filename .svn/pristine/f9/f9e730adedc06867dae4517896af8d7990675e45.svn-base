package com.trading.platform.service;

import com.trading.platform.model.Coin;
import com.trading.platform.model.User;
import com.trading.platform.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
