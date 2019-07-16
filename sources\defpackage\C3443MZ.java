package defpackage;

import com.soundcloud.android.foundation.events.I;
import java.util.UUID;

/* renamed from: MZ reason: default package and case insensitive filesystem */
/* compiled from: AdSessionEventArgs */
public abstract class C3443MZ {
    public static C3443MZ a(I i, Long l, Long l2, String str, String str2) {
        C3461SZ sz = new C3461SZ(i, l.longValue(), l2.longValue(), str, str2, UUID.randomUUID().toString());
        return sz;
    }

    public abstract long a();

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract I e();

    public abstract String f();
}
