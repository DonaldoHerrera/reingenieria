package androidx.mediarouter.media;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import androidx.media.G;
import androidx.mediarouter.media.c.C0017c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: MediaRouter */
public final class h {
    static final boolean a = Log.isLoggable("MediaRouter", 3);
    static d b;
    final Context c;
    final ArrayList<b> d = new ArrayList<>();

    /* compiled from: MediaRouter */
    public static abstract class a {
        public void a(h hVar, e eVar) {
        }

        public void a(h hVar, g gVar) {
        }

        public void a(h hVar, g gVar, int i) {
            f(hVar, gVar);
        }

        public void b(h hVar, e eVar) {
        }

        public void b(h hVar, g gVar) {
        }

        public void c(h hVar, e eVar) {
        }

        public void c(h hVar, g gVar) {
        }

        public void d(h hVar, g gVar) {
        }

        public void e(h hVar, g gVar) {
        }

        public void f(h hVar, g gVar) {
        }

        public void g(h hVar, g gVar) {
        }
    }

    /* compiled from: MediaRouter */
    private static final class b {
        public final h a;
        public final a b;
        public g c = g.a;
        public int d;

        public b(h hVar, a aVar) {
            this.a = hVar;
            this.b = aVar;
        }

        public boolean a(g gVar) {
            return (this.d & 2) != 0 || gVar.a(this.c);
        }
    }

    /* compiled from: MediaRouter */
    public static abstract class c {
        public void a(Bundle bundle) {
        }

        public void a(String str, Bundle bundle) {
        }
    }

    /* compiled from: MediaRouter */
    private static final class d implements androidx.mediarouter.media.x.f, androidx.mediarouter.media.v.a {
        final Context a;
        final ArrayList<WeakReference<h>> b = new ArrayList<>();
        private final ArrayList<g> c = new ArrayList<>();
        private final Map<C0247Qb<String, String>, String> d = new HashMap();
        private final ArrayList<e> e = new ArrayList<>();
        private final ArrayList<C0018d> f = new ArrayList<>();
        final androidx.mediarouter.media.w.c g = new androidx.mediarouter.media.w.c();
        private final c h = new c();
        final a i = new a();
        private final C1474lb j;
        final x k;
        private final boolean l;
        private v m;
        private g n;
        private g o;
        g p;
        private androidx.mediarouter.media.c.d q;
        private final Map<String, androidx.mediarouter.media.c.d> r = new HashMap();
        private b s;
        private b t;
        MediaSessionCompat u;
        private MediaSessionCompat v;
        private OnActiveChangeListener w = new i(this);

        /* compiled from: MediaRouter */
        private final class a extends Handler {
            private final ArrayList<b> a = new ArrayList<>();

            a() {
            }

            private void b(int i, Object obj) {
                if (i != 262) {
                    switch (i) {
                        case 257:
                            d.this.k.a((g) obj);
                            return;
                        case 258:
                            d.this.k.c((g) obj);
                            return;
                        case 259:
                            d.this.k.b((g) obj);
                            return;
                        default:
                            return;
                    }
                } else {
                    d.this.k.d((g) obj);
                }
            }

            public void a(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            public void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                if (i == 259 && d.this.f().h().equals(((g) obj).h())) {
                    d.this.a(true);
                }
                b(i, obj);
                try {
                    int size = d.this.b.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        h hVar = (h) ((WeakReference) d.this.b.get(size)).get();
                        if (hVar == null) {
                            d.this.b.remove(size);
                        } else {
                            this.a.addAll(hVar.d);
                        }
                    }
                    int size2 = this.a.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        a((b) this.a.get(i3), i, obj, i2);
                    }
                } finally {
                    this.a.clear();
                }
            }

            public void a(int i, Object obj, int i2) {
                Message obtainMessage = obtainMessage(i, obj);
                obtainMessage.arg1 = i2;
                obtainMessage.sendToTarget();
            }

