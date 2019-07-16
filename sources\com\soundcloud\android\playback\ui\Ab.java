package com.soundcloud.android.playback.ui;

import android.view.View;
import com.soundcloud.android.playback.C4431ub;

/* compiled from: PlayerOverlayController */
public class Ab implements d {
    private final C4463jb a;
    private final View b;
    private boolean c;
    private float d;
    private boolean e;
    private boolean f;
    private boolean g;

    /* compiled from: PlayerOverlayController */
    public static class a {
        private final C7054oVa<C4463jb> a;

        a(C7054oVa<C4463jb> ova) {
            this.a = ova;
        }

        public Ab a(View view) {
            return new Ab(view, (C4463jb) this.a.get());
        }
    }

    public Ab(View view, C4463jb jbVar) {
        this.b = view;
        this.a = jbVar;
    }

    private boolean c() {
        return !this.c;
    }

    private boolean d() {
        return this.e && !this.f;
    }

    public void a(float f2, float f3) {
    }

    public void a(C4431ub ubVar) {
        this.e = ubVar.p();
        a();
    }

    public void b(boolean z) {
        this.g = z;
    }

    private boolean b() {
        return this.d == 0.0f;
    }

    public void a(boolean z) {
        this.f = z;
        a();
    }

    private void a() {
        if (!this.g && c() && b() && d()) {
            this.a.a(this.b);
        } else if (b()) {
            this.a.b(this.b);
        }
    }

    public void a(float f2) {
        this.d = f2;
        if (!this.g && d()) {
            this.a.a(this.b, this.d);
        }
    }

    public void a(Mna mna) {
        this.c = mna == Mna.SCRUBBING;
        if (this.c) {
            this.a.b(this.b);
        } else if (!this.g && d() && b()) {
            this.a.a(this.b);
        }
    }
}
