package defpackage;

import android.net.Uri;

/* renamed from: bja reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_ResolveResult */
final class C3956bja extends Dja {
    private final boolean a;
    private final C4928GKa<C3508cda> b;
    private final C4928GKa<Uri> c;
    private final C4928GKa<Exception> d;

    C3956bja(boolean z, C4928GKa<C3508cda> gKa, C4928GKa<Uri> gKa2, C4928GKa<Exception> gKa3) {
        this.a = z;
        if (gKa != null) {
            this.b = gKa;
            if (gKa2 != null) {
                this.c = gKa2;
                if (gKa3 != null) {
                    this.d = gKa3;
                    return;
                }
                throw new NullPointerException("Null exception");
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null urn");
    }

    public C4928GKa<Exception> a() {
        return this.d;
    }

    public boolean b() {
        return this.a;
    }

    public C4928GKa<Uri> c() {
        return this.c;
    }

    public C4928GKa<C3508cda> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Dja)) {
            return false;
        }
        Dja dja = (Dja) obj;
        if (this.a != dja.b() || !this.b.equals(dja.d()) || !this.c.equals(dja.c()) || !this.d.equals(dja.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResolveResult{success=");
        sb.append(this.a);
        sb.append(", urn=");
        sb.append(this.b);
        sb.append(", uri=");
        sb.append(this.c);
        sb.append(", exception=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
