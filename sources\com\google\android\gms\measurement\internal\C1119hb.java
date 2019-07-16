package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.hb reason: case insensitive filesystem */
final class C1119hb implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ Object d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ C1124ib f;

    C1119hb(C1124ib ibVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f = ibVar;
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public final void run() {
        C1168rb g = this.f.a.g();
        if (g.n()) {
            if (this.f.c == 0) {
                if (this.f.f().o()) {
                    C1124ib ibVar = this.f;
                    ibVar.a();
                    ibVar.c = 'C';
                } else {
                    C1124ib ibVar2 = this.f;
                    ibVar2.a();
                    ibVar2.c = 'c';
                }
            }
            if (this.f.d < 0) {
                C1124ib ibVar3 = this.f;
                ibVar3.d = ibVar3.f().m();
            }
            char charAt = "01VDIWEA?".charAt(this.a);
            char a2 = this.f.c;
            long b2 = this.f.d;
            String a3 = C1124ib.a(true, this.b, this.c, this.d, this.e);
            StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(a2);
            sb.append(b2);
            sb.append(":");
            sb.append(a3);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.b.substring(0, 1024);
            }
            g.e.a(sb2, 1);
            return;
        }
        this.f.a(6, "Persisted config not initialized. Not logging error/warn");
    }
}
