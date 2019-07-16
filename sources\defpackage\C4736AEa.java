package defpackage;

import java.util.List;

/* renamed from: AEa reason: default package and case insensitive filesystem */
/* compiled from: CollectionRendererState.kt */
public final class C4736AEa<ItemT, ErrorType> {
    private final C6900mEa<ErrorType> a;
    private final List<ItemT> b;

    public C4736AEa(C6900mEa<ErrorType> mea, List<? extends ItemT> list) {
        C7471uYa.b(mea, "collectionLoadingState");
        C7471uYa.b(list, "items");
        this.a = mea;
        this.b = list;
    }

    public final C6900mEa<ErrorType> a() {
        return this.a;
    }

    public final List<ItemT> b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4736AEa) {
                C4736AEa aEa = (C4736AEa) obj;
                if (C7471uYa.a((Object) this.a, (Object) aEa.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C6900mEa<ErrorType> mea = this.a;
        int i = 0;
        int hashCode = (mea != null ? mea.hashCode() : 0) * 31;
        List<ItemT> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollectionRendererState(collectionLoadingState=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
