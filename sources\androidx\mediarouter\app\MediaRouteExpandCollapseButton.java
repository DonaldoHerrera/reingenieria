package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import androidx.core.content.a;

class MediaRouteExpandCollapseButton extends ImageButton {
    final AnimationDrawable a;
    final AnimationDrawable b;
    final String c;
    final String d;
    boolean e;
    OnClickListener f;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = (AnimationDrawable) a.c(context, C1719td.mr_group_expand);
        this.b = (AnimationDrawable) a.c(context, C1719td.mr_group_collapse);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(E.a(context, i), Mode.SRC_IN);
        this.a.setColorFilter(porterDuffColorFilter);
        this.b.setColorFilter(porterDuffColorFilter);
        this.c = context.getString(C1869yd.mr_controller_expand_group);
        this.d = context.getString(C1869yd.mr_controller_collapse_group);
        setImageDrawable(this.a.getFrame(0));
        setContentDescription(this.c);
        super.setOnClickListener(new D(this));
    }
}
