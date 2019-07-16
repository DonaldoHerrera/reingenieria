package com.soundcloud.android.accounts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.events.C3707i;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* compiled from: UserRemovedController.kt */
public final class O extends DefaultActivityLightCycle<AppCompatActivity> {
    private VPa a = C4881Eua.b();
    private final C5327TLa b;

    public O(C5327TLa tLa) {
        C7471uYa.b(tLa, "eventBus");
        this.b = tLa;
    }

    /* renamed from: a */
    public void onDestroy(AppCompatActivity appCompatActivity) {
        this.a.dispose();
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        C5327TLa tLa = this.b;
        C5443XLa<C3707i> xLa = C3876taa.i;
        C7471uYa.a((Object) xLa, "EventQueue.CURRENT_USER_CHANGED");
        C5220Pua a2 = C5220Pua.a((C6776kQa<T>) new N<T>(appCompatActivity));
        C7471uYa.a((Object) a2, "LambdaObserver.onNext<Cu…      }\n                }");
        this.a = tLa.a(xLa, (SUa<E>) a2);
    }
}
