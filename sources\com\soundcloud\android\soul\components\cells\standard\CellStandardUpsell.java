package com.soundcloud.android.soul.components.cells.standard;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.HashMap;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/soul/components/cells/standard/CellStandardUpsell;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "render", "", "viewModel", "Lcom/soundcloud/android/soul/components/cells/standard/CellStandardUpsell$ViewModel;", "setupViewFromAttributes", "ViewModel", "components_release"}, mv = {1, 1, 15})
/* compiled from: CellStandardUpsell.kt */
public final class CellStandardUpsell extends ConstraintLayout {
    private HashMap u;

    /* compiled from: CellStandardUpsell.kt */
    public static final class a {
        private final String a;

        public a(String str) {
            C7471uYa.b(str, "title");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.soul.components.cells.standard.CellStandardUpsell.a) r2).a) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewModel(title=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    public CellStandardUpsell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CellStandardUpsell(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(k.cell_standard_upsell, this);
        a(context, attributeSet);
        setLayoutParams(new LayoutParams(-1, -2));
        C7782yxa.a(this, e.white, 0, 2, null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        int[] iArr = n.CellStandardUpsell;
        C7471uYa.a((Object) iArr, "R.styleable.CellStandardUpsell");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        if (obtainStyledAttributes.hasValue(n.CellStandardUpsell_android_text)) {
            a(new a(C0282Ya.b(obtainStyledAttributes, n.CellStandardUpsell_android_text)));
        }
        obtainStyledAttributes.recycle();
    }

    public View b(int i) {
        if (this.u == null) {
            this.u = new HashMap();
        }
        View view = (View) this.u.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.u.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* synthetic */ CellStandardUpsell(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
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
        CustomFontTextView customFontTextView = (CustomFontTextView) b(h.cell_title);
        C7471uYa.a((Object) customFontTextView, "title");
        customFontTextView.setText(aVar.a());
    }
}
