package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: BBa reason: default package and case insensitive filesystem */
/* compiled from: PushPlaylistAdditionsCommand */
class C4764BBa extends C1317gT<Collection<C3508cda>, Collection<C3508cda>, C4764BBa> {
    private final dfa b;
    private C3508cda c;

    C4764BBa(dfa dfa) {
        this.b = dfa;
    }

    private void a(jfa jfa) throws ifa {
        ifa a = jfa.a();
        if (a == null) {
            return;
        }
        if (a.c() || jfa.d() >= 500) {
            throw a;
        }
    }

    public Collection<C3508cda> call() throws Exception {
        ArrayList arrayList = new ArrayList(((Collection) this.a).size());
        for (C3508cda cda : (Collection) this.a) {
            jfa a = this.b.a(hfa.c(C2226PO.PLAYLIST_ADD_TRACK.a(this.c)).c().a((Object) Collections.singletonMap("track_urn", cda.toString())).b());
            if (a.g()) {
                arrayList.add(cda);
            } else {
                a(a);
            }
        }
        return arrayList;
    }
}
