package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.material.snackbar.BaseTransientBottomBar.a;
import com.google.android.material.snackbar.Snackbar;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import java.lang.ref.WeakReference;

/* renamed from: OJa reason: default package and case insensitive filesystem */
/* compiled from: SnackbarWrapper.kt */
public class C5175OJa {
    private final int a;
    private final int b = -1;
    private WeakReference<Snackbar> c;

    public C5175OJa(Resources resources) {
        C7471uYa.b(resources, "resources");
        this.a = resources.getColor(f.raven);
    }

    public static /* synthetic */ void a(C5175OJa oJa, View view, Fca fca, Integer num, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                num = null;
            }
            oJa.a(view, fca, num);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showOrReshowSnackbar");
    }

    public static /* synthetic */ void b(C5175OJa oJa, View view, Fca fca, Integer num, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                num = null;
            }
            oJa.b(view, fca, num);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSnackbar");
    }

    private void c(View view, Fca fca, Integer num) {
        WeakReference<Snackbar> weakReference = this.c;
        if (weakReference != null) {
            Snackbar snackbar = (Snackbar) weakReference.get();
            if (snackbar != null) {
                snackbar.a((a<B>) new C5114MJa<B>(this, view, fca, num));
                Snackbar snackbar2 = snackbar;
            }
        }
        WeakReference<Snackbar> weakReference2 = this.c;
        if (weakReference2 != null) {
            Snackbar snackbar3 = (Snackbar) weakReference2.get();
            if (snackbar3 != null) {
                snackbar3.c();
            }
        }
    }

    public void b(View view, Fca fca) {
        a(this, view, fca, null, 4, null);
    }

    public void a(View view, Fca fca, Integer num) {
        C7471uYa.b(view, "anchor");
        C7471uYa.b(fca, "feedback");
        WeakReference<Snackbar> weakReference = this.c;
        if (weakReference != null) {
            Snackbar snackbar = (Snackbar) weakReference.get();
            if (snackbar != null && snackbar.j()) {
                c(view, fca, num);
                return;
            }
        }
        b(view, fca, num);
    }

    public void b(View view, Fca fca, Integer num) {
        C7471uYa.b(view, "anchor");
        C7471uYa.b(fca, "feedback");
        Snackbar a2 = a(view, a(view, fca), a(fca), num);
        OnClickListener a3 = fca.a();
        if (a3 != null) {
            a2.a(fca.b(), a3);
        }
        _Xa c2 = fca.c();
        if (c2 != null) {
            a2.a((a<B>) new C5145NJa<B>(c2));
            Snackbar snackbar = a2;
        }
        a2.n();
        this.c = new WeakReference<>(a2);
    }

    public String a(View view, Fca fca) {
        C7471uYa.b(view, "anchor");
        C7471uYa.b(fca, "feedback");
        if (fca.f() != null) {
            String string = view.getResources().getString(fca.e(), new Object[]{view.getResources().getString(fca.f().intValue())});
            C7471uYa.a((Object) string, "anchor.resources.getStri…back.messageReplacement))");
            return string;
        }
        String string2 = view.getResources().getString(fca.e());
        C7471uYa.a((Object) string2, "anchor.resources.getString(feedback.message)");
        return string2;
    }

    private int a(Fca fca) {
        int d = fca.d();
        if (d != 0) {
            return (d == 1 || d != 2) ? 0 : -2;
        }
        return -1;
    }

    private Snackbar a(View view, String str, int i, Integer num) {
        Snackbar a2 = Snackbar.a(view, (CharSequence) str, i);
        C7471uYa.a((Object) a2, "Snackbar.make(anchor, message, snackbarDuration)");
        View h = a2.h();
        C7471uYa.a((Object) h, "snackbar.view");
        if (num != null) {
            h.setPadding(0, 0, 0, num.intValue());
        }
        C1778vc.a(h, h.getResources().getDimension(g.snackbar_elevation));
        h.setBackgroundColor(this.a);
        View findViewById = h.findViewById(i.snackbar_text);
        C7471uYa.a((Object) findViewById, "view.findViewById(R.id.snackbar_text)");
        TextView textView = (TextView) findViewById;
        textView.setTextColor(this.b);
        textView.setMaxLines(2);
        return a2;
    }
}
