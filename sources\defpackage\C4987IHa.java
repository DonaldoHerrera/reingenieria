package defpackage;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;

/* renamed from: IHa reason: default package and case insensitive filesystem */
/* compiled from: LightCycleLogger.kt */
public final class C4987IHa {
    public static final C4987IHa a = new C4987IHa();

    private C4987IHa() {
    }

    public final ActivityLightCycle<Activity> a(String str) {
        C7471uYa.b(str, "tag");
        return new C4925GHa(str);
    }

    public final SupportFragmentLightCycle<Fragment> b(String str) {
        C7471uYa.b(str, "tag");
        return new C4956HHa(str);
    }
}
