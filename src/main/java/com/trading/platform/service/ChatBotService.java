package com.trading.platform.service;

import com.trading.platform.model.CoinDTO;
import com.trading.platform.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
