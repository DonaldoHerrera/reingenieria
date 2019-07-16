package androidx.viewpager.widget;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PagerTabStrip */
class c implements OnClickListener {
    final /* synthetic */ PagerTabStrip a;

    c(PagerTabStrip pagerTabStrip) {
        this.a = pagerTabStrip;
    }

    public void onClick(View view) {
        ViewPager viewPager = this.a.c;
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
    }
}
