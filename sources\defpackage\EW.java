package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: EW reason: default package */
/* compiled from: UserStorageWriter.kt */
final class EW<T> implements C6776kQa<Iterable<? extends C3776gea>> {
    final /* synthetic */ HW a;

    EW(HW hw) {
        this.a = hw;
    }

    /* renamed from: a */
    public final void accept(Iterable<C3776gea> iterable) {
        HW hw = this.a;
        C7471uYa.a((Object) iterable, "it");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) iterable, 10));
        for (C3776gea a2 : iterable) {
            arrayList.add(this.a.a(a2));
        }
        hw.b((Collection<Ufa<C3776gea>>) arrayList);
    }
}
