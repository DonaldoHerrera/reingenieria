package com.soundcloud.android.sync;

import android.content.Intent;
import android.os.Looper;
import com.soundcloud.android.accounts.C2529j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: SyncInitiator */
public class T {
    private final C2529j a;
    private final C4806CMa<K> b;
    private final HPa c;

    T(C2529j jVar, C4806CMa<K> cMa, HPa hPa) {
        this.a = jVar;
        this.b = cMa;
        this.c = hPa;
    }

    public IPa<SyncJobResult> a(na naVar) {
        return a(c(naVar));
    }

    public VPa b(na naVar) {
        C6979nPa h = a(naVar).h();
        C4974Hua hua = new C4974Hua();
        h.c(hua);
        return hua;
    }

    public IPa<SyncJobResult> c(C3508cda cda) {
        return b(Collections.singletonList(cda));
    }

    public IPa<SyncJobResult> a(na naVar, String str) {
        return a(c(naVar).setAction(str));
    }

    public IPa<SyncJobResult> b(List<C3508cda> list) {
        Intent c2 = c(na.USERS);
        V.a(c2, (Collection<C3508cda>) list);
        return a(c2);
    }

    public void c(Collection<C3508cda> collection) {
        b(collection).a((GPa<? super T>) new C5037Jua<Object>());
    }

    private Intent c(na naVar) {
        Intent intent = new Intent();
        V.a(intent, naVar);
        intent.putExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", true);
        return intent;
    }

    public IPa<SyncJobResult> a(Collection<C3508cda> collection) {
        Intent c2 = c(na.TRACKS);
        V.a(c2, collection);
        return a(c2);
    }

    public VPa b(C3508cda cda) {
        IPa a2 = a(cda);
        C5068Kua kua = new C5068Kua();
        a2.c(kua);
        return kua;
    }

    public IPa<SyncJobResult> a(C3508cda cda) {
        if (cda.c() < 0) {
            return a(na.MY_PLAYLISTS);
        }
        Intent c2 = c(na.PLAYLIST);
        V.a(c2, (Collection<C3508cda>) Arrays.asList(new C3508cda[]{cda}));
        return a(c2);
    }

    /* access modifiers changed from: 0000 */
    public APa<SyncJobResult> b(Collection<C3508cda> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        boolean z = false;
        for (C3508cda cda : collection) {
            if (cda.g()) {
                z = true;
            } else {
                arrayList.add(a(cda));
            }
        }
        if (z) {
            arrayList.add(a(na.MY_PLAYLISTS));
        }
        return IPa.a((Iterable<? extends MPa<? extends T>>) arrayList).e();
    }

    public IPa<SyncJobResult> a(List<C3508cda> list) {
        Intent c2 = c(na.PLAYLISTS);
        V.a(c2, (Collection<C3508cda>) list);
        return a(c2);
    }

    private IPa<SyncJobResult> a(Intent intent) {
        return IPa.a((LPa<T>) new C6120c<T>(this, intent)).a(this.c);
    }

    public /* synthetic */ void a(Intent intent, JPa jPa) throws Exception {
        intent.putExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER", new ResultReceiverAdapter(jPa, Looper.getMainLooper()));
        ((K) this.b.get()).b(intent);
    }

    public C6979nPa a() {
        return this.a.d().b((C7118pQa<? super T, ? extends C7255rPa>) C6119b.a);
    }
}
