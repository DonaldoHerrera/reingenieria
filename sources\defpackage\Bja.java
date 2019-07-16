package defpackage;

import android.net.Uri;
import com.soundcloud.android.deeplinks.e;
import com.soundcloud.android.stations.kc;
import com.soundcloud.android.tracks.Ya;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* renamed from: Bja reason: default package */
/* compiled from: ResolveOperations */
public class Bja {
    private final efa a;
    private final HPa b;
    private final C3768fea c;
    private final Hda d;
    private final C3800jea e;
    private final Ya f;
    private final C6332dsa g;
    private final C1472lW h;
    private final kc i;

    Bja(efa efa, HPa hPa, C3768fea fea, Hda hda, C3800jea jea, Ya ya, C6332dsa dsa, C1472lW lWVar, kc kcVar) {
        this.a = efa;
        this.b = hPa;
        this.c = fea;
        this.d = hda;
        this.e = jea;
        this.f = ya;
        this.g = dsa;
        this.h = lWVar;
        this.i = kcVar;
    }

    private IPa<C3508cda> g(String str) {
        return i(str).h().f(new Qia(this, str));
    }

    private IPa<Via> h(String str) {
        return this.a.a(hfa.b(C2226PO.RESOLVE_ENTITY.a()).c().a("identifier", str).b(), Via.class);
    }

    private C7531vPa<C3508cda> i(String str) {
        String a2 = a(str);
        if (d(a2)) {
            return this.f.a(a2);
        }
        if (b(a2)) {
            return this.g.a(a2);
        }
        if (e(a2)) {
            return this.h.a(a2);
        }
        if (c(a2)) {
            return this.i.a(a2);
        }
        return C7531vPa.c();
    }

    public /* synthetic */ MPa a(Uri uri) throws Exception {
        return IPa.a((MPa<? extends T1>) IPa.a(uri), (MPa<? extends T2>) g(uri.toString()), (C6504gQa<? super T1, ? super T2, ? extends R>) Oia.a).g(new Nia(uri));
    }

    /* access modifiers changed from: 0000 */
    public boolean c(String str) {
        List pathSegments = Uri.parse(str).getPathSegments();
        if (pathSegments.size() < 3 || !((String) pathSegments.get(0)).equals("stations")) {
            return false;
        }
        return ((String) pathSegments.get(1)).equals("artist") || ((String) pathSegments.get(1)).equals("track");
    }

    /* access modifiers changed from: 0000 */
    public boolean d(String str) {
        return Uri.parse(str).getPathSegments().size() == 2;
    }

    /* access modifiers changed from: 0000 */
    public boolean e(String str) {
        return Uri.parse(str).getPathSegments().size() == 1;
    }

    public IPa<Dja> f(String str) {
        return b(Uri.parse(str)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Ria<Object,Object>(this)).b(this.b);
    }

    /* access modifiers changed from: 0000 */
    public boolean b(String str) {
        List pathSegments = Uri.parse(str).getPathSegments();
        return pathSegments.size() == 3 && ((String) pathSegments.get(1)).equals("sets");
    }

    private IPa<Boolean> c(Via via) {
        return IPa.c((Callable<? extends T>) new Pia<Object>(this, via));
    }

    private IPa<Uri> b(Uri uri) {
        if (e.c(uri)) {
            return this.a.a(hfa.b(uri.toString()).d().b()).a(e.a(uri)).g(new Sia(uri));
        }
        return IPa.a(uri);
    }

    static /* synthetic */ Dja a(Uri uri, C3508cda cda) throws Exception {
        if (C3508cda.a.equals(cda)) {
            return Dja.a(uri, null);
        }
        return Dja.a(cda);
    }

    public /* synthetic */ MPa a(String str, Throwable th) throws Exception {
        if (th instanceof NoSuchElementException) {
            return h(str).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Tia<Object,Object>(this));
        }
        return IPa.b(th);
    }

    public /* synthetic */ Boolean b(Via via) throws Exception {
        if (via.c().c()) {
            return Boolean.valueOf(this.c.a(Collections.singletonList(via.c().b())));
        }
        if (via.a().c()) {
            return Boolean.valueOf(this.d.a(Collections.singletonList(via.a().b())));
        }
        if (via.d().c()) {
            return Boolean.valueOf(this.e.b(Collections.singletonList(via.d().b())));
        }
        if (via.b().c()) {
            return Boolean.valueOf(this.i.a((Sda) via.b().b()));
        }
        return Boolean.valueOf(false);
    }

    public /* synthetic */ MPa a(Via via) throws Exception {
        return c(via).e(new Uia(via));
    }

    /* access modifiers changed from: 0000 */
    public String a(String str) {
        Uri a2 = C5497ZHa.a(Uri.parse(str));
        if (!e.d(a2)) {
            return a2.getPath().substring(1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2.getHost());
        sb.append(a2.getPath());
        return sb.toString();
    }
}
