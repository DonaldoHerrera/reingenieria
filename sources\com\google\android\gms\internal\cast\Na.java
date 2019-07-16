package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.mediarouter.media.g;
import androidx.mediarouter.media.h;
import androidx.mediarouter.media.h.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class Na extends Ja {
    private final h a;
    private final Map<g, Set<a>> b = new HashMap();

    public Na(h hVar) {
        this.a = hVar;
    }

    public final int a() {
        return 12451009;
    }

    public final void a(Bundle bundle, Ma ma) {
        g a2 = g.a(bundle);
        if (!this.b.containsKey(a2)) {
            this.b.put(a2, new HashSet());
        }
        ((Set) this.b.get(a2)).add(new Oa(ma));
    }

    public final void b(Bundle bundle, int i) {
        g a2 = g.a(bundle);
        for (a a3 : (Set) this.b.get(a2)) {
            this.a.a(a2, a3, i);
        }
    }

    public final Bundle d(String str) {
        for (h.g gVar : this.a.d()) {
            if (gVar.h().equals(str)) {
                return gVar.f();
            }
        }
        return null;
    }

    public final void g(Bundle bundle) {
        for (a a2 : (Set) this.b.get(g.a(bundle))) {
            this.a.a(a2);
        }
    }

    public final void n() {
        h hVar = this.a;
        hVar.a(hVar.b());
    }

    public final boolean p() {
        return this.a.e().h().equals(this.a.b().h());
    }

    public final String x() {
        return this.a.e().h();
    }

    public final void y() {
        for (Set<a> it : this.b.values()) {
            for (a a2 : it) {
                this.a.a(a2);
            }
        }
        this.b.clear();
    }

    public final void b(String str) {
        for (h.g gVar : this.a.d()) {
            if (gVar.h().equals(str)) {
                this.a.a(gVar);
                return;
            }
        }
    }

    public final boolean a(Bundle bundle, int i) {
        return this.a.a(g.a(bundle), i);
    }

    public final void a(MediaSessionCompat mediaSessionCompat) {
        this.a.a(mediaSessionCompat);
    }
}
