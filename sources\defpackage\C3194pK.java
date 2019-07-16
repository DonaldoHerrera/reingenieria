package defpackage;

import android.app.Activity;
import com.soundcloud.android.ia.c;
import com.soundcloud.android.image.N;
import java.util.List;

/* renamed from: pK reason: default package and case insensitive filesystem */
/* compiled from: AlphaDialogHelper.kt */
public class C3194pK {
    private final N a;
    private final C7054oVa<C1930AK> b;
    private final C7054oVa<C3353xK> c;
    private final HPa d;
    private final HPa e;

    public C3194pK(N n, C7054oVa<C1930AK> ova, C7054oVa<C3353xK> ova2, HPa hPa, HPa hPa2) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(ova, "thankYouProvider");
        C7471uYa.b(ova2, "nagProvider");
        C7471uYa.b(hPa, "backgroundScheduler");
        C7471uYa.b(hPa2, "mainThread");
        this.a = n;
        this.b = ova;
        this.c = ova2;
        this.d = hPa;
        this.e = hPa2;
    }

    public C6979nPa a(Activity activity) {
        C7471uYa.b(activity, "host");
        N n = this.a;
        String[] stringArray = activity.getResources().getStringArray(c.alpha_reminder_images);
        C7471uYa.a((Object) stringArray, "host.resources.getString…ay.alpha_reminder_images)");
        C6979nPa e2 = n.a(a(C6578hWa.j(stringArray))).b(this.d).a(this.e).e(new C3108lK(activity)).c((C6776kQa<? super T>) new C3089kK<Object>(new C3127mK((C3353xK) this.c.get()))).e();
        C7471uYa.a((Object) e2, "imageOperations.loadImag…         .ignoreElement()");
        return e2;
    }

    public C6979nPa b(Activity activity) {
        C7471uYa.b(activity, "host");
        N n = this.a;
        String[] stringArray = activity.getResources().getStringArray(c.alpha_thanks_images);
        C7471uYa.a((Object) stringArray, "host.resources.getString…rray.alpha_thanks_images)");
        C6979nPa e2 = n.a(a(C6578hWa.j(stringArray))).b(this.d).a(this.e).e(new C3146nK(activity)).c((C6776kQa<? super T>) new C3089kK<Object>(new C3175oK((C1930AK) this.b.get()))).e();
        C7471uYa.a((Object) e2, "imageOperations.loadImag…         .ignoreElement()");
        return e2;
    }

    private String a(List<String> list) {
        return (String) C7676xWa.f(C7262rWa.c((Iterable) list));
    }
}
