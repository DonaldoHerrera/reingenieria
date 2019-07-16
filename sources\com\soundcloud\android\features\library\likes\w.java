package com.soundcloud.android.features.library.likes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.features.library.aa.i;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.aa.o;
import com.soundcloud.android.likes.S;
import com.soundcloud.android.offlinestate.OfflineStateButton;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0011J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0011J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0011R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\t0\t0\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\t0\t0\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\t0\t0\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\t0\t0\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/features/library/likes/TrackLikesHeaderRenderer;", "Lcom/soundcloud/android/uniflow/android/ViewHolderFactory;", "Lcom/soundcloud/android/likes/TrackLikesHeaderUniflowItem;", "()V", "offlineToggled", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "searchClicked", "", "shuffleClick", "upsellClick", "upsellImpression", "createViewHolder", "Lcom/soundcloud/android/uniflow/android/ScViewHolder;", "parent", "Landroid/view/ViewGroup;", "Lio/reactivex/Observable;", "searchClick", "LikesHeaderViewHolder", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: TrackLikesHeaderRenderer.kt */
public final class w implements C6289dFa<S> {
    /* access modifiers changed from: private */
    public final C2332VH<RVa> a;
    /* access modifiers changed from: private */
    public final C2332VH<RVa> b;
    /* access modifiers changed from: private */
    public final C2332VH<RVa> c;
    /* access modifiers changed from: private */
    public final C2332VH<RVa> d;
    /* access modifiers changed from: private */
    public final C2332VH<Boolean> e;

    /* compiled from: TrackLikesHeaderRenderer.kt */
    public final class a extends C5378VEa<S> {
        private final TextView a;
        private final ImageButton b;
        private final ImageView c;
        private final OfflineStateButton d;
        final /* synthetic */ w e;

        public a(w wVar, View view) {
            C7471uYa.b(view, "itemView");
            this.e = wVar;
            super(view);
            View findViewById = view.findViewById(i.header_text);
            C7471uYa.a((Object) findViewById, "itemView.findViewById(R.id.header_text)");
            this.a = (TextView) findViewById;
            View findViewById2 = view.findViewById(i.shuffle_btn);
            C7471uYa.a((Object) findViewById2, "itemView.findViewById(R.id.shuffle_btn)");
            this.b = (ImageButton) findViewById2;
            View findViewById3 = view.findViewById(i.track_likes_header_search);
            C7471uYa.a((Object) findViewById3, "itemView.findViewById(R.…rack_likes_header_search)");
            this.c = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(i.offline_state_button);
            C7471uYa.a((Object) findViewById4, "itemView.findViewById(R.id.offline_state_button)");
            this.d = (OfflineStateButton) findViewById4;
        }

        private final void b(S s) {
            OfflineStateButton offlineStateButton = this.d;
            offlineStateButton.setVisibility(0);
            offlineStateButton.setOnClickListener(new r(this, s));
            offlineStateButton.setState(s.d());
            if (s.g()) {
                offlineStateButton.b();
            } else if (s.f()) {
                offlineStateButton.a();
            }
        }

        private final void c(S s) {
            this.d.setOnClickListener(null);
            this.d.setVisibility(8);
            if (s.j()) {
                b(s);
            } else if (s.i()) {
                b();
            } else {
                this.d.setState(C3823mda.NOT_OFFLINE);
            }
        }

        public void a(S s) {
            C7471uYa.b(s, "item");
            View view = this.itemView;
            String str = "itemView";
            C7471uYa.a((Object) view, str);
            view.setVisibility(s.e() ? 0 : 8);
            if (s.e()) {
                View view2 = this.itemView;
                C7471uYa.a((Object) view2, str);
                a(view2, s);
            }
        }

        private final void a(View view, S s) {
            int i = 0;
            this.a.setText(view.getResources().getQuantityString(o.library_search_likes_hint, s.c(), new Object[]{Integer.valueOf(s.c())}));
            ImageButton imageButton = this.b;
            imageButton.setOnClickListener(new C3619t(this, s));
            if (!s.h()) {
                i = 8;
            }
            imageButton.setVisibility(i);
            imageButton.setEnabled(s.h());
            this.c.setOnClickListener(new u(this));
            this.a.setOnClickListener(new v(this));
            c(s);
        }

        private final void b() {
            this.d.setVisibility(0);
            this.d.setOnClickListener(new C3604s(this));
            this.e.a.accept(RVa.a);
        }
    }

    public w() {
        C2332VH<RVa> s = C2332VH.s();
        String str = "PublishRelay.create<Unit>()";
        C7471uYa.a((Object) s, str);
        this.a = s;
        C2332VH<RVa> s2 = C2332VH.s();
        C7471uYa.a((Object) s2, str);
        this.b = s2;
        C2332VH<RVa> s3 = C2332VH.s();
        C7471uYa.a((Object) s3, str);
        this.c = s3;
        C2332VH<RVa> s4 = C2332VH.s();
        C7471uYa.a((Object) s4, str);
        this.d = s4;
        C2332VH<Boolean> s5 = C2332VH.s();
        C7471uYa.a((Object) s5, "PublishRelay.create<Boolean>()");
        this.e = s5;
    }

    public C5378VEa<S> a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.library_likes_header, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…es_header, parent, false)");
        return new a(this, inflate);
    }

    public final APa<RVa> b() {
        return this.d;
    }

    public final APa<RVa> c() {
        return this.b;
    }

    public final APa<RVa> d() {
        return this.c;
    }

    public final APa<RVa> e() {
        return this.a;
    }

    public final APa<Boolean> a() {
        return this.e;
    }
}
