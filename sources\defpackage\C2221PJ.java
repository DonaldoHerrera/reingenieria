package defpackage;

import java.util.UUID;

/* renamed from: PJ reason: default package and case insensitive filesystem */
/* compiled from: VideoAdsRequestData.kt */
public final class C2221PJ {
    private final String a;
    private final C6971nHa b;
    private final C6903mHa c;
    private final C6902mGa d;

    public C2221PJ() {
        this(null, null, null, 7, null);
    }

    public C2221PJ(C6971nHa nha, C6903mHa mha, C6902mGa mga) {
        C7471uYa.b(nha, "deviceType");
        C7471uYa.b(mha, "deviceOrientation");
        C7471uYa.b(mga, "connectionType");
        this.b = nha;
        this.c = mha;
        this.d = mga;
        String uuid = UUID.randomUUID().toString();
        C7471uYa.a((Object) uuid, "UUID.randomUUID().toString()");
        this.a = uuid;
    }

    public final C6902mGa a() {
        return this.d;
    }

    public final C6903mHa b() {
        return this.c;
    }

    public final C6971nHa c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2221PJ) {
                C2221PJ pj = (C2221PJ) obj;
                if (C7471uYa.a((Object) this.b, (Object) pj.b)) {
                    if (C7471uYa.a((Object) this.c, (Object) pj.c)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C6971nHa nha = this.b;
        int i = 0;
        int hashCode = (nha != null ? nha.hashCode() : 0) * 31;
        C6903mHa mha = this.c;
        int hashCode2 = (hashCode + (mha != null ? mha.hashCode() : 0)) * 31;
        C6902mGa mga = this.d;
        if (mga != null) {
            i = mga.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoAdsRequestData(deviceType=");
        sb.append(this.b);
        sb.append(", deviceOrientation=");
        sb.append(this.c);
        sb.append(", connectionType=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C2221PJ(C6971nHa nha, C6903mHa mha, C6902mGa mga, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            nha = C6971nHa.UNKNOWN;
        }
        if ((i & 2) != 0) {
            mha = C6903mHa.UNKNOWN;
        }
        if ((i & 4) != 0) {
            mga = C6902mGa.UNKNOWN;
        }
        this(nha, mha, mga);
    }
}
