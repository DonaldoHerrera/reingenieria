package defpackage;

import defpackage.C0252Rv;
import defpackage.C0256Sv;

/* renamed from: Rv reason: default package and case insensitive filesystem */
public abstract class C0252Rv<MessageType extends C0256Sv<MessageType, BuilderType>, BuilderType extends C0252Rv<MessageType, BuilderType>> implements C1373hx {
    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    public final /* synthetic */ C1373hx a(C1403ix ixVar) {
        if (a().getClass().isInstance(ixVar)) {
            a((MessageType) (C0256Sv) ixVar);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
