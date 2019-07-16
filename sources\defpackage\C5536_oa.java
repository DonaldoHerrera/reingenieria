package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.l;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/soundcloud/android/playlists/CreatePlaylistItemRenderer;", "Lcom/soundcloud/android/uniflow/android/ViewHolderFactory;", "Lcom/soundcloud/android/playlists/AddTrackToPlaylistItem;", "()V", "createNewPlaylistClick", "Lio/reactivex/subjects/PublishSubject;", "", "getCreateNewPlaylistClick", "()Lio/reactivex/subjects/PublishSubject;", "createViewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "parent", "Landroid/view/ViewGroup;", "Holder", "base_release"}, mv = {1, 1, 15})
/* renamed from: _oa reason: default package and case insensitive filesystem */
/* compiled from: CreatePlaylistItemRenderer.kt */
public final class C5536_oa implements C6289dFa<C5333Toa> {
    private final C6781kVa<RVa> a;

    /* renamed from: _oa$a */
    /* compiled from: CreatePlaylistItemRenderer.kt */
    public final class a extends C5378VEa<C5333Toa> {
        final /* synthetic */ C5536_oa a;

        public a(C5536_oa _oa, View view) {
            C7471uYa.b(view, "view");
            this.a = _oa;
            super(view);
        }

        public void a(C5333Toa toa) {
            C7471uYa.b(toa, "item");
            this.itemView.setOnClickListener(new C5507Zoa(this));
        }
    }

    public C5536_oa() {
        C6781kVa<RVa> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.a = s;
    }

    public C5378VEa<C5333Toa> a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.add_to_playlist_create_playlist_item, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…list_item, parent, false)");
        return new a(this, inflate);
    }

    public final C6781kVa<RVa> a() {
        return this.a;
    }
}
