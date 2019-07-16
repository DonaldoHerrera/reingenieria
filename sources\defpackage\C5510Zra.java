package defpackage;

import com.soundcloud.android.sync.SyncJobResult;
import java.util.List;

/* renamed from: Zra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistOperations.kt */
final class C5510Zra<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4909Fra a;
    final /* synthetic */ C3508cda b;

    C5510Zra(C4909Fra fra, C3508cda cda) {
        this.a = fra;
        this.b = cda;
    }

    /* renamed from: a */
    public final IPa<List<C3508cda>> apply(SyncJobResult syncJobResult) {
        C7471uYa.b(syncJobResult, "it");
        return ((C5421Wpa) this.a.d.get()).c(this.b);
    }
}
