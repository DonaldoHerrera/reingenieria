package com.soundcloud.android.payments;

/* compiled from: ConnectionStatus */
public enum C {
    DISCONNECTED,
    UNSUPPORTED,
    READY;

    public boolean a() {
        return this == READY;
    }

    public boolean b() {
        return this == UNSUPPORTED;
    }
}
