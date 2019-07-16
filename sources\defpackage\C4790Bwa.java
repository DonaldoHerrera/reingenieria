package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.image.N;

/* renamed from: Bwa reason: default package and case insensitive filesystem */
/* compiled from: SuggestionItemRenderer.kt */
public abstract class C4790Bwa extends C5541_ta<C7780ywa> {
    /* access modifiers changed from: private */
    public final C6781kVa<C7849zwa> a;
    private boolean b;
    private final N c;

    protected C4790Bwa(N n) {
        C7471uYa.b(n, "imageOperations");
        this.c = n;
        C6781kVa<C7849zwa> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<SuggestionItemClickData>()");
        this.a = s;
    }

    /* access modifiers changed from: protected */
    public abstract void a(ImageView imageView, Vca vca, Resources resources);

    public final APa<C7849zwa> b() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final N a() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, View view, C7366swa swa, int i2) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(swa, "suggestionItem");
        TextView textView = (TextView) view.findViewById(i.title);
        Context context = view.getContext();
        C7471uYa.a((Object) textView, "titleText");
        C7471uYa.a((Object) context, "context");
        textView.setText(a(swa, context));
        ((ImageView) view.findViewById(i.iv_search_type)).setImageResource(i2);
        ImageView imageView = (ImageView) view.findViewById(i.icon);
        C7471uYa.a((Object) imageView, "icon");
        Resources resources = context.getResources();
        C7471uYa.a((Object) resources, "context.resources");
        a(imageView, swa, resources);
        if (!this.b) {
            view.setOnClickListener(new C4759Awa(this, swa, i));
        }
    }

    private final Spanned a(C7366swa swa, Context context) {
        C7642wwa wwa = (C7642wwa) swa.j().d(C7711xwa.a(swa.g(), swa.h()));
        SpannableString spannableString = new SpannableString(swa.h());
        C7711xwa.a(context, spannableString, wwa);
        return spannableString;
    }
}
