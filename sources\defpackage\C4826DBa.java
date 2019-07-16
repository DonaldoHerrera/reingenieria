package defpackage;

import java.util.Collection;

/* renamed from: DBa reason: default package and case insensitive filesystem */
/* compiled from: PushPlaylistRemovalsCommand */
class C4826DBa extends C1317gT<Collection<C3508cda>, Collection<C3508cda>, C4826DBa> {
    private final dfa b;
    private C3508cda c;

    C4826DBa(dfa dfa) {
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
        for (C3508cda cda : (Collection) this.a) {
            a(this.b.a(hfa.a(C2226PO.PLAYLIST_REMOVE_TRACK.a(this.c, cda)).c().b()));
        }
        return (Collection) this.a;
    }
}
