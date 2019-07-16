package com.soundcloud.android.offline;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.Map;

/* compiled from: TrackOfflineStateProvider */
public class Se {
    private final De a;
    /* access modifiers changed from: private */
    public final C5327TLa b;
    private final HPa c;
    /* access modifiers changed from: private */
    public Map<C3508cda, C3823mda> d = Collections.emptyMap();
    /* access modifiers changed from: private */
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    public final UPa e = new UPa();

    /* compiled from: TrackOfflineStateProvider */
    private final class a extends C5037Jua<Hc> {
        private a() {
        }

        public void a(Hc hc) {
            for (C3508cda cda : hc.b) {
                if (cda.x()) {
                    Se.this.d.put(cda, hc.a);
                }
            }
        }
    }

    /* compiled from: TrackOfflineStateProvider */
    private final class b extends C5068Kua<Map<C3508cda, C3823mda>> {
        private b() {
        }

        /* renamed from: a */
        public void onSuccess(Map<C3508cda, C3823mda> map) {
            Se.this.d = map;
            Se.this.e.b(Se.this.b.a(C3876taa.u, (SUa<E>) new a<E>()));
            super.onSuccess(map);
        }
    }

    public Se(De de, C5327TLa tLa, HPa hPa) {
        this.a = de;
        this.b = tLa;
        this.c = hPa;
    }

    public void b() {
        UPa uPa = this.e;
        IPa a2 = this.a.h().b(this.c).a(RPa.a());
        b bVar = new b();
        a2.c(bVar);
        uPa.b(bVar);
    }

    public void a() {
        this.d.clear();
    }

    public C3823mda a(C3508cda cda) {
        return this.d.containsKey(cda) ? (C3823mda) this.d.get(cda) : C3823mda.NOT_OFFLINE;
    }
}
