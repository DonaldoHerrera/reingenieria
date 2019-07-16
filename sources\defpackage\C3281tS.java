package defpackage;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.cast.framework.media.C0650e.C0042e;
import com.soundcloud.android.cast.F;
import com.soundcloud.android.cast.H;
import com.soundcloud.android.playback.core.d;
import java.io.IOException;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: tS reason: default package and case insensitive filesystem */
/* compiled from: CastProtocol */
public class C3281tS extends H {
    private C4928GKa<C0636d> a = C4928GKa.a();
    private a b;
    private C4928GKa<b> c = C4928GKa.a();
    private boolean d;
    private final C3202pS e;
    private final F f;
    private final C7054oVa<C3183oS> g;
    private final C5606ava h;
    private final d i;

    /* renamed from: tS$a */
    /* compiled from: CastProtocol */
    public interface a extends C0042e {
        void a(long j, long j2, Jla jla);

        void a(C3261sS sSVar);

        void b(long j, long j2);

        void c(long j, long j2);

        void d(long j, long j2);

        void i();
    }

    /* renamed from: tS$b */
    /* compiled from: CastProtocol */
    private static class b {
        /* access modifiers changed from: private */
        public int a;
        /* access modifiers changed from: private */
        public C4928GKa<String> b;

        b(int i, C4928GKa<String> gKa) {
            this.a = i;
            this.b = gKa;
        }
    }

    C3281tS(C3202pS pSVar, C7054oVa<C3183oS> ova, C5606ava ava, d dVar) {
        this.e = pSVar;
        this.g = ova;
        this.h = ava;
        this.i = dVar;
        this.f = new F(dVar);
    }

    private C0650e l() {
        if (m()) {
            return ((C0636d) this.a.b()).g();
        }
        return null;
    }

    private boolean m() {
        return this.a.c() && ((C0636d) this.a.b()).b();
    }

    private void n() {
        if (a(1, C4928GKa.a())) {
            this.f.a("onIdleEmptyMetadataReceived", l());
            this.b.i();
            b(1, C4928GKa.a());
            return;
        }
        this.f.a("Swallowed State", l());
    }

    public void a(C0636d dVar) {
        d dVar2 = this.i;
        StringBuilder sb = new StringBuilder();
        sb.append("CastProtocol::registerCastSession() for session: ");
        sb.append(dVar);
        dVar2.a("GoogleCast", sb.toString());
        this.a = C4928GKa.c(dVar);
    }

    public void b(C3261sS sSVar) {
        a(C3241rS.a("UPDATE_QUEUE", sSVar.a((C3183oS) this.g.get())));
    }

    public void e() {
        C0650e l = l();
        if (this.b != null && l != null) {
            this.f.a("onStatusUpdated", l());
            if (b(l().k())) {
                this.i.b("GoogleCast", "onStatusUpdated() ignored IDLE state: those shouldn't exist after LOAD has been issued");
            } else {
                a(l);
            }
        }
    }

    public void k() {
        this.i.a("GoogleCast", "CastProtocol::unregisterCastSession() called");
        this.a = C4928GKa.a();
        this.c = C4928GKa.a();
        this.d = false;
    }

    public void a(String str, boolean z, long j, C3261sS sSVar) {
        this.d = true;
        com.google.android.gms.cast.MediaInfo.a aVar = new com.google.android.gms.cast.MediaInfo.a(str);
        aVar.a("audio/mpeg");
        aVar.a(1);
        C3021gS gSVar = new C3021gS(this, aVar.a(), z, j, sSVar);
        a((Callable) gSVar);
        d dVar = this.i;
        StringBuilder sb = new StringBuilder();
        sb.append("CastProtocol::sendLoad");
        sb.append(z ? " in autoplay" : "");
        sb.append(" for pos. ");
        sb.append(j);
        sb.append(" with playQueue = ");
        sb.append(sSVar);
        dVar.a("GoogleCast", sb.toString());
    }

    public void b() {
        C0650e l = l();
        if (this.b != null && l != null) {
            this.f.a("onMetadataUpdated", l);
            int k = l.k();
            if (b(k)) {
                this.i.b("GoogleCast", "onMetadataUpdated() ignored IDLE state: those shouldn't exist after LOAD has been issued");
                return;
            }
            C4928GKa b2 = b(l);
            try {
                if (b2.c()) {
                    if (k != 0) {
                        a(k, (JSONObject) b2.b());
                    }
                } else if (k == 1) {
                    n();
                }
            } catch (Lea | IOException | JSONException e2) {
                this.i.a(e2, "Could not parse received queue");
            }
        }
    }

    public /* synthetic */ Object a(MediaInfo mediaInfo, boolean z, long j, C3261sS sSVar) throws Exception {
        return l().a(mediaInfo, z, j, this.e.a(sSVar.a((C3183oS) this.g.get())));
    }

    private void a(C3241rS rSVar) {
        try {
            String a2 = this.e.a(rSVar);
            StringBuilder sb = new StringBuilder();
            sb.append("CastProtocol::sendMessage = ");
            sb.append(a2);
            this.i.b("GoogleCast", sb.toString());
            ((C0636d) this.a.b()).a("urn:x-cast:com.soundcloud.chromecast", a2);
        } catch (Lea e2) {
            d dVar = this.i;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CastProtocol::sendMessage - could not map message to JSON: ");
            sb2.append(rSVar);
            dVar.a((Exception) e2, sb2.toString());
        }
    }

    private boolean b(int i2) {
        return this.d && i2 == 1;
    }

    private void a(C0650e eVar) {
        long d2 = eVar.d();
        long l = eVar.l();
        int k = eVar.k();
        if (k == 0) {
            this.i.c("GoogleCast", "Received an unknown media status");
        } else if (k == 1) {
            Jla a2 = a(eVar.e());
            if (a2 != null) {
                this.b.a(d2, l, a2);
            }
        } else if (k == 2) {
            this.b.b(d2, l);
        } else if (k == 3) {
            this.b.d(d2, l);
        } else if (k == 4 || k == 5) {
            this.b.c(d2, l);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown Media State code returned ");
            sb.append(eVar.k());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private C4928GKa<JSONObject> b(C0650e eVar) {
        if (eVar.g() == null || eVar.g().I() == null) {
            return C4928GKa.a();
        }
        return C4928GKa.c(eVar.g().I());
    }

    private void b(int i2, C4928GKa<String> gKa) {
        this.c = C4928GKa.c(new b(i2, gKa));
    }

    private Jla a(int i2) {
        if (i2 == 1) {
            return Jla.PLAYBACK_COMPLETE;
        }
        if (i2 == 2) {
            return Jla.NONE;
        }
        if (i2 != 4) {
            return null;
        }
        return Jla.ERROR_RECOVERABLE;
    }

    private void a(int i2, JSONObject jSONObject) throws IOException, Lea, JSONException {
        C3261sS a2 = a(jSONObject);
        if (a(i2, a2.h())) {
            this.f.a("onNonEmptyMetadataReceived", l());
            this.b.a(a2);
            b(i2, a2.h());
            return;
        }
        this.f.a("Swallowed State", l());
    }

    public C3261sS a(JSONObject jSONObject) throws IOException, Lea, JSONException {
        return this.e.a(jSONObject);
    }

    private void a(Callable callable) {
        APa.c(callable).b(RPa.a()).i().c(this.h.a());
    }

    private boolean a(int i2, C4928GKa<String> gKa) {
        return !this.c.c() || i2 != ((b) this.c.b()).a || !gKa.equals(((b) this.c.b()).b);
    }
}
