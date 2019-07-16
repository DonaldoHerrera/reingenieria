package androidx.viewpager.widget;

/* compiled from: ViewPager */
class f implements Runnable {
    final /* synthetic */ ViewPager a;

    f(ViewPager viewPager) {
        this.a = viewPager;
    }

    public void run() {
        this.a.setScrollState(0);
        this.a.h();
    }
}
