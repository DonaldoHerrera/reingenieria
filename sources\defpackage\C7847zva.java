package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

@EVa(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0002J \u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0012H\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R2\u0010\b\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\n0\n \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/soundcloud/android/search/suggestions/AutocompletionItemRenderer;", "Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "Lcom/soundcloud/android/search/suggestions/SuggestionItem$AutocompletionItem;", "()V", "arrowClick", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/search/suggestions/AutoCompletionClickData;", "kotlin.jvm.PlatformType", "arrowClickListener", "Lcom/soundcloud/java/optional/Optional;", "Lcom/soundcloud/android/search/suggestions/AutocompletionItemRenderer$ArrowClickListener;", "autocompletionClick", "useLegacyClicks", "", "Lio/reactivex/Observable;", "bindItemView", "", "position", "", "itemView", "Landroid/view/View;", "item", "createItemView", "viewGroup", "Landroid/view/ViewGroup;", "handleArrowClick", "autocompletionItem", "queryPosition", "highlight", "Landroid/text/SpannableString;", "autocompletion", "context", "Landroid/content/Context;", "setupArrow", "arrowButton", "Landroid/widget/ImageView;", "ArrowClickListener", "base_release"}, mv = {1, 1, 15})
/* renamed from: zva reason: default package and case insensitive filesystem */
/* compiled from: AutocompletionItemRenderer.kt */
public final class C7847zva extends C5541_ta<defpackage.C7780ywa.a> {
    private C4928GKa<a> a = C4928GKa.a();
    /* access modifiers changed from: private */
    public final C6781kVa<C7433tva> b;
    private final C6781kVa<C7433tva> c;
    private boolean d;

    /* renamed from: zva$a */
    /* compiled from: AutocompletionItemRenderer.kt */
    public interface a {
        void a(String str, String str2, C4928GKa<C3508cda> gKa, int i);
    }

    public C7847zva() {
        C6781kVa<C7433tva> s = C6781kVa.s();
        String str = "PublishSubject.create<AutoCompletionClickData>()";
        C7471uYa.a((Object) s, str);
        this.b = s;
        C6781kVa<C7433tva> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, str);
        this.c = s2;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.autocompletion_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(view…n_item, viewGroup, false)");
        return inflate;
    }

    public final APa<C7433tva> b() {
        return this.b;
    }

    public void a(int i, View view, defpackage.C7780ywa.a aVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(aVar, "item");
        View findViewById = view.findViewById(i.search_title);
        C7471uYa.a((Object) findViewById, "itemView.findViewById<TextView>(R.id.search_title)");
        TextView textView = (TextView) findViewById;
        Context context = view.getContext();
        C7471uYa.a((Object) context, "itemView.context");
        textView.setText(a(aVar, context));
        if (!this.d) {
            view.setOnClickListener(new C4758Ava(this, new C7433tva(aVar, i)));
        }
        View findViewById2 = view.findViewById(i.arrow_icon);
        C7471uYa.a((Object) findViewById2, "itemView.findViewById(R.id.arrow_icon)");
        a((ImageView) findViewById2, aVar, i);
    }

    public final APa<C7433tva> a() {
        return this.c;
    }

    private final SpannableString a(defpackage.C7780ywa.a aVar, Context context) {
        C7642wwa a2 = C7711xwa.a(aVar.g(), aVar.i());
        SpannableString spannableString = new SpannableString(aVar.i());
        C7711xwa.a(context, spannableString, a2);
        return spannableString;
    }

    private final void a(ImageView imageView, defpackage.C7780ywa.a aVar, int i) {
        imageView.setOnClickListener(new C4820Cva(this, aVar, i));
        C6768kIa.a((View) imageView, g.search_suggestion_arrow_touch_expansion);
    }

    /* access modifiers changed from: private */
    public final void a(defpackage.C7780ywa.a aVar, int i) {
        this.a.a((C7733yKa<? super T>) new C4789Bva<Object>(aVar, i));
        this.c.a(new C7433tva(aVar, i));
    }
}
