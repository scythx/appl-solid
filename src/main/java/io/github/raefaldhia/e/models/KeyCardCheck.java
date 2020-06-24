package io.github.raefaldhia.e.models;

import io.github.raefaldhia.e.interfaces.IRequestKeyCard;

public class KeyCardCheck extends SecurityCheck {
    private final IRequestKeyCard
    requestKeyCard;

    public KeyCardCheck(final IRequestKeyCard securityUI) {
        this.requestKeyCard = securityUI;
    }

    private Boolean isValid(final String code) {
        return true;
    }

    @Override
    public Boolean validateUser() {
        return this.isValid(this.requestKeyCard.requestKeyCard());
    }    
}