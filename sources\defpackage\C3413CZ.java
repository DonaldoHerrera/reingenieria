package defpackage;

import com.soundcloud.android.foundation.events.J;
import java.util.List;

/* renamed from: CZ reason: default package and case insensitive filesystem */
/* compiled from: AdErrorTrackingEvent.kt */
public final class C3413CZ extends J {
    private final List<String> a;

    public C3413CZ(List<String> list) {
        C7471uYa.b(list, "errorTrackers");
        this.a = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C3413CZ) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3413CZ) {
            }
            return false;
        }
        return true;
    }

    public long g() {
        return J.c();
    }

    public int hashCode() {
        List<String> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final List<String> i() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdErrorTrackingEvent(errorTrackers=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
