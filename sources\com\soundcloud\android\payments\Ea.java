package com.soundcloud.android.payments;

/* compiled from: PurchaseStatus */
enum Ea {
    PENDING,
    SUCCESS,
    UPDATE_FAIL,
    VERIFY_FAIL,
    VERIFY_TIMEOUT,
    NONE;

    public boolean a() {
        return this == PENDING;
    }
}
