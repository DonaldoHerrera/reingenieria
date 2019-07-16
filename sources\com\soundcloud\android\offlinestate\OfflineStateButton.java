package com.soundcloud.android.offlinestate;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.soundcloud.android.offlinestate.c.a;
import com.soundcloud.android.offlinestate.f.i;
import com.soundcloud.android.offlinestate.f.l;
import com.soundcloud.android.offlinestate.f.n;
import com.soundcloud.android.offlinestate.f.p;

@EVa(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0012J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0012J\u0012\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u000fH\u0012J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0012J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0012J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0019H\u0012J\b\u0010(\u001a\u00020\u001eH\u0016J\b\u0010)\u001a\u00020\u001eH\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138WX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00138WX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00138WX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00138WX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/soundcloud/android/offlinestate/OfflineStateButton;", "Landroid/widget/LinearLayout;", "Lcom/soundcloud/android/offlinestate/OfflineStateHelper$Callback;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "buttonIcon", "Landroid/widget/ImageView;", "buttonLabel", "Landroid/widget/TextView;", "defaultIcon", "Landroid/graphics/drawable/Drawable;", "downloadedIcon", "downloadingIcon", "isDefaultState", "", "()Z", "isDownloadedState", "isDownloadingState", "isWaitingState", "offlineState", "Lcom/soundcloud/android/foundation/domain/offline/OfflineState;", "offlineStateHelper", "Lcom/soundcloud/android/offlinestate/OfflineStateHelper;", "waitingIcon", "init", "", "onStateTransition", "state", "setContentDescription", "setDownloadStateResource", "drawable", "setIcon", "setLabel", "setState", "shouldShowSavingText", "showNoConnection", "showNoWiFi", "offlinestate_release"}, mv = {1, 1, 15})
/* compiled from: OfflineStateButton.kt */
public class OfflineStateButton extends LinearLayout implements a {
    private ImageView a;
    private TextView b;
    private final Drawable c;
    private final Drawable d;
    private final Drawable e;
    private final Drawable f;
    private C3823mda g;
    private final c h;

    public OfflineStateButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public OfflineStateButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ OfflineStateButton(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(l.offline_state_button, this);
        this.a = (ImageView) findViewById(i.offine_state_button_icon);
        this.b = (TextView) findViewById(i.offile_state_button_label);
        setClickable(true);
        setState(C3823mda.NOT_OFFLINE);
    }

    private void setContentDescription(C3823mda mda) {
        b.d(this);
        int i = a.b[mda.ordinal()];
        if (i == 1 || i == 2) {
            setContentDescription(getResources().getString(n.accessibility_not_offline));
        } else if (i == 3) {
            setContentDescription(getResources().getString(n.accessibility_offline_unavailable));
        } else if (i == 4) {
            setContentDescription(getResources().getString(n.accessibility_offline_downloading));
        } else if (i == 5) {
            setContentDescription(getResources().getString(n.accessibility_offline_downloaded));
        }
    }

    private void setDownloadStateResource(Drawable drawable) {
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.clearAnimation();
            imageView.setImageDrawable(drawable);
        }
    }

    private void setIcon(C3823mda mda) {
        int i = a.a[mda.ordinal()];
        if (i == 1 || i == 2) {
            setDownloadStateResource(this.c);
        } else if (i == 3) {
            setDownloadStateResource(this.f);
        } else if (i == 4) {
            setDownloadStateResource(this.d);
            ImageView imageView = this.a;
            if (imageView != null) {
                C5466YFa.a((View) imageView);
            } else {
                C7471uYa.a();
                throw null;
            }
        } else if (i == 5) {
            setDownloadStateResource(this.e);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown state : ");
            sb.append(mda);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void setLabel(C3823mda mda) {
        TextView textView = this.b;
        if (textView == null) {
            return;
        }
        if (b(mda)) {
            b.f(textView);
            textView.setText(n.offline_update_in_progress);
            return;
        }
        b.e(textView);
    }

    public void b() {
        setState(C3823mda.UNAVAILABLE);
        TextView textView = this.b;
        if (textView != null) {
            b.f(textView);
            textView.setText(n.offline_no_wifi);
        }
    }

    public void setState(C3823mda mda) {
        C7471uYa.b(mda, "state");
        this.h.a(this.g, mda);
    }

    public OfflineStateButton(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.OfflineStateButton);
        int resourceId = obtainStyledAttributes.getResourceId(p.OfflineStateButton_defaultIcon, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(p.OfflineStateButton_downloadingIcon, -1);
        int resourceId3 = obtainStyledAttributes.getResourceId(p.OfflineStateButton_downloadedIcon, -1);
        int resourceId4 = obtainStyledAttributes.getResourceId(p.OfflineStateButton_waitingIcon, -1);
        this.c = C1437k.b(context, resourceId);
        this.d = C1437k.b(context, resourceId2);
        this.e = C1437k.b(context, resourceId3);
        this.f = C1437k.b(context, resourceId4);
        obtainStyledAttributes.recycle();
        this.h = c.b.a(this, this);
        a(context);
    }

    private boolean b(C3823mda mda) {
        return C3823mda.DOWNLOADING == mda || C3823mda.REQUESTED == mda;
    }

    public void a(C3823mda mda) {
        C7471uYa.b(mda, "state");
        this.g = mda;
        setIcon(mda);
        setLabel(mda);
        setContentDescription(mda);
    }

    public void a() {
        setState(C3823mda.UNAVAILABLE);
    }
}
