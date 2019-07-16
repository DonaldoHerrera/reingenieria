package com.soundcloud.android.playback.ui.view;

import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.e;
import androidx.viewpager.widget.ViewPager.h;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.concurrent.TimeUnit;

/* compiled from: ViewPagerSwipeDetector */
public class m extends h {
    private static final b a = a.a;
    private final C5694cGa b;
    private final long c;
    private b d = a;
    private long e;
    private int f;

    /* compiled from: ViewPagerSwipeDetector */
    public enum a {
        LEFT,
        RIGHT
    }

    /* compiled from: ViewPagerSwipeDetector */
    public interface b {
        void a(a aVar);
    }

    m(int i, TimeUnit timeUnit, C5694cGa cga) {
        this.b = cga;
        this.c = timeUnit.toMillis((long) i);
        c();
    }

    public static m a(ViewPager viewPager) {
        m mVar = new m(HttpStatus.HTTP_INTERNAL_SERVER_ERROR, TimeUnit.MILLISECONDS, C5626bGa.a);
        viewPager.a((e) mVar);
        return mVar;
    }

    static /* synthetic */ void a(a aVar) {
    }

    private boolean b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 255) == 1;
    }

    private void c() {
        this.e = 0;
    }

    public void b(int i) {
        if (a()) {
            c();
            if (i > this.f) {
                this.d.a(a.RIGHT);
            } else {
                this.d.a(a.LEFT);
            }
        }
        this.f = i;
    }

    public void a(MotionEvent motionEvent) {
        if (b(motionEvent)) {
            b();
        } else {
            c();
        }
    }

    public void a(b bVar) {
        if (bVar != null) {
            this.d = bVar;
            return;
        }
        throw new IllegalArgumentException("Skip listener cannot be null");
    }

    private void b() {
        this.e = this.b.a();
    }

    private boolean a() {
        return this.b.a() - this.e <= this.c;
    }
}
