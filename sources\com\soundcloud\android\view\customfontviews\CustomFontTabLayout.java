package com.soundcloud.android.view.customfontviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.f;
import java.util.ArrayList;
import java.util.Iterator;

@EVa(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/view/customfontviews/CustomFontTabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "addTab", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "shared-ui_release"}, mv = {1, 1, 15})
/* compiled from: CustomFontTabLayout.kt */
public final class CustomFontTabLayout extends TabLayout {
    public CustomFontTabLayout(Context context) {
        C7471uYa.b(context, "context");
        super(context);
    }

    public void a(f fVar) {
        C7471uYa.b(fVar, "tab");
        super.a(fVar);
        View childAt = getChildAt(0);
        String str = "null cannot be cast to non-null type android.view.ViewGroup";
        if (childAt != null) {
            View childAt2 = ((ViewGroup) childAt).getChildAt(fVar.c());
            if (childAt2 != null) {
                ViewGroup viewGroup = (ViewGroup) childAt2;
                C6785kZa d = C7265rZa.d(0, viewGroup.getChildCount());
                ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) d, 10));
                Iterator it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(viewGroup.getChildAt(((FWa) it).nextInt()));
                }
                ArrayList<TextView> arrayList2 = new ArrayList<>();
                for (Object next : arrayList) {
                    if (next instanceof TextView) {
                        arrayList2.add(next);
                    }
                }
                for (TextView a : arrayList2) {
                    a.a(a, "fonts/InterstateSound_Pnum-Regular_fbFICLP0jJ.ttf");
                }
                return;
            }
            throw new OVa(str);
        }
        throw new OVa(str);
    }

    public CustomFontTabLayout(Context context, AttributeSet attributeSet) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public CustomFontTabLayout(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }
}
