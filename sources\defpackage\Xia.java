package defpackage;

import com.soundcloud.android.deeplinks.b;

/* renamed from: Xia reason: default package */
/* compiled from: AutoValue_NavigationTarget_ChartsMetaData */
final class Xia extends b {
    private final C4928GKa<C2132KP> a;
    private final C4928GKa<b> b;

    /* access modifiers changed from: 0000 */
    public C4928GKa<C2132KP> a() {
        return this.a;
    }

    public C4928GKa<b> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.a.equals(bVar.a()) || !this.b.equals(bVar.b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChartsMetaData{category=");
        sb.append(this.a);
        sb.append(", chartDetails=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
