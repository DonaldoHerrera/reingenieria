package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeScroll extends Transition {
    private static final String[] K = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    private void d(ha haVar) {
        haVar.a.put("android:changeScroll:x", Integer.valueOf(haVar.b.getScrollX()));
        haVar.a.put("android:changeScroll:y", Integer.valueOf(haVar.b.getScrollY()));
    }

    public String[] A() {
        return K;
    }

    public void a(ha haVar) {
        d(haVar);
    }

    public void c(ha haVar) {
        d(haVar);
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Animator a(ViewGroup viewGroup, ha haVar, ha haVar2) {
        Animator animator;
        ObjectAnimator objectAnimator = null;
        if (haVar == null || haVar2 == null) {
            return null;
        }
        View view = haVar2.b;
        String str = "android:changeScroll:x";
        int intValue = ((Integer) haVar.a.get(str)).intValue();
        int intValue2 = ((Integer) haVar2.a.get(str)).intValue();
        String str2 = "android:changeScroll:y";
        int intValue3 = ((Integer) haVar.a.get(str2)).intValue();
        int intValue4 = ((Integer) haVar2.a.get(str2)).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            animator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            animator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return ga.a(animator, objectAnimator);
    }
}
