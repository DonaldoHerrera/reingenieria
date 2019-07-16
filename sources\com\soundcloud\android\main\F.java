package com.soundcloud.android.main;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.main.ia.b;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* compiled from: ActivityScreenStateProvider.kt */
public class F extends DefaultActivityLightCycle<AppCompatActivity> implements ia {
    private boolean a;
    private boolean b;
    private boolean c;

    public void a(Bundle bundle) {
        b.a(this, bundle);
    }

    public void b(boolean z) {
        this.c = z;
    }

    public void c(boolean z) {
        this.b = z;
    }

    public void d(AppCompatActivity appCompatActivity, Bundle bundle) {
        b.a((ia) this, appCompatActivity, bundle);
    }

    public boolean j() {
        return this.a;
    }

    public boolean k() {
        return this.b;
    }

    public boolean l() {
        return b.a(this);
    }

    public boolean m() {
        return b.b(this);
    }

    public void x() {
        b.c(this);
    }

    public void y() {
        b.d(this);
    }

    public void a(boolean z) {
        this.a = z;
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        a(bundle);
    }

    /* renamed from: c */
    public void onSaveInstanceState(AppCompatActivity appCompatActivity, Bundle bundle) {
        d(appCompatActivity, bundle);
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        x();
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        y();
    }
}
