package androidx.media;

import android.os.Build.VERSION;

/* compiled from: VolumeProviderCompat */
public abstract class G {
    private final int a;
    private final int b;
    private int c;
    private a d;
    private Object e;

    /* compiled from: VolumeProviderCompat */
    public static abstract class a {
        public abstract void onVolumeChanged(G g);
    }

    public G(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.c;
    }

    public abstract void a(int i);

    public final int b() {
        return this.b;
    }

    public abstract void b(int i);

    public final int c() {
        return this.a;
    }

    public Object d() {
        if (this.e == null && VERSION.SDK_INT >= 21) {
            this.e = I.a(this.a, this.b, this.c, new F(this));
        }
        return this.e;
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public final void c(int i) {
        this.c = i;
        Object d2 = d();
        if (d2 != null && VERSION.SDK_INT >= 21) {
            I.a(d2, i);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.onVolumeChanged(this);
        }
    }
}
