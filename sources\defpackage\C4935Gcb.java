package defpackage;

import java.util.Collection;

/* renamed from: Gcb reason: default package and case insensitive filesystem */
/* compiled from: CallableMemberDescriptor */
public interface C4935Gcb extends C4904Fcb, C5718cdb {

    /* renamed from: Gcb$a */
    /* compiled from: CallableMemberDescriptor */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean a() {
            return this != FAKE_OVERRIDE;
        }
    }

    C4935Gcb a(C5272Rcb rcb, C6314ddb ddb, C5583aeb aeb, a aVar, boolean z);

    void a(Collection<? extends C4935Gcb> collection);

    a g();

    C4935Gcb getOriginal();

    Collection<? extends C4935Gcb> j();
}