            private void a(b bVar, int i, Object obj, int i2) {
                h hVar = bVar.a;
                a aVar = bVar.b;
                int i3 = 65280 & i;
                if (i3 == 256) {
                    g gVar = (g) obj;
                    if (bVar.a(gVar)) {
                        switch (i) {
                            case 257:
                                aVar.a(hVar, gVar);
                                return;
                            case 258:
                                aVar.d(hVar, gVar);
                                return;
                            case 259:
                                aVar.b(hVar, gVar);
                                return;
                            case 260:
                                aVar.g(hVar, gVar);
                                return;
                            case 261:
                                aVar.c(hVar, gVar);
                                return;
                            case 262:
                                aVar.e(hVar, gVar);
                                return;
                            case 263:
                                aVar.a(hVar, gVar, i2);
                                return;
                            default:
                                return;
                        }
                    }
                } else if (i3 == 512) {
                    e eVar = (e) obj;
                    switch (i) {
                        case 513:
                            aVar.a(hVar, eVar);
                            return;
                        case 514:
                            aVar.c(hVar, eVar);
                            return;
                        case 515:
                            aVar.b(hVar, eVar);
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* compiled from: MediaRouter */
        private final class b {
            private final MediaSessionCompat a;
            private int b;
            private int c;
            private G d;

            b(MediaSessionCompat mediaSessionCompat) {
                this.a = mediaSessionCompat;
            }

            public void a(int i, int i2, int i3) {
                if (this.a != null) {
                    G g = this.d;
                    if (g != null && i == this.b && i2 == this.c) {
                        g.c(i3);
                        return;
                    }
                    this.d = new l(this, i, i2, i3);
                    this.a.setPlaybackToRemote(this.d);
                }
            }

            public Token b() {
                MediaSessionCompat mediaSessionCompat = this.a;
                if (mediaSessionCompat != null) {
                    return mediaSessionCompat.getSessionToken();
                }
                return null;
            }

            public void a() {
                MediaSessionCompat mediaSessionCompat = this.a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.setPlaybackToLocal(d.this.g.d);
                    this.d = null;
                }
            }
        }

        /* compiled from: MediaRouter */
        private final class c extends androidx.mediarouter.media.c.a {
            c() {
            }

            public void a(c cVar, d dVar) {
                d.this.a(cVar, dVar);
            }
        }

        /* renamed from: androidx.mediarouter.media.h$d$d reason: collision with other inner class name */
        /* compiled from: MediaRouter */
        private final class C0018d implements androidx.mediarouter.media.w.d {
            private final w a;
            private boolean b;

            public C0018d(Object obj) {
                this.a = w.a(d.this.a, obj);
                this.a.a((androidx.mediarouter.media.w.d) this);
                c();
            }

            public void a() {
                this.b = true;
                this.a.a((androidx.mediarouter.media.w.d) null);
            }

            public Object b() {
                return this.a.a();
            }

            public void c() {
                this.a.a(d.this.g);
            }

            public void b(int i) {
                if (!this.b) {
                    g gVar = d.this.p;
                    if (gVar != null) {
                        gVar.b(i);
                    }
                }
            }

            public void a(int i) {
                if (!this.b) {
                    g gVar = d.this.p;
                    if (gVar != null) {
                        gVar.a(i);
                    }
                }
            }
        }

        d(Context context) {
            this.a = context;
            this.j = C1474lb.a(context);
            this.l = androidx.core.app.d.a((ActivityManager) context.getSystemService("activity"));
            this.k = x.a(context, this);
        }

        private void d(g gVar, int i2) {
            String str = "MediaRouter";
            if (h.b == null || (this.o != null && gVar.s())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb = new StringBuilder();
                for (int i3 = 3; i3 < stackTrace.length; i3++) {
                    StackTraceElement stackTraceElement = stackTrace[i3];
                    sb.append(stackTraceElement.getClassName());
                    sb.append(".");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append("  ");
                }
                String str2 = ", callers=";
                if (h.b == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("setSelectedRouteInternal is called while sGlobal is null: pkgName=");
                    sb2.append(this.a.getPackageName());
                    sb2.append(str2);
                    sb2.append(sb.toString());
                    Log.w(str, sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Default route is selected while a BT route is available: pkgName=");
                    sb3.append(this.a.getPackageName());
                    sb3.append(str2);
                    sb3.append(sb.toString());
                    Log.w(str, sb3.toString());
                }
            }
            g gVar2 = this.p;
            if (gVar2 != gVar) {
                if (gVar2 != null) {
                    if (h.a) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Route unselected: ");
                        sb4.append(this.p);
                        sb4.append(" reason: ");
                        sb4.append(i2);
                        Log.d(str, sb4.toString());
                    }
                    this.i.a(263, this.p, i2);
                    androidx.mediarouter.media.c.d dVar = this.q;
                    if (dVar != null) {
                        dVar.b(i2);
                        this.q.a();
                        this.q = null;
                    }
                    if (!this.r.isEmpty()) {
                        for (androidx.mediarouter.media.c.d dVar2 : this.r.values()) {
                            dVar2.b(i2);
                            dVar2.a();
                        }
                        this.r.clear();
                    }
                }
                this.p = gVar;
                this.q = gVar.n().a(gVar.b);
                androidx.mediarouter.media.c.d dVar3 = this.q;
                if (dVar3 != null) {
                    dVar3.b();
                }
                if (h.a) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Route selected: ");
                    sb5.append(this.p);
                    Log.d(str, sb5.toString());
                }
                this.i.a(262, this.p);
                g gVar3 = this.p;
                if (gVar3 instanceof f) {
                    List<g> y = ((f) gVar3).y();
                    this.r.clear();
                    for (g gVar4 : y) {
                        androidx.mediarouter.media.c.d a2 = gVar4.n().a(gVar4.b, this.p.b);
                        a2.b();
                        this.r.put(gVar4.b, a2);
                    }
                }
                i();
            }
        }

        private void i() {
            g gVar = this.p;
            if (gVar != null) {
                this.g.a = gVar.o();
                this.g.b = this.p.q();
                this.g.c = this.p.p();
                this.g.d = this.p.j();
                this.g.e = this.p.k();
                int size = this.f.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    ((C0018d) this.f.get(i3)).c();
                }
                if (this.t == null) {
                    return;
                }
                if (this.p == c() || this.p == b()) {
                    this.t.a();
                    return;
                }
                if (this.g.c == 1) {
                    i2 = 2;
                }
                b bVar = this.t;
                androidx.mediarouter.media.w.c cVar = this.g;
                bVar.a(i2, cVar.b, cVar.a);
                return;
            }
            b bVar2 = this.t;
            if (bVar2 != null) {
                bVar2.a();
            }
        }

