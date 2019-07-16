package defpackage;

import android.content.Context;

/* renamed from: nh reason: default package and case insensitive filesystem */
/* compiled from: FirebaseAnalyticsApiAdapter */
class C1542nh {
    private final Context a;
    private final C1604ph b;
    private C1511mh c;

    public C1542nh(Context context) {
        this(context, new C1604ph());
    }

    public C1511mh a() {
        if (this.c == null) {
            this.c = C1295fh.a(this.a);
        }
        return this.c;
    }

    public C1542nh(Context context, C1604ph phVar) {
        this.a = context;
        this.b = phVar;
    }

    public void a(Bh bh) {
        C1511mh a2 = a();
        String str = "Answers";
        if (a2 == null) {
            C5328TMa.e().d(str, "Firebase analytics logging was enabled, but not available...");
            return;
        }
        C1573oh a3 = this.b.a(bh);
        if (a3 == null) {
            C5701cNa e = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Fabric event was not mappable to Firebase event: ");
            sb.append(bh);
            e.d(str, sb.toString());
            return;
        }
        a2.a(a3.a(), a3.b());
        if ("levelEnd".equals(bh.g)) {
            a2.a("post_score", a3.b());
        }
    }
}
