package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeClipBounds extends Transition {
    private static final String[] K = {"android:clipBounds:clip"};

    public ChangeClipBounds() {
    }

    private void d(ha haVar) {
        View view = haVar.b;
        if (view.getVisibility() != 8) {
            Rect f = C1778vc.f(view);
            haVar.a.put("android:clipBounds:clip", f);
            if (f == null) {
                haVar.a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
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

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Animator a(ViewGroup viewGroup, ha haVar, ha haVar2) {
        ObjectAnimator objectAnimator = null;
        if (!(haVar == null || haVar2 == null)) {
            String str = "android:clipBounds:clip";
            if (haVar.a.containsKey(str) && haVar2.a.containsKey(str)) {
                Rect rect = (Rect) haVar.a.get(str);
                Rect rect2 = (Rect) haVar2.a.get(str);
                boolean z = rect2 == null;
                if (rect == null && rect2 == null) {
                    return null;
                }
                String str2 = "android:clipBounds:bounds";
                if (rect == null) {
                    rect = (Rect) haVar.a.get(str2);
                } else if (rect2 == null) {
                    rect2 = (Rect) haVar2.a.get(str2);
                }
                if (rect.equals(rect2)) {
                    return null;
                }
                C1778vc.a(haVar2.b, rect);
                objectAnimator = ObjectAnimator.ofObject(haVar2.b, wa.e, new N(new Rect()), new Rect[]{rect, rect2});
                if (z) {
                    objectAnimator.addListener(new C0454l(this, haVar2.b));
                }
            }
        }
        return objectAnimator;
    }
}
