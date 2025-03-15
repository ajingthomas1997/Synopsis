package com.trading.platform.service;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.trading.platform.domain.PaymentMethod;
import com.trading.platform.model.PaymentOrder;
import com.trading.platform.model.User;
import com.trading.platform.response.PaymentResponse;

public interface PaymentService {

    PaymentOrder createOrder(User user, Long amount, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    Boolean ProccedPaymentOrder (PaymentOrder paymentOrder,
                                 String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLink(User user,
                                              Long Amount,
                                              Long orderId) throws RazorpayException;

    PaymentResponse createStripePaymentLink(User user, Long Amount,
                                            Long orderId) throws StripeException;
}
