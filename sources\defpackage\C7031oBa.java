package defpackage;

import java.util.List;

/* renamed from: oBa reason: default package and case insensitive filesystem */
/* compiled from: LoadLocalPlaylistsCommand */
public class C7031oBa extends C1317gT<Object, List<C7376tBa>, C7031oBa> {
    private final C5500ZKa b;

    /* renamed from: oBa$a */
    /* compiled from: LoadLocalPlaylistsCommand */
    private static final class a implements C6295dLa<C7376tBa> {
        private a() {
        }

        public C7376tBa a(C5326TKa tKa) {
            return C7376tBa.a(C3508cda.c(tKa.c(e.d)), tKa.d(e.p), C3492ada.PRIVATE.b().equals(tKa.d(e.y)));
        }
    }

    C7031oBa(C5500ZKa zKa) {
        this.b = zKa;
    }

    public List<C7376tBa> call() throws Exception {
        return this.b.a((C6975nLa) ((C6975nLa) C6975nLa.a(e.c).a(e.d, e.p, e.y).a(e.e, (Object) Integer.valueOf(1))).b(e.d, (Object) Integer.valueOf(0))).b(new a());
    }
}
