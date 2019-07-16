package com.soundcloud.android.main;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

@EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0003H\u0002R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0004\"\u0004\b\u000b\u0010\u0006¨\u0006\u001d"}, d2 = {"Lcom/soundcloud/android/main/ScreenStateProvider;", "", "isConfigurationChange", "", "()Z", "setConfigurationChange", "(Z)V", "isForeground", "setForeground", "onCreateCalled", "getOnCreateCalled", "setOnCreateCalled", "isEnteringScreen", "isReallyResuming", "onCreateHelper", "", "savedInstanceState", "Landroid/os/Bundle;", "onPauseHelper", "onResumeHelper", "onSaveInstanceStateHelper", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "bundle", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "writeConfigurationChangeToBundle", "state", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: ScreenStateProvider.kt */
public interface ia {
    public static final a a = a.b;

    /* compiled from: ScreenStateProvider.kt */
    public static final class a {
        private static final String a = a;
        static final /* synthetic */ a b = new a();

        private a() {
        }

        public final String a() {
            return a;
        }
    }

    /* compiled from: ScreenStateProvider.kt */
    public static final class b {
        public static void a(ia iaVar, Bundle bundle) {
            iaVar.a(true);
            if (bundle != null) {
                iaVar.c(bundle.getBoolean(ia.a.a(), false));
            }
        }

        public static boolean b(ia iaVar) {
            return !iaVar.j();
        }

        public static void c(ia iaVar) {
            iaVar.a(false);
            iaVar.b(false);
        }

        public static void d(ia iaVar) {
            iaVar.b(true);
        }

        public static void a(ia iaVar, AppCompatActivity appCompatActivity, Bundle bundle) {
            if (appCompatActivity != null && bundle != null) {
                a(iaVar, bundle, appCompatActivity.getChangingConfigurations() != 0);
            }
        }

        public static void a(ia iaVar, FragmentActivity fragmentActivity, Bundle bundle) {
            C7471uYa.b(fragmentActivity, "fragmentActivity");
            if (bundle != null) {
                a(iaVar, bundle, fragmentActivity.getChangingConfigurations() != 0);
            }
        }

        public static boolean a(ia iaVar) {
            return !iaVar.k() || iaVar.m();
        }

        private static void a(ia iaVar, Bundle bundle, boolean z) {
            bundle.putBoolean(ia.a.a(), z);
        }
    }

    void a(boolean z);

    void b(boolean z);

    void c(boolean z);

    boolean j();

    boolean k();

    boolean l();

    boolean m();
}
