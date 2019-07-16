package com.soundcloud.android.features.library.downloads;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.features.library.aa.i;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.aa.o;
import com.soundcloud.android.features.library.aa.p;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.offline.C4070ce;
import com.soundcloud.android.view.DownloadImageView;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00020\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/features/library/downloads/DownloadsPlaylistRenderer;", "Lcom/soundcloud/android/uniflow/android/ViewHolderFactory;", "Lcom/soundcloud/android/features/library/downloads/DownloadsLibraryItem$Playlist;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "menuPresenter", "Lcom/soundcloud/android/playlists/PlaylistItemMenuPresenter;", "offlineSettingsOperations", "Lcom/soundcloud/android/offline/OfflineSettingsOperations;", "connectionHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "(Lcom/soundcloud/android/image/ImageOperations;Lcom/soundcloud/android/playlists/PlaylistItemMenuPresenter;Lcom/soundcloud/android/offline/OfflineSettingsOperations;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;)V", "playlistClick", "Lcom/jakewharton/rxrelay2/PublishRelay;", "kotlin.jvm.PlatformType", "createViewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "parent", "Landroid/view/ViewGroup;", "Lio/reactivex/Observable;", "DownloadsPlaylistViewHolder", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: DownloadsPlaylistRenderer.kt */
public final class w implements C6289dFa<com.soundcloud.android.features.library.downloads.s.a> {
    /* access modifiers changed from: private */
    public final C2332VH<com.soundcloud.android.features.library.downloads.s.a> a;
    /* access modifiers changed from: private */
    public final N b;
    /* access modifiers changed from: private */
    public final C7287rra c;
    /* access modifiers changed from: private */
    public final C4070ce d;
    /* access modifiers changed from: private */
    public final C6834lGa e;

    /* compiled from: DownloadsPlaylistRenderer.kt */
    public final class a extends C5378VEa<com.soundcloud.android.features.library.downloads.s.a> {
        private final TextView a;
        private final TextView b;
        private final TextView c;
        private final ImageView d;
        /* access modifiers changed from: private */
        public final View e;
        private final DownloadImageView f;
        private final TextView g;
        private final TextView h;
        private final Resources i;
        final /* synthetic */ w j;

        public a(w wVar, View view) {
            C7471uYa.b(view, "view");
            this.j = wVar;
            super(view);
            View findViewById = this.itemView.findViewById(i.list_item_header);
            C7471uYa.a((Object) findViewById, "itemView.findViewById(R.id.list_item_header)");
            this.a = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(i.list_item_subheader);
            C7471uYa.a((Object) findViewById2, "itemView.findViewById(R.id.list_item_subheader)");
            this.b = (TextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(i.list_item_right_info);
            C7471uYa.a((Object) findViewById3, "itemView.findViewById(R.id.list_item_right_info)");
            this.c = (TextView) findViewById3;
            View findViewById4 = this.itemView.findViewById(i.image);
            C7471uYa.a((Object) findViewById4, "itemView.findViewById(R.id.image)");
            this.d = (ImageView) findViewById4;
            View findViewById5 = this.itemView.findViewById(i.overflow_button);
            C7471uYa.a((Object) findViewById5, "itemView.findViewById(R.id.overflow_button)");
            this.e = findViewById5;
            View findViewById6 = this.itemView.findViewById(i.playlist_item_offline_state_image_view);
            C7471uYa.a((Object) findViewById6, "itemView.findViewById(R.…offline_state_image_view)");
            this.f = (DownloadImageView) findViewById6;
            View findViewById7 = this.itemView.findViewById(i.playlist_item_offline_state_text);
            C7471uYa.a((Object) findViewById7, "itemView.findViewById(R.…_item_offline_state_text)");
            this.g = (TextView) findViewById7;
            View findViewById8 = view.findViewById(i.playlist_item_no_network_text);
            C7471uYa.a((Object) findViewById8, "view.findViewById(R.id.p…ist_item_no_network_text)");
            this.h = (TextView) findViewById8;
            View view2 = this.itemView;
            C7471uYa.a((Object) view2, "itemView");
            Resources resources = view2.getResources();
            C7471uYa.a((Object) resources, "itemView.resources");
            this.i = resources;
        }

        private final void b() {
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            this.h.setVisibility(8);
        }

        private final void c() {
            if (this.j.d.a() && !this.j.e.a()) {
                a(this.h, p.offline_no_wifi);
            } else if (!this.j.e.d()) {
                a(this.h, p.offline_no_connection);
            } else {
                a(C3823mda.REQUESTED, p.offline_update_requested);
            }
        }

        public void a(com.soundcloud.android.features.library.downloads.s.a aVar) {
            C7471uYa.b(aVar, "item");
            C3863rda c2 = aVar.c();
            this.itemView.setOnClickListener(new u(this, aVar));
            this.e.setOnClickListener(new v(this, aVar));
            this.a.setText(c2.d());
            this.b.setText(c2.B());
            this.c.setText(this.i.getQuantityString(o.number_of_sounds, c2.L(), new Object[]{Integer.valueOf(c2.L())}));
            a(c2.r());
            N b2 = this.j.b;
            C3508cda a2 = c2.a();
            C7471uYa.a((Object) a2, "urn");
            C4928GKa b3 = c2.b();
            C7471uYa.a((Object) b3, "imageUrlTemplate");
            View view = this.itemView;
            C7471uYa.a((Object) view, "itemView");
            C3721b c3 = C3721b.c(view.getResources());
            C7471uYa.a((Object) c3, "ApiImageSize.getListItem…eSize(itemView.resources)");
            b2.a(a2, b3, c3, this.d, false);
        }

        private final void a(C3823mda mda) {
            b();
            int i2 = t.a[mda.ordinal()];
            if (i2 == 1) {
                c();
            } else if (i2 == 2) {
                a(C3823mda.DOWNLOADING, p.offline_update_in_progress);
            } else if (i2 == 3) {
                a(C3823mda.DOWNLOADED, p.offline_update_completed);
            } else if (i2 == 4) {
                a(C3823mda.UNAVAILABLE, p.offline_not_available_offline);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't show offline state ");
                sb.append(mda);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        private final void a(C3823mda mda, int i2) {
            this.f.setState(mda);
            a(this.g, i2);
        }

        private final void a(TextView textView, int i2) {
            textView.setText(textView.getResources().getString(i2));
            textView.setVisibility(0);
        }
    }

    public w(N n, C7287rra rra, C4070ce ceVar, C6834lGa lga) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(rra, "menuPresenter");
        C7471uYa.b(ceVar, "offlineSettingsOperations");
        C7471uYa.b(lga, "connectionHelper");
        this.b = n;
        this.c = rra;
        this.d = ceVar;
        this.e = lga;
        C2332VH<com.soundcloud.android.features.library.downloads.s.a> s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create<Playlist>()");
        this.a = s;
    }

    public C5378VEa<com.soundcloud.android.features.library.downloads.s.a> a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.playlist_item_downloads, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…downloads, parent, false)");
        return new a(this, inflate);
    }

    public final APa<com.soundcloud.android.features.library.downloads.s.a> a() {
        return this.a;
    }
}
