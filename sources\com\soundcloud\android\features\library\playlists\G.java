package com.soundcloud.android.features.library.playlists;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.soundcloud.android.features.library.aa.i;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.playlists.C3635l.b;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/features/library/playlists/PlaylistHeaderRenderer;", "Lcom/soundcloud/android/presentation/LegacyCellRenderer;", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItem$Header;", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "onSettingsClickListener", "Lcom/soundcloud/android/features/library/playlists/PlaylistHeaderRenderer$OnSettingsClickListener;", "getOnSettingsClickListener", "()Lcom/soundcloud/android/features/library/playlists/PlaylistHeaderRenderer$OnSettingsClickListener;", "setOnSettingsClickListener", "(Lcom/soundcloud/android/features/library/playlists/PlaylistHeaderRenderer$OnSettingsClickListener;)V", "bindItemView", "", "position", "", "itemView", "Landroid/view/View;", "item", "createItemView", "parent", "Landroid/view/ViewGroup;", "OnSettingsClickListener", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: PlaylistHeaderRenderer.kt */
public final class G extends C5541_ta<b> {
    private a a;
    private final Resources b;

    /* compiled from: PlaylistHeaderRenderer.kt */
    public interface a {
        void a(View view);
    }

    public G(Resources resources) {
        C7471uYa.b(resources, "resources");
        this.b = resources;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.collection_playlist_header, viewGroup, false);
        C7471uYa.a((Object) inflate, "view");
        ((ImageButton) inflate.findViewById(i.btn_collections_playlist_options)).setOnClickListener(new H(this));
        ImageButton imageButton = (ImageButton) inflate.findViewById(i.btn_collections_playlist_options);
        C7471uYa.a((Object) imageButton, "view.btn_collections_playlist_options");
        C6428fIa.a((ImageView) imageButton);
        return inflate;
    }

    public final a a() {
        return this.a;
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    public void a(int i, View view, b bVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(bVar, "item");
        CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.header_text);
        C7471uYa.a((Object) customFontTextView, "itemView.header_text");
        customFontTextView.setText(this.b.getQuantityString(bVar.e(), bVar.d(), new Object[]{Integer.valueOf(bVar.d())}));
    }
}
