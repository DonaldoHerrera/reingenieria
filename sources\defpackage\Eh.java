package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.UUID;

/* renamed from: Eh reason: default package */
/* compiled from: SessionMetadataCollector */
class Eh {
    private final Context a;
    private final C4931GNa b;
    private final String c;
    private final String d;

    public Eh(Context context, C4931GNa gNa, String str, String str2) {
        this.a = context;
        this.b = gNa;
        this.c = str;
        this.d = str2;
    }

    public Ch a() {
        Map e = this.b.e();
        Ch ch = new Ch(this.b.c(), UUID.randomUUID().toString(), this.b.d(), this.b.k(), (String) e.get(a.FONT_TOKEN), C7391tNa.n(this.a), this.b.j(), this.b.g(), this.c, this.d);
        return ch;
    }
}
