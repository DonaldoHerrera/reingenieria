package com.soundcloud.android.soul.components.cells.standard;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.soundcloud.android.view.customfontviews.CustomFontButton;
import java.util.HashMap;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/soul/components/cells/standard/CellStandardIcon;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "render", "", "viewModel", "Lcom/soundcloud/android/soul/components/cells/standard/CellStandardIcon$ViewModel;", "setOnClickListener", "l", "Landroid/view/View$OnClickListener;", "setupViewFromAttributes", "ViewModel", "components_release"}, mv = {1, 1, 15})
/* compiled from: CellStandardIcon.kt */
public final class CellStandardIcon extends FrameLayout {
    private HashMap a;

    /* compiled from: CellStandardIcon.kt */
    public static final class a {
        private final String a;
        private final int b;
        private final boolean c;

        public a(String str, int i, boolean z) {
            C7471uYa.b(str, "title");
            this.a = str;
            this.b = i;
            this.c = z;
        }

        public final int a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                        if (this.b == aVar.b) {
                            if (this.c == aVar.c) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewModel(title=");
            sb.append(this.a);
            sb.append(", icon=");
            sb.append(this.b);
            sb.append(", showChevron=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    public CellStandardIcon(Context context) {
        this(context, null, 0, 6, null);
    }

    public CellStandardIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CellStandardIcon(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(k.cell_standard_icon, this);
        a(context, attributeSet);
        C7782yxa.a(this, e.white, 0, 2, null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        int[] iArr = n.CellStandardIcon;
        C7471uYa.a((Object) iArr, "R.styleable.CellStandardIcon");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        if (obtainStyledAttributes.hasValue(n.CellStandardIcon_cellTitle) && obtainStyledAttributes.hasValue(n.CellStandardIcon_cellIcon)) {
            a(new a(C0282Ya.b(obtainStyledAttributes, n.CellStandardIcon_cellTitle), C0282Ya.a(obtainStyledAttributes, n.CellStandardIcon_cellIcon), obtainStyledAttributes.getBoolean(n.CellStandardIcon_showChevron, false)));
        }
        obtainStyledAttributes.recycle();
    }

    public View a(int i) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        View view = (View) this.a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        ((CustomFontButton) a(h.cell_standard_icon)).setOnClickListener(onClickListener);
    }

    public /* synthetic */ CellStandardIcon(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void a(a aVar) {
        C7471uYa.b(aVar, "viewModel");
        CustomFontButton customFontButton = (CustomFontButton) a(h.cell_standard_icon);
        C7471uYa.a((Object) customFontButton, "cell_standard_icon");
        customFontButton.setText(aVar.c());
        if (aVar.b()) {
            ((CustomFontButton) a(h.cell_standard_icon)).setCompoundDrawablesWithIntrinsicBounds(C1437k.b(getContext(), aVar.a()), null, C1437k.b(getContext(), g.ic_chevron_right_12_ash), null);
        } else {
            ((CustomFontButton) a(h.cell_standard_icon)).setCompoundDrawablesWithIntrinsicBounds(C1437k.b(getContext(), aVar.a()), null, null, null);
        }
    }
}
