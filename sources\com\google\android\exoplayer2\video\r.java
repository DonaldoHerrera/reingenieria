package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;

/* compiled from: VideoRendererEventListener */
public interface r {

    /* compiled from: VideoRendererEventListener */
    public static final class a {
        private final Handler a;
        private final r b;

        public a(Handler handler, r rVar) {
            Handler handler2;
            if (rVar != null) {
                C1852xq.a(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.a = handler2;
            this.b = rVar;
        }

        public void a(String str, long j, long j2) {
            if (this.b != null) {
                Handler handler = this.a;
                d dVar = new d(this, str, j, j2);
                handler.post(dVar);
            }
        }

        public void b(Pm pm) {
            if (this.b != null) {
                this.a.post(new e(this, pm));
            }
        }

        public /* synthetic */ void c(Pm pm) {
            pm.a();
            this.b.b(pm);
        }

        public /* synthetic */ void d(Pm pm) {
            this.b.d(pm);
        }

        public void a(Format format) {
            if (this.b != null) {
                this.a.post(new a(this, format));
            }
        }

        public /* synthetic */ void b(String str, long j, long j2) {
            this.b.a(str, j, j2);
        }

        public /* synthetic */ void b(Format format) {
            this.b.a(format);
        }

        public void a(int i, long j) {
            if (this.b != null) {
                this.a.post(new g(this, i, j));
            }
        }

        public /* synthetic */ void b(int i, long j) {
            this.b.a(i, j);
        }

        public void b(int i, int i2, int i3, float f) {
            if (this.b != null) {
                Handler handler = this.a;
                c cVar = new c(this, i, i2, i3, f);
                handler.post(cVar);
            }
        }

        public /* synthetic */ void a(int i, int i2, int i3, float f) {
            this.b.a(i, i2, i3, f);
        }

        public /* synthetic */ void a(Surface surface) {
            this.b.a(surface);
        }

        public void b(Surface surface) {
            if (this.b != null) {
                this.a.post(new b(this, surface));
            }
        }

        public void a(Pm pm) {
            pm.a();
            if (this.b != null) {
                this.a.post(new f(this, pm));
            }
        }
    }

    void a(int i, int i2, int i3, float f);

    void a(int i, long j);

    void a(Surface surface);

    void a(Format format);

    void a(String str, long j, long j2);

    void b(Pm pm);

    void d(Pm pm);
}
