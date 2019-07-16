package defpackage;

import android.os.Handler;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.player.ui.waveform.WaveformScrollView;
import java.util.LinkedHashSet;
import java.util.Set;

@EVa(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 +2\u00020\u0001:\u0005+,-./B+\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0015H\u0016J\u0015\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0017H\u0010¢\u0006\u0002\b#J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0017H\u0016J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u001cH\u0012R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\r8RX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/soundcloud/android/player/ui/progress/ScrubController;", "", "scrubView", "Lcom/soundcloud/android/player/ui/waveform/WaveformScrollView;", "seeker", "Lkotlin/Function1;", "", "", "seekHandlerFactory", "Lcom/soundcloud/android/player/ui/progress/SeekHandler$Factory;", "(Lcom/soundcloud/android/player/ui/waveform/WaveformScrollView;Lkotlin/jvm/functions/Function1;Lcom/soundcloud/android/player/ui/progress/SeekHandler$Factory;)V", "fullDuration", "isDragging", "", "isDragging$player_ui_components_release", "()Z", "setDragging$player_ui_components_release", "(Z)V", "isScrubbing", "listeners", "", "Lcom/soundcloud/android/player/ui/progress/ScrubController$OnScrubListener;", "pendingSeek", "", "Ljava/lang/Float;", "progressHelper", "Lcom/soundcloud/android/player/ui/progress/ProgressHelper;", "scrubState", "Lcom/soundcloud/android/player/ui/ScrubState;", "seekHandler", "Landroid/os/Handler;", "addScrubListener", "listener", "finishSeek", "seekPercentage", "finishSeek$player_ui_components_release", "setFullDuration", "duration", "setPendingSeek", "seekPos", "setProgressHelper", "setScrubState", "newState", "Companion", "DirectionAwareScrubListener", "Factory", "OnScrubListener", "ScrollViewListener", "player-ui-components_release"}, mv = {1, 1, 15})
/* renamed from: goa reason: default package */
/* compiled from: ScrubController.kt */
public class goa {
    /* access modifiers changed from: private */
    public static final int a = 0;
    /* access modifiers changed from: private */
    public static final long b = b;
    public static final a c = new a(null);
    /* access modifiers changed from: private */
    public final Handler d;
    /* access modifiers changed from: private */
    public final Set<d> e = new LinkedHashSet();
    /* access modifiers changed from: private */
    public doa f;
    /* access modifiers changed from: private */
    public Float g;
    private Mna h;
    private boolean i;
    private long j;
    private final _Xa<Long, RVa> k;

    /* renamed from: goa$a */
    /* compiled from: ScrubController.kt */
    public static final class a {
        private a() {
        }

        public final int a() {
            return goa.a;
        }

        public final long b() {
            return goa.b;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    @EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH$J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/player/ui/progress/ScrubController$DirectionAwareScrubListener;", "Lcom/soundcloud/android/player/ui/progress/ScrubController$OnScrubListener;", "()V", "initialScrubPosition", "", "latestScrubPosition", "shouldRecordInitialScrubPosition", "", "displayScrubPosition", "", "scrubPosition", "boundedScrubPosition", "onScrubComplete", "direction", "Lcom/soundcloud/android/player/ui/progress/ScrubController$DirectionAwareScrubListener$Direction;", "scrubStateChanged", "newScrubState", "Lcom/soundcloud/android/player/ui/ScrubState;", "Direction", "player-ui-components_release"}, mv = {1, 1, 15})
    /* renamed from: goa$b */
    /* compiled from: ScrubController.kt */
    public static abstract class b implements d {
        private float a;
        private float b;
        private boolean c;

        /* renamed from: goa$b$a */
        /* compiled from: ScrubController.kt */
        public enum a {
            BACKWARD,
            FORWARD
        }

        public void a(Mna mna) {
            C7471uYa.b(mna, "newScrubState");
            if (mna == Mna.SCRUBBING) {
                this.c = true;
            } else if (mna == Mna.NONE) {
                a(this.a > this.b ? a.BACKWARD : a.FORWARD);
            }
        }

        /* access modifiers changed from: protected */
        public abstract void a(a aVar);

        public void a(float f, float f2) {
            if (this.c) {
                this.a = f2;
                this.c = false;
            }
            this.b = f2;
        }
    }

    /* renamed from: goa$c */
    /* compiled from: ScrubController.kt */
    public static class c {
        private final defpackage.ioa.a a;

        public c(defpackage.ioa.a aVar) {
            C7471uYa.b(aVar, "seekHandlerFactory");
            this.a = aVar;
        }

        public goa a(WaveformScrollView waveformScrollView, _Xa<? super Long, RVa> _xa) {
            C7471uYa.b(waveformScrollView, "scrubView");
            C7471uYa.b(_xa, "seeker");
            return new goa(waveformScrollView, _xa, this.a);
        }
    }

    /* renamed from: goa$d */
    /* compiled from: ScrubController.kt */
    public interface d {
        void a(float f, float f2);

        void a(Mna mna);
    }

    /* renamed from: goa$e */
    /* compiled from: ScrubController.kt */
    private final class e implements com.soundcloud.android.player.ui.waveform.WaveformScrollView.c {
        public e() {
        }

        public void a(int i, int i2) {
            if (goa.this.d() && goa.this.f != null) {
                doa c = goa.this.f;
                if (c != null) {
                    float a2 = c.a(i);
                    float max = Math.max(0.0f, Math.min(1.0f, a2));
                    goa.this.d.removeMessages(goa.c.a());
                    goa.this.d.sendMessageDelayed(goa.this.d.obtainMessage(goa.c.a(), Float.valueOf(max)), goa.c.b());
                    for (d a3 : goa.this.e) {
                        a3.a(a2, max);
                    }
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }

        public void b() {
            goa.this.a(true);
            goa.this.a(Mna.SCRUBBING);
        }

        public void a() {
            goa.this.a(false);
            if (!goa.this.d.hasMessages(goa.c.a())) {
                Float b = goa.this.g;
                if (b != null) {
                    goa.this.a(b.floatValue());
                    return;
                }
                goa.this.a(Mna.CANCELLED);
            }
        }
    }

    public goa(WaveformScrollView waveformScrollView, _Xa<? super Long, RVa> _xa, defpackage.ioa.a aVar) {
        C7471uYa.b(waveformScrollView, "scrubView");
        C7471uYa.b(_xa, "seeker");
        C7471uYa.b(aVar, "seekHandlerFactory");
        this.k = _xa;
        this.d = aVar.a(this);
        waveformScrollView.setListener(new e());
    }

    /* access modifiers changed from: private */
    public boolean d() {
        return this.h == Mna.SCRUBBING || this.d.hasMessages(a);
    }

    public boolean c() {
        return this.i;
    }

    public void b(float f2) {
        this.g = Float.valueOf(f2);
    }

    public void a(boolean z) {
        this.i = z;
    }

    public void a(long j2) {
        this.j = j2;
    }

    public void a(float f2) {
        this.k.invoke(Long.valueOf((long) (f2 * ((float) this.j))));
        a(Mna.NONE);
        this.g = null;
    }

    /* access modifiers changed from: private */
    public void a(Mna mna) {
        this.h = mna;
        for (d a2 : this.e) {
            a2.a(mna);
        }
    }

    public void a(doa doa) {
        C7471uYa.b(doa, "progressHelper");
        this.f = doa;
    }

    public void a(d dVar) {
        C7471uYa.b(dVar, CastExtraArgs.LISTENER);
        this.e.add(dVar);
    }
}
