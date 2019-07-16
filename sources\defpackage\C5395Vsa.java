package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: Vsa reason: default package and case insensitive filesystem */
/* compiled from: UpdateTrackListIntent.kt */
final class C5395Vsa<V> implements Callable<a> {
    final /* synthetic */ C5424Wsa a;
    final /* synthetic */ List b;

    C5395Vsa(C5424Wsa wsa, List list) {
        this.a = wsa;
        this.b = list;
    }

    public final a call() {
        List list = this.b;
        C7471uYa.a((Object) list, "tracks");
        return new a(list, this.a.c);
    }
}
