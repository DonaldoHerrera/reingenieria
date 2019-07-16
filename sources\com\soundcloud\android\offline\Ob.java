package com.soundcloud.android.offline;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: DownloadHandler */
class Ob extends Handler {
    private final WeakReference<b> a;
    private final Vb b;
    private final C4165se c;
    private final De d;
    private final Td e;
    private C4146pc f;

    /* compiled from: DownloadHandler */
    static class a {
        private final Vb a;
        private final De b;
        private final C4165se c;
        private final Td d;

        a(Vb vb, De de, C4165se seVar, Td td) {
            this.a = vb;
            this.b = de;
            this.c = seVar;
            this.d = td;
        }

        /* access modifiers changed from: 0000 */
        public Ob a(b bVar) {
            Ob ob = new Ob(a(), bVar, this.a, this.c, this.b, this.d);
            return ob;
        }

        private Looper a() {
            HandlerThread handlerThread = new HandlerThread("DownloadThread", 10);
            handlerThread.start();
            return handlerThread.getLooper();
        }
    }

    /* compiled from: DownloadHandler */
    interface b {
        void a(C4152qc qcVar);

        void b(C4152qc qcVar);

        void c(C4152qc qcVar);

        void d(C4152qc qcVar);
    }

    private com.soundcloud.android.offline.Vb.b a(C4146pc pcVar) {
        return new C4077e(this, pcVar);
    }

    /* access modifiers changed from: 0000 */
    public C4146pc b() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.f != null;
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        getLooper().quit();
    }

    public void handleMessage(Message message) {
        C4146pc pcVar = (C4146pc) message.obj;
        this.f = pcVar;
        a(C4152qc.a(pcVar, 0));
        a(b(pcVar));
        this.f = null;
    }

    private Ob(Looper looper, b bVar, Vb vb, C4165se seVar, De de, Td td) {
        super(looper);
        this.e = td;
        this.a = new WeakReference<>(bVar);
        this.b = vb;
        this.c = seVar;
        this.d = de;
    }

    private C4152qc b(C4146pc pcVar) {
        this.e.a(pcVar);
        C4152qc a2 = this.b.a(pcVar, a(pcVar));
        if (a2.k()) {
            return b(a2);
        }
        if (a2.l()) {
            this.d.b(a2.c());
        }
        return a2;
    }

    public /* synthetic */ void a(C4146pc pcVar, long j) {
        a(C4152qc.a(pcVar, j));
    }

    private void a(C4152qc qcVar) {
        b bVar = (b) this.a.get();
        if (bVar == null) {
            return;
        }
        if (qcVar.g()) {
            bVar.c(qcVar);
        } else if (qcVar.k()) {
            bVar.a(qcVar);
            this.e.b(qcVar);
        } else if (qcVar.d()) {
            bVar.d(qcVar);
            this.e.a(qcVar);
        } else {
            bVar.b(qcVar);
            this.e.c(qcVar);
        }
    }

    private C4152qc b(C4152qc qcVar) {
        if (this.d.a(qcVar)) {
            return qcVar;
        }
        this.c.a(qcVar.c());
        return C4152qc.c(qcVar.a);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.b.a();
    }
}
