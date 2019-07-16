package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import com.appboy.h;
import com.appboy.j;
import com.appboy.m;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener;

/* renamed from: DQ reason: default package and case insensitive filesystem */
/* compiled from: RealAppboyWrapper */
public class C1996DQ implements C1956BQ {
    private final h a;

    public C1996DQ(h hVar) {
        this.a = hVar;
    }

    private String e(String str) {
        return Base64.encodeToString(str.getBytes(), 2);
    }

    public boolean b(Activity activity) {
        return this.a.a(activity);
    }

    public void c(String str) {
        this.a.d(str);
    }

    public j d(String str) {
        return this.a.a(e(str));
    }

    public void b() {
        this.a.j();
    }

    public void c(Activity activity) {
        AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(activity);
    }

    public void a(String str) {
        h.a((m) new C3319vQ(str));
    }

    public boolean b(String str) {
        return this.a.b(str);
    }

    public void a(String str, String str2, String str3, String str4) {
        this.a.c().a(new C1812wg(str, str2, str3, str4));
    }

    public boolean a(Activity activity) {
        return this.a.b(activity);
    }

    public void a(Activity activity, boolean z) {
        IInAppMessageManagerListener iInAppMessageManagerListener;
        AppboyInAppMessageManager instance = AppboyInAppMessageManager.getInstance();
        if (z) {
            iInAppMessageManagerListener = C1936AQ.a();
        } else {
            iInAppMessageManagerListener = C1936AQ.b();
        }
        instance.setCustomInAppMessageManagerListener(iInAppMessageManagerListener);
        instance.registerInAppMessageManager(activity);
    }

    public void a(Context context) {
        AppboyInAppMessageManager.getInstance().ensureSubscribedToInAppMessageEvents(context.getApplicationContext());
    }

    public void a() {
        this.a.k();
    }

    public boolean a(String str, C1782vg vgVar) {
        return this.a.a(str, vgVar);
    }
}
