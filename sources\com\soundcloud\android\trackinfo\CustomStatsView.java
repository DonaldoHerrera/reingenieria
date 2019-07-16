package com.soundcloud.android.trackinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.soundcloud.android.trackinfo.x.i;
import com.soundcloud.android.trackinfo.x.l;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.HashMap;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/trackinfo/CustomStatsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setStatDrawable", "", "currentStatDrawable", "setStatValue", "currentStatValue", "", "trackinfo_release"}, mv = {1, 1, 15})
/* compiled from: CustomStatsView.kt */
public final class CustomStatsView extends FrameLayout {
    private HashMap a;

    public CustomStatsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CustomStatsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CustomStatsView(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public View a(int i) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        View view = (View) this.a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setStatDrawable(int i) {
        ((ImageView) a(i.statDrawableView)).setImageResource(i);
    }

    public final void setStatValue(String str) {
        C7471uYa.b(str, "currentStatValue");
        CustomFontTextView customFontTextView = (CustomFontTextView) a(i.statDisplayValueView);
        C7471uYa.a((Object) customFontTextView, "statDisplayValueView");
        customFontTextView.setText(str);
    }

    public CustomStatsView(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(l.track_info_stats_layout, this);
    }
}
