package com.soundcloud.android.main;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* compiled from: ActivityLifeCycleLogger */
public class B extends DefaultActivityLightCycle<AppCompatActivity> {
    /* renamed from: a */
    public void onDestroy(AppCompatActivity appCompatActivity) {
        a(appCompatActivity, "OnDestroy");
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        a(appCompatActivity, "OnCreate");
    }

    /* renamed from: c */
    public void onResume(AppCompatActivity appCompatActivity) {
        a(appCompatActivity, "OnResume");
    }

    /* renamed from: d */
    public void onStart(AppCompatActivity appCompatActivity) {
        a(appCompatActivity, "OnStart");
    }

    /* renamed from: e */
    public void onStop(AppCompatActivity appCompatActivity) {
        a(appCompatActivity, "OnStop");
    }

    private void a(AppCompatActivity appCompatActivity, String str) {
        b a = SDb.a("ActivityLifeCycle");
        StringBuilder sb = new StringBuilder();
        sb.append("[Activity LifeCycle] ");
        sb.append(str);
        sb.append(" : ");
        sb.append(appCompatActivity.getClass().getSimpleName());
        a.a(sb.toString(), new Object[0]);
    }

    /* renamed from: b */
    public void onPause(AppCompatActivity appCompatActivity) {
        a(appCompatActivity, "OnPause");
    }
}
