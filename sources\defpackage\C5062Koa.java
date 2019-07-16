package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/soundcloud/android/playlists/AddToPlaylistItemRenderer;", "Lcom/soundcloud/android/uniflow/android/ViewHolderFactory;", "Lcom/soundcloud/android/playlists/AddTrackToPlaylistItem$AddTrackToPlaylist;", "()V", "addToPlaylistClick", "Lio/reactivex/subjects/PublishSubject;", "", "getAddToPlaylistClick", "()Lio/reactivex/subjects/PublishSubject;", "createViewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "parent", "Landroid/view/ViewGroup;", "Holder", "base_release"}, mv = {1, 1, 15})
/* renamed from: Koa reason: default package and case insensitive filesystem */
/* compiled from: AddToPlaylistItemRenderer.kt */
public final class C5062Koa implements C6289dFa<defpackage.C5333Toa.a> {
    private final C6781kVa<Long> a;

    /* renamed from: Koa$a */
    /* compiled from: AddToPlaylistItemRenderer.kt */
    public final class a extends C5378VEa<defpackage.C5333Toa.a> {
        final /* synthetic */ C5062Koa a;

        public a(C5062Koa koa, View view) {
            C7471uYa.b(view, "view");
            this.a = koa;
            super(view);
        }

        public void a(defpackage.C5333Toa.a aVar) {
            C7471uYa.b(aVar, "item");
            View view = this.itemView;
            view.setEnabled(!aVar.h());
            CustomFontTextView customFontTextView = (CustomFontTextView) view.findViewById(i.playListTitle);
            String str = "playListTitle";
            C7471uYa.a((Object) customFontTextView, str);
            customFontTextView.setText(aVar.c());
            CustomFontTextView customFontTextView2 = (CustomFontTextView) view.findViewById(i.playListTitle);
            C7471uYa.a((Object) customFontTextView2, str);
            customFontTextView2.setEnabled(!aVar.h());
            int d = aVar.d();
            CustomFontTextView customFontTextView3 = (CustomFontTextView) view.findViewById(i.trackCount);
            C7471uYa.a((Object) customFontTextView3, "trackCount");
            a(d, customFontTextView3);
            boolean g = aVar.g();
            boolean e = aVar.e();
            boolean f = aVar.f();
            View view2 = this.itemView;
            C7471uYa.a((Object) view2, "itemView");
            ImageView imageView = (ImageView) view2.findViewById(i.icon_private);
            C7471uYa.a((Object) imageView, "itemView.icon_private");
            ImageView imageView2 = (ImageView) view.findViewById(i.icon_offline);
            C7471uYa.a((Object) imageView2, "icon_offline");
            a(g, e, f, imageView, imageView2);
            view.setOnClickListener(new C5031Joa(this, aVar));
        }

        private final void a(boolean z, boolean z2, boolean z3, ImageView imageView, ImageView imageView2) {
            int i = 0;
            imageView.setVisibility(z ? 0 : 8);
            if (!z3 || !z2) {
                i = 8;
            }
            imageView2.setVisibility(i);
        }

        private final void a(int i, TextView textView) {
            textView.setCompoundDrawablesWithIntrinsicBounds(textView.getResources().getDrawable(h.stats_sounds), null, null, null);
            textView.setText(String.valueOf(i));
        }
    }

    public C5062Koa() {
        C6781kVa<Long> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.a = s;
    }

    public C5378VEa<defpackage.C5333Toa.a> a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.add_to_playlist_list_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…list_item, parent, false)");
        return new a(this, inflate);
    }

    public final C6781kVa<Long> a() {
        return this.a;
    }
}
