package com.soundcloud.android.playback;

import android.net.Uri;
import android.net.Uri.Builder;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.C3694v;
import com.soundcloud.android.settings.streamingquality.e.b;
import com.soundcloud.android.settings.streamingquality.e.b.C0171b;
import com.soundcloud.android.settings.streamingquality.e.b.c;

/* compiled from: StreamUrlBuilder */
public class Gd {
    private final C2526g a;
    private final C2961dP b;

    Gd(C2526g gVar, C2961dP dPVar) {
        this.a = gVar;
        this.b = dPVar;
    }

    public String a(C3508cda cda) {
        C2961dP a2 = this.b.a(C2226PO.HTTPS_STREAM, cda);
        a(a2);
        return a2.a();
    }

    public String a(C3508cda cda, b bVar) {
        C2961dP a2 = this.b.a(C2226PO.OFFLINE_SYNC, cda);
        a(a2);
        a2.a("quality", (Object) a(bVar));
        return a2.a();
    }

    private String a(b bVar) {
        if (bVar == c.a) {
            return "sq";
        }
        if (bVar == C0171b.a) {
            return "hq";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot use ");
        sb.append(bVar);
        sb.append("for building the stream url");
        throw new IllegalArgumentException(sb.toString());
    }

    public String a(String str) {
        C2961dP a2 = this.b.a(str);
        a(a2);
        return a2.a();
    }

    public String a(C3693u uVar) {
        C3694v vVar = (C3694v) C1943BD.c(uVar.B(), C4424t.a);
        return vVar.a() ? a(vVar) : vVar.b();
    }

    private C2961dP a(C2961dP dPVar) {
        C2358WP e = this.a.e();
        if (e.e()) {
            dPVar.a(c.OAUTH_TOKEN, (Object) e.a());
        }
        return dPVar;
    }

    private String a(C3694v vVar) {
        Builder buildUpon = Uri.parse(vVar.b()).buildUpon();
        C2358WP e = this.a.e();
        if (e.e()) {
            buildUpon.appendQueryParameter(c.OAUTH_TOKEN.toString(), e.a());
        }
        return buildUpon.build().toString();
    }
}
