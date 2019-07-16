package defpackage;

import java.io.IOException;

/* renamed from: UJa reason: default package and case insensitive filesystem */
/* compiled from: WaveformCacheSerializer.kt */
public class C5354UJa implements C7183qMa<C5325TJa> {
    private final C4806CMa<Nea> a;
    private final C3469VY b;

    public C5354UJa(C4806CMa<Nea> cMa, C3469VY vy) {
        C7471uYa.b(cMa, "jsonTransformerLazy");
        C7471uYa.b(vy, "errorReporter");
        this.a = cMa;
        this.b = vy;
    }

    public C5325TJa a(String str) {
        C7471uYa.b(str, "s");
        try {
            Nea nea = (Nea) this.a.get();
            C4990IKa a2 = C4990IKa.a(C5325TJa.class);
            C7471uYa.a((Object) a2, "TypeToken.of(ApiWaveform::class.java)");
            return (C5325TJa) nea.a(str, a2);
        } catch (IOException e) {
            a.a(this.b, e, null, 2, null);
            return null;
        } catch (Lea e2) {
            a.a(this.b, e2, null, 2, null);
            return null;
        }
    }

    public String a(C5325TJa tJa) {
        C7471uYa.b(tJa, "apiWaveform");
        try {
            return ((Nea) this.a.get()).a(tJa);
        } catch (Lea e) {
            a.a(this.b, e, null, 2, null);
            return null;
        }
    }
}
