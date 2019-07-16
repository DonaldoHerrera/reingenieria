package com.soundcloud.android.soul.components.empty.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/soul/components/empty/text/TextOnLight;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "descriptionText", "Landroid/widget/TextView;", "taglineText", "render", "", "viewModel", "Lcom/soundcloud/android/soul/components/empty/text/TextOnLight$ViewModel;", "setupViewFromAttributes", "ViewModel", "components_release"}, mv = {1, 1, 15})
/* compiled from: TextOnLight.kt */
public final class TextOnLight extends LinearLayout {
    private final TextView a;
    private final TextView b;

    /* compiled from: TextOnLight.kt */
    public static final class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            C7471uYa.b(str, "tagline");
            C7471uYa.b(str2, "description");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
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
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
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
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewModel(tagline=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    public TextOnLight(Context context) {
        this(context, null, 0, 6, null);
    }

    public TextOnLight(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TextOnLight(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        LinearLayout.inflate(context, k.empty_text_on_light, this);
        View findViewById = findViewById(h.empty_text_tagline);
        C7471uYa.a((Object) findViewById, "findViewById(R.id.empty_text_tagline)");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(h.empty_text_description);
        C7471uYa.a((Object) findViewById2, "findViewById(R.id.empty_text_description)");
        this.b = (TextView) findViewById2;
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        int[] iArr = n.TextOnLight;
        C7471uYa.a((Object) iArr, "R.styleable.TextOnLight");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        a(new a(C0282Ya.b(obtainStyledAttributes, n.TextOnLight_tagline), C0282Ya.b(obtainStyledAttributes, n.TextOnLight_description)));
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ TextOnLight(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
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
        this.a.setText(aVar.b());
        this.b.setText(aVar.a());
    }
}
