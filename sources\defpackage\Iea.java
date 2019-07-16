package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.view.customfontviews.a;

/* renamed from: Iea reason: default package */
/* compiled from: IntroductoryOverlayPresenter */
public class Iea {
    private final Fea a;
    private final Resources b;
    private final C3700b c;

    public Iea(Fea fea, Resources resources, C3700b bVar) {
        this.a = fea;
        this.b = resources;
        this.c = bVar;
    }

    public void a(Dea dea) {
        String e = dea.e();
        if (a(e)) {
            View f = dea.f();
            Activity a2 = a(f);
            if (a2 != null) {
                a(a2, f, dea.g(), dea.b(), dea.d());
                this.a.a(e);
                C4928GKa c2 = dea.c();
                C3700b bVar = this.c;
                bVar.getClass();
                c2.a((C7733yKa<? super T>) new Aea<Object>(bVar));
            }
        }
    }

    private boolean a(String str) {
        return !this.a.b(str) && this.a.a();
    }

    private void a(Activity activity, View view, int i, int i2, C4928GKa<Drawable> gKa) {
        Context context = view.getContext();
        C1907zl a2 = C1907zl.a(view, (CharSequence) this.b.getString(i), (CharSequence) this.b.getString(i2));
        a2.b(f.white);
        a2.c(f.soundcloudOrange);
        a2.d(f.black);
        a2.a(false);
        a2.e(g.shrinkwrap_medium_primary_text_size);
        a2.a(g.shrinkwrap_medium_secondary_text_size);
        a2.a(a.a(context, "fonts/InterstateSound_Pnum-Light_fbsTfohiYZ.ttf"));
        a2.getClass();
        gKa.a((C7733yKa<? super T>) new C3928zea<Object>(a2));
        Nl.a(activity, a2, (a) new Hea(this, view));
    }

    private Activity a(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
