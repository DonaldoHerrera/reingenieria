package com.google.android.material.internal;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* compiled from: StateListAnimator */
public final class o {
    private final ArrayList<a> a = new ArrayList<>();
    private a b = null;
    ValueAnimator c = null;
    private final AnimatorListener d = new n(this);

    /* compiled from: StateListAnimator */
    static class a {
        final int[] a;
        final ValueAnimator b;

        a(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        a aVar = new a(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(aVar);
    }

    public void a(int[] iArr) {
        a aVar;
        int size = this.a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = (a) this.a.get(i);
            if (StateSet.stateSetMatches(aVar.a, iArr)) {
                break;
            }
            i++;
        }
        a aVar2 = this.b;
        if (aVar != aVar2) {
            if (aVar2 != null) {
                b();
            }
            this.b = aVar;
            if (aVar != null) {
                a(aVar);
            }
        }
    }

    private void a(a aVar) {
        this.c = aVar.b;
        this.c.start();
    }

    public void a() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.c = null;
        }
    }
}
