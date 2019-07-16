package com.soundcloud.android.search;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.G;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: SearchTracker */
public class Ja {
    private final C3700b a;
    private final Map<La, a> b = new EnumMap(La.class);

    /* compiled from: SearchTracker */
    static final class a {
        static final a a = new a(C3508cda.a, false);
        static final a b = new a(C3508cda.a, true);
        final C3508cda c;
        final boolean d;

        /* access modifiers changed from: 0000 */
        public boolean a() {
            return this.d;
        }

        /* access modifiers changed from: 0000 */
        public boolean b() {
            return this.c != C3508cda.a;
        }

        private a(C3508cda cda, boolean z) {
            this.c = cda;
            this.d = z;
        }
    }

    public Ja(C3700b bVar) {
        this.a = bVar;
        b();
    }

    private void b() {
        for (La put : La.values()) {
            this.b.put(put, a.a);
        }
    }

    public void a(Yca yca, String str, C4928GKa<C3508cda> gKa, C4928GKa<Integer> gKa2) {
        this.a.a((J) G.a(yca, str, (C3508cda) gKa.d(), (Integer) gKa2.d()));
    }

    public void a() {
        this.a.a(Yca.SEARCH_MAIN);
    }

    public void a(La la, C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
        a(la.b(), cda, searchQuerySourceInfo);
    }

    public void b(La la) {
        if (((a) this.b.get(la)).b()) {
            this.a.a(new Zca(la.b(), null, ((a) this.b.get(la)).c));
            return;
        }
        this.b.put(la, a.b);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(La la) {
        return ((a) this.b.get(la)).a();
    }

    /* access modifiers changed from: 0000 */
    public void a(La la, C3508cda cda) {
        this.b.put(la, new a(cda, false));
    }

    private void a(Yca yca, C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
        if (cda.x()) {
            this.a.a((J) G.a(yca, searchQuerySourceInfo));
        } else if (cda.u()) {
            this.a.a((J) G.a(yca, searchQuerySourceInfo));
        } else if (cda.J()) {
            this.a.a((J) G.a(yca, searchQuerySourceInfo));
        }
    }
}
