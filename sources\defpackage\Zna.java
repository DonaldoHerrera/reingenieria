package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: Zna reason: default package */
/* compiled from: ProgressAnimator */
public abstract class Zna {
    protected final View a;
    protected final ObjectAnimator b;

    public Zna(View view, float f, float f2) {
        this.a = view;
        this.b = a(f, f2);
    }

    public abstract float a(float f);

    /* access modifiers changed from: protected */
    public abstract ObjectAnimator a(float f, float f2);

    public void a(long j) {
        this.b.setCurrentPlayTime(j);
    }

    public void b(long j) {
        this.b.setDuration(j);
    }

    public void c() {
        this.b.start();
    }

    public void a() {
        this.b.cancel();
    }

    public boolean b() {
        return this.b.isRunning();
    }
}
