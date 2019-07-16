package defpackage;

import com.soundcloud.android.sync.SyncJobResult;
import java.util.List;
import java.util.Map;

/* renamed from: oFa reason: default package and case insensitive filesystem */
/* compiled from: DefaultUserRepository.kt */
final class C7038oFa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C7728yFa a;
    final /* synthetic */ List b;
    final /* synthetic */ C2074HO c;

    C7038oFa(C7728yFa yfa, List list, C2074HO ho) {
        this.a = yfa;
        this.b = list;
        this.c = ho;
    }

    /* renamed from: a */
    public final IPa<Map<C3508cda, C3784hea>> apply(SyncJobResult syncJobResult) {
        C7471uYa.b(syncJobResult, "it");
        return this.a.a.a(this.b).g().c((C6776kQa<? super T>) new C6969nFa<Object>(this));
    }
}
