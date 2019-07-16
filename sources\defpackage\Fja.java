package defpackage;

import android.net.Uri;
import androidx.browser.customtabs.b;

/* renamed from: Fja reason: default package */
/* compiled from: CustomTabsMetadata.kt */
public final class Fja {
    private final b a;
    private final Uri b;

    public Fja(b bVar, Uri uri) {
        C7471uYa.b(bVar, "customTabsIntent");
        C7471uYa.b(uri, "uri");
        this.a = bVar;
        this.b = uri;
    }

    public final b a() {
        return this.a;
    }

    public final Uri b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Fja) {
                Fja fja = (Fja) obj;
                if (C7471uYa.a((Object) this.a, (Object) fja.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        b bVar = this.a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        Uri uri = this.b;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomTabsMetadata(customTabsIntent=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
