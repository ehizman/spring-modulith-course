package com.ehizman.spring_modulith_course.payment;

import com.ehizman.spring_modulith_course.payment.type.PaymentStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface PaymentRepository extends CrudRepository<PaymentStatus, Long> {
    Optional<Payment> getPaymentByOrderId(String orderId);
}
