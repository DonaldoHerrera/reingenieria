package defpackage;

import com.soundcloud.android.view.customfontviews.CustomFontTextView;

/* renamed from: eJa reason: default package and case insensitive filesystem */
/* compiled from: UserItemRenderer.kt */
final class C6361eJa<T> implements C7733yKa<String> {
    final /* synthetic */ CustomFontTextView a;

    C6361eJa(CustomFontTextView customFontTextView) {
        this.a = customFontTextView;
    }

    /* renamed from: a */
    public final void accept(String str) {
        CustomFontTextView customFontTextView = this.a;
        C7471uYa.a((Object) customFontTextView, "countryText");
        customFontTextView.setText(str);
    }
}
