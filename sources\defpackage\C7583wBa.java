package defpackage;

import android.util.Pair;
import com.soundcloud.android.collections.data.L;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3708j;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.offline.Gd;
import com.soundcloud.android.sync.SyncJobResult;
import com.soundcloud.android.sync.na;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: wBa reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistsSyncer */
class C7583wBa implements Callable<Boolean> {
    private final C7309sCa a;
    private final C7031oBa b;
    private final C5421Wpa c;
    private final C4981IBa d;
    private final C5363Upa e;
    private final C5128Msa f;
    private final C6332dsa g;
    private final dfa h;
    private final Gd i;
    private final boolean j;
    private final C5287SBa k;
    private final C5327TLa l;
    private final C3700b m;
    private final L n;

    C7583wBa(C7309sCa sca, C7031oBa oba, C5421Wpa wpa, C4981IBa iBa, C5363Upa upa, C5128Msa msa, dfa dfa, Gd gd, C5287SBa sBa, C6332dsa dsa, C5327TLa tLa, C3700b bVar, L l2, boolean z) {
        this.a = sca;
        this.b = oba;
        this.c = wpa;
        this.d = iBa;
        this.e = upa;
        this.f = msa;
        this.h = dfa;
        this.k = sBa;
        this.l = tLa;
        this.m = bVar;
        this.i = gd;
        this.j = !z;
        this.g = dsa;
        this.n = l2;
    }

    private Set<C3508cda> a() {
        HashSet hashSet = new HashSet(this.g.c());
        if (this.j) {
            hashSet.addAll((Collection) this.i.b().b());
        }
        return hashSet;
    }

    private List<C3508cda> b() throws Exception {
        List<C7376tBa> call = this.b.call();
        ArrayList arrayList = new ArrayList(call.size());
        SDb.a("MyPlaylistsSyncer").a("Local Playlist count : %s", Integer.valueOf(call.size()));
        for (C7376tBa tba : call) {
            C3508cda c2 = tba.c();
            C3927zda a2 = ((C6554hBa) this.h.a(hfa.c(C2226PO.PLAYLISTS_CREATE.a()).c().a((Object) a(tba, this.c.a(c2))).b(), C6554hBa.class)).a();
            ((C4981IBa) this.d.a(Pair.create(c2, a2))).call();
            this.n.a(c2, a2.a());
            a(c2, a2);
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    private void c() throws ifa {
        for (C3508cda cda : this.e.a((Void) null)) {
            jfa a2 = this.h.a(hfa.a(C2226PO.PLAYLISTS_DELETE.a(cda)).c().b());
            if (a2.g() || a(a2)) {
                this.f.a(cda);
            } else if (a2.a() != null) {
                throw a2.a();
            }
        }
    }

    public Boolean call() throws Exception {
        c();
        return Boolean.valueOf(this.a.a(b()).booleanValue() || a((Collection<C3508cda>) a()));
    }

    private boolean a(Collection<C3508cda> collection) {
        ArrayList arrayList = new ArrayList();
        for (C3508cda cda : collection) {
            if (a(cda)) {
                arrayList.add(cda);
            }
        }
        a((List<C3508cda>) arrayList);
        return !arrayList.isEmpty();
    }

    private void a(List<C3508cda> list) {
        if (!list.isEmpty()) {
            this.l.c(C3876taa.n, SyncJobResult.a(na.PLAYLIST.name(), true, list));
        }
    }

    private boolean a(C3508cda cda) {
        try {
            return this.k.a(cda).call().booleanValue();
        } catch (Exception unused) {
            SDb.a("MyPlaylistsSyncer").f("Failed to sync my playlist %s", cda);
            return false;
        }
    }

    private boolean a(jfa jfa) {
        return jfa.d() >= 400 && jfa.d() < 500;
    }

    private void a(C3508cda cda, C3927zda zda) {
        this.m.a((J) K.a(C3708j.a(zda)));
        this.l.c(C3876taa.q, Kaa.a(cda, Eda.a(zda)));
    }

    private Map<String, Object> a(C7376tBa tba, List<C3508cda> list) {
        T t = new T(2);
        t.put("title", tba.b());
        t.put("public", Boolean.valueOf(!tba.a()));
        T t2 = new T(2);
        t2.put("playlist", t);
        t2.put("track_urns", C5526_Ha.b(list));
        return t2;
    }
}
