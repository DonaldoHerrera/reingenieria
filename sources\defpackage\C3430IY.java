package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.StyledImageView;
import com.soundcloud.android.image.W;
import com.soundcloud.android.view.OverflowAnchorImageButton;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

@EVa(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J \u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J&\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/discovery/SelectionItemRenderer;", "Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "Lcom/soundcloud/android/discovery/SelectionItemViewModel;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "selectionItemClickListener", "Lio/reactivex/subjects/PublishSubject;", "(Lcom/soundcloud/android/image/ImageOperations;Lio/reactivex/subjects/PublishSubject;)V", "bindClickHandling", "", "view", "Landroid/view/View;", "selectionItem", "bindImage", "bindItemView", "position", "", "itemView", "item", "bindOverflowMenu", "bindText", "textView", "Landroid/widget/TextView;", "text", "", "artworkStyle", "Lcom/soundcloud/android/image/ImageStyle;", "createItemView", "parent", "Landroid/view/ViewGroup;", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: IY reason: default package and case insensitive filesystem */
/* compiled from: SelectionItemRenderer.kt */
public final class C3430IY extends C5541_ta<C3445NY> {
    private final N a;
    /* access modifiers changed from: private */
    public final C6781kVa<C3445NY> b;

    /* renamed from: IY$a */
    /* compiled from: SelectionItemRenderer.kt */
    public static final class a {
        private final N a;

        public a(N n) {
            C7471uYa.b(n, "imageOperations");
            this.a = n;
        }

        public final C3430IY a(C6781kVa<C3445NY> kva) {
            C7471uYa.b(kva, "selectionItemClickListener");
            return new C3430IY(this.a, kva);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C3430IY.a) r2).a) != false) goto L_0x0015;
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
            N n = this.a;
            if (n != null) {
                return n.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory(imageOperations=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    public C3430IY(N n, C6781kVa<C3445NY> kva) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(kva, "selectionItemClickListener");
        this.a = n;
        this.b = kva;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.selection_carousel_playlist_item_fixed_width, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…xed_width, parent, false)");
        return inflate;
    }

    private final void b(View view, C3445NY ny) {
        ((StyledImageView) view.findViewById(i.artwork)).a(C4928GKa.b(ny.b()), C4928GKa.b(ny.a()), C4928GKa.b(ny.f()), this.a);
    }

    public void a(int i, View view, C3445NY ny) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(ny, "item");
        b(view, ny);
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.title);
        C7471uYa.a((Object) customFontTextView, "itemView.title");
        a((TextView) customFontTextView, ny.d(), ny.a());
        CustomFontTextView customFontTextView2 = (CustomFontTextView) view.findViewById(i.secondary_text);
        C7471uYa.a((Object) customFontTextView2, "itemView.secondary_text");
        a((TextView) customFontTextView2, ny.c(), ny.a());
        a(view);
        a(view, ny);
    }

    private final void a(View view) {
        OverflowAnchorImageButton overflowAnchorImageButton = (OverflowAnchorImageButton) view.findViewById(i.overflow_button);
        C7471uYa.a((Object) overflowAnchorImageButton, "view.overflow_button");
        overflowAnchorImageButton.setVisibility(8);
    }

    private final void a(TextView textView, String str, W w) {
        if (str != null) {
            textView.setText(str);
            if (w == W.CIRCULAR) {
                textView.setGravity(1);
            }
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    private final void a(View view, C3445NY ny) {
        view.setOnClickListener(new C3433JY(this, ny));
    }
}
