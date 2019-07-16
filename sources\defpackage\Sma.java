package defpackage;

import android.graphics.Bitmap;

/* renamed from: Sma reason: default package */
/* compiled from: MetadataOperations.kt */
final class Sma {
    private final Rma a;
    private final C4928GKa<Bitmap> b;

    public Sma(Rma rma, C4928GKa<Bitmap> gKa) {
        C7471uYa.b(rma, "trackItem");
        C7471uYa.b(gKa, "bitmap");
        this.a = rma;
        this.b = gKa;
    }

    public final C4928GKa<Bitmap> a() {
        return this.b;
    }

    public final Rma b() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Sma) {
                Sma sma = (Sma) obj;
                if (C7471uYa.a((Object) this.a, (Object) sma.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Rma rma = this.a;
        int i = 0;
        int hashCode = (rma != null ? rma.hashCode() : 0) * 31;
        C4928GKa<Bitmap> gKa = this.b;
        if (gKa != null) {
            i = gKa.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackAndBitmap(trackItem=");
        sb.append(this.a);
        sb.append(", bitmap=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
