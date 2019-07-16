package com.soundcloud.android.accounts;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;

/* compiled from: LoggedInController.kt */
final class z<T> implements C6776kQa<Boolean> {
    final /* synthetic */ A a;
    final /* synthetic */ AppCompatActivity b;

    z(A a2, AppCompatActivity appCompatActivity) {
        this.a = a2;
        this.b = appCompatActivity;
    }

    /* renamed from: a */
    public final void accept(Boolean bool) {
        this.a.d.l();
        this.a.c.a((Activity) this.b);
        this.b.finish();
    }
}
