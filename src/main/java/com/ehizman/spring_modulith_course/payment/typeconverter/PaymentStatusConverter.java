package com.ehizman.spring_modulith_course.payment.typeconverter;

import com.ehizman.spring_modulith_course.payment.type.PaymentStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;


@Converter(autoApply = true)
public class PaymentStatusConverter implements AttributeConverter<PaymentStatus, String> {
    @Override
    public String convertToDatabaseColumn(PaymentStatus status) {
        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }
        return status.getCode();
    }

    @Override
    public PaymentStatus convertToEntityAttribute(String s) {
       if (s == null) {
           throw new IllegalArgumentException("Status code cannot be null");
       }
       return PaymentStatus.fromCode(s).orElseThrow(() -> new IllegalArgumentException("No status found"));
    }
}