        public h a(Context context) {
            int size = this.b.size();
            while (true) {
                size--;
                if (size >= 0) {
                    h hVar = (h) ((WeakReference) this.b.get(size)).get();
                    if (hVar == null) {
                        this.b.remove(size);
                    } else if (hVar.c == context) {
                        return hVar;
                    }
                } else {
                    h hVar2 = new h(context);
                    this.b.add(new WeakReference(hVar2));
                    return hVar2;
                }
            }
        }

        public void b(g gVar, int i2) {
            if (gVar == this.p) {
                androidx.mediarouter.media.c.d dVar = this.q;
                if (dVar != null) {
                    dVar.c(i2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public g c() {
            g gVar = this.n;
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        public List<g> e() {
            return this.c;
        }

        /* access modifiers changed from: 0000 */
        public g f() {
            g gVar = this.p;
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        public void g() {
            a((c) this.k);
            this.m = new v(this.a, this);
            this.m.b();
        }

        public void h() {
            androidx.mediarouter.media.g.a aVar = new androidx.mediarouter.media.g.a();
            int size = this.b.size();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                h hVar = (h) ((WeakReference) this.b.get(size)).get();
                if (hVar == null) {
                    this.b.remove(size);
                } else {
                    int size2 = hVar.d.size();
                    boolean z3 = z2;
                    boolean z4 = z;
                    for (int i2 = 0; i2 < size2; i2++) {
                        b bVar = (b) hVar.d.get(i2);
                        aVar.a(bVar.c);
                        if ((bVar.d & 1) != 0) {
                            z4 = true;
                            z3 = true;
                        }
                        if ((bVar.d & 4) != 0 && !this.l) {
                            z4 = true;
                        }
                        if ((bVar.d & 8) != 0) {
                            z4 = true;
                        }
                    }
                    z = z4;
                    z2 = z3;
                }
            }
            g a2 = z ? aVar.a() : g.a;
            b bVar2 = this.s;
            if (bVar2 == null || !bVar2.b().equals(a2) || this.s.c() != z2) {
                if (!a2.d() || z2) {
                    this.s = new b(a2, z2);
                } else if (this.s != null) {
                    this.s = null;
                } else {
                    return;
                }
                String str = "MediaRouter";
                if (h.a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Updated discovery request: ");
                    sb.append(this.s);
                    Log.d(str, sb.toString());
                }
                if (z && !z2 && this.l) {
                    Log.i(str, "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                int size3 = this.e.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((e) this.e.get(i3)).a.b(this.s);
                }
            }
        }

        public g b(String str) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.c.equals(str)) {
                    return gVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public void c(g gVar, int i2) {
            String str = "MediaRouter";
            if (!this.c.contains(gVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring attempt to select removed route: ");
                sb.append(gVar);
                Log.w(str, sb.toString());
            } else if (!gVar.g) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Ignoring attempt to select disabled route: ");
                sb2.append(gVar);
                Log.w(str, sb2.toString());
            } else {
                d(gVar, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        public g b() {
            return this.o;
        }

        public void b(c cVar) {
            int c2 = c(cVar);
            if (c2 >= 0) {
                cVar.a((androidx.mediarouter.media.c.a) null);
                cVar.b(null);
                e eVar = (e) this.e.get(c2);
                a(eVar, (d) null);
                if (h.a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Provider removed: ");
                    sb.append(eVar);
                    Log.d("MediaRouter", sb.toString());
                }
                this.i.a(514, eVar);
                this.e.remove(c2);
            }
        }

        public void a(g gVar, int i2) {
            if (gVar == this.p) {
                androidx.mediarouter.media.c.d dVar = this.q;
                if (dVar != null) {
                    dVar.a(i2);
                    return;
                }
            }
            if (!this.r.isEmpty()) {
                androidx.mediarouter.media.c.d dVar2 = (androidx.mediarouter.media.c.d) this.r.get(gVar.b);
                if (dVar2 != null) {
                    dVar2.a(i2);
                }
            }
        }

        private int c(c cVar) {
            int size = this.e.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((e) this.e.get(i2)).a == cVar) {
                    return i2;
                }
            }
            return -1;
        }

        private int c(String str) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((g) this.c.get(i2)).c.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        private boolean c(g gVar) {
            return gVar.n() == this.k && gVar.a("android.media.intent.category.LIVE_AUDIO") && !gVar.a("android.media.intent.category.LIVE_VIDEO");
        }

        /* access modifiers changed from: 0000 */
        public void a(g gVar) {
            c(gVar, 3);
        }

        public boolean a(g gVar, int i2) {
            if (gVar.d()) {
                return false;
            }
            if ((i2 & 2) == 0 && this.l) {
                return true;
            }
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                g gVar2 = (g) this.c.get(i3);
                if (((i2 & 1) == 0 || !gVar2.t()) && gVar2.a(gVar)) {
                    return true;
                }
            }
            return false;
        }

        private String b(e eVar, String str) {
            String flattenToShortString = eVar.a().flattenToShortString();
            StringBuilder sb = new StringBuilder();
            sb.append(flattenToShortString);
            sb.append(":");
            sb.append(str);
            String sb2 = sb.toString();
            if (c(sb2) < 0) {
                this.d.put(new C0247Qb(flattenToShortString, str), sb2);
                return sb2;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Either ");
            sb3.append(str);
            sb3.append(" isn't unique in ");
            sb3.append(flattenToShortString);
            sb3.append(" or we're trying to assign a unique ID for an already added route");
            Log.w("MediaRouter", sb3.toString());
            int i2 = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", new Object[]{sb2, Integer.valueOf(i2)});
                if (c(format) < 0) {
                    this.d.put(new C0247Qb(flattenToShortString, str), format);
                    return format;
                }
                i2++;
            }
        }

        private int c(Object obj) {
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0018d) this.f.get(i2)).b() == obj) {
                    return i2;
                }
            }
            return -1;
        }

        public void a(c cVar) {
            if (c(cVar) < 0) {
                e eVar = new e(cVar);
                this.e.add(eVar);
                if (h.a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Provider added: ");
                    sb.append(eVar);
                    Log.d("MediaRouter", sb.toString());
                }
                this.i.a(513, eVar);
                a(eVar, cVar.d());
                cVar.a((androidx.mediarouter.media.c.a) this.h);
                cVar.b(this.s);
            }
        }

        private boolean b(g gVar) {
            return gVar.n() == this.k && gVar.b.equals("DEFAULT_ROUTE");
        }

        public void b(Object obj) {
            int c2 = c(obj);
            if (c2 >= 0) {
                ((C0018d) this.f.remove(c2)).a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(c cVar, d dVar) {
            int c2 = c(cVar);
            if (c2 >= 0) {
                a((e) this.e.get(c2), dVar);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x0174 A[LOOP:3: B:62:0x0172->B:63:0x0174, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0195  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01c3  */
        private void a(e eVar, d dVar) {
            int i2;
            boolean z;
            int size;
            int size2;
            String str;
            g gVar;
            e eVar2 = eVar;
            d dVar2 = dVar;
            if (eVar.a(dVar)) {
                String str2 = "MediaRouter";
                if (dVar2 != null) {
                    if (dVar.d()) {
                        List c2 = dVar.c();
                        int size3 = c2.size();
                        ArrayList<C0247Qb> arrayList = new ArrayList<>();
                        ArrayList<C0247Qb> arrayList2 = new ArrayList<>();
                        int i3 = 0;
                        i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            str = "Route added: ";
                            if (i3 >= size3) {
                                break;
                            }
                            a aVar = (a) c2.get(i3);
                            String k2 = aVar.k();
                            int a2 = eVar2.a(k2);
                            boolean z3 = aVar.i() != null;
                            if (a2 < 0) {
                                String b2 = b(eVar2, k2);
                                g fVar = z3 ? new f(eVar2, k2, b2) : new g(eVar2, k2, b2);
                                int i4 = i2 + 1;
                                eVar2.b.add(i2, fVar);
                                this.c.add(fVar);
                                if (z3) {
                                    arrayList.add(new C0247Qb(fVar, aVar));
                                } else {
                                    fVar.a(aVar);
                                    if (h.a) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(str);
                                        sb.append(fVar);
                                        Log.d(str2, sb.toString());
                                    }
                                    this.i.a(257, fVar);
                                }
                                i2 = i4;
                            } else if (a2 < i2) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Ignoring route descriptor with duplicate id: ");
                                sb2.append(aVar);
                                Log.w(str2, sb2.toString());
                            } else {
                                g gVar2 = (g) eVar2.b.get(a2);
                                if ((gVar2 instanceof f) != z3) {
                                    if (z3) {
                                        gVar = new f(eVar2, k2, gVar2.h());
                                    } else {
                                        gVar = new g(eVar2, k2, gVar2.h());
                                    }
                                    gVar2 = gVar;
                                    eVar2.b.set(a2, gVar2);
                                }
                                int i5 = i2 + 1;
                                Collections.swap(eVar2.b, a2, i2);
                                if (gVar2 instanceof f) {
                                    arrayList2.add(new C0247Qb(gVar2, aVar));
                                } else if (a(gVar2, aVar) != 0 && gVar2 == this.p) {
                                    i2 = i5;
                                    z2 = true;
                                }
                                i2 = i5;
                            }
                            i3++;
                        }
                        for (C0247Qb qb : arrayList) {
                            g gVar3 = (g) qb.a;
                            gVar3.a((a) qb.b);
                            if (h.a) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str);
                                sb3.append(gVar3);
                                Log.d(str2, sb3.toString());
                            }
                            this.i.a(257, gVar3);
                        }
                        z = z2;
                        for (C0247Qb qb2 : arrayList2) {
                            g gVar4 = (g) qb2.a;
                            if (a(gVar4, (a) qb2.b) != 0 && gVar4 == this.p) {
                                z = true;
                            }
                        }
                        for (size = eVar2.b.size() - 1; size >= i2; size--) {
                            g gVar5 = (g) eVar2.b.get(size);
                            gVar5.a((a) null);
                            this.c.remove(gVar5);
                        }
                        a(z);
                        for (size2 = eVar2.b.size() - 1; size2 >= i2; size2--) {
                            g gVar6 = (g) eVar2.b.remove(size2);
                            if (h.a) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Route removed: ");
                                sb4.append(gVar6);
                                Log.d(str2, sb4.toString());
                            }
                            this.i.a(258, gVar6);
                        }
                        if (h.a) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Provider changed: ");
                            sb5.append(eVar2);
                            Log.d(str2, sb5.toString());
                        }
                        this.i.a(515, eVar2);
                    }
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Ignoring invalid provider descriptor: ");
                    sb6.append(dVar2);
                    Log.w(str2, sb6.toString());
                }
                z = false;
                i2 = 0;
                while (size >= i2) {
                }
                a(z);
                while (size2 >= i2) {
                }
                if (h.a) {
                }
                this.i.a(515, eVar2);
            }
        }

