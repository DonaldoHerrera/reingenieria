package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.X;
import java.io.IOException;

/* compiled from: MediaSource */
public interface r {

    /* compiled from: MediaSource */
    public static final class a {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public a(Object obj) {
            this(obj, -1);
        }

        public boolean a() {
            return this.b != -1;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!(this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return ((((((((527 + this.a.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
        }

        public a(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public a(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public a(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, -1);
        }

        private a(Object obj, int i, int i2, long j, int i3) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = i3;
        }
    }

    /* compiled from: MediaSource */
    public interface b {
        void a(r rVar, X x, Object obj);
    }

    q a(a aVar, Sp sp, long j);

    void a() throws IOException;

    void a(Handler handler, s sVar);

    void a(q qVar);

    void a(b bVar);

    void a(b bVar, C1702sq sqVar);

    void a(s sVar);
}
