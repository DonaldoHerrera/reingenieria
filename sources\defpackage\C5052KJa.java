package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.playback.ui.ac;

/* renamed from: KJa reason: default package and case insensitive filesystem */
/* compiled from: FeedbackController */
public class C5052KJa {
    private final C5175OJa a;
    private C4928GKa<ac> b = C4928GKa.a();
    private C4928GKa<View> c = C4928GKa.a();
    private C4928GKa<Integer> d = C4928GKa.a();

    public C5052KJa(C5175OJa oJa) {
        this.a = oJa;
    }

    public void a(FragmentActivity fragmentActivity, ac acVar) {
        this.c = C4928GKa.b(a((Activity) fragmentActivity));
        this.b = C4928GKa.c(acVar);
        this.d = C4928GKa.c(Integer.valueOf(fragmentActivity.getResources().getDimensionPixelSize(g.bottom_navigation_height)));
    }

    public void a() {
        this.c = C4928GKa.a();
        this.b = C4928GKa.a();
    }

    public void a(Fca fca) {
        this.b.a((C7733yKa<? super T>) new C4958HJa<Object>(this, fca));
    }

    public /* synthetic */ void a(Fca fca, ac acVar) {
        if (acVar.z()) {
            this.a.b(acVar.x(), fca);
        } else {
            this.a.a((View) this.c.b(), fca, (Integer) this.d.d());
        }
    }

    private View a(Activity activity) {
        View findViewById = activity.findViewById(i.snackbar_anchor);
        return findViewById != null ? findViewById : activity.findViewById(i.container);
    }
}
