package com.soundcloud.android.fcm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/* renamed from: com.soundcloud.android.fcm.e reason: case insensitive filesystem */
/* compiled from: DefaultFcmManager */
public class C3539e implements C3832nea {
    private final C7181qKa a;
    private final C3856qea b;
    private final C7730yHa c;

    public C3539e(C7181qKa qka, C3856qea qea, C7730yHa yha) {
        this.a = qka;
        this.b = qea;
        this.c = yha;
    }

    public void a(AppCompatActivity appCompatActivity, Bundle bundle) {
        if (bundle == null) {
            int a2 = this.c.a((Context) appCompatActivity);
            if (a2 == 0) {
                a(appCompatActivity);
            } else {
                a(appCompatActivity, a2);
            }
        }
    }

    private void a(AppCompatActivity appCompatActivity) {
        if (this.b.c()) {
            FcmRegistrationService.a(appCompatActivity);
        }
    }

    private void a(AppCompatActivity appCompatActivity, int i) {
        if (!this.c.a(i)) {
            SDb.a("GcmHelper").a("This device is not supported.", new Object[0]);
        } else if (this.a.i()) {
            this.c.a((Activity) appCompatActivity, i);
        }
    }
}
