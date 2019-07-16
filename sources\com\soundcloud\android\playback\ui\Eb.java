package com.soundcloud.android.playback.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Handler;
import android.view.animation.AccelerateInterpolator;
import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;

/* compiled from: PlayerPagerOnboardingPresenter */
public class Eb extends DefaultSupportFragmentLightCycle<C4451fb> {
    private final Gb a;
    private final Fea b;
    private final C2732f c;
    private final C5327TLa d;
    private final Handler e;
    private VPa f = C4881Eua.b();
    /* access modifiers changed from: private */
    public boolean g;

    /* compiled from: PlayerPagerOnboardingPresenter */
    private static class a implements AnimatorListener {
        private final PlayerTrackPager a;
        private final int b;
        private final Handler c;

        public void onAnimationCancel(Animator animator) {
            this.a.c();
        }

        public void onAnimationEnd(Animator animator) {
            Handler handler = this.c;
            PlayerTrackPager playerTrackPager = this.a;
            playerTrackPager.getClass();
            handler.postDelayed(new C4470m(playerTrackPager), (long) this.b);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        private a(PlayerTrackPager playerTrackPager, int i, Handler handler) {
            this.a = playerTrackPager;
            this.b = i;
            this.c = handler;
        }
    }

    /* compiled from: PlayerPagerOnboardingPresenter */
    private static class b implements AnimatorUpdateListener {
        private final PlayerTrackPager a;
        private float b;

        private void a(PlayerTrackPager playerTrackPager, float f) {
            playerTrackPager.b(f - this.b);
            this.b = f;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a(this.a, -((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        private b(PlayerTrackPager playerTrackPager) {
            this.a = playerTrackPager;
        }
    }

    /* compiled from: PlayerPagerOnboardingPresenter */
    private class c extends C5037Jua<Iaa> {
        private final PlayerTrackPager d;

        c(PlayerTrackPager playerTrackPager) {
            this.d = playerTrackPager;
        }

        private boolean b(Iaa iaa) {
            return iaa.c() == 0;
        }

        public void a(Iaa iaa) {
            if (b(iaa)) {
                if (a(this.d) && Eb.this.g()) {
                    Eb.this.a(this.d);
                    Eb.this.i();
                }
                Eb.this.g = false;
            }
        }

        private boolean a(PlayerTrackPager playerTrackPager) {
            return playerTrackPager.getChildCount() > 1;
        }
    }

    Eb(Gb gb, Fea fea, C2732f fVar, C5327TLa tLa) {
        this.a = gb;
        this.b = fea;
        this.c = fVar;
        this.d = tLa;
        this.e = new Handler();
    }

    /* access modifiers changed from: private */
    public boolean g() {
        return !this.g && !j();
    }

    private boolean h() {
        return this.a.b() >= 3;
    }

    /* access modifiers changed from: private */
    public void i() {
        this.a.a();
        if (h()) {
            this.f.dispose();
        }
    }

    private boolean j() {
        return !this.c.e() && !this.b.b("play_queue");
    }

    /* renamed from: b */
    public void onResume(C4451fb fbVar) {
        if (!h()) {
            PlayerTrackPager Bb = fbVar.Bb();
            if (Bb != null) {
                this.g = j();
                this.f = this.d.a(C3876taa.d, (SUa<E>) new c<E>(Bb));
            }
        }
    }

    /* renamed from: a */
    public void onPause(C4451fb fbVar) {
        this.f.dispose();
        this.e.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: private */
    public void a(PlayerTrackPager playerTrackPager) {
        if (playerTrackPager.e() || !playerTrackPager.a()) {
            SDb.b("Fake dragging failed to start.", new Object[0]);
            return;
        }
        b(playerTrackPager);
    }

    private void b(PlayerTrackPager playerTrackPager) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) C6768kIa.a(playerTrackPager.getContext(), 70)});
        ofFloat.setInterpolator(new AccelerateInterpolator(0.88f));
        ofFloat.setDuration(350);
        ofFloat.addUpdateListener(new b(playerTrackPager));
        ofFloat.addListener(new a(playerTrackPager, 350, this.e));
        ofFloat.start();
    }
}
