package io.github.raefaldhia.e.models;

import io.github.raefaldhia.e.interfaces.IRequestPinCode;

public class PinCodeCheck extends SecurityCheck {
    private final IRequestPinCode
    requestPinCode;

    public PinCodeCheck(final IRequestPinCode requestPinCode) {
        this.requestPinCode = requestPinCode;
    }

    private Boolean isValid(final Integer pin) {
        return true;
    }

    @Override
    public Boolean validateUser() {
        return this.isValid(this.requestPinCode.requestPinCode());
    }
}