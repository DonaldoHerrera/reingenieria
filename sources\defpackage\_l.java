package defpackage;

import android.view.Surface;
import com.google.android.exoplayer2.C0618s;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.X;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.s.b;
import com.google.android.exoplayer2.source.s.c;
import com.google.android.exoplayer2.trackselection.m;
import java.io.IOException;

/* renamed from: _l reason: default package */
/* compiled from: AnalyticsListener */
public interface _l {

    /* renamed from: _l$a */
    /* compiled from: AnalyticsListener */
    public static final class a {
        public final long a;
        public final X b;
        public final int c;
        public final com.google.android.exoplayer2.source.r.a d;
        public final long e;
        public final long f;
        public final long g;

        public a(long j, X x, int i, com.google.android.exoplayer2.source.r.a aVar, long j2, long j3, long j4) {
            this.a = j;
            this.b = x;
            this.c = i;
            this.d = aVar;
            this.e = j2;
            this.f = j3;
            this.g = j4;
        }
    }

    void a(a aVar);

    void a(a aVar, float f);

    void a(a aVar, int i);

    void a(a aVar, int i, int i2);

    void a(a aVar, int i, int i2, int i3, float f);

    void a(a aVar, int i, long j);

    void a(a aVar, int i, long j, long j2);

    void a(a aVar, int i, Pm pm);

    void a(a aVar, int i, Format format);

    void a(a aVar, int i, String str, long j);

    void a(a aVar, Surface surface);

    void a(a aVar, J j);

    void a(a aVar, Metadata metadata);

    void a(a aVar, C0618s sVar);

    void a(a aVar, TrackGroupArray trackGroupArray, m mVar);

    void a(a aVar, b bVar, c cVar);

    void a(a aVar, b bVar, c cVar, IOException iOException, boolean z);

    void a(a aVar, c cVar);

    void a(a aVar, Exception exc);

    void a(a aVar, boolean z);

    void a(a aVar, boolean z, int i);

    void b(a aVar);

    void b(a aVar, int i);

    void b(a aVar, int i, long j, long j2);

    void b(a aVar, int i, Pm pm);

    void b(a aVar, b bVar, c cVar);

    void c(a aVar);

    void c(a aVar, int i);

    void c(a aVar, b bVar, c cVar);

    void d(a aVar);

    void e(a aVar);

    void f(a aVar);

    void g(a aVar);

    void h(a aVar);

    void i(a aVar);
}
