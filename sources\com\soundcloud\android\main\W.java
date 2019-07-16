package com.soundcloud.android.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.A;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;

/* compiled from: MainPagerAdapter */
public class W extends androidx.viewpager.widget.a {
    private final Z c;
    private final Context d;
    private final C0370l e;
    private A f;
    private Fragment g;

    /* compiled from: MainPagerAdapter */
    public interface a {
        void c(boolean z);
    }

    /* compiled from: MainPagerAdapter */
    public interface b {
    }

    private Fragment e(int i) {
        return this.c.a(i).Ua();
    }

    private String f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("soundcloud:main:");
        sb.append(this.c.a(i).Ta().a());
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    public int a() {
        return this.c.a();
    }

    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void b(ViewGroup viewGroup) {
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof Fragment) {
            a((Fragment) obj);
        }
    }

    public Parcelable c() {
        return null;
    }

    public CharSequence c(int i) {
        return this.d.getString(this.c.a(i).getName());
    }

    @SuppressLint({"CommitTransaction"})
    public Object a(ViewGroup viewGroup, int i) {
        if (this.f == null) {
            this.f = this.e.a();
        }
        String f2 = f(i);
        Fragment a2 = this.e.a(f2);
        if (a2 != null) {
            this.f.a(a2);
        } else {
            a2 = e(i);
            this.f.a(viewGroup.getId(), a2, f2);
        }
        if (!a2.equals(this.g)) {
            a2.setMenuVisibility(false);
            a2.setUserVisibleHint(false);
        }
        return a2;
    }

    private void a(Fragment fragment, boolean z) {
        if (fragment instanceof a) {
            ((a) fragment).c(z);
        }
        fragment.setMenuVisibility(z);
        fragment.setUserVisibleHint(z);
    }

    @SuppressLint({"CommitTransaction"})
    public void a(ViewGroup viewGroup, int i, Object obj) {
        if (this.f == null) {
            this.f = this.e.a();
        }
        this.f.b((Fragment) obj);
    }

    private void a(Fragment fragment) {
        if (!fragment.equals(this.g)) {
            Fragment fragment2 = this.g;
            if (fragment2 == null) {
                a(fragment, true);
            } else {
                a(fragment2, false);
            }
            this.g = fragment;
        }
    }

    public void a(ViewGroup viewGroup) {
        A a2 = this.f;
        if (a2 != null) {
            a2.b();
            this.f = null;
            this.e.b();
        }
    }

    public boolean a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }
}
