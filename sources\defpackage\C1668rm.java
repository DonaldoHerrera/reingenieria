package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.Format;

/* renamed from: rm reason: default package and case insensitive filesystem */
/* compiled from: AudioRendererEventListener */
public interface C1668rm {

    /* renamed from: rm$a */
    /* compiled from: AudioRendererEventListener */
    public static final class a {
        private final Handler a;
        private final C1668rm b;

        public a(Handler handler, C1668rm rmVar) {
            Handler handler2;
            if (rmVar != null) {
                C1852xq.a(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.a = handler2;
            this.b = rmVar;
        }

        public void a(String str, long j, long j2) {
            if (this.b != null) {
                Handler handler = this.a;
                C0497bm bmVar = new C0497bm(this, str, j, j2);
                handler.post(bmVar);
            }
        }

        public void b(Pm pm) {
            if (this.b != null) {
                this.a.post(new C0528cm(this, pm));
            }
        }

        public /* synthetic */ void c(Pm pm) {
            pm.a();
            this.b.c(pm);
        }

        public /* synthetic */ void d(Pm pm) {
            this.b.a(pm);
        }

        public void a(Format format) {
            if (this.b != null) {
                this.a.post(new C0312am(this, format));
            }
        }

        public /* synthetic */ void b(String str, long j, long j2) {
            this.b.b(str, j, j2);
        }

        public /* synthetic */ void b(Format format) {
            this.b.b(format);
        }

        public void a(int i, long j, long j2) {
            if (this.b != null) {
                Handler handler = this.a;
                C1300fm fmVar = new C1300fm(this, i, j, j2);
                handler.post(fmVar);
            }
        }

        public /* synthetic */ void b(int i, long j, long j2) {
            this.b.a(i, j, j2);
        }

        public /* synthetic */ void b(int i) {
            this.b.a(i);
        }

        public void a(Pm pm) {
            pm.a();
            if (this.b != null) {
                this.a.post(new C1269em(this, pm));
            }
        }

        public void a(int i) {
            if (this.b != null) {
                this.a.post(new C1239dm(this, i));
            }
        }
    }

    void a(int i);

    void a(int i, long j, long j2);

    void a(Pm pm);

    void b(Format format);

    void b(String str, long j, long j2);

    void c(Pm pm);
}
