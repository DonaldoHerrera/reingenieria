package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* compiled from: FragmentWrapper */
public class L {
    private Fragment a;
    private android.app.Fragment b;

    public L(Fragment fragment) {
        ja.a((Object) fragment, "fragment");
        this.a = fragment;
    }

    public void a(Intent intent, int i) {
        Fragment fragment = this.a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
        } else {
            this.b.startActivityForResult(intent, i);
        }
    }

    public android.app.Fragment b() {
        return this.b;
    }

    public Fragment c() {
        return this.a;
    }

    public L(android.app.Fragment fragment) {
        ja.a((Object) fragment, "fragment");
        this.b = fragment;
    }

    public final Activity a() {
        Fragment fragment = this.a;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return this.b.getActivity();
    }
}
