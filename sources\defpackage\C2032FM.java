package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.UnsupportedEncodingException;
import java.util.List;

@SuppressLint({"sc.SilentExceptionUsage"})
/* renamed from: FM reason: default package and case insensitive filesystem */
/* compiled from: TrackingHandler */
class C2032FM extends Handler {
    private final C6834lGa a;
    private final C2129KM b;
    private final C1952BM c;
    private final C3469VY d;

    C2032FM(Looper looper, C6834lGa lga, C2129KM km, C1952BM bm, C3469VY vy) {
        super(looper);
        this.a = lga;
        this.b = km;
        this.c = bm;
        this.d = vy;
    }

    private Throwable a(Message message, C5413WKa wKa) {
        if (wKa.a() != null) {
            return wKa.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("error inserting tracking event ");
        sb.append(message.obj);
        return new Exception(sb.toString());
    }

    private void b(Message message) {
        int i = message.what;
        if (i == -559038737) {
            SDb.a(C2428_L.a).a("Shutting down.", new Object[0]);
            removeCallbacksAndMessages(null);
            getLooper().quit();
        } else if (i == 0) {
            try {
                SDb.a(C2428_L.a).a("Inserting event: %s\nthread=%s", message.obj, Thread.currentThread());
                C5413WKa a2 = this.b.a((C2110JM) message.obj);
                if (!a2.b()) {
                    this.d.a(a(message, a2), new HVa[0]);
                }
            } catch (UnsupportedEncodingException e) {
                this.d.a(e, new HVa[0]);
            }
        } else if (i == 1) {
            a(message);
        }
    }

    public void handleMessage(Message message) {
        try {
            b(message);
        } catch (C2011EL e) {
            throw e;
        } catch (Exception e2) {
            this.d.a(e2, new HVa[0]);
        }
    }

    private void a(Message message) {
        List list;
        String str = (String) message.obj;
        if (this.a.d()) {
            SDb.a(C2428_L.a).a("flushing tracking events (backend = %s)", str);
            if (str == null) {
                list = this.b.a();
            } else {
                list = this.b.a(str);
            }
            if (!list.isEmpty()) {
                a(list, str);
                return;
            }
            return;
        }
        SDb.a(C2428_L.a).a("not connected, skipping flush", new Object[0]);
    }

    private void a(List<C2110JM> list, String str) {
        List a2 = this.c.a(str).a(list);
        if (!a2.isEmpty()) {
            C5266RKa a3 = this.b.a(a2);
            int c2 = a3.c();
            if (!a3.b() || a2.size() != c2) {
                C3469VY vy = this.d;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to delete some tracking events: failed = ");
                sb.append(a2.size() - c2);
                vy.a(new Exception(sb.toString(), a3.a()), new HVa[0]);
                return;
            }
            SDb.a(C2428_L.a).a("submitted %d events", Integer.valueOf(c2));
        }
    }
}
