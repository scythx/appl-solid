package io.github.raefaldhia.d.models;

import io.github.raefaldhia.d.interfaces.IRechargeable;

public class RechargeStation {
    public void Recharge(final IRechargeable rechargeable) {
        rechargeable.recharge();
    }
}