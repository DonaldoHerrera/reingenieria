package defpackage;

import java.util.ArrayList;
import java.util.List;

@EVa(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¨\u0006\t"}, d2 = {"Lcom/soundcloud/android/playlists/EditModeChangedIntent;", "", "()V", "toResult", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/playlists/EditModeChangedIntent$EditModeResult;", "editMode", "", "EditModeResult", "base_release"}, mv = {1, 1, 15})
/* renamed from: Npa reason: default package and case insensitive filesystem */
/* compiled from: EditModeChangedIntent.kt */
public final class C5155Npa {
    public static final C5155Npa a = new C5155Npa();

    /* renamed from: Npa$a */
    /* compiled from: EditModeChangedIntent.kt */
    public static final class a implements C4751Aoa {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public C7218qra a(C7218qra qra) {
            C7471uYa.b(qra, "previous");
            C6532gqa a2 = qra.c().a(this.a);
            List<e> e = qra.e();
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) e, 10));
            for (e a3 : e) {
                arrayList.add(a3.a(this.a));
            }
            return C7218qra.a(qra, a2, arrayList, null, null, null, 28, null);
        }
    }

    private C5155Npa() {
    }

    public final APa<a> a(APa<Boolean> aPa) {
        C7471uYa.b(aPa, "editMode");
        APa<a> h = aPa.h(C5185Opa.a);
        C7471uYa.a((Object) h, "editMode.map { EditModeResult(it) }");
        return h;
    }
}
