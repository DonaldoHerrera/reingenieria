package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.StyledImageView;
import com.soundcloud.android.image.W;
import com.soundcloud.android.view.OverflowAnchorImageButton;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/view/adapters/CarouselPlaylistItemRenderer;", "Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "Lcom/soundcloud/android/foundation/domain/playable/PlaylistItem;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "(Lcom/soundcloud/android/image/ImageOperations;)V", "playlistListener", "Lcom/soundcloud/android/view/adapters/CarouselPlaylistItemRenderer$PlaylistListener;", "bindItemView", "", "position", "", "itemView", "Landroid/view/View;", "item", "createItemView", "parent", "Landroid/view/ViewGroup;", "setPlaylistListener", "PlaylistListener", "base_release"}, mv = {1, 1, 15})
/* renamed from: SIa reason: default package and case insensitive filesystem */
/* compiled from: CarouselPlaylistItemRenderer.kt */
public final class C5294SIa extends C5541_ta<C3863rda> {
    /* access modifiers changed from: private */
    public a a;
    private final N b;

    /* renamed from: SIa$a */
    /* compiled from: CarouselPlaylistItemRenderer.kt */
    public interface a {
        void a(Context context, C3863rda rda, int i);
    }

    public C5294SIa(N n) {
        C7471uYa.b(n, "imageOperations");
        this.b = n;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.carousel_playlist_item_fixed_width, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…xed_width, parent, false)");
        return inflate;
    }

    public void a(int i, View view, C3863rda rda) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(rda, "item");
        ((StyledImageView) view.findViewById(i.artwork)).a(rda.b(), C4928GKa.c(W.SQUARE), rda.a(), this.b);
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.title);
        C7471uYa.a((Object) customFontTextView, "title");
        customFontTextView.setText(rda.B());
        CustomFontTextView customFontTextView2 = (CustomFontTextView) view.findViewById(i.secondary_text);
        C7471uYa.a((Object) customFontTextView2, "secondary_text");
        customFontTextView2.setText(rda.d());
        ImageView imageView = (ImageView) view.findViewById(i.private_indicator);
        C7471uYa.a((Object) imageView, "private_indicator");
        int i2 = 0;
        imageView.setVisibility(rda.m() ? 0 : 8);
        ImageView imageView2 = (ImageView) view.findViewById(i.like_indicator);
        C7471uYa.a((Object) imageView2, "like_indicator");
        if (!rda.o()) {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
        OverflowAnchorImageButton overflowAnchorImageButton = (OverflowAnchorImageButton) view.findViewById(i.overflow_button);
        C7471uYa.a((Object) overflowAnchorImageButton, "overflow_button");
        overflowAnchorImageButton.setVisibility(8);
        view.setOnClickListener(new C5324TIa(this, rda, i));
    }

    public final void a(a aVar) {
        C7471uYa.b(aVar, "playlistListener");
        this.a = aVar;
    }
}
