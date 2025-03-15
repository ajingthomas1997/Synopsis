package com.trading.platform.service;

import lombok.With;

import java.util.List;

import com.trading.platform.model.User;
import com.trading.platform.model.Withdrawal;

public interface WithdrawalService {

    Withdrawal requestWithdrawal(Long amount,User user);
    Withdrawal procedWithdrawal(Long withdrawalId,boolean accept) throws Exception;
    List<Withdrawal> getUsersWithdrawalHistory(User user);
    List<Withdrawal> getAllWithdrawalRequest();
}
