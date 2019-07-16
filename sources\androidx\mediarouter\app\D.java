package androidx.mediarouter.app;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: MediaRouteExpandCollapseButton */
class D implements OnClickListener {
    final /* synthetic */ MediaRouteExpandCollapseButton a;

    D(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.a = mediaRouteExpandCollapseButton;
    }

    public void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
        mediaRouteExpandCollapseButton.e = !mediaRouteExpandCollapseButton.e;
        if (mediaRouteExpandCollapseButton.e) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.a);
            this.a.a.start();
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = this.a;
            mediaRouteExpandCollapseButton2.setContentDescription(mediaRouteExpandCollapseButton2.d);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.b);
            this.a.b.start();
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = this.a;
            mediaRouteExpandCollapseButton3.setContentDescription(mediaRouteExpandCollapseButton3.c);
        }
        OnClickListener onClickListener = this.a.f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
