package defpackage;

import com.soundcloud.android.foundation.events.C.a;
import com.soundcloud.android.foundation.events.C.a.C0091a;
import com.soundcloud.android.foundation.events.C.a.b;
import com.soundcloud.android.foundation.events.D;
import java.util.concurrent.Callable;

/* renamed from: DR reason: default package and case insensitive filesystem */
/* compiled from: RepostOperations */
public class C1997DR {
    private final C2172MR a;
    private final efa b;
    private final HPa c;
    private final C5327TLa d;

    C1997DR(C2172MR mr, efa efa, HPa hPa, C5327TLa tLa) {
        this.a = mr;
        this.b = efa;
        this.c = hPa;
        this.d = tLa;
    }

    private C7118pQa<a, IPa<C2037FR>> c() {
        return new C2304TQ(this);
    }

    private C7118pQa<a, IPa<C2037FR>> d() {
        return new C2433_Q(this);
    }

    private IPa<b> e(C3508cda cda) {
        return this.a.c().c(cda).b(this.c).e(new C2323UQ(cda)).c((C6776kQa<? super T>) new C2247QQ<Object>(this)).a((C6776kQa<? super Throwable>) new C2266RQ<Object>(this, cda));
    }

    public IPa<C2037FR> a(C3508cda cda, boolean z) {
        if (z) {
            return a(cda).a(c());
        }
        return e(cda).a(d());
    }

    public /* synthetic */ IPa b(a aVar) throws Exception {
        return d(aVar.b()).b((Callable<? extends T>) C2414ZQ.a).f(new C2285SQ(this, aVar));
    }

    private C6979nPa c(C3508cda cda) {
        return this.b.a(hfa.c(b(cda).a(cda.toString())).c().b());
    }

    private C6979nPa d(C3508cda cda) {
        return this.b.a(hfa.a(b(cda).a(cda.toString())).c().b());
    }

    public /* synthetic */ IPa a(a aVar) throws Exception {
        return c(aVar.b()).b((Callable<? extends T>) C2377XQ.a).a(e(aVar.b()).e(C2359WQ.a));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public MPa<? extends C2037FR> a(a aVar, Throwable th) {
        if (!(th instanceof ifa) || !((ifa) th).j().equals(a.NOT_FOUND)) {
            return a(aVar.b()).e(C2228PQ.a);
        }
        return IPa.a(C2037FR.UNREPOST_SUCCEEDED);
    }

    private IPa<C0091a> a(C3508cda cda) {
        return this.a.a().c(cda).b(this.c).e(new C2209OQ(cda)).c((C6776kQa<? super T>) new C2395YQ<Object>(this)).a((C6776kQa<? super Throwable>) new C2341VQ<Object>(this, cda));
    }

    static /* synthetic */ b b(C3508cda cda, Integer num) throws Exception {
        return new b(cda, num);
    }

    public /* synthetic */ void b(b bVar) throws Exception {
        this.d.c(C3876taa.s, D.a((a) bVar));
    }

    public /* synthetic */ void b(C3508cda cda, Throwable th) throws Exception {
        this.d.c(C3876taa.s, D.a(cda));
    }

    private C2226PO b(C3508cda cda) {
        return cda.x() ? C2226PO.MY_TRACK_REPOSTS : C2226PO.MY_PLAYLIST_REPOSTS;
    }

    static /* synthetic */ C0091a a(C3508cda cda, Integer num) throws Exception {
        return new C0091a(cda, num);
    }

    public /* synthetic */ void a(C0091a aVar) throws Exception {
        this.d.c(C3876taa.s, D.a((a) aVar));
    }

    public /* synthetic */ void a(C3508cda cda, Throwable th) throws Exception {
        this.d.c(C3876taa.s, D.b(cda));
    }
}
