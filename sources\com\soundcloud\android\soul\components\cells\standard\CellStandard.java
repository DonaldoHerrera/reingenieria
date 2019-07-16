package com.soundcloud.android.soul.components.cells.standard;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.HashMap;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0010"}, d2 = {"Lcom/soundcloud/android/soul/components/cells/standard/CellStandard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "render", "", "viewModel", "Lcom/soundcloud/android/soul/components/cells/standard/CellStandard$ViewModel;", "setupViewFromAttributes", "EndSlotElement", "ViewModel", "components_release"}, mv = {1, 1, 15})
/* compiled from: CellStandard.kt */
public final class CellStandard extends ConstraintLayout {
    private HashMap u;

    @EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/soundcloud/android/soul/components/cells/standard/CellStandard$EndSlotElement;", "", "()V", "Checkmark", "NoElement", "Toggle", "Lcom/soundcloud/android/soul/components/cells/standard/CellStandard$EndSlotElement$NoElement;", "Lcom/soundcloud/android/soul/components/cells/standard/CellStandard$EndSlotElement$Checkmark;", "Lcom/soundcloud/android/soul/components/cells/standard/CellStandard$EndSlotElement$Toggle;", "components_release"}, mv = {1, 1, 15})
    /* compiled from: CellStandard.kt */
    public static abstract class a {

        /* renamed from: com.soundcloud.android.soul.components.cells.standard.CellStandard$a$a reason: collision with other inner class name */
        /* compiled from: CellStandard.kt */
        public static final class C0173a extends a {
            public static final C0173a a = new C0173a();

            private C0173a() {
                super(null);
            }
        }

        /* compiled from: CellStandard.kt */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        /* compiled from: CellStandard.kt */
        public static final class c extends a {
            private final boolean a;

            public c() {
                this(false, 1, null);
            }

            public c(boolean z) {
                super(null);
                this.a = z;
            }

            public final boolean a() {
                return this.a;
            }

            public /* synthetic */ c(boolean z, int i, C7264rYa rya) {
                if ((i & 1) != 0) {
                    z = false;
                }
                this(z);
            }
        }

        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: CellStandard.kt */
    public static final class b {
        private final String a;
        private final a b;

        public b(String str, a aVar) {
            C7471uYa.b(str, "title");
            C7471uYa.b(aVar, "endSlotElement");
            this.a = str;
            this.b = aVar;
        }

        public final a a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) this.a, (Object) bVar.a)) {
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
            a aVar = this.b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewModel(title=");
            sb.append(this.a);
            sb.append(", endSlotElement=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    public CellStandard(Context context) {
        this(context, null, 0, 6, null);
    }

    public CellStandard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CellStandard(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(k.cell_standard, this);
        a(context, attributeSet);
        setLayoutParams(new LayoutParams(-1, -2));
        C7782yxa.a(this, e.white, 0, 2, null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        a aVar;
        int[] iArr = n.CellStandard;
        C7471uYa.a((Object) iArr, "R.styleable.CellStandard");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        if (obtainStyledAttributes.hasValue(n.CellStandard_android_text)) {
            boolean z = obtainStyledAttributes.getBoolean(n.CellStandard_showCheckmark, false);
            boolean z2 = obtainStyledAttributes.getBoolean(n.CellStandard_showToggle, false);
            String b2 = C0282Ya.b(obtainStyledAttributes, n.CellStandard_android_text);
            if (z) {
                aVar = C0173a.a;
            } else if (z2) {
                aVar = new c(false, 1, null);
            } else {
                aVar = b.a;
            }
            a(new b(b2, aVar));
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

    public /* synthetic */ CellStandard(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void a(b bVar) {
        C7471uYa.b(bVar, "viewModel");
        CustomFontTextView customFontTextView = (CustomFontTextView) b(h.cell_title);
        C7471uYa.a((Object) customFontTextView, "title");
        customFontTextView.setText(bVar.b());
        if (bVar.a() instanceof C0173a) {
            ImageView imageView = (ImageView) b(h.cell_checkmark);
            String str = "checkmark";
            C7471uYa.a((Object) imageView, str);
            imageView.setVisibility(0);
            ImageView imageView2 = (ImageView) b(h.cell_checkmark);
            C7471uYa.a((Object) imageView2, str);
            imageView2.setContentDescription(getResources().getString(l.accessibility_checked));
        } else if (bVar.a() instanceof c) {
            Switch switchR = (Switch) b(h.cell_toggle);
            String str2 = "toggle";
            C7471uYa.a((Object) switchR, str2);
            switchR.setVisibility(0);
            Switch switchR2 = (Switch) b(h.cell_toggle);
            C7471uYa.a((Object) switchR2, str2);
            switchR2.setChecked(((c) bVar.a()).a());
        }
    }
}
