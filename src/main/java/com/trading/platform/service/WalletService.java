package com.trading.platform.service;


import java.math.BigDecimal;

import com.trading.platform.exception.WalletException;
import com.trading.platform.model.Order;
import com.trading.platform.model.User;
import com.trading.platform.model.Wallet;

public interface WalletService {


    Wallet getUserWallet(User user) throws WalletException;

    public Wallet addBalanceToWallet(Wallet wallet, Long money) throws WalletException;

    public Wallet findWalletById(Long id) throws WalletException;

    public Wallet walletToWalletTransfer(User sender,Wallet receiverWallet, Long amount) throws WalletException;

    public Wallet payOrderPayment(Order order, User user) throws WalletException;



}
