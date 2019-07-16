package com.soundcloud.android.playback.ui;

import android.util.Pair;
import android.view.View;

/* compiled from: SlideAnimationHelper */
class Yb {
    private static final Pair<Float, Float> a;
    private static final Pair<Float, Float> b;
    private static final Pair<Float, Float> c;

    static {
        Float valueOf = Float.valueOf(0.4f);
        Float valueOf2 = Float.valueOf(1.0f);
        a = new Pair<>(valueOf, valueOf2);
        b = new Pair<>(Float.valueOf(0.6f), valueOf2);
        c = new Pair<>(valueOf, Float.valueOf(0.9f));
    }

    Yb() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void a(float f, View view) {
        view.setAlpha(Math.min(1.0f, Math.max(0.0f, f)));
    }

    /* access modifiers changed from: 0000 */
    public void a(float f, View view, Iterable<View> iterable, Iterable<View> iterable2, Ab... abArr) {
        a(f, view, abArr);
        float a2 = a(f, c);
        a(a2, iterable);
        a(((double) a2) < 0.001d, iterable2);
    }

    /* access modifiers changed from: 0000 */
    public void a(float f, View view, View view2, Ab... abArr) {
        a(f, view, abArr);
        a(a(f, c), view2);
    }

    private void a(float f, View view, Ab... abArr) {
        for (Ab a2 : abArr) {
            a2.a(a(1.0f - f, a));
        }
        a(a(1.0f - f, b), view);
    }

    private void a(float f, Iterable<View> iterable) {
        C6768kIa.a(iterable, (C7733yKa<View>) new W<View>(this, f));
    }

    private void a(boolean z, Iterable<View> iterable) {
        C6768kIa.a(iterable, (C7733yKa<View>) new X<View>(z));
    }

    static /* synthetic */ void a(boolean z, View view) {
        if (z) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
    }

    private float a(float f, Pair<Float, Float> pair) {
        return Math.min(1.0f, Math.max(0.0f, (f - ((Float) pair.first).floatValue()) / (((Float) pair.second).floatValue() - ((Float) pair.first).floatValue())));
    }
}
