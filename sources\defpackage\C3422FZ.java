package defpackage;

import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.events.I;

/* renamed from: FZ reason: default package and case insensitive filesystem */
/* compiled from: AdOverlayEvent */
public class C3422FZ {
    private static final C3422FZ a = new C3422FZ(1, C3508cda.a, null, null);
    private final int b;
    private final C3508cda c;
    private final ca d;
    private final I e;

    public C3422FZ(int i, C3508cda cda, ca caVar, I i2) {
        this.b = i;
        this.c = cda;
        this.d = caVar;
        this.e = i2;
    }

    public static C3422FZ a(C3508cda cda, ca caVar, I i) {
        return new C3422FZ(0, cda, caVar, i);
    }

    public static C3422FZ e() {
        return a;
    }

    public C3508cda b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public I d() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdOverlayEvent: ");
        sb.append(this.b);
        return sb.toString();
    }

    public ca a() {
        return this.d;
    }
}
