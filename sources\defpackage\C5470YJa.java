package defpackage;

import java.io.IOException;

/* renamed from: YJa reason: default package and case insensitive filesystem */
/* compiled from: WaveformHttpClient.kt */
public class C5470YJa {
    private final C4806CMa<C7440tyb> a;

    public C5470YJa(C4806CMa<C7440tyb> cMa) {
        C7471uYa.b(cMa, "httpClientProvider");
        this.a = cMa;
    }

    public Ayb a(String str) throws IOException {
        C7471uYa.b(str, "waveformUrl");
        C7440tyb tyb = (C7440tyb) this.a.get();
        a aVar = new a();
        aVar.b(str);
        aVar.c();
        Ayb execute = tyb.a(aVar.a()).execute();
        C7471uYa.a((Object) execute, "httpClientProvider.get()… )\n            .execute()");
        return execute;
    }
}
