package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001e\u001f B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0012J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0010H\u0012J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/soundcloud/android/playback/players/volume/VolumeController;", "Lcom/soundcloud/android/playback/players/volume/FadeHelper$Listener;", "listener", "Lcom/soundcloud/android/playback/players/volume/VolumeController$Listener;", "fadeHelperFactory", "Lcom/soundcloud/android/playback/players/volume/FadeHelper$Factory;", "(Lcom/soundcloud/android/playback/players/volume/VolumeController$Listener;Lcom/soundcloud/android/playback/players/volume/FadeHelper$Factory;)V", "ducked", "", "fadeHelper", "Lcom/soundcloud/android/playback/players/volume/FadeHelper;", "fadingIn", "fadingOut", "duck", "", "startVolume", "", "duration", "", "fade", "endVolume", "offset", "fadeIn", "fadeOut", "onFade", "volume", "onFadeFinished", "resetVolume", "setVolume", "unDuck", "Companion", "Factory", "Listener", "players_release"}, mv = {1, 1, 15})
/* renamed from: Bna reason: default package */
/* compiled from: VolumeController.kt */
public class Bna implements d {
    public static final a a = new a(null);
    private final C4713xna b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final c f;

    /* renamed from: Bna$a */
    /* compiled from: VolumeController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: Bna$b */
    /* compiled from: VolumeController.kt */
    public static class b {
        private final defpackage.C4713xna.b a;

        public b(defpackage.C4713xna.b bVar) {
            C7471uYa.b(bVar, "fadeHelperFactory");
            this.a = bVar;
        }

        public Bna a(c cVar) {
            C7471uYa.b(cVar, CastExtraArgs.LISTENER);
            return new Bna(cVar, this.a);
        }
    }

    /* renamed from: Bna$c */
    /* compiled from: VolumeController.kt */
    public interface c {
        void a();

        void a(float f);
    }

    public Bna(c cVar, defpackage.C4713xna.b bVar) {
        C7471uYa.b(cVar, CastExtraArgs.LISTENER);
        C7471uYa.b(bVar, "fadeHelperFactory");
        this.f = cVar;
        this.b = bVar.a(this);
    }

    public void a(float f2, long j) {
        if (!this.c) {
            this.c = true;
            b(f2, j, 0);
        }
    }

    public void b(float f2, long j) {
        if (this.c) {
            this.c = false;
            a(f2, j, 0);
        }
    }

    public void a(float f2, long j, long j2) {
        if (!this.d) {
            this.d = true;
            this.e = false;
            a(f2, this.c ? 0.1f : 1.0f, j, j2);
        }
    }

    public void b() {
        if (!this.c) {
            this.b.a();
            b(1.0f);
            this.d = false;
            this.e = false;
        }
    }

    private void a(float f2, float f3, long j, long j2) {
        C4713xna xna = this.b;
        Ana ana = new Ana(j, j2, f2, f3);
        xna.a(ana);
    }

    public void a(float f2) {
        if (this.d || this.e) {
            b(f2);
        }
    }

    public void b(float f2, long j, long j2) {
        if (!this.e) {
            this.e = true;
            this.d = false;
            a(f2, this.c ? 0.1f : 0.0f, j, j2);
        }
    }

    public void a() {
        this.d = false;
        this.e = false;
        this.f.a();
    }

    private void b(float f2) {
        this.f.a(f2);
    }
}
