package com.soundcloud.android.view.bottomnav;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.w.a;
import androidx.appcompat.widget.va;
import com.facebook.stetho.websocket.CloseCodes;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

/* compiled from: ScBottomNavigationItemView */
public class b extends FrameLayout implements a {
    private static final int[] a = {16842912};
    private ImageView b = ((ImageView) findViewById(i.icon));
    private p c;
    private ColorStateList d = getResources().getColorStateList(f.bottom_nav_button_selector);

    public b(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(l.bottom_navigation_item, this, true);
        setBackgroundResource(h.bottom_navigation_item_background);
    }

    public void a(p pVar, int i) {
        this.c = pVar;
        setCheckable(pVar.isCheckable());
        setChecked(pVar.isChecked());
        setEnabled(pVar.isEnabled());
        setIcon(pVar.getIcon());
        setId(pVar.getItemId());
        setContentDescription(pVar.getTitle());
        va.a(this, pVar.getTooltipText());
    }

    public boolean a() {
        return false;
    }

    public p getItemData() {
        return this.c;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        p pVar = this.c;
        if (pVar != null && pVar.isCheckable() && this.c.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, a);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        if (z) {
            C1778vc.a((View) this, C1568oc.a(getContext(), CloseCodes.PROTOCOL_ERROR));
        } else {
            C1778vc.a((View) this, (C1568oc) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
            androidx.core.graphics.drawable.a.a(drawable, this.d);
        }
        this.b.setImageDrawable(drawable);
    }

    public void setTitle(CharSequence charSequence) {
    }
}
