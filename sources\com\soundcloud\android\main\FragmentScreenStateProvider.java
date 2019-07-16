package com.soundcloud.android.main;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.main.ia.b;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u001a\u0010\u0016\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/soundcloud/android/main/FragmentScreenStateProvider;", "Lcom/soundcloud/lightcycle/SupportFragmentLightCycleDispatcher;", "Landroidx/fragment/app/Fragment;", "Lcom/soundcloud/android/main/ScreenStateProvider;", "()V", "isConfigurationChange", "", "()Z", "setConfigurationChange", "(Z)V", "isForeground", "setForeground", "onCreateCalled", "getOnCreateCalled", "setOnCreateCalled", "onCreate", "", "fragment", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onSaveInstanceState", "outState", "base_release"}, mv = {1, 1, 15})
/* compiled from: FragmentScreenStateProvider.kt */
public class FragmentScreenStateProvider extends SupportFragmentLightCycleDispatcher<Fragment> implements ia {
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

    public void v() {
        b.c(this);
    }

    public void w() {
        b.d(this);
    }

    public void a(FragmentActivity fragmentActivity, Bundle bundle) {
        C7471uYa.b(fragmentActivity, "fragmentActivity");
        b.a((ia) this, fragmentActivity, bundle);
    }

    /* renamed from: b */
    public void onSaveInstanceState(Fragment fragment, Bundle bundle) {
        C7471uYa.b(bundle, "outState");
        if (fragment != null) {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                C7471uYa.a((Object) activity, "it");
                a(activity, bundle);
            }
        }
    }

    public void a(boolean z) {
        this.a = z;
    }

    /* renamed from: b */
    public void onResume(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        w();
    }

    /* renamed from: a */
    public void onCreate(Fragment fragment, Bundle bundle) {
        C7471uYa.b(fragment, "fragment");
        a(bundle);
    }

    /* renamed from: a */
    public void onPause(Fragment fragment) {
        C7471uYa.b(fragment, "fragment");
        v();
    }
}
