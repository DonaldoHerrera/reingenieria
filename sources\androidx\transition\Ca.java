package androidx.transition;

import android.view.View;

/* compiled from: VisibilityPropagation */
public abstract class Ca extends C0446ea {
    private static final String[] a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public void a(ha haVar) {
        View view = haVar.b;
        Integer num = (Integer) haVar.a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        haVar.a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        haVar.a.put("android:visibilityPropagation:center", iArr);
    }

    public int b(ha haVar) {
        if (haVar == null) {
            return 8;
        }
        Integer num = (Integer) haVar.a.get("android:visibilityPropagation:visibility");
        if (num == null) {
            return 8;
        }
        return num.intValue();
    }

    public int c(ha haVar) {
        return a(haVar, 0);
    }

    public int d(ha haVar) {
        return a(haVar, 1);
    }

    public String[] a() {
        return a;
    }

    private static int a(ha haVar, int i) {
        if (haVar == null) {
            return -1;
        }
        int[] iArr = (int[]) haVar.a.get("android:visibilityPropagation:center");
        if (iArr == null) {
            return -1;
        }
        return iArr[i];
    }
}
