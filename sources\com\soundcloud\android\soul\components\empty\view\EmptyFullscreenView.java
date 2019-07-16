package com.soundcloud.android.soul.components.empty.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.view.customfontviews.CustomFontButton;

@EVa(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001 B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u001a\u0010\u001b\u001a\u00020\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001dJ\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/soundcloud/android/soul/components/empty/view/EmptyFullscreenView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "descriptionText", "Landroid/widget/TextView;", "illustration", "Landroid/widget/ImageView;", "taglineText", "upsellButton", "Lcom/soundcloud/android/view/customfontviews/CustomFontButton;", "render", "", "viewModel", "Lcom/soundcloud/android/soul/components/empty/view/EmptyFullscreenView$ViewModel;", "setDrawableOrHide", "view", "drawableToSet", "(Landroid/widget/ImageView;Ljava/lang/Integer;)V", "setTextOrHide", "textToSet", "", "setUpsellButtonOnClickListener", "listener", "Lkotlin/Function1;", "", "setupViewFromAttributes", "ViewModel", "components_release"}, mv = {1, 1, 15})
/* compiled from: EmptyFullscreenView.kt */
public final class EmptyFullscreenView extends ConstraintLayout {
    private final TextView u;
    private final TextView v;
    private final CustomFontButton w;
    private final ImageView x;

    /* compiled from: EmptyFullscreenView.kt */
    public static final class a {
        private final String a;
        private final String b;
        private final String c;
        private final Integer d;

        public a(String str, String str2, String str3, Integer num) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = num;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final Integer c() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0033;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                        if (C7471uYa.a((Object) this.b, (Object) aVar.b)) {
                            if (C7471uYa.a((Object) this.c, (Object) aVar.c)) {
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
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Integer num = this.d;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewModel(tagline=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", buttonText=");
            sb.append(this.c);
            sb.append(", icon=");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }
    }

    public EmptyFullscreenView(Context context) {
        this(context, null, 0, 6, null);
    }

    public EmptyFullscreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EmptyFullscreenView(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        ViewGroup.inflate(context, k.empty_view_fullscreen, this);
        View findViewById = findViewById(h.empty_text_tagline);
        C7471uYa.a((Object) findViewById, "findViewById(R.id.empty_text_tagline)");
        this.u = (TextView) findViewById;
        View findViewById2 = findViewById(h.empty_illustration);
        C7471uYa.a((Object) findViewById2, "findViewById(R.id.empty_illustration)");
        this.x = (ImageView) findViewById2;
        View findViewById3 = findViewById(h.empty_button_layout);
        C7471uYa.a((Object) findViewById3, "findViewById(R.id.empty_button_layout)");
        this.w = (CustomFontButton) findViewById3;
        View findViewById4 = findViewById(h.empty_text_description);
        C7471uYa.a((Object) findViewById4, "findViewById(R.id.empty_text_description)");
        this.v = (TextView) findViewById4;
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        int[] iArr = n.EmptyFullscreenView;
        C7471uYa.a((Object) iArr, "R.styleable.EmptyFullscreenView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        Integer a2 = b.c(obtainStyledAttributes, n.EmptyFullscreenView_srcCompat);
        a(new a(b.d(obtainStyledAttributes, n.EmptyFullscreenView_tagline), b.d(obtainStyledAttributes, n.EmptyFullscreenView_description), b.d(obtainStyledAttributes, n.EmptyFullscreenView_buttonText), a2));
        obtainStyledAttributes.recycle();
    }

    public final void setUpsellButtonOnClickListener(_Xa<Object, RVa> _xa) {
        C7471uYa.b(_xa, CastExtraArgs.LISTENER);
        this.w.setOnClickListener(new a(_xa));
    }

    public /* synthetic */ EmptyFullscreenView(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
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
        a(this.x, aVar.c());
        a(this.u, aVar.d());
        a(this.v, aVar.b());
        a((TextView) this.w, aVar.a());
    }

    private final void a(TextView textView, String str) {
        if (str != null) {
            b.d(textView);
            textView.setText(str);
            return;
        }
        b.c(textView);
    }

    private final void a(ImageView imageView, Integer num) {
        if (num != null) {
            b.d(imageView);
            imageView.setImageDrawable(C1437k.b(getContext(), num.intValue()));
            return;
        }
        b.c(imageView);
    }
}
