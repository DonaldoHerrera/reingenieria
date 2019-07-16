package com.soundcloud.android.player.ui.waveform;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;

@EVa(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/soundcloud/android/player/ui/waveform/CommentHolder;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "player-ui-components_release"}, mv = {1, 1, 15})
/* compiled from: CommentHolder.kt */
public final class CommentHolder extends FrameLayout {
    public CommentHolder(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentHolder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CommentHolder(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public CommentHolder(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
        Property property = View.TRANSLATION_Y;
        Resources resources = context.getResources();
        C7471uYa.a((Object) resources, "context.resources");
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(property, new float[]{resources.getDisplayMetrics().density * 10.0f, 0.0f});
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(2);
        layoutTransition.setAnimator(2, ObjectAnimator.ofPropertyValuesHolder(null, new PropertyValuesHolder[]{ofFloat, ofFloat2}));
        layoutTransition.enableTransitionType(3);
        layoutTransition.setAnimator(3, ObjectAnimator.ofPropertyValuesHolder(null, new PropertyValuesHolder[]{ofFloat3}));
        layoutTransition.disableTransitionType(4);
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        setLayoutTransition(layoutTransition);
    }
}
