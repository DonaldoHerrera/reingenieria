package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.Ja;
import com.google.android.gms.internal.firebase-perf.La;

public abstract class La<MessageType extends Ja<MessageType, BuilderType>, BuilderType extends La<MessageType, BuilderType>> implements C0826cc {
    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    public final /* synthetic */ C0826cc a(C0835ec ecVar) {
        if (e().getClass().isInstance(ecVar)) {
            a((MessageType) (Ja) ecVar);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
