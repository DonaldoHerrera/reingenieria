package com.soundcloud.android.player.ui.waveform;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import java.lang.ref.WeakReference;
import java.util.BitSet;
import java.util.List;
import java.util.Set;

@EVa(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0002abBC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0010\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020\bH\u0016J\u0010\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u0013H\u0012J\b\u0010A\u001a\u00020\bH\u0016J\b\u0010B\u001a\u00020\bH\u0016J\b\u0010C\u001a\u00020\bH\u0016J\u0010\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020.H\u0016J\u0010\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\u0013H\u0016J\b\u0010H\u001a\u00020\bH\u0016J\u0016\u0010I\u001a\u00020\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u0018\u0010K\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0012J\b\u0010L\u001a\u00020\bH\u0016J\u0010\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020OH\u0016J&\u0010P\u001a\u00020\b2\f\u00107\u001a\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u0018H\u0016J\b\u0010U\u001a\u00020\bH\u0016J\b\u0010V\u001a\u00020\bH\u0012J\b\u0010W\u001a\u00020\bH\u0012J\u0010\u0010X\u001a\u00020\b2\u0006\u0010Y\u001a\u00020$H\u0012J\u0010\u0010Z\u001a\u00020\b2\u0006\u0010[\u001a\u00020\\H\u0012J\u001c\u0010]\u001a\b\u0012\u0004\u0012\u0002090^2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040`H\u0016R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X.¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020.8RX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u000e\u00101\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020'X.¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u000e¢\u0006\u0002\n\u0000R\u0016\u00107\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020.X\u0004¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lcom/soundcloud/android/player/ui/waveform/WaveformViewController;", "Lcom/soundcloud/android/player/ui/PlayStateAware;", "Lcom/soundcloud/android/player/ui/waveform/WaveformView$OnWidthChangedListener;", "waveformView", "Lcom/soundcloud/android/player/ui/waveform/WaveformView;", "seeker", "Lkotlin/Function1;", "", "", "animationControllerFactory", "Lcom/soundcloud/android/player/ui/progress/ProgressController$Factory;", "scrubControllerFactory", "Lcom/soundcloud/android/player/ui/progress/ScrubController$Factory;", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/player/ui/waveform/WaveformView;Lkotlin/jvm/functions/Function1;Lcom/soundcloud/android/player/ui/progress/ProgressController$Factory;Lcom/soundcloud/android/player/ui/progress/ScrubController$Factory;Lcom/soundcloud/android/rx/observers/ObserverFactory;Lio/reactivex/Scheduler;)V", "adjustedWidth", "", "allProgressControllers", "", "Lcom/soundcloud/android/player/ui/progress/ProgressController;", "canShow", "", "commentsSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "Lcom/soundcloud/android/foundation/domain/comments/CommentWithAuthor;", "createState", "Ljava/util/BitSet;", "dragProgressController", "fullDuration", "isCollapsed", "isWaveformLoaded", "latestPlayState", "Lcom/soundcloud/android/player/ui/PlayerPlayState;", "leftProgressController", "leftProgressHelper", "Lcom/soundcloud/android/player/ui/progress/TranslateXHelper;", "getMainThreadScheduler", "()Lio/reactivex/Scheduler;", "getObserverFactory", "()Lcom/soundcloud/android/rx/observers/ObserverFactory;", "playDuration", "playableProportion", "", "getPlayableProportion", "()F", "rightProgressController", "rightProgressHelper", "scrubController", "Lcom/soundcloud/android/player/ui/progress/ScrubController;", "waveformDisposable", "Lio/reactivex/disposables/Disposable;", "waveformObservable", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/player/ui/waveform/WaveformDataWithComments;", "waveformWidthRatio", "addScrubListener", "listener", "Lcom/soundcloud/android/player/ui/progress/ScrubController$OnScrubListener;", "clearWaveform", "createWaveforms", "flag", "hide", "onBackground", "onForeground", "onPlayerSlide", "value", "onWaveformViewWidthChanged", "newWidth", "setCollapsed", "setComments", "comments", "setDurations", "setExpanded", "setState", "trackPageState", "Lcom/soundcloud/android/player/ui/ViewPlaybackState;", "setWaveform", "Lio/reactivex/Single;", "Lcom/soundcloud/android/player/ui/waveform/WaveformData;", "duration", "isForeground", "show", "showIdleState", "showWaveform", "updateLatestPlayState", "playerPlayState", "updateLatestProgress", "playerProgressState", "Lcom/soundcloud/android/player/ui/PlayerViewProgressState;", "waveformObserver", "Lio/reactivex/observers/ResourceObserver;", "waveformViewRef", "Ljava/lang/ref/WeakReference;", "Companion", "Factory", "player-ui-components_release"}, mv = {1, 1, 15})
/* compiled from: WaveformViewController.kt */
public class h implements Hna, com.soundcloud.android.player.ui.waveform.WaveformView.b {
    private static final BitSet a = b.a(5);
    public static final a b = new a(null);
    private final BitSet c = new BitSet(5);
    private final float d = this.v.getWidthRatio();
    private final _na e;
    private final _na f;
    private final _na g;
    private final List<_na> h;
    private final goa i;
    private boolean j;
    private boolean k;
    private moa l;
    private moa m;
    private APa<d> n;
    private VPa o;
    /* access modifiers changed from: private */
    public int p;
    /* access modifiers changed from: private */
    public boolean q;
    /* access modifiers changed from: private */
    public Jna r;
    private long s;
    private long t;
    /* access modifiers changed from: private */
    public final C6713jVa<Set<C3799jda>> u;
    /* access modifiers changed from: private */
    public final WaveformView v;
    private final C5606ava w;
    private final HPa x;

    /* compiled from: WaveformViewController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        /* access modifiers changed from: private */
        public final BitSet a(int i) {
            BitSet bitSet = new BitSet(i);
            bitSet.set(0, i);
            return bitSet;
        }
    }

    /* compiled from: WaveformViewController.kt */
    public static class b {
        private final c a;
        private final defpackage._na.b b;
        private final C5606ava c;
        private final HPa d;

        public b(c cVar, defpackage._na.b bVar, C5606ava ava, HPa hPa) {
            C7471uYa.b(cVar, "scrubControllerFactory");
            C7471uYa.b(bVar, "animationControllerFactory");
            C7471uYa.b(ava, "observerFactory");
            C7471uYa.b(hPa, "scheduler");
            this.a = cVar;
            this.b = bVar;
            this.c = ava;
            this.d = hPa;
        }

        public h a(WaveformView waveformView, _Xa<? super Long, RVa> _xa) {
            C7471uYa.b(waveformView, "waveformView");
            C7471uYa.b(_xa, "seeker");
            h hVar = new h(waveformView, _xa, this.b, this.a, this.c, this.d);
            return hVar;
        }
    }

    public h(WaveformView waveformView, _Xa<? super Long, RVa> _xa, defpackage._na.b bVar, c cVar, C5606ava ava, HPa hPa) {
        C7471uYa.b(waveformView, "waveformView");
        C7471uYa.b(_xa, "seeker");
        C7471uYa.b(bVar, "animationControllerFactory");
        C7471uYa.b(cVar, "scrubControllerFactory");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(hPa, "mainThreadScheduler");
        this.v = waveformView;
        this.w = ava;
        this.x = hPa;
        defpackage._na.b bVar2 = bVar;
        this.e = defpackage._na.b.a(bVar2, this.v.getLeftWaveform(), false, false, 6, null);
        this.f = defpackage._na.b.a(bVar2, this.v.getRightWaveform(), false, false, 6, null);
        this.g = defpackage._na.b.a(bVar2, this.v.getDragViewHolder(), false, false, 4, null);
        this.h = C6918mWa.b((Object[]) new _na[]{this.e, this.f, this.g});
        this.i = cVar.a(this.v.getDragViewHolder(), _xa);
        this.k = true;
        this.o = C4881Eua.b();
        C6713jVa<Set<C3799jda>> f2 = C6713jVa.f(SWa.a());
        C7471uYa.a((Object) f2, "BehaviorSubject.createDefault(emptySet())");
        this.u = f2;
        this.c.set(4);
        this.v.setOnWidthChangedListener(this);
    }

    /* access modifiers changed from: private */
    public float j() {
        long j2 = this.t;
        if (j2 > 0) {
            long j3 = this.s;
            if (j3 > 0) {
                return ((float) j2) / ((float) j3);
            }
        }
        return 1.0f;
    }

    private void k() {
        this.v.d();
        this.v.b();
    }

    private void l() {
        if (this.q) {
            this.v.c();
        } else {
            this.v.d();
        }
    }

    public void f() {
        b(0);
    }

    public void g() {
        this.j = true;
        this.c.clear(2);
        this.v.setVisibility(8);
    }

    public void h() {
        this.j = false;
        b(2);
        if (this.k) {
            this.v.setVisibility(0);
        }
    }

    public void i() {
        this.k = true;
        if (!this.j) {
            this.v.setVisibility(0);
        }
    }

    public void setState(Nna nna) {
        C7471uYa.b(nna, "trackPageState");
        if (nna.e()) {
            this.v.a(((float) nna.a()) / ((float) nna.c().c()));
        } else {
            this.v.a();
        }
        a(nna.c());
        for (_na a2 : this.h) {
            a2.a(nna);
        }
        a(nna.b());
    }

    public HPa b() {
        return this.x;
    }

    public C5606ava c() {
        return this.w;
    }

    public void d() {
        this.k = false;
        this.v.setVisibility(8);
    }

    public void e() {
        this.c.clear(0);
        this.c.set(4);
    }

    private void a(Kna kna) {
        if (kna.d() != this.t || kna.c() != this.s) {
            a(kna.d(), kna.c());
        }
    }

    private void b(int i2) {
        this.c.set(i2);
        if (C7471uYa.a((Object) this.c, (Object) a)) {
            this.o.dispose();
            APa<d> aPa = this.n;
            if (aPa != null) {
                GPa c2 = aPa.a(b()).c(a(new WeakReference<>(this.v)));
                C7471uYa.a((Object) c2, "requireNotNull(waveformO…Reference(waveformView)))");
                this.o = (VPa) c2;
                this.c.clear(4);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private void a(Jna jna) {
        if (this.r != jna) {
            int i2 = i.a[jna.ordinal()];
            if (i2 == 1) {
                k();
            } else if (i2 == 2) {
                l();
            } else if (i2 == 3) {
                l();
            }
            this.r = jna;
        }
        if (jna == Jna.IDLE) {
            this.v.d();
        }
    }

    public void a(int i2) {
        this.p = (int) (this.d * ((float) i2));
        this.v.b(this.p, j());
        int i3 = i2 / 2;
        this.v.a(i3, 0);
        this.l = new moa(i3, i3 - this.p);
        _na _na = this.e;
        moa moa = this.l;
        if (moa != null) {
            _na.a((doa) moa);
            this.m = new moa(0, -this.p);
            _na _na2 = this.f;
            moa moa2 = this.m;
            if (moa2 != null) {
                _na2.a((doa) moa2);
                foa foa = new foa(0, this.p);
                this.g.a((doa) foa);
                this.i.a((doa) foa);
                b(1);
                return;
            }
            C7471uYa.b("rightProgressHelper");
            throw null;
        }
        C7471uYa.b("leftProgressHelper");
        throw null;
    }

    public void a(IPa<b> iPa, long j2, boolean z) {
        C7471uYa.b(iPa, "waveformObservable");
        this.n = iPa.d((C7118pQa<? super T, ? extends EPa<? extends R>>) new k<Object,Object>(this, j2));
        this.c.set(4);
        b(3);
        if (z) {
            f();
        } else {
            e();
        }
    }

    public void a() {
        this.u.a(SWa.a());
        this.o.dispose();
        this.n = null;
        this.q = false;
        this.c.clear(3);
    }

    public void a(float f2) {
        int i2 = 0;
        this.j = false;
        if (this.k) {
            WaveformView waveformView = this.v;
            if (f2 <= ((float) 0)) {
                i2 = 8;
            }
            waveformView.setVisibility(i2);
        }
    }

    private void a(long j2, long j3) {
        this.t = j2;
        this.s = j3;
        this.i.a(j3);
        this.v.a(this.p, j());
    }

    public void a(d dVar) {
        C7471uYa.b(dVar, CastExtraArgs.LISTENER);
        this.i.a(dVar);
    }

    public SUa<d> a(WeakReference<WaveformView> weakReference) {
        C7471uYa.b(weakReference, "waveformViewRef");
        return c().b(new l(this, weakReference));
    }

    public void a(Set<C3799jda> set) {
        C7471uYa.b(set, "comments");
        this.u.a(set);
    }
}
