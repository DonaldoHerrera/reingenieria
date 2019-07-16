package com.soundcloud.android.playback.ui.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.j;
import com.soundcloud.android.ia.l;
import java.util.concurrent.TimeUnit;

public class TimestampView extends LinearLayout implements Hna, d {
    /* access modifiers changed from: private */
    public final View a;
    private final View b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final View f;
    private final C1727tl g;
    private final float h;
    private final float i;
    private final View j;
    private boolean k;
    private boolean l;
    private boolean m;
    private long n;
    private long o;
    private int p;
    private C1577ol q;
    private AnimatorSet r;
    private AnimatorSet s;
    private final C1515ml t;

    public TimestampView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1727tl.c());
    }

    private void c() {
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C1577ol olVar = this.q;
        if (olVar != null) {
            olVar.g();
            this.q.a();
        }
    }

    private AnimatorSet d() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a((View) this.d), a((View) this.e), a(this.j)});
        return animatorSet;
    }

    /* access modifiers changed from: private */
    public int getTimestampScrubY() {
        return (int) (-((((double) (((float) this.b.getTop()) - (((float) getHeight()) * (((float) this.p) / 100.0f)))) + ((double) this.h)) - ((double) this.i)));
    }

    public void setBufferingMode(boolean z) {
        if (z != this.l) {
            this.l = z;
            if (this.l) {
                this.s.start();
                return;
            }
            this.s.cancel();
            b((View) this.d);
            b((View) this.e);
            b(this.j);
        }
    }

    public void setPreview(boolean z) {
        this.k = z;
        int i2 = 4;
        this.a.setVisibility(z ? 4 : 0);
        View view = this.c;
        if (z) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    public void setState(Nna nna) {
        this.d.setText(a(nna.c().a()));
    }

    public TimestampView(Context context, AttributeSet attributeSet, C1727tl tlVar) {
        super(context, attributeSet);
        this.t = new k(this);
        this.g = tlVar;
        LayoutInflater.from(context).inflate(l.timestamp_layout, this, true);
        setOrientation(1);
        setClipChildren(false);
        this.d = (TextView) findViewById(i.timestamp_progress);
        this.e = (TextView) findViewById(i.timestamp_duration);
        this.f = findViewById(i.timestamp_background);
        this.a = findViewById(i.timestamp_layout);
        this.b = findViewById(i.timestamp_holder);
        this.c = findViewById(i.timestamp_preview);
        this.j = findViewById(i.timestamp_divider);
        this.p = getResources().getInteger(j.timestamp_animate_percentage);
        this.h = getResources().getDimension(g.waveform_baseline);
        this.i = getResources().getDimension(g.timestamp_height);
        this.s = d();
    }

    private void b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{view.getAlpha(), 1.0f});
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    private ValueAnimator a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.2f, 1.0f});
        ofFloat.setDuration(1800);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        int i2;
        int left = this.f.getLeft();
        int top = this.a.getTop() + this.f.getTop();
        int right = this.f.getRight();
        if (z) {
            i2 = getBottom();
        } else {
            i2 = (int) (((float) (this.a.getTop() + this.f.getBottom())) + (((float) this.f.getHeight()) * 2.2f));
        }
        float width = (((float) this.f.getWidth()) * 2.2f) / 2.0f;
        invalidate((int) (((float) left) - width), top, (int) (((float) right) + width), i2);
    }

    public void a(long j2, long j3) {
        this.n = j2;
        this.o = j3;
        this.d.setText(a(0));
        this.e.setText(a(j2));
    }

    private String a(long j2) {
        return C7315sGa.a(j2, TimeUnit.MILLISECONDS);
    }

    private void b() {
        this.q = this.g.a();
        this.q.a((C1667rl) this.t);
        this.q.a(C1608pl.a(110.0d, 10.0d));
        this.q.b((double) (this.a.getTranslationY() / ((float) getTimestampScrubY())));
        this.q.c(1.0d);
        this.f.setAlpha(0.0f);
    }

    public void a(boolean z) {
        this.f.setVisibility(z ? 0 : 4);
        this.c.setBackgroundResource(z ? f.black : 17170445);
    }

    public void a(float f2, float f3) {
        this.d.setText(a(Math.min(this.n, ((long) (f3 * ((float) this.o))) + 500)));
        b(false);
    }

    public void a(Mna mna) {
        int i2 = 0;
        this.m = mna == Mna.SCRUBBING;
        c();
        if (this.m) {
            this.c.setVisibility(4);
            this.a.setVisibility(0);
            b();
        } else if (this.a.getTranslationY() != 0.0f || mna == Mna.CANCELLED) {
            this.c.setVisibility(this.k ? 0 : 4);
            View view = this.a;
            if (this.k) {
                i2 = 4;
            }
            view.setVisibility(i2);
            a();
        }
    }

    private void a() {
        this.r = new AnimatorSet();
        View view = this.a;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), 0.0f});
        AnimatorSet animatorSet = this.r;
        View view2 = this.a;
        float[] fArr = {view2.getScaleX(), 1.0f};
        View view3 = this.a;
        float[] fArr2 = {view3.getScaleY(), 1.0f};
        View view4 = this.f;
        animatorSet.playTogether(new Animator[]{ofFloat, ObjectAnimator.ofFloat(view2, "scaleX", fArr), ObjectAnimator.ofFloat(view3, "scaleY", fArr2), ObjectAnimator.ofFloat(view4, "alpha", new float[]{view4.getAlpha(), 1.0f})});
        a(this.r);
        this.r.setDuration(120);
        this.r.start();
    }

    private void a(AnimatorSet animatorSet) {
        this.a.setLayerType(2, null);
        animatorSet.addListener(new l(this));
    }
}
