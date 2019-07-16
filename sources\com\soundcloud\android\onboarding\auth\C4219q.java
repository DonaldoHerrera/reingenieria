package com.soundcloud.android.onboarding.auth;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.ia.p;

/* renamed from: com.soundcloud.android.onboarding.auth.q reason: case insensitive filesystem */
/* compiled from: AlmostDoneLayout.kt */
final class C4219q implements OnClickListener {
    final /* synthetic */ ImageView a;
    final /* synthetic */ AlmostDoneLayout b;

    C4219q(ImageView imageView, AlmostDoneLayout almostDoneLayout) {
        this.a = imageView;
        this.b = almostDoneLayout;
    }

    public final void onClick(View view) {
        if (!this.b.e) {
            FragmentActivity e = this.b.getAlmostDoneHandler().e();
            if (e != null && C4739AHa.a((Activity) e)) {
                this.b.b(e);
                return;
            }
            return;
        }
        Toast.makeText(this.a.getContext(), p.authentication_clear_image, 1).show();
    }
}
