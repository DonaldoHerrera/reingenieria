package com.soundcloud.android.accounts;

import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.events.C3707i;

/* compiled from: UserRemovedController.kt */
final class N<T> implements C6776kQa<T> {
    final /* synthetic */ AppCompatActivity a;

    N(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    /* renamed from: a */
    public final void accept(C3707i iVar) {
        C7471uYa.a((Object) iVar, "event");
        if (iVar.d()) {
            AppCompatActivity appCompatActivity = this.a;
            if (appCompatActivity != null) {
                appCompatActivity.finish();
            }
        }
    }
}
