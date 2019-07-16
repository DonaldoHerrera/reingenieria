package com.soundcloud.android.profile;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.view.C;

/* renamed from: com.soundcloud.android.profile.xa reason: case insensitive filesystem */
/* compiled from: ProfileHeaderPresenter.kt */
final class C5870xa implements OnClickListener {
    final /* synthetic */ Vca a;

    C5870xa(Vca vca) {
        this.a = vca;
    }

    public final void onClick(View view) {
        FragmentActivity c = C6768kIa.c(view);
        C7471uYa.a((Object) c, "ViewUtils.getFragmentActivity(view)");
        C.a(c.getSupportFragmentManager(), this.a);
    }
}
