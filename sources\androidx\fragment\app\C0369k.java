package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.k reason: case insensitive filesystem */
/* compiled from: FragmentHostCallback */
public abstract class C0369k<E> extends C0366h {
    private final Activity a;
    private final Context b;
    private final Handler c;
    private final int d;
    final C0377t e;

    C0369k(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    public View a(int i) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void a(Fragment fragment) {
    }

    public void a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.b.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void a(Fragment fragment, String[] strArr, int i) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public boolean a() {
        return true;
    }

    public boolean a(String str) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public Activity b() {
        return this.a;
    }

    public boolean b(Fragment fragment) {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public Context c() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public Handler d() {
        return this.c;
    }

    public abstract E e();

    public LayoutInflater f() {
        return LayoutInflater.from(this.b);
    }

    public int g() {
        return this.d;
    }

    public boolean h() {
        return true;
    }

    public void i() {
    }

    @SuppressLint({"RestrictedApi"})
    C0369k(Activity activity, Context context, Handler handler, int i) {
        this.e = new C0377t();
        this.a = activity;
        C0263Ub.a(context, "context == null");
        this.b = context;
        C0263Ub.a(handler, "handler == null");
        this.c = handler;
        this.d = i;
    }

    public void a(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (i == -1) {
            b.a(this.a, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }
}
