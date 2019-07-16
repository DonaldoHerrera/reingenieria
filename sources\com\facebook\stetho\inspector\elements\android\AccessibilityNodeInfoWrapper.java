package com.facebook.stetho.inspector.elements.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.stetho.common.android.AccessibilityUtil;

public final class AccessibilityNodeInfoWrapper {
    public static Mc createNodeInfoFromView(View view) {
        Mc x = Mc.x();
        C1778vc.a(view, x);
        return x;
    }

    public static String getActions(View view) {
        Mc createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            StringBuilder sb = new StringBuilder();
            for (a aVar : createNodeInfoFromView.a()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                int a = aVar.a();
                if (a == 1) {
                    sb.append("focus");
                } else if (a != 2) {
                    switch (a) {
                        case 4:
                            sb.append("select");
                            break;
                        case 8:
                            sb.append("clear-selection");
                            break;
                        case 16:
                            sb.append("click");
                            break;
                        case 32:
                            sb.append("long-click");
                            break;
                        case 64:
                            sb.append("accessibility-focus");
                            break;
                        case 128:
                            sb.append("clear-accessibility-focus");
                            break;
                        case 256:
                            sb.append("next-at-movement-granularity");
                            break;
                        case 512:
                            sb.append("previous-at-movement-granularity");
                            break;
                        case 1024:
                            sb.append("next-html-element");
                            break;
                        case 2048:
                            sb.append("previous-html-element");
                            break;
                        case 4096:
                            sb.append("scroll-forward");
                            break;
                        case 8192:
                            sb.append("scroll-backward");
                            break;
                        case 16384:
                            sb.append("copy");
                            break;
                        case 32768:
                            sb.append("paste");
                            break;
                        case 65536:
                            sb.append("cut");
                            break;
                        case 131072:
                            sb.append("set-selection");
                            break;
                        default:
                            CharSequence b = aVar.b();
                            if (b == null) {
                                sb.append("unknown");
                                break;
                            } else {
                                sb.append(b);
                                break;
                            }
                    }
                } else {
                    sb.append("clear-focus");
                }
            }
            return sb.length() > 0 ? sb.toString() : null;
        } finally {
            createNodeInfoFromView.y();
        }
    }

    public static CharSequence getDescription(View view) {
        Mc createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            CharSequence f = createNodeInfoFromView.f();
            CharSequence j = createNodeInfoFromView.j();
            boolean z = !TextUtils.isEmpty(j);
            boolean z2 = view instanceof EditText;
            if (!TextUtils.isEmpty(f) && (!z2 || !z)) {
                return f;
            }
            if (z) {
                createNodeInfoFromView.y();
                return j;
            }
            String str = null;
            if (view instanceof ViewGroup) {
                StringBuilder sb = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    Mc x = Mc.x();
                    C1778vc.a(childAt, x);
                    CharSequence description = (!AccessibilityUtil.isSpeakingNode(x, childAt) || AccessibilityUtil.isAccessibilityFocusable(x, childAt)) ? null : getDescription(childAt);
                    if (!TextUtils.isEmpty(description)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(description);
                    }
                    x.y();
                }
                if (sb.length() > 0) {
                    str = sb.toString();
                }
                createNodeInfoFromView.y();
                return str;
            }
            createNodeInfoFromView.y();
            return null;
        } finally {
            createNodeInfoFromView.y();
        }
    }

    public static String getFocusableReasons(View view) {
        Mc createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            boolean hasText = AccessibilityUtil.hasText(createNodeInfoFromView);
            boolean m = createNodeInfoFromView.m();
            boolean hasNonActionableSpeakingDescendants = AccessibilityUtil.hasNonActionableSpeakingDescendants(createNodeInfoFromView, view);
            if (AccessibilityUtil.isActionableForAccessibility(createNodeInfoFromView)) {
                if (createNodeInfoFromView.c() <= 0) {
                    return "View is actionable and has no children.";
                }
                if (hasText) {
                    String str = "View is actionable and has a description.";
                    createNodeInfoFromView.y();
                    return str;
                } else if (m) {
                    String str2 = "View is actionable and checkable.";
                    createNodeInfoFromView.y();
                    return str2;
                } else if (hasNonActionableSpeakingDescendants) {
                    String str3 = "View is actionable and has non-actionable descendants with descriptions.";
                    createNodeInfoFromView.y();
                    return str3;
                }
            }
            if (AccessibilityUtil.isTopLevelScrollItem(createNodeInfoFromView, view)) {
                if (hasText) {
                    String str4 = "View is a direct child of a scrollable container and has a description.";
                    createNodeInfoFromView.y();
                    return str4;
                } else if (m) {
                    String str5 = "View is a direct child of a scrollable container and is checkable.";
                    createNodeInfoFromView.y();
                    return str5;
                } else if (hasNonActionableSpeakingDescendants) {
                    String str6 = "View is a direct child of a scrollable container and has non-actionable descendants with descriptions.";
                    createNodeInfoFromView.y();
                    return str6;
                }
            }
            if (hasText) {
                String str7 = "View has a description and is not actionable, but has no actionable ancestor.";
                createNodeInfoFromView.y();
                return str7;
            }
            createNodeInfoFromView.y();
            return null;
        } finally {
            createNodeInfoFromView.y();
        }
    }

    public static boolean getIgnored(View view) {
        int j = C1778vc.j(view);
        if (j == 2 || j == 4) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (C1778vc.j((View) parent) == 4) {
                return true;
            }
        }
        Mc createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!createNodeInfoFromView.w()) {
                return true;
            }
            if (AccessibilityUtil.isAccessibilityFocusable(createNodeInfoFromView, view)) {
                if (createNodeInfoFromView.c() <= 0) {
                    createNodeInfoFromView.y();
                    return false;
                } else if (AccessibilityUtil.isSpeakingNode(createNodeInfoFromView, view)) {
                    createNodeInfoFromView.y();
                    return false;
                } else {
                    createNodeInfoFromView.y();
                    return true;
                }
            } else if (AccessibilityUtil.hasFocusableAncestor(createNodeInfoFromView, view) || !AccessibilityUtil.hasText(createNodeInfoFromView)) {
                createNodeInfoFromView.y();
                return true;
            } else {
                createNodeInfoFromView.y();
                return false;
            }
        } finally {
            createNodeInfoFromView.y();
        }
    }

    public static String getIgnoredReasons(View view) {
        int j = C1778vc.j(view);
        if (j == 2) {
            return "View has importantForAccessibility set to 'NO'.";
        }
        if (j == 4) {
            return "View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (C1778vc.j((View) parent) == 4) {
                return "An ancestor View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
            }
        }
        Mc createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!createNodeInfoFromView.w()) {
                return "View is not visible.";
            }
            if (AccessibilityUtil.isAccessibilityFocusable(createNodeInfoFromView, view)) {
                String str = "View is actionable, but has no description.";
                createNodeInfoFromView.y();
                return str;
            } else if (AccessibilityUtil.hasText(createNodeInfoFromView)) {
                String str2 = "View is not actionable, and an ancestor View has co-opted its description.";
                createNodeInfoFromView.y();
                return str2;
            } else {
                String str3 = "View is not actionable and has no description.";
                createNodeInfoFromView.y();
                return str3;
            }
        } finally {
            createNodeInfoFromView.y();
        }
    }

    public static boolean getIsAccessibilityFocused(View view) {
        Mc createNodeInfoFromView = createNodeInfoFromView(view);
        boolean l = createNodeInfoFromView.l();
        createNodeInfoFromView.y();
        return l;
    }
}
