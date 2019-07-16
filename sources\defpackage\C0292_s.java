package defpackage;

import java.io.IOException;

/* renamed from: _s reason: default package and case insensitive filesystem */
public class C0292_s extends IOException {
    private final int a;
    private final String b;
    private final transient C1830wy c;
    private final String d;

    public C0292_s(C0279Xs xs) {
        this(new C0288Zs(xs));
    }

    public final int a() {
        return this.a;
    }

    protected C0292_s(C0288Zs zs) {
        super(zs.e);
        this.a = zs.a;
        this.b = zs.b;
        this.c = zs.c;
        this.d = zs.d;
    }

    public static StringBuilder a(C0279Xs xs) {
        StringBuilder sb = new StringBuilder();
        int d2 = xs.d();
        if (d2 != 0) {
            sb.append(d2);
        }
        String e = xs.e();
        if (e != null) {
            if (d2 != 0) {
                sb.append(' ');
            }
            sb.append(e);
        }
        return sb;
    }
}
