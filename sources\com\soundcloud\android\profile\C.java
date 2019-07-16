package com.soundcloud.android.profile;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.soundcloud.android.profile.P.b;
import com.soundcloud.android.profile.P.c;
import com.soundcloud.android.profile.P.d;
import com.soundcloud.android.profile.P.e;
import com.soundcloud.android.profile.P.f;

@EVa(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BG\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u001e\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010 \u001a\u00020\u001fH\u0016R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018¨\u0006&"}, d2 = {"Lcom/soundcloud/android/profile/ProfileBucketsAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/profile/ProfileBucketsItem;", "dividerRenderer", "Lcom/soundcloud/android/profile/DividerRenderer;", "headerRenderer", "Lcom/soundcloud/android/profile/HeaderRenderer;", "viewAllRenderer", "Lcom/soundcloud/android/profile/ViewAllRenderer;", "trackCardRenderer", "Lcom/soundcloud/android/profile/ProfileBucketsTrackCardRenderer;", "trackItemRenderer", "Lcom/soundcloud/android/profile/ProfileBucketsTrackItemRenderer;", "playlistCardRenderer", "Lcom/soundcloud/android/profile/ProfileBucketsPlaylistCardRenderer;", "playlistItemRenderer", "Lcom/soundcloud/android/profile/ProfileBucketsPlaylistItemRenderer;", "endOfListDividerRenderer", "Lcom/soundcloud/android/profile/EndOfListDividerRenderer;", "(Lcom/soundcloud/android/profile/DividerRenderer;Lcom/soundcloud/android/profile/HeaderRenderer;Lcom/soundcloud/android/profile/ViewAllRenderer;Lcom/soundcloud/android/profile/ProfileBucketsTrackCardRenderer;Lcom/soundcloud/android/profile/ProfileBucketsTrackItemRenderer;Lcom/soundcloud/android/profile/ProfileBucketsPlaylistCardRenderer;Lcom/soundcloud/android/profile/ProfileBucketsPlaylistItemRenderer;Lcom/soundcloud/android/profile/EndOfListDividerRenderer;)V", "onPlaylistClicked", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/navigation/NavigationTarget;", "getOnPlaylistClicked", "()Lio/reactivex/Observable;", "onTrackClicked", "Lcom/soundcloud/android/playback/PlaybackInitiator$PlayParams;", "getOnTrackClicked", "onViewAllClicked", "getOnViewAllClicked", "getBasicItemViewType", "", "position", "onBindViewHolder", "", "scViewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: ProfileBucketsAdapter.kt */
public final class C extends C5407WEa<P> {
    public static final a g = new a(null);
    private final APa<com.soundcloud.android.playback.Db.a> h;
    private final APa<C4621nja> i;
    private final APa<C4621nja> j;

    /* compiled from: ProfileBucketsAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean a(P p) {
            if (p instanceof e) {
                if (((e) p).a() != 0) {
                    return true;
                }
            } else if (!(p instanceof d) || ((d) p).a() != 0) {
                return true;
            }
            return false;
        }
    }

    public C(C5820n nVar, r rVar, pe peVar, C5801ja jaVar, C5816ma maVar, S s, V v, C5830p pVar) {
        C7471uYa.b(nVar, "dividerRenderer");
        C7471uYa.b(rVar, "headerRenderer");
        C7471uYa.b(peVar, "viewAllRenderer");
        C7471uYa.b(jaVar, "trackCardRenderer");
        C7471uYa.b(maVar, "trackItemRenderer");
        C7471uYa.b(s, "playlistCardRenderer");
        C7471uYa.b(v, "playlistItemRenderer");
        C7471uYa.b(pVar, "endOfListDividerRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(0, nVar), new C5693cFa(1, rVar), new C5693cFa(2, peVar), new C5693cFa(3, jaVar), new C5693cFa(4, maVar), new C5693cFa(5, s), new C5693cFa(6, v), new C5693cFa(7, pVar)});
        APa<com.soundcloud.android.playback.Db.a> b = maVar.a().b((EPa<? extends T>) jaVar.a());
        C7471uYa.a((Object) b, "trackItemRenderer.onTrac…dRenderer.onTrackClicked)");
        this.h = b;
        APa<C4621nja> b2 = v.a().b((EPa<? extends T>) s.a());
        C7471uYa.a((Object) b2, "playlistItemRenderer.onP…nderer.onPlaylistClicked)");
        this.i = b2;
        this.j = peVar.a();
    }

    /* renamed from: a */
    public void b(C5378VEa<P> vEa, int i2) {
        C7471uYa.b(vEa, "scViewHolder");
        super.b(vEa, i2);
        P p = (P) g(i2);
        View view = vEa.itemView;
        C7471uYa.a((Object) view, "scViewHolder.itemView");
        LayoutParams layoutParams = view.getLayoutParams();
        C7471uYa.a((Object) layoutParams, "scViewHolder.itemView.layoutParams");
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).a(g.a(p));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(layoutParams);
        sb.append(" not of type ");
        sb.append(StaggeredGridLayoutManager.LayoutParams.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    public int f(int i2) {
        P p = (P) g(i2);
        if (p instanceof com.soundcloud.android.profile.P.a) {
            return 0;
        }
        if (p instanceof c) {
            return 1;
        }
        if (p instanceof f) {
            return 2;
        }
        if (p instanceof e) {
            return ((e) p).a() == 0 ? 3 : 4;
        }
        if (p instanceof d) {
            return ((d) p).a() == 0 ? 5 : 6;
        }
        if (p instanceof b) {
            return 7;
        }
        throw new FVa();
    }

    public final APa<C4621nja> j() {
        return this.i;
    }

    public final APa<com.soundcloud.android.playback.Db.a> k() {
        return this.h;
    }

    public final APa<C4621nja> l() {
        return this.j;
    }
}
