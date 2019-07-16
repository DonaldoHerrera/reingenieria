package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3701c;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* renamed from: GL reason: default package and case insensitive filesystem */
/* compiled from: DefaultAnalyticsConnector */
public class C2051GL extends DefaultActivityLightCycle<AppCompatActivity> implements C3701c {
    private final C1956BQ a;
    private final C2486cN b;
    private final C2526g c;
    private final boolean d;
    private boolean e;

    C2051GL(C1956BQ bq, C2486cN cNVar, C2526g gVar, boolean z) {
        this.a = bq;
        this.b = cNVar;
        this.c = gVar;
        this.d = z;
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        this.a.c((Activity) appCompatActivity);
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        if (!this.c.g()) {
            this.a.a((Context) appCompatActivity);
        }
    }

    /* renamed from: c */
    public void onStart(AppCompatActivity appCompatActivity) {
        if (this.d && this.a.a((Activity) appCompatActivity)) {
            this.b.c();
        }
        this.a.a();
    }

    /* renamed from: d */
    public void onStop(AppCompatActivity appCompatActivity) {
        if (this.d) {
            this.a.b((Activity) appCompatActivity);
        }
    }

    public void r() {
        this.e = true;
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        if (!this.c.g()) {
            this.a.a((Activity) appCompatActivity, this.e);
        }
    }

    public C2051GL(C1956BQ bq, C2486cN cNVar, C2526g gVar, C3177oM oMVar) {
        this(bq, cNVar, gVar, oMVar.b());
    }
}
