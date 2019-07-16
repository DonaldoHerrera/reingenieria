package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.a;

/* compiled from: FragmentPagerAdapter */
public abstract class x extends a {
    private final C0370l c;
    private A d = null;
    private Fragment e = null;

    public x(C0370l lVar) {
        this.c = lVar;
    }

    public Object a(ViewGroup viewGroup, int i) {
        if (this.d == null) {
            this.d = this.c.a();
        }
        long f = f(i);
        Fragment a = this.c.a(a(viewGroup.getId(), f));
        if (a != null) {
            this.d.a(a);
        } else {
            a = e(i);
            this.d.a(viewGroup.getId(), a, a(viewGroup.getId(), f));
        }
        if (a != this.e) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void b(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    public Parcelable c() {
        return null;
    }

    public abstract Fragment e(int i);

    public long f(int i) {
        return (long) i;
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.e.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.e = fragment;
        }
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        if (this.d == null) {
            this.d = this.c.a();
        }
        this.d.b((Fragment) obj);
    }

    public void a(ViewGroup viewGroup) {
        A a = this.d;
        if (a != null) {
            a.d();
            this.d = null;
        }
    }

    public boolean a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    private static String a(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }
}
