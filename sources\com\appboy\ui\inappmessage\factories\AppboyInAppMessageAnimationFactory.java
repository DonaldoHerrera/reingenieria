package com.appboy.ui.inappmessage.factories;

import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.appboy.ui.inappmessage.IInAppMessageAnimationFactory;
import com.appboy.ui.support.AnimationUtils;

public class AppboyInAppMessageAnimationFactory implements IInAppMessageAnimationFactory {
    private final int mShortAnimationDurationMillis = Resources.getSystem().getInteger(17694720);

    public Animation getClosingAnimation(C0522cg cgVar) {
        if (!(cgVar instanceof C1510mg)) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            AnimationUtils.setAnimationParams(alphaAnimation, (long) this.mShortAnimationDurationMillis, false);
            return alphaAnimation;
        } else if (((C1510mg) cgVar).c() == Vf.TOP) {
            return AnimationUtils.createVerticalAnimation(0.0f, -1.0f, (long) this.mShortAnimationDurationMillis, false);
        } else {
            return AnimationUtils.createVerticalAnimation(0.0f, 1.0f, (long) this.mShortAnimationDurationMillis, false);
        }
    }

    public Animation getOpeningAnimation(C0522cg cgVar) {
        if (!(cgVar instanceof C1510mg)) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            AnimationUtils.setAnimationParams(alphaAnimation, (long) this.mShortAnimationDurationMillis, true);
            return alphaAnimation;
        } else if (((C1510mg) cgVar).c() == Vf.TOP) {
            return AnimationUtils.createVerticalAnimation(-1.0f, 0.0f, (long) this.mShortAnimationDurationMillis, false);
        } else {
            return AnimationUtils.createVerticalAnimation(1.0f, 0.0f, (long) this.mShortAnimationDurationMillis, false);
        }
    }
}
