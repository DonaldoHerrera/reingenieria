package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C0615o;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.drm.g.c;
import com.google.android.exoplayer2.drm.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@TargetApi(18)
/* compiled from: DefaultDrmSessionManager */
public class j<T extends p> implements n<T>, c<T> {
    private final UUID a;
    private final q<T> b;
    private final t c;
    private final HashMap<String, String> d;
    private final Eq<h> e;
    private final boolean f;
    private final int g;
    /* access modifiers changed from: private */
    public final List<g<T>> h;
    private final List<g<T>> i;
    private Looper j;
    private int k;
    private byte[] l;
    volatile a m;

    @SuppressLint({"HandlerLeak"})
    /* compiled from: DefaultDrmSessionManager */
    private class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                Iterator it = j.this.h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    g gVar = (g) it.next();
                    if (gVar.a(bArr)) {
                        gVar.a(message.what);
                        break;
                    }
                }
            }
        }
    }

    /* compiled from: DefaultDrmSessionManager */
    public static final class b extends Exception {
        private b(UUID uuid) {
            StringBuilder sb = new StringBuilder();
            sb.append("Media does not support uuid: ");
            sb.append(uuid);
            super(sb.toString());
        }
    }

    public final void a(Handler handler, h hVar) {
        this.e.a(handler, hVar);
    }

    public boolean a(DrmInitData drmInitData) {
        boolean z = true;
        if (this.l != null) {
            return true;
        }
        if (a(drmInitData, this.a, true).isEmpty()) {
            if (drmInitData.d != 1 || !drmInitData.a(0).a(C0615o.b)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(this.a);
            Iq.d("DefaultDrmSessionMgr", sb.toString());
        }
        String str = drmInitData.c;
        if (str != null && !"cenc".equals(str)) {
            if (!"cbc1".equals(str) && !"cbcs".equals(str) && !"cens".equals(str)) {
                return true;
            }
            if (C0471ar.a < 25) {
                z = false;
            }
        }
        return z;
    }

    public m<T> a(Looper looper, DrmInitData drmInitData) {
        List list;
        g gVar;
        Looper looper2 = this.j;
        C1852xq.b(looper2 == null || looper2 == looper);
        if (this.h.isEmpty()) {
            this.j = looper;
            if (this.m == null) {
                this.m = new a<>(looper);
            }
        }
        g gVar2 = null;
        if (this.l == null) {
            List a2 = a(drmInitData, this.a, false);
            if (a2.isEmpty()) {
                b bVar = new b(this.a);
                this.e.a((defpackage.Eq.a<T>) new c<T>(bVar));
                return new o(new com.google.android.exoplayer2.drm.m.a(bVar));
            }
            list = a2;
        } else {
            list = null;
        }
        if (this.f) {
            Iterator it = this.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar3 = (g) it.next();
                if (C0471ar.a((Object) gVar3.a, (Object) list)) {
                    gVar2 = gVar3;
                    break;
                }
            }
        } else if (!this.h.isEmpty()) {
            gVar2 = (g) this.h.get(0);
        }
        if (gVar2 == null) {
            gVar = new g(this.a, this.b, this, list, this.k, this.l, this.d, this.c, looper, this.e, this.g);
            this.h.add(gVar);
        } else {
            gVar = gVar2;
        }
        gVar.d();
        return gVar;
    }

    public void a(m<T> mVar) {
        if (!(mVar instanceof o)) {
            g gVar = (g) mVar;
            if (gVar.g()) {
                this.h.remove(gVar);
                if (this.i.size() > 1 && this.i.get(0) == gVar) {
                    ((g) this.i.get(1)).f();
                }
                this.i.remove(gVar);
            }
        }
    }

    public void a(g<T> gVar) {
        if (!this.i.contains(gVar)) {
            this.i.add(gVar);
            if (this.i.size() == 1) {
                gVar.f();
            }
        }
    }

    public void a() {
        for (g e2 : this.i) {
            e2.e();
        }
        this.i.clear();
    }

    public void a(Exception exc) {
        for (g a2 : this.i) {
            a2.a(exc);
        }
        this.i.clear();
    }

    private static List<SchemeData> a(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.d);
        for (int i2 = 0; i2 < drmInitData.d; i2++) {
            SchemeData a2 = drmInitData.a(i2);
            if ((a2.a(uuid) || (C0615o.c.equals(uuid) && a2.a(C0615o.b))) && (a2.e != null || z)) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
