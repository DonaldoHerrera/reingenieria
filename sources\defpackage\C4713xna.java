package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\u0019\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0012J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0012J\b\u0010\u0011\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/soundcloud/android/playback/players/volume/FadeHelper;", "", "listener", "Lcom/soundcloud/android/playback/players/volume/FadeHelper$Listener;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/playback/players/volume/FadeHelper$Listener;Lio/reactivex/Scheduler;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "fade", "", "request", "Lcom/soundcloud/android/playback/players/volume/FadeRequest;", "finishWithVolume", "volume", "", "start", "stop", "Companion", "Factory", "FadeObserver", "Listener", "players_release"}, mv = {1, 1, 15})
/* renamed from: xna reason: default package and case insensitive filesystem */
/* compiled from: FadeHelper.kt */
public class C4713xna {
    public static final a a = new a(null);
    private VPa b;
    /* access modifiers changed from: private */
    public final d c;
    private final HPa d;

    /* renamed from: xna$a */
    /* compiled from: FadeHelper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: xna$b */
    /* compiled from: FadeHelper.kt */
    public static class b {
        public C4713xna a(d dVar) {
            C7471uYa.b(dVar, CastExtraArgs.LISTENER);
            return new C4713xna(dVar, null, 2, null);
        }
    }

    /* renamed from: xna$c */
    /* compiled from: FadeHelper.kt */
    private final class c extends OUa<Float> {
        public c() {
        }

        public /* bridge */ /* synthetic */ void a(Object obj) {
            a(((Number) obj).floatValue());
        }

        public void onComplete() {
            C4713xna.this.c.a();
            dispose();
        }

        public void a(float f) {
            C4713xna.this.c.a(f);
        }

        public void a(Throwable th) {
            C7471uYa.b(th, "throwable");
            dispose();
        }
    }

    /* renamed from: xna$d */
    /* compiled from: FadeHelper.kt */
    public interface d {
        void a();

        void a(float f);
    }

    public C4713xna(d dVar, HPa hPa) {
        C7471uYa.b(dVar, CastExtraArgs.LISTENER);
        C7471uYa.b(hPa, "scheduler");
        this.c = dVar;
        this.d = hPa;
        VPa a2 = WPa.a();
        C7471uYa.a((Object) a2, "Disposables.disposed()");
        this.b = a2;
    }

    private void b(Ana ana) {
        GPa c2 = APa.a(Math.max(0, -ana.c()), 10, TimeUnit.MILLISECONDS, this.d).d((long) ((int) (Math.ceil((((double) ana.a()) - ((double) Math.max(0, ana.c()))) / ((double) 10)) + ((double) 1)))).h(new C4722yna(ana)).c(new c());
        C7471uYa.a((Object) c2, "Observable\n             …cribeWith(FadeObserver())");
        this.b = (VPa) c2;
    }

    public void a() {
        if (!this.b.a()) {
            this.c.a();
            this.b.dispose();
        }
    }

    public /* synthetic */ C4713xna(d dVar, HPa hPa, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            hPa = C6645iVa.a();
            C7471uYa.a((Object) hPa, "Schedulers.computation()");
        }
        this(dVar, hPa);
    }

    public void a(Ana ana) {
        C7471uYa.b(ana, "request");
        if (ana.a() > 0) {
            a();
            b(ana);
            return;
        }
        a(ana.b());
    }

    private void a(float f) {
        this.c.a(f);
        this.c.a();
    }
}
