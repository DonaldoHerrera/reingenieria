package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.UUID;

/* renamed from: wh reason: default package and case insensitive filesystem */
/* compiled from: SessionAnalyticsFilesManager */
class C1813wh extends C7047oOa<Bh> {
    private NOa h;

    C1813wh(Context context, Dh dh, C7529vNa vna, C7116pOa poa) throws IOException {
        super(context, dh, vna, poa, 100);
    }

    /* access modifiers changed from: 0000 */
    public void a(NOa nOa) {
        this.h = nOa;
    }

    /* access modifiers changed from: protected */
    public String c() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder();
        sb.append("sa");
        String str = "_";
        sb.append(str);
        sb.append(randomUUID.toString());
        sb.append(str);
        sb.append(this.c.a());
        sb.append(".tap");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public int e() {
        NOa nOa = this.h;
        return nOa == null ? super.e() : nOa.c;
    }

    /* access modifiers changed from: protected */
    public int f() {
        NOa nOa = this.h;
        return nOa == null ? super.f() : nOa.e;
    }
}
