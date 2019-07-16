package defpackage;

import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.ia.f;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* renamed from: QJa reason: default package and case insensitive filesystem */
/* compiled from: StatusBarColorController */
public class C5235QJa extends DefaultActivityLightCycle<AppCompatActivity> {
    private int a;
    private int b;
    private boolean c;
    private boolean d;
    private AppCompatActivity e;

    private View A() {
        return this.e.findViewById(16908290);
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        this.e = null;
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        super.onResume(appCompatActivity);
        this.e = appCompatActivity;
        this.c = C5295SJa.b(A());
        this.a = C5295SJa.a(appCompatActivity);
        this.b = appCompatActivity.getResources().getColor(f.primary_darker);
        z();
    }

    public void x() {
        AppCompatActivity appCompatActivity = this.e;
        if (appCompatActivity != null && a(appCompatActivity.getResources())) {
            C5295SJa.a(this.e, this.a);
            if (this.c) {
                C5295SJa.c(this.e.findViewById(16908290));
            } else {
                C5295SJa.a(this.e.findViewById(16908290));
            }
        }
    }

    public void y() {
        AppCompatActivity appCompatActivity = this.e;
        if (appCompatActivity == null) {
            this.d = true;
        } else if (a(appCompatActivity.getResources())) {
            C5295SJa.a(this.e, this.b);
            C5295SJa.a(A());
        }
    }

    /* access modifiers changed from: 0000 */
    public void z() {
        if (this.d) {
            y();
        }
        this.d = false;
    }

    public void a(float f) {
        AppCompatActivity appCompatActivity = this.e;
        if (appCompatActivity != null && f >= 0.0f && a(appCompatActivity.getResources())) {
            C5295SJa.a(this.e, C6768kIa.a(this.a, this.b, f));
        }
    }

    private boolean a(Resources resources) {
        int i = resources.getConfiguration().uiMode & 48;
        if (i == 16) {
            return true;
        }
        if (i != 32) {
        }
        return false;
    }
}
