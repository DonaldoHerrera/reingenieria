package defpackage;

import java.util.Iterator;

/* renamed from: fjb reason: default package and case insensitive filesystem */
/* compiled from: typeEnhancement.kt */
final class C6456fjb implements C6723jeb {
    private final C7349snb a;

    public C6456fjb(C7349snb snb) {
        C7471uYa.b(snb, "fqNameToMatch");
        this.a = snb;
    }

    public boolean b(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return b.b(this, snb);
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<C6315deb> iterator() {
        return C6918mWa.a().iterator();
    }

    public C6388ejb a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        if (C7471uYa.a((Object) snb, (Object) this.a)) {
            return C6388ejb.a;
        }
        return null;
    }
}
