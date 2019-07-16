package defpackage;

import com.soundcloud.android.collection.G;
import com.soundcloud.android.features.discovery.C3550h;
import com.soundcloud.android.features.library.C3645w;
import com.soundcloud.android.main.ActivityEnterScreenDispatcher;
import com.soundcloud.android.main.MainNavigationView;
import com.soundcloud.android.main.Z;
import com.soundcloud.android.main.Z.a;
import com.soundcloud.android.main.ba;
import com.soundcloud.android.more.z;
import com.soundcloud.android.search.C5928p;
import com.soundcloud.android.stream.C6113xa;

/* renamed from: aia reason: default package and case insensitive filesystem */
/* compiled from: NavigationModule */
public abstract class C3947aia {
    public static Z a(C2040FU fu) {
        a[] aVarArr = new a[5];
        aVarArr[0] = new C3550h();
        aVarArr[1] = new C6113xa();
        aVarArr[2] = new C5928p();
        aVarArr[3] = fu.a() ? new C3645w() : new G();
        aVarArr[4] = new z();
        return new Z(aVarArr);
    }

    public static MainNavigationView a(ActivityEnterScreenDispatcher activityEnterScreenDispatcher, Z z, Zha zha) {
        return new MainNavigationView(activityEnterScreenDispatcher, z, zha);
    }

    public static ba a(C4580iia iia) {
        return new ba(iia);
    }
}
