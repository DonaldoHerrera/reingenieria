package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.squareup.picasso.q reason: case insensitive filesystem */
/* compiled from: Dispatcher */
class C6252q {
    final b a = new b();
    final Context b;
    final ExecutorService c;
    final r d;
    final Map<String, C6244i> e;
    final Map<Object, C6236a> f;
    final Map<Object, C6236a> g;
    final Set<Object> h;
    final Handler i;
    final Handler j;
    final C6246k k;
    final P l;
    final List<C6244i> m;
    final c n;
    final boolean o;
    boolean p;

    /* renamed from: com.squareup.picasso.q$a */
    /* compiled from: Dispatcher */
    private static class a extends Handler {
        private final C6252q a;

        a(Looper looper, C6252q qVar) {
            super(looper);
            this.a = qVar;
        }

        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.a.d((C6236a) message.obj);
                    return;
                case 2:
                    this.a.c((C6236a) message.obj);
                    return;
                case 4:
                    this.a.d((C6244i) message.obj);
                    return;
                case 5:
                    this.a.e((C6244i) message.obj);
                    return;
                case 6:
                    this.a.a((C6244i) message.obj, false);
                    return;
                case 7:
                    this.a.a();
                    return;
                case 9:
                    this.a.b((NetworkInfo) message.obj);
                    return;
                case 10:
                    C6252q qVar = this.a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    qVar.b(z);
                    return;
                case 11:
                    this.a.c(message.obj);
                    return;
                case 12:
                    this.a.d(message.obj);
                    return;
                default:
                    E.a.post(new C6251p(this, message));
                    return;
            }
        }
    }

    /* renamed from: com.squareup.picasso.q$b */
    /* compiled from: Dispatcher */
    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.squareup.picasso.q$c */
    /* compiled from: Dispatcher */
    static class c extends BroadcastReceiver {
        private final C6252q a;

        c(C6252q qVar) {
            this.a = qVar;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.a.o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.a.b.registerReceiver(this, intentFilter);
        }

        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    String str = "state";
                    if (intent.hasExtra(str)) {
                        this.a.a(intent.getBooleanExtra(str, false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.a.a(((ConnectivityManager) W.a(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    C6252q(Context context, ExecutorService executorService, Handler handler, r rVar, C6246k kVar, P p2) {
        this.a.start();
        W.a(this.a.getLooper());
        this.b = context;
        this.c = executorService;
        this.e = new LinkedHashMap();
        this.f = new WeakHashMap();
        this.g = new WeakHashMap();
        this.h = new LinkedHashSet();
        this.i = new a(this.a.getLooper(), this);
        this.d = rVar;
        this.j = handler;
        this.k = kVar;
        this.l = p2;
        this.m = new ArrayList(4);
        this.p = W.c(this.b);
        this.o = W.b(context, "android.permission.ACCESS_NETWORK_STATE");
        this.n = new c(this);
        this.n.a();
    }

    private void f(C6244i iVar) {
        if (!iVar.m()) {
            Bitmap bitmap = iVar.q;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.m.add(iVar);
            if (!this.i.hasMessages(7)) {
                this.i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    private void g(C6244i iVar) {
        C6236a b2 = iVar.b();
        if (b2 != null) {
            e(b2);
        }
        List c2 = iVar.c();
        if (c2 != null) {
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                e((C6236a) c2.get(i2));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C6236a aVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* access modifiers changed from: 0000 */
    public void b(C6236a aVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    /* access modifiers changed from: 0000 */
    public void c(C6244i iVar) {
        Handler handler = this.i;
        handler.sendMessageDelayed(handler.obtainMessage(5, iVar), 500);
    }

    /* access modifiers changed from: 0000 */
    public void d(C6236a aVar) {
        a(aVar, true);
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"MissingPermission"})
    public void e(C6244i iVar) {
        if (!iVar.m()) {
            boolean z = false;
            if (this.c.isShutdown()) {
                a(iVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.o) {
                networkInfo = ((ConnectivityManager) W.a(this.b, "connectivity")).getActiveNetworkInfo();
            }
            if (iVar.a(this.p, networkInfo)) {
                if (iVar.i().p) {
                    W.a("Dispatcher", "retrying", W.a(iVar));
                }
                if (iVar.e() instanceof a) {
                    iVar.m |= A.NO_CACHE.e;
                }
                iVar.r = this.c.submit(iVar);
            } else {
                if (this.o && iVar.n()) {
                    z = true;
                }
                a(iVar, z);
                if (z) {
                    g(iVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Object obj) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(11, obj));
    }

    /* access modifiers changed from: 0000 */
    public void b(Object obj) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(12, obj));
    }

    /* access modifiers changed from: 0000 */
    public void c(C6236a aVar) {
        String b2 = aVar.b();
        C6244i iVar = (C6244i) this.e.get(b2);
        String str = "canceled";
        String str2 = "Dispatcher";
        if (iVar != null) {
            iVar.b(aVar);
            if (iVar.a()) {
                this.e.remove(b2);
                if (aVar.e().p) {
                    W.a(str2, str, aVar.g().d());
                }
            }
        }
        if (this.h.contains(aVar.h())) {
            this.g.remove(aVar.i());
            if (aVar.e().p) {
                W.a(str2, str, aVar.g().d(), "because paused request got canceled");
            }
        }
        C6236a aVar2 = (C6236a) this.f.remove(aVar.i());
        if (aVar2 != null && aVar2.e().p) {
            W.a(str2, str, aVar2.g().d(), "from replaying");
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(Object obj) {
        if (this.h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator it = this.g.values().iterator();
            while (it.hasNext()) {
                C6236a aVar = (C6236a) it.next();
                if (aVar.h().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C6244i iVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(4, iVar));
    }

    /* access modifiers changed from: 0000 */
    public void b(C6244i iVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(6, iVar));
    }

    /* access modifiers changed from: 0000 */
    public void a(NetworkInfo networkInfo) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z) {
        this.p = z;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* access modifiers changed from: 0000 */
    public void b(NetworkInfo networkInfo) {
        ExecutorService executorService = this.c;
        if (executorService instanceof I) {
            ((I) executorService).a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            b();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C6236a aVar, boolean z) {
        String str = "Dispatcher";
        if (this.h.contains(aVar.h())) {
            this.g.put(aVar.i(), aVar);
            if (aVar.e().p) {
                String d2 = aVar.b.d();
                StringBuilder sb = new StringBuilder();
                sb.append("because tag '");
                sb.append(aVar.h());
                sb.append("' is paused");
                W.a(str, "paused", d2, sb.toString());
            }
            return;
        }
        C6244i iVar = (C6244i) this.e.get(aVar.b());
        if (iVar != null) {
            iVar.a(aVar);
        } else if (this.c.isShutdown()) {
            if (aVar.e().p) {
                W.a(str, "ignored", aVar.b.d(), "because shut down");
            }
        } else {
            C6244i a2 = C6244i.a(aVar.e(), this, this.k, this.l, aVar);
            a2.r = this.c.submit(a2);
            this.e.put(aVar.b(), a2);
            if (z) {
                this.f.remove(aVar.i());
            }
            if (aVar.e().p) {
                W.a(str, "enqueued", aVar.b.d());
            }
        }
    }

    private void b() {
        if (!this.f.isEmpty()) {
            Iterator it = this.f.values().iterator();
            while (it.hasNext()) {
                C6236a aVar = (C6236a) it.next();
                it.remove();
                if (aVar.e().p) {
                    W.a("Dispatcher", "replaying", aVar.g().d());
                }
                a(aVar, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(C6244i iVar) {
        if (z.b(iVar.h())) {
            this.k.a(iVar.f(), iVar.k());
        }
        this.e.remove(iVar.f());
        f(iVar);
        if (iVar.i().p) {
            W.a("Dispatcher", "batched", W.a(iVar), "for completion");
        }
    }

    private void e(C6236a aVar) {
        Object i2 = aVar.i();
        if (i2 != null) {
            aVar.k = true;
            this.f.put(i2, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(Object obj) {
        if (this.h.add(obj)) {
            Iterator it = this.e.values().iterator();
            while (it.hasNext()) {
                C6244i iVar = (C6244i) it.next();
                boolean z = iVar.i().p;
                C6236a b2 = iVar.b();
                List c2 = iVar.c();
                boolean z2 = c2 != null && !c2.isEmpty();
                if (b2 != null || z2) {
                    String str = "' was paused";
                    String str2 = "because tag '";
                    String str3 = "paused";
                    String str4 = "Dispatcher";
                    if (b2 != null && b2.h().equals(obj)) {
                        iVar.b(b2);
                        this.g.put(b2.i(), b2);
                        if (z) {
                            String d2 = b2.b.d();
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(obj);
                            sb.append(str);
                            W.a(str4, str3, d2, sb.toString());
                        }
                    }
                    if (z2) {
                        for (int size = c2.size() - 1; size >= 0; size--) {
                            C6236a aVar = (C6236a) c2.get(size);
                            if (aVar.h().equals(obj)) {
                                iVar.b(aVar);
                                this.g.put(aVar.i(), aVar);
                                if (z) {
                                    String d3 = aVar.b.d();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str2);
                                    sb2.append(obj);
                                    sb2.append(str);
                                    W.a(str4, str3, d3, sb2.toString());
                                }
                            }
                        }
                    }
                    if (iVar.a()) {
                        it.remove();
                        if (z) {
                            W.a(str4, "canceled", W.a(iVar), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        ArrayList arrayList = new ArrayList(this.m);
        this.m.clear();
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        a((List<C6244i>) arrayList);
    }

    /* access modifiers changed from: 0000 */
    public void a(C6244i iVar, boolean z) {
        if (iVar.i().p) {
            String a2 = W.a(iVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : "");
            W.a("Dispatcher", "batched", a2, sb.toString());
        }
        this.e.remove(iVar.f());
        f(iVar);
    }

    private void a(List<C6244i> list) {
        if (list != null && !list.isEmpty() && ((C6244i) list.get(0)).i().p) {
            StringBuilder sb = new StringBuilder();
            for (C6244i iVar : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(W.a(iVar));
            }
            W.a("Dispatcher", "delivered", sb.toString());
        }
    }
}
