package com.soundcloud.android.main;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* compiled from: ActivityLifeCyclePublisher */
public class D extends DefaultActivityLightCycle<AppCompatActivity> {
    private final C5327TLa a;

    public D(C5327TLa tLa) {
        this.a = tLa;
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        this.a.c(C3876taa.m, C3699a.b(appCompatActivity));
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        this.a.c(C3876taa.m, C3699a.a(appCompatActivity));
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        this.a.c(C3876taa.m, C3699a.c(appCompatActivity));
    }
}
