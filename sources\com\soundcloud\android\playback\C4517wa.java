package com.soundcloud.android.playback;

import android.net.Uri;
import android.net.Uri.Builder;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.C3694v;

/* renamed from: com.soundcloud.android.playback.wa reason: case insensitive filesystem */
/* compiled from: HlsStreamUrlBuilder */
public class C4517wa {
    private final C2526g a;
    private final C2961dP b;

    public C4517wa(C2526g gVar, C2961dP dPVar) {
        this.a = gVar;
        this.b = dPVar;
    }

    private String b(C3508cda cda, boolean z) {
        if (z) {
            return a(cda, C2226PO.HLS_SNIPPET_STREAM).a();
        }
        return a(cda, C2226PO.HLS_STREAM).a("can_snip", (Object) Boolean.valueOf(false)).a("secure", (Object) Boolean.valueOf(true)).a();
    }

    public String a(C3508cda cda, boolean z) {
        return b(cda, z);
    }

    public String a(String str) {
        C2961dP a2 = this.b.a(str);
        if (this.a.f()) {
            a2.a(c.OAUTH_TOKEN, (Object) this.a.e().a());
        }
        return a2.a();
    }

    public String a(C3693u uVar) {
        C3694v vVar = (C3694v) C1943BD.c(uVar.B(), C4294d.a);
        return vVar.a() ? a(vVar) : vVar.b();
    }

    private C2961dP a(C3508cda cda, C2226PO po) {
        C2961dP a2 = this.b.a(po, cda);
        if (this.a.f()) {
            a2.a(c.OAUTH_TOKEN, (Object) this.a.e().a());
        }
        return a2;
    }

    private String a(C3694v vVar) {
        Builder buildUpon = Uri.parse(vVar.b()).buildUpon();
        if (this.a.f()) {
            buildUpon.appendQueryParameter(c.OAUTH_TOKEN.toString(), this.a.e().a());
        }
        return buildUpon.build().toString();
    }
}
