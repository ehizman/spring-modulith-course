package com.ehizman.spring_modulith_course.payment.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@Getter
@AllArgsConstructor
public enum PaymentStatus {
    INCOMPLETE("I"), COMPLETED("C"), FAILED("F");

    private final String code;

    public static Optional<Object> fromCode(String s) {
        for (PaymentStatus status : values()) {
            if (status.code.equals(s)) {
                return Optional.of(status);
            }
        }
        return Optional.empty();
    }
}
