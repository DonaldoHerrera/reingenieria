package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0784q;
import com.google.android.gms.internal.clearcut.r;

public abstract class r<MessageType extends C0784q<MessageType, BuilderType>, BuilderType extends r<MessageType, BuilderType>> implements Ma {
    public final /* synthetic */ Ma a(La la) {
        if (j().getClass().isInstance(la)) {
            a((MessageType) (C0784q) la);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);
}
