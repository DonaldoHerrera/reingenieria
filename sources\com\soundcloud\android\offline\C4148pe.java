package com.soundcloud.android.offline;

import android.content.res.Resources;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;

/* renamed from: com.soundcloud.android.offline.pe reason: case insensitive filesystem */
/* compiled from: OfflineTrackAssetDownloader.kt */
public class C4148pe {
    private final N a;
    private final Resources b;
    private final C5412WJa c;
    private final C6838lKa d;
    private final C6970nGa e;
    private final C3469VY f;
    private final Qb g;

    public C4148pe(N n, Resources resources, C5412WJa wJa, C6838lKa lka, C6970nGa nga, C3469VY vy, Qb qb) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(resources, "resources");
        C7471uYa.b(wJa, "waveformFetchCommand");
        C7471uYa.b(lka, "waveformStorage");
        C7471uYa.b(nga, "networkConnectionHelper");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(qb, "offlineLogger");
        this.a = n;
        this.b = resources;
        this.c = wJa;
        this.d = lka;
        this.e = nga;
        this.f = vy;
        this.g = qb;
    }

    public void a(Vca vca) {
        C7471uYa.b(vca, "imageResource");
        Qb qb = this.g;
        StringBuilder sb = new StringBuilder();
        sb.append("Prefetch artwork called for: ");
        sb.append(vca);
        qb.a(sb.toString());
        C3721b b2 = C3721b.b(this.b);
        N n = this.a;
        C3508cda a2 = vca.a();
        C4928GKa b3 = vca.b();
        C7471uYa.a((Object) b2, "playerSize");
        n.a(a2, b3, b2);
        C3721b c2 = C3721b.c(this.b);
        N n2 = this.a;
        C3508cda a3 = vca.a();
        C4928GKa b4 = vca.b();
        C7471uYa.a((Object) c2, "listItemSize");
        n2.a(a3, b4, c2);
    }

    public void a(C3508cda cda, String str) {
        C7471uYa.b(cda, "trackUrn");
        C7471uYa.b(str, "waveformUrl");
        Qb qb = this.g;
        StringBuilder sb = new StringBuilder();
        sb.append("Prefetch waveform called for: ");
        sb.append(cda);
        qb.a(sb.toString());
        if (!this.d.a(cda)) {
            try {
                this.d.a(cda, this.c.a(str));
            } catch (a e2) {
                Qb qb2 = this.g;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to download waveform for track: ");
                sb2.append(cda);
                sb2.append(' ');
                sb2.append(e2.getCause());
                qb2.a(sb2.toString());
            } catch (Exception e3) {
                this.f.a(new a((Throwable) e3), NVa.a("connection_type", this.e.b().toString()), NVa.a("urn", cda.toString()));
            }
        }
    }
}
