package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.C0615o;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MediaSourceEventListener */
public interface s {

    /* compiled from: MediaSourceEventListener */
    public static final class a {
        public final int a;
        public final com.google.android.exoplayer2.source.r.a b;
        private final CopyOnWriteArrayList<C0034a> c;
        private final long d;

        /* renamed from: com.google.android.exoplayer2.source.s$a$a reason: collision with other inner class name */
        /* compiled from: MediaSourceEventListener */
        private static final class C0034a {
            public final Handler a;
            public final s b;

            public C0034a(Handler handler, s sVar) {
                this.a = handler;
                this.b = sVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0);
        }

        public a a(int i, com.google.android.exoplayer2.source.r.a aVar, long j) {
            a aVar2 = new a(this.c, i, aVar, j);
            return aVar2;
        }

        public void b() {
            com.google.android.exoplayer2.source.r.a aVar = this.b;
            C1852xq.a(aVar);
            com.google.android.exoplayer2.source.r.a aVar2 = aVar;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0034a aVar3 = (C0034a) it.next();
                a(aVar3.a, (Runnable) new h(this, aVar3.b, aVar2));
            }
        }

        public void c(b bVar, c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0034a aVar = (C0034a) it.next();
                a(aVar.a, (Runnable) new g(this, aVar.b, bVar, cVar));
            }
        }

        private a(CopyOnWriteArrayList<C0034a> copyOnWriteArrayList, int i, com.google.android.exoplayer2.source.r.a aVar, long j) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = aVar;
            this.d = j;
        }

        public void a(Handler handler, s sVar) {
            C1852xq.a((handler == null || sVar == null) ? false : true);
            this.c.add(new C0034a(handler, sVar));
        }

        public void a(s sVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0034a aVar = (C0034a) it.next();
                if (aVar.b == sVar) {
                    this.c.remove(aVar);
                }
            }
        }

        public /* synthetic */ void c(s sVar, b bVar, c cVar) {
            sVar.a(this.a, this.b, bVar, cVar);
        }

        public /* synthetic */ void b(s sVar, com.google.android.exoplayer2.source.r.a aVar) {
            sVar.c(this.a, aVar);
        }

        public void c() {
            com.google.android.exoplayer2.source.r.a aVar = this.b;
            C1852xq.a(aVar);
            com.google.android.exoplayer2.source.r.a aVar2 = aVar;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0034a aVar3 = (C0034a) it.next();
                a(aVar3.a, (Runnable) new f(this, aVar3.b, aVar2));
            }
        }

        public void b(C0470aq aqVar, Uri uri, Map<String, List<String>> map, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            b bVar = new b(aqVar, uri, map, j3, j4, j5);
            c cVar = new c(i, i2, format, i3, obj, a(j), a(j2));
            b(bVar, cVar);
        }

        public void a() {
            com.google.android.exoplayer2.source.r.a aVar = this.b;
            C1852xq.a(aVar);
            com.google.android.exoplayer2.source.r.a aVar2 = aVar;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0034a aVar3 = (C0034a) it.next();
                a(aVar3.a, (Runnable) new e(this, aVar3.b, aVar2));
            }
        }

        public /* synthetic */ void c(s sVar, com.google.android.exoplayer2.source.r.a aVar) {
            sVar.b(this.a, aVar);
        }

        public void b(b bVar, c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0034a aVar = (C0034a) it.next();
                a(aVar.a, (Runnable) new d(this, aVar.b, bVar, cVar));
            }
        }

        public /* synthetic */ void a(s sVar, com.google.android.exoplayer2.source.r.a aVar) {
            sVar.a(this.a, aVar);
        }

        public void a(C0470aq aqVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
            C0470aq aqVar2 = aqVar;
            b bVar = new b(aqVar2, aqVar2.a, Collections.emptyMap(), j3, 0, 0);
            c cVar = new c(i, i2, format, i3, obj, a(j), a(j2));
            c(bVar, cVar);
        }

        public /* synthetic */ void b(s sVar, b bVar, c cVar) {
            sVar.b(this.a, this.b, bVar, cVar);
        }

        public void a(C0470aq aqVar, Uri uri, Map<String, List<String>> map, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            b bVar = new b(aqVar, uri, map, j3, j4, j5);
            c cVar = new c(i, i2, format, i3, obj, a(j), a(j2));
            a(bVar, cVar);
        }

        public void a(b bVar, c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0034a aVar = (C0034a) it.next();
                a(aVar.a, (Runnable) new C0620b(this, aVar.b, bVar, cVar));
            }
        }

        public /* synthetic */ void a(s sVar, b bVar, c cVar) {
            sVar.c(this.a, this.b, bVar, cVar);
        }

        public void a(C0470aq aqVar, Uri uri, Map<String, List<String>> map, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            b bVar = new b(aqVar, uri, map, j3, j4, j5);
            c cVar = new c(i, i2, format, i3, obj, a(j), a(j2));
            a(bVar, cVar, iOException, z);
        }

        public void a(b bVar, c cVar, IOException iOException, boolean z) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0034a aVar = (C0034a) it.next();
                s sVar = aVar.b;
                Handler handler = aVar.a;
                C0619a aVar2 = new C0619a(this, sVar, bVar, cVar, iOException, z);
                a(handler, (Runnable) aVar2);
            }
        }

        public /* synthetic */ void a(s sVar, b bVar, c cVar, IOException iOException, boolean z) {
            sVar.a(this.a, this.b, bVar, cVar, iOException, z);
        }

        public void a(int i, Format format, int i2, Object obj, long j) {
            c cVar = new c(1, i, format, i2, obj, a(j), -9223372036854775807L);
            a(cVar);
        }

        public void a(c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0034a aVar = (C0034a) it.next();
                a(aVar.a, (Runnable) new C0621c(this, aVar.b, cVar));
            }
        }

        public /* synthetic */ void a(s sVar, c cVar) {
            sVar.a(this.a, this.b, cVar);
        }

        private long a(long j) {
            long b2 = C0615o.b(j);
            if (b2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + b2;
        }

        private void a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* compiled from: MediaSourceEventListener */
    public static final class b {
        public final C0470aq a;
        public final Uri b;
        public final Map<String, List<String>> c;
        public final long d;
        public final long e;
        public final long f;

        public b(C0470aq aqVar, Uri uri, Map<String, List<String>> map, long j, long j2, long j3) {
            this.a = aqVar;
            this.b = uri;
            this.c = map;
            this.d = j;
            this.e = j2;
            this.f = j3;
        }
    }

    /* compiled from: MediaSourceEventListener */
    public static final class c {
        public final int a;
        public final int b;
        public final Format c;
        public final int d;
        public final Object e;
        public final long f;
        public final long g;

        public c(int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            this.a = i;
            this.b = i2;
            this.c = format;
            this.d = i3;
            this.e = obj;
            this.f = j;
            this.g = j2;
        }
    }

    void a(int i, com.google.android.exoplayer2.source.r.a aVar);

    void a(int i, com.google.android.exoplayer2.source.r.a aVar, b bVar, c cVar);

    void a(int i, com.google.android.exoplayer2.source.r.a aVar, b bVar, c cVar, IOException iOException, boolean z);

    void a(int i, com.google.android.exoplayer2.source.r.a aVar, c cVar);

    void b(int i, com.google.android.exoplayer2.source.r.a aVar);

    void b(int i, com.google.android.exoplayer2.source.r.a aVar, b bVar, c cVar);

    void c(int i, com.google.android.exoplayer2.source.r.a aVar);

    void c(int i, com.google.android.exoplayer2.source.r.a aVar, b bVar, c cVar);
}
