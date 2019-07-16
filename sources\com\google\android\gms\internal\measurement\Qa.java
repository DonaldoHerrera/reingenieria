package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Oa;
import com.google.android.gms.internal.measurement.Qa;

public abstract class Qa<MessageType extends Oa<MessageType, BuilderType>, BuilderType extends Qa<MessageType, BuilderType>> implements C1020pc {
    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    public abstract BuilderType a(byte[] bArr, int i, int i2, C1042tb tbVar) throws Rb;

    public final BuilderType a(byte[] bArr, C1042tb tbVar) throws Rb {
        a(bArr, 0, bArr.length, tbVar);
        return this;
    }

    public final /* synthetic */ C1020pc a(C1026qc qcVar) {
        if (a().getClass().isInstance(qcVar)) {
            a((MessageType) (Oa) qcVar);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
