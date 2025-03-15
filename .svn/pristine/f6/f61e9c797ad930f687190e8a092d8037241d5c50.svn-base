package com.trading.platform.service;

import java.util.List;

import com.trading.platform.domain.WalletTransactionType;
import com.trading.platform.model.Wallet;
import com.trading.platform.model.WalletTransaction;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
