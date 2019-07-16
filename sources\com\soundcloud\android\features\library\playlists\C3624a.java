package com.soundcloud.android.features.library.playlists;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.features.library.aa.i;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.aa.p;
import com.soundcloud.android.features.library.playlists.C3635l.a;

@EVa(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/soundcloud/android/features/library/playlists/EmptyPlaylistsRenderer;", "Lcom/soundcloud/android/uniflow/android/ViewHolderFactory;", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItem$Empty;", "()V", "createViewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "parent", "Landroid/view/ViewGroup;", "EmptyPlaylistViewHolder", "collections-ui_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.features.library.playlists.a reason: case insensitive filesystem */
/* compiled from: EmptyPlaylistsRenderer.kt */
public final class C3624a implements C6289dFa<a> {

    /* renamed from: com.soundcloud.android.features.library.playlists.a$a reason: collision with other inner class name */
    /* compiled from: EmptyPlaylistsRenderer.kt */
    public static final class C0089a extends C5378VEa<a> {
        private final TextView a;

        public C0089a(View view) {
            C7471uYa.b(view, "itemView");
            super(view);
            this.a = (TextView) view.findViewById(i.collections_empty_playlists);
        }

        public void a(a aVar) {
            C7471uYa.b(aVar, "item");
            this.a.setText(p.collections_empty_playlists);
        }
    }

    public C5378VEa<a> a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.empty_collections_playlists_view, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…      false\n            )");
        return new C0089a(inflate);
    }
}
