package com.trading.platform.service;

import com.trading.platform.model.PaymentDetails;
import com.trading.platform.model.User;

import jakarta.persistence.OneToOne;

public interface PaymentDetailsService {
    public PaymentDetails addPaymentDetails( String accountNumber,
                                             String accountHolderName,
                                             String ifsc,
                                             String bankName,
                                             User user
    );

    public PaymentDetails getUsersPaymentDetails(User user);


}
