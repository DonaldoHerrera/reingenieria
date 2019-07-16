package com.soundcloud.android.soul.components.cells.standard;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.HashMap;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/soul/components/cells/standard/CellStandardExtended;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "render", "", "viewModel", "Lcom/soundcloud/android/soul/components/cells/standard/CellStandardExtended$ViewModel;", "setOnCheckedChangeListener", "listener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setupViewFromAttributes", "ViewModel", "components_release"}, mv = {1, 1, 15})
/* compiled from: CellStandardExtended.kt */
public final class CellStandardExtended extends ConstraintLayout {
    private HashMap u;

    /* compiled from: CellStandardExtended.kt */
    public static final class a {
        private final String a;
        private final String b;
        private final boolean c;

        public a(String str, String str2, boolean z) {
            C7471uYa.b(str, "title");
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a) && C7471uYa.a((Object) this.b, (Object) aVar.b)) {
                        if (this.c == aVar.c) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.c;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewModel(title=");
            sb.append(this.a);
            sb.append(", subline=");
            sb.append(this.b);
            sb.append(", checked=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    public CellStandardExtended(Context context) {
        this(context, null, 0, 6, null);
    }

    public CellStandardExtended(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CellStandardExtended(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(k.cell_standard_extended, this);
        a(context, attributeSet);
        setLayoutParams(new LayoutParams(-1, -2));
        C7782yxa.a(this, e.white, 0, 2, null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        int[] iArr = n.CellStandardExtended;
        C7471uYa.a((Object) iArr, "R.styleable.CellStandardExtended");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        if (obtainStyledAttributes.hasValue(n.CellStandardExtended_android_text)) {
            a(new a(C0282Ya.b(obtainStyledAttributes, n.CellStandardExtended_android_text), obtainStyledAttributes.hasValue(n.CellStandardExtended_subline) ? obtainStyledAttributes.getString(n.CellStandardExtended_subline) : null, obtainStyledAttributes.getBoolean(n.CellStandardExtended_android_checked, false)));
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

    public final void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        ((Switch) b(h.cell_toggle)).setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public /* synthetic */ CellStandardExtended(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
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
        CustomFontTextView customFontTextView = (CustomFontTextView) b(h.header);
        C7471uYa.a((Object) customFontTextView, "header");
        customFontTextView.setText(aVar.c());
        Switch switchR = (Switch) b(h.cell_toggle);
        C7471uYa.a((Object) switchR, "cell_toggle");
        switchR.setChecked(aVar.a());
        String str = "subline";
        if (aVar.b() != null) {
            CustomFontTextView customFontTextView2 = (CustomFontTextView) b(h.subline);
            C7471uYa.a((Object) customFontTextView2, str);
            customFontTextView2.setVisibility(0);
            CustomFontTextView customFontTextView3 = (CustomFontTextView) b(h.subline);
            C7471uYa.a((Object) customFontTextView3, str);
            customFontTextView3.setText(aVar.b());
        } else {
            CustomFontTextView customFontTextView4 = (CustomFontTextView) b(h.subline);
            C7471uYa.a((Object) customFontTextView4, str);
            customFontTextView4.setVisibility(8);
        }
        setOnClickListener(new a(this));
    }
}