        public Token d() {
            b bVar = this.t;
            if (bVar != null) {
                return bVar.b();
            }
            MediaSessionCompat mediaSessionCompat = this.v;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.getSessionToken();
            }
            return null;
        }

        private int a(g gVar, a aVar) {
            int a2 = gVar.a(aVar);
            if (a2 != 0) {
                String str = "MediaRouter";
                if ((a2 & 1) != 0) {
                    if (h.a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Route changed: ");
                        sb.append(gVar);
                        Log.d(str, sb.toString());
                    }
                    this.i.a(259, gVar);
                }
                if ((a2 & 2) != 0) {
                    if (h.a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Route volume changed: ");
                        sb2.append(gVar);
                        Log.d(str, sb2.toString());
                    }
                    this.i.a(260, gVar);
                }
                if ((a2 & 4) != 0) {
                    if (h.a) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Route presentation display changed: ");
                        sb3.append(gVar);
                        Log.d(str, sb3.toString());
                    }
                    this.i.a(261, gVar);
                }
            }
            return a2;
        }

        /* access modifiers changed from: 0000 */
        public String a(e eVar, String str) {
            return (String) this.d.get(new C0247Qb(eVar.a().flattenToShortString(), str));
        }

        /* access modifiers changed from: 0000 */
        public void a(boolean z) {
            g gVar = this.n;
            String str = "MediaRouter";
            if (gVar != null && !gVar.v()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Clearing the default route because it is no longer selectable: ");
                sb.append(this.n);
                Log.i(str, sb.toString());
                this.n = null;
            }
            if (this.n == null && !this.c.isEmpty()) {
                Iterator it = this.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    g gVar2 = (g) it.next();
                    if (b(gVar2) && gVar2.v()) {
                        this.n = gVar2;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Found default route: ");
                        sb2.append(this.n);
                        Log.i(str, sb2.toString());
                        break;
                    }
                }
            }
            g gVar3 = this.o;
            if (gVar3 != null && !gVar3.v()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Clearing the bluetooth route because it is no longer selectable: ");
                sb3.append(this.o);
                Log.i(str, sb3.toString());
                this.o = null;
            }
            if (this.o == null && !this.c.isEmpty()) {
                Iterator it2 = this.c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    g gVar4 = (g) it2.next();
                    if (c(gVar4) && gVar4.v()) {
                        this.o = gVar4;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Found bluetooth route: ");
                        sb4.append(this.o);
                        Log.i(str, sb4.toString());
                        break;
                    }
                }
            }
            g gVar5 = this.p;
            if (gVar5 == null || !gVar5.v()) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Unselecting the current route because it is no longer selectable: ");
                sb5.append(this.p);
                Log.i(str, sb5.toString());
                d(a(), 0);
            } else if (z) {
                g gVar6 = this.p;
                if (gVar6 instanceof f) {
                    List<g> y = ((f) gVar6).y();
                    HashSet hashSet = new HashSet();
                    for (g gVar7 : y) {
                        hashSet.add(gVar7.b);
                    }
                    Iterator it3 = this.r.entrySet().iterator();
                    while (it3.hasNext()) {
                        Entry entry = (Entry) it3.next();
                        if (!hashSet.contains(entry.getKey())) {
                            androidx.mediarouter.media.c.d dVar = (androidx.mediarouter.media.c.d) entry.getValue();
                            dVar.c();
                            dVar.a();
                            it3.remove();
                        }
                    }
                    for (g gVar8 : y) {
                        if (!this.r.containsKey(gVar8.b)) {
                            androidx.mediarouter.media.c.d a2 = gVar8.n().a(gVar8.b, this.p.b);
                            a2.b();
                            this.r.put(gVar8.b, a2);
                        }
                    }
                }
                i();
            }
        }

        /* access modifiers changed from: 0000 */
        public g a() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar != this.n && c(gVar) && gVar.v()) {
                    return gVar;
                }
            }
            return this.n;
        }

        public void a(String str) {
            this.i.removeMessages(262);
            int c2 = c((c) this.k);
            if (c2 >= 0) {
                e eVar = (e) this.e.get(c2);
                int a2 = eVar.a(str);
                if (a2 >= 0) {
                    ((g) eVar.b.get(a2)).x();
                }
            }
        }

        public void a(Object obj) {
            if (c(obj) < 0) {
                this.f.add(new C0018d(obj));
            }
        }

        public void a(MediaSessionCompat mediaSessionCompat) {
            this.v = mediaSessionCompat;
            int i2 = VERSION.SDK_INT;
            if (i2 >= 21) {
                a(mediaSessionCompat != null ? new b(mediaSessionCompat) : null);
            } else if (i2 >= 14) {
                MediaSessionCompat mediaSessionCompat2 = this.u;
                if (mediaSessionCompat2 != null) {
                    b(mediaSessionCompat2.getRemoteControlClient());
                    this.u.removeOnActiveChangeListener(this.w);
                }
                this.u = mediaSessionCompat;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.addOnActiveChangeListener(this.w);
                    if (mediaSessionCompat.isActive()) {
                        a(mediaSessionCompat.getRemoteControlClient());
                    }
                }
            }
        }

        private void a(b bVar) {
            b bVar2 = this.t;
            if (bVar2 != null) {
                bVar2.a();
            }
            this.t = bVar;
            if (bVar != null) {
                i();
            }
        }
    }

    /* compiled from: MediaRouter */
    public static final class e {
        final c a;
        final List<g> b = new ArrayList();
        private final C0017c c;
        private d d;

        e(c cVar) {
            this.a = cVar;
            this.c = cVar.g();
        }

        public ComponentName a() {
            return this.c.a();
        }

        public String b() {
            return this.c.b();
        }

        public c c() {
            h.a();
            return this.a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaRouter.RouteProviderInfo{ packageName=");
            sb.append(b());
            sb.append(" }");
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        public boolean a(d dVar) {
            if (this.d == dVar) {
                return false;
            }
            this.d = dVar;
            return true;
        }

        /* access modifiers changed from: 0000 */
        public int a(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (((g) this.b.get(i)).b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* compiled from: MediaRouter */
    public static class f extends g {
        private List<g> w = new ArrayList();

        f(e eVar, String str, String str2) {
            super(eVar, str, str2);
        }

        /* access modifiers changed from: 0000 */
        public int a(a aVar) {
            int i = 0;
            if (this.v != aVar) {
                this.v = aVar;
                if (aVar != null) {
                    List<String> i2 = aVar.i();
                    ArrayList arrayList = new ArrayList();
                    if (i2 == null) {
                        Log.w("MediaRouter", "groupMemberIds shouldn't be null.");
                        i = 1;
                    } else {
                        if (i2.size() != this.w.size()) {
                            i = 1;
                        }
                        for (String a : i2) {
                            g b = h.b.b(h.b.a(m(), a));
                            if (b != null) {
                                arrayList.add(b);
                                if (i == 0 && !this.w.contains(b)) {
                                    i = 1;
                                }
                            }
                        }
                    }
                    if (i != 0) {
                        this.w = arrayList;
                    }
                }
            }
            return super.b(aVar) | i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(super.toString());
            sb.append('[');
            int size = this.w.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(this.w.get(i));
            }
            sb.append(']');
            return sb.toString();
        }

        public List<g> y() {
            return this.w;
        }
    }

    /* compiled from: MediaRouter */
    public static class g {
        private final e a;
        final String b;
        final String c;
        private String d;
        private String e;
        private Uri f;
        boolean g;
        private boolean h;
        private int i;
        private boolean j;
        private final ArrayList<IntentFilter> k = new ArrayList<>();
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private Display r;
        private int s = -1;
        private Bundle t;
        private IntentSender u;
        a v;

        g(e eVar, String str, String str2) {
            this.a = eVar;
            this.b = str;
            this.c = str2;
        }

        public boolean a(g gVar) {
            if (gVar != null) {
                h.a();
                return gVar.a((List<IntentFilter>) this.k);
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        public int b() {
            return this.i;
        }

        public String c() {
            return this.e;
        }

        /* access modifiers changed from: 0000 */
        public String d() {
            return this.b;
        }

        public int e() {
            return this.n;
        }

        public Bundle f() {
            return this.t;
        }

        public Uri g() {
            return this.f;
        }

        public String h() {
            return this.c;
        }

        public String i() {
            return this.d;
        }

        public int j() {
            return this.m;
        }

        public int k() {
            return this.l;
        }

        public int l() {
            return this.s;
        }

        public e m() {
            return this.a;
        }

        public c n() {
            return this.a.c();
        }

        public int o() {
            return this.p;
        }

        public int p() {
            return this.o;
        }

        public int q() {
            return this.q;
        }

        public boolean r() {
            return this.h;
        }

        public boolean s() {
            h.a();
            return h.b.c() == this;
        }

        public boolean t() {
            if (s() || this.n == 3) {
                return true;
            }
            if (!a(this) || !a("android.media.intent.category.LIVE_AUDIO") || a("android.media.intent.category.LIVE_VIDEO")) {
                return false;
            }
            return true;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaRouter.RouteInfo{ uniqueId=");
            sb.append(this.c);
            sb.append(", name=");
            sb.append(this.d);
            sb.append(", description=");
            sb.append(this.e);
            sb.append(", iconUri=");
            sb.append(this.f);
            sb.append(", enabled=");
            sb.append(this.g);
            sb.append(", connecting=");
            sb.append(this.h);
            sb.append(", connectionState=");
            sb.append(this.i);
            sb.append(", canDisconnect=");
            sb.append(this.j);
            sb.append(", playbackType=");
            sb.append(this.l);
            sb.append(", playbackStream=");
            sb.append(this.m);
            sb.append(", deviceType=");
            sb.append(this.n);
            sb.append(", volumeHandling=");
            sb.append(this.o);
            sb.append(", volume=");
            sb.append(this.p);
            sb.append(", volumeMax=");
            sb.append(this.q);
            sb.append(", presentationDisplayId=");
            sb.append(this.s);
            sb.append(", extras=");
            sb.append(this.t);
            sb.append(", settingsIntent=");
            sb.append(this.u);
            sb.append(", providerPackageName=");
            sb.append(this.a.b());
            sb.append(" }");
            return sb.toString();
        }

        public boolean u() {
            return this.g;
        }

        /* access modifiers changed from: 0000 */
        public boolean v() {
            return this.v != null && this.g;
        }

        public boolean w() {
            h.a();
            return h.b.f() == this;
        }

        public void x() {
            h.a();
            h.b.a(this);
        }

        public void b(int i2) {
            h.a();
            if (i2 != 0) {
                h.b.b(this, i2);
            }
        }

        public boolean a(String str) {
            if (str != null) {
                h.a();
                int size = this.k.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((IntentFilter) this.k.get(i2)).hasCategory(str)) {
                        return true;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException("category must not be null");
        }

        /* access modifiers changed from: 0000 */
        public int b(a aVar) {
            this.v = aVar;
            int i2 = 0;
            if (aVar == null) {
                return 0;
            }
            if (!C0243Pb.a(this.d, aVar.n())) {
                this.d = aVar.n();
                i2 = 1;
            }
            if (!C0243Pb.a(this.e, aVar.f())) {
                this.e = aVar.f();
                i2 |= 1;
            }
            if (!C0243Pb.a(this.f, aVar.j())) {
                this.f = aVar.j();
                i2 |= 1;
            }
            if (this.g != aVar.w()) {
                this.g = aVar.w();
                i2 |= 1;
            }
            if (this.h != aVar.v()) {
                this.h = aVar.v();
                i2 |= 1;
            }
            if (this.i != aVar.d()) {
                this.i = aVar.d();
                i2 |= 1;
            }
            if (!this.k.equals(aVar.e())) {
                this.k.clear();
                this.k.addAll(aVar.e());
                i2 |= 1;
            }
            if (this.l != aVar.p()) {
                this.l = aVar.p();
                i2 |= 1;
            }
            if (this.m != aVar.o()) {
                this.m = aVar.o();
                i2 |= 1;
            }
            if (this.n != aVar.g()) {
                this.n = aVar.g();
                i2 |= 1;
            }
            if (this.o != aVar.t()) {
                this.o = aVar.t();
                i2 |= 3;
            }
            if (this.p != aVar.s()) {
                this.p = aVar.s();
                i2 |= 3;
            }
            if (this.q != aVar.u()) {
                this.q = aVar.u();
                i2 |= 3;
            }
            if (this.s != aVar.q()) {
                this.s = aVar.q();
                this.r = null;
                i2 |= 5;
            }
            if (!C0243Pb.a(this.t, aVar.h())) {
                this.t = aVar.h();
                i2 |= 1;
            }
            if (!C0243Pb.a(this.u, aVar.r())) {
                this.u = aVar.r();
                i2 |= 1;
            }
            if (this.j == aVar.b()) {
                return i2;
            }
            this.j = aVar.b();
            return i2 | 5;
        }

        private static boolean a(g gVar) {
            return TextUtils.equals(gVar.n().g().b(), "android");
        }

        public boolean a() {
            return this.j;
        }

        public void a(int i2) {
            h.a();
            h.b.a(this, Math.min(this.q, Math.max(0, i2)));
        }

        /* access modifiers changed from: 0000 */
        public int a(a aVar) {
            if (this.v != aVar) {
                return b(aVar);
            }
            return 0;
        }
    }

    h(Context context) {
        this.c = context;
    }

    public static h a(Context context) {
        if (context != null) {
            a();
            if (b == null) {
                b = new d(context.getApplicationContext());
                b.g();
            }
            return b.a(context);
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public g b() {
        a();
        return b.c();
    }

    public Token c() {
        return b.d();
    }

    public List<g> d() {
        a();
        return b.e();
    }

    public g e() {
        a();
        return b.f();
    }

    private int b(a aVar) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            if (((b) this.d.get(i)).b == aVar) {
                return i;
            }
        }
        return -1;
    }

    public void a(g gVar) {
        if (gVar != null) {
            a();
            if (a) {
                StringBuilder sb = new StringBuilder();
                sb.append("selectRoute: ");
                sb.append(gVar);
                Log.d("MediaRouter", sb.toString());
            }
            b.a(gVar);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }

    public void a(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        a();
        g a2 = b.a();
        if (b.f() != a2) {
            b.c(a2, i);
            return;
        }
        d dVar = b;
        dVar.c(dVar.c(), i);
    }

    public boolean a(g gVar, int i) {
        if (gVar != null) {
            a();
            return b.a(gVar, i);
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public void a(g gVar, a aVar) {
        a(gVar, aVar, 0);
    }

    public void a(g gVar, a aVar, int i) {
        b bVar;
        if (gVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (aVar != null) {
            a();
            if (a) {
                StringBuilder sb = new StringBuilder();
                sb.append("addCallback: selector=");
                sb.append(gVar);
                sb.append(", callback=");
                sb.append(aVar);
                sb.append(", flags=");
                sb.append(Integer.toHexString(i));
                Log.d("MediaRouter", sb.toString());
            }
            int b2 = b(aVar);
            if (b2 < 0) {
                bVar = new b(this, aVar);
                this.d.add(bVar);
            } else {
                bVar = (b) this.d.get(b2);
            }
            boolean z = false;
            int i2 = bVar.d;
            if (((~i2) & i) != 0) {
                bVar.d = i2 | i;
                z = true;
            }
            if (!bVar.c.a(gVar)) {
                androidx.mediarouter.media.g.a aVar2 = new androidx.mediarouter.media.g.a(bVar.c);
                aVar2.a(gVar);
                bVar.c = aVar2.a();
                z = true;
            }
            if (z) {
                b.h();
            }
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    public void a(a aVar) {
        if (aVar != null) {
            a();
            if (a) {
                StringBuilder sb = new StringBuilder();
                sb.append("removeCallback: callback=");
                sb.append(aVar);
                Log.d("MediaRouter", sb.toString());
            }
            int b2 = b(aVar);
            if (b2 >= 0) {
                this.d.remove(b2);
                b.h();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void a(MediaSessionCompat mediaSessionCompat) {
        if (a) {
            StringBuilder sb = new StringBuilder();
            sb.append("addMediaSessionCompat: ");
            sb.append(mediaSessionCompat);
            Log.d("MediaRouter", sb.toString());
        }
        b.a(mediaSessionCompat);
    }

    static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }
}
