package com.facebook.stetho.common.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Spinner;
import java.util.List;

public final class AccessibilityUtil {
    private AccessibilityUtil() {
    }

    public static boolean hasFocusableAncestor(Mc mc, View view) {
        if (mc == null || view == null) {
            return false;
        }
        ViewParent q = C1778vc.q(view);
        if (!(q instanceof View)) {
            return false;
        }
        Mc x = Mc.x();
        try {
            C1778vc.a((View) q, x);
            if (x == null) {
                return false;
            }
            if (isAccessibilityFocusable(x, (View) q)) {
                x.y();
                return true;
            } else if (hasFocusableAncestor(x, (View) q)) {
                x.y();
                return true;
            } else {
                x.y();
                return false;
            }
        } finally {
            x.y();
        }
    }

    public static boolean hasNonActionableSpeakingDescendants(Mc mc, View view) {
        if (!(mc == null || view == null || !(view instanceof ViewGroup))) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    Mc x = Mc.x();
                    try {
                        C1778vc.a(childAt, x);
                        if (!isAccessibilityFocusable(x, childAt)) {
                            if (isSpeakingNode(x, childAt)) {
                                x.y();
                                return true;
                            }
                        }
                    } finally {
                        x.y();
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasText(Mc mc) {
        boolean z = false;
        if (mc == null) {
            return false;
        }
        if (!TextUtils.isEmpty(mc.j()) || !TextUtils.isEmpty(mc.f())) {
            z = true;
        }
        return z;
    }

    public static boolean isAccessibilityFocusable(Mc mc, View view) {
        boolean z = false;
        if (!(mc == null || view == null)) {
            if (!mc.w()) {
                return false;
            }
            if (isActionableForAccessibility(mc)) {
                return true;
            }
            if (isTopLevelScrollItem(mc, view) && isSpeakingNode(mc, view)) {
                z = true;
            }
        }
        return z;
    }

    public static boolean isActionableForAccessibility(Mc mc) {
        boolean z = false;
        if (mc == null) {
            return false;
        }
        if (mc.o() || mc.s() || mc.q()) {
            return true;
        }
        List a = mc.a();
        if (a.contains(Integer.valueOf(16)) || a.contains(Integer.valueOf(32)) || a.contains(Integer.valueOf(1))) {
            z = true;
        }
        return z;
    }

    public static boolean isSpeakingNode(Mc mc, View view) {
        boolean z = false;
        if (!(mc == null || view == null)) {
            if (!mc.w()) {
                return false;
            }
            int j = C1778vc.j(view);
            if (j != 4 && ((j != 2 || mc.c() > 0) && (mc.m() || hasText(mc) || hasNonActionableSpeakingDescendants(mc, view)))) {
                z = true;
            }
        }
        return z;
    }

    public static boolean isTopLevelScrollItem(Mc mc, View view) {
        boolean z = false;
        if (mc == null || view == null) {
            return false;
        }
        View view2 = (View) C1778vc.q(view);
        if (view2 == null) {
            return false;
        }
        if (mc.u()) {
            return true;
        }
        List a = mc.a();
        if (a.contains(Integer.valueOf(4096)) || a.contains(Integer.valueOf(8192))) {
            return true;
        }
        if (view2 instanceof Spinner) {
            return false;
        }
        if ((view2 instanceof AdapterView) || (view2 instanceof ScrollView) || (view2 instanceof HorizontalScrollView)) {
            z = true;
        }
        return z;
    }
}
