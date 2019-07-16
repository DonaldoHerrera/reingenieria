package com.soundcloud.android.playback.ui.view;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001BB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001b\u001a\u00020\u001cH\u0012J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0012J\b\u0010\"\u001a\u00020\u001eH\u0012J\b\u0010#\u001a\u00020\u001eH\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\fH\u0012J\u0014\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0(0'H\u0012J\b\u0010)\u001a\u00020\u001eH\u0013J$\u0010*\u001a\b\u0012\u0004\u0012\u00020+0(2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010-\u001a\u00020\u001aH\u0012J\u0016\u0010.\u001a\u00020\u001e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010/\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u001aH\u0016J\u0010\u00102\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\fH\u0012J$\u00103\u001a\b\u0012\u0004\u0012\u00020\f0(2\u0006\u00104\u001a\u00020+2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\f0(H\u0012J\u0014\u00106\u001a\u00020\u0013*\u00020+2\u0006\u00107\u001a\u000208H\u0012J\f\u00109\u001a\u00020\u0013*\u00020+H\u0012J\u0014\u0010:\u001a\u00020\u0013*\u00020+2\u0006\u00105\u001a\u00020\fH\u0012J\u0014\u0010;\u001a\u00020\u0013*\u00020+2\u0006\u0010<\u001a\u00020\fH\u0012J\u001c\u0010=\u001a\u0004\u0018\u00010\f*\b\u0012\u0004\u0012\u00020\f0>2\u0006\u0010?\u001a\u00020\u001aH\u0012J\f\u0010@\u001a\u00020\u0013*\u00020+H\u0012J\u0014\u0010A\u001a\u00020\u0013*\u00020+2\u0006\u00105\u001a\u00020\fH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/soundcloud/android/playback/ui/view/VisualPlayerCommentsPresenter;", "Lcom/soundcloud/android/player/ui/PlayStateAware;", "commentRenderer", "Lcom/soundcloud/android/playback/ui/view/PlayerCommentRenderer;", "playerCommentHolder", "Landroid/view/ViewGroup;", "playerSettings", "Lcom/soundcloud/android/settings/player/PlayerSettings;", "(Lcom/soundcloud/android/playback/ui/view/PlayerCommentRenderer;Landroid/view/ViewGroup;Lcom/soundcloud/android/settings/player/PlayerSettings;)V", "commentsRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "Lcom/soundcloud/android/foundation/domain/comments/CommentWithAuthor;", "currentCommentView", "goToComment", "Lcom/jakewharton/rxrelay2/PublishRelay;", "getGoToComment", "()Lcom/jakewharton/rxrelay2/PublishRelay;", "isScrubbing", "", "palette", "Landroidx/palette/graphics/Palette;", "playingEndBounds", "", "playingStartBounds", "viewPlaybackStateRelay", "Lcom/soundcloud/android/player/ui/ViewPlaybackState;", "centeredParams", "Landroid/widget/FrameLayout$LayoutParams;", "clear", "", "clearCommentView", "view", "Landroid/view/View;", "clearCurrentComment", "clearPalette", "createComment", "commentWithAuthor", "currentComment", "Lio/reactivex/Observable;", "Lcom/gojuno/koptional/Optional;", "initializeCommentEmissions", "nextCommentWithCurrentPlayState", "Lcom/soundcloud/android/playback/ui/view/VisualPlayerCommentsPresenter$PlaybackStateAndNextComment;", "comments", "playbackState", "setCommentsWithAuthor", "setPalette", "setState", "trackPageState", "showComment", "showableComment", "stateAndComment", "lastComment", "inPlayingRange", "comment", "Lcom/soundcloud/android/foundation/domain/comments/Comment;", "inScrubbingRange", "isTheSameCommentAs", "lastCommentInPlayingRange", "lastCommentWithAuthor", "nextComment", "", "viewPlaybackState", "nextCommentWithinRange", "nextCommentWithinScrubRange", "PlaybackStateAndNextComment", "base_release"}, mv = {1, 1, 15})
/* compiled from: VisualPlayerCommentsPresenter.kt */
public class n implements Hna {
    private final C2314UH<Nna> a;
    private final C2314UH<Set<C3799jda>> b;
    private final int c = -2001;
    private final int d = 2001;
    private Fd e;
    private ViewGroup f;
    private boolean g;
    private final C2332VH<C3799jda> h;
    private final i i;
    private final ViewGroup j;
    private final C5039Jwa k;

    /* compiled from: VisualPlayerCommentsPresenter.kt */
    private static final class a {
        private final Nna a;
        private final C3799jda b;

        public a(Nna nna, C3799jda jda) {
            C7471uYa.b(nna, "viewPlaybackState");
            C7471uYa.b(jda, "commentWithAuthor");
            this.a = nna;
            this.b = jda;
        }

        public final C3799jda a() {
            return this.b;
        }

        public final Nna b() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Nna nna = this.a;
            int i = 0;
            int hashCode = (nna != null ? nna.hashCode() : 0) * 31;
            C3799jda jda = this.b;
            if (jda != null) {
                i = jda.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlaybackStateAndNextComment(viewPlaybackState=");
            sb.append(this.a);
            sb.append(", commentWithAuthor=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    public n(i iVar, ViewGroup viewGroup, C5039Jwa jwa) {
        C7471uYa.b(iVar, "commentRenderer");
        C7471uYa.b(viewGroup, "playerCommentHolder");
        C7471uYa.b(jwa, "playerSettings");
        this.i = iVar;
        this.j = viewGroup;
        this.k = jwa;
        C2314UH<Nna> s = C2314UH.s();
        String str = "BehaviorRelay.create()";
        C7471uYa.a((Object) s, str);
        this.a = s;
        C2314UH<Set<C3799jda>> s2 = C2314UH.s();
        C7471uYa.a((Object) s2, str);
        this.b = s2;
        g();
        C2332VH<C3799jda> s3 = C2332VH.s();
        C7471uYa.a((Object) s3, "PublishRelay.create()");
        this.h = s3;
    }

    private LayoutParams d() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* access modifiers changed from: private */
    public void e() {
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            a((View) viewGroup);
            this.f = null;
        }
    }

    private APa<Ul<C3799jda>> f() {
        _Ua _ua = _Ua.a;
        APa<Ul<C3799jda>> b2 = APa.a((EPa<? extends T1>) this.a, (EPa<? extends T2>) this.b, (EPa<? extends T3>) this.k.a(), (C6844lQa<? super T1, ? super T2, ? super T3, ? extends R>) new p<Object,Object,Object,Object>(this)).b(Tl.b, (C6504gQa<R, ? super T, R>) new q<R,Object,R>(this));
        C7471uYa.a((Object) b2, "Observables.combineLates…\n            }\n        })");
        return b2;
    }

    @SuppressLint({"CheckResult"})
    private void g() {
        f().f((C6776kQa<? super T>) new r<Object>(this));
    }

    public void b() {
        this.e = null;
    }

    public C2332VH<C3799jda> c() {
        return this.h;
    }

    public void setState(Nna nna) {
        C7471uYa.b(nna, "trackPageState");
        this.a.accept(nna);
        if (nna.e() != this.g) {
            this.g = nna.e();
            ViewGroup viewGroup = this.f;
            if (viewGroup != null) {
                this.i.a(viewGroup, this.g, this.e);
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(C3799jda jda) {
        ViewGroup viewGroup = this.f;
        if (viewGroup == null || !C7471uYa.a(viewGroup.getTag(), (Object) jda)) {
            e();
            ViewGroup a2 = a(jda);
            this.i.a(a2, this.g, this.e);
            this.f = a2;
        }
    }

    private boolean c(a aVar, C3799jda jda) {
        return a(aVar, jda) && a(aVar);
    }

    public void a(Set<C3799jda> set) {
        C7471uYa.b(set, "comments");
        this.b.accept(set);
    }

    private boolean b(a aVar) {
        if (aVar.b().e()) {
            return a(aVar);
        }
        return a(aVar, aVar.a().c());
    }

    public void a(Fd fd) {
        C7471uYa.b(fd, "palette");
        this.e = fd;
    }

    public void a() {
        this.b.accept(SWa.a());
        b();
    }

    private boolean b(a aVar, C3799jda jda) {
        return a(aVar, jda.c());
    }

    private C3799jda a(List<C3799jda> list, Nna nna) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (nna.c().e() < ((C3799jda) obj).c().d()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C3799jda) obj;
    }

    private void a(View view) {
        view.setOnClickListener(null);
        this.j.removeView(view);
    }

    private ViewGroup a(C3799jda jda) {
        ViewGroup a2 = this.i.a(jda, this.j);
        a2.setTag(jda);
        a2.setOnClickListener(new o(this, jda));
        if (this.j.getChildCount() != 1 || (!C7471uYa.a((Object) this.j.getChildAt(0), (Object) a2))) {
            for (View onClickListener : Ac.a(this.j)) {
                onClickListener.setOnClickListener(null);
            }
            this.j.removeAllViews();
            this.j.addView(a2, d());
        }
        return a2;
    }

    /* access modifiers changed from: private */
    public Ul<C3799jda> a(a aVar, Ul<C3799jda> ul) {
        boolean z = ul instanceof Wl;
        if (z && b(aVar, (C3799jda) ((Wl) ul).a())) {
            return ul;
        }
        if (b(aVar)) {
            return Vl.a(aVar.a());
        }
        return (!z || !c(aVar, (C3799jda) ((Wl) ul).a())) ? Tl.b : ul;
    }

    private boolean a(a aVar, C3799jda jda) {
        return C7471uYa.a((Object) jda, (Object) aVar.a());
    }

    private boolean a(a aVar, C3791ida ida) {
        long e2 = aVar.b().c().e() - ida.d();
        return ((long) this.c) <= e2 && ((long) this.d) >= e2;
    }

    private boolean a(a aVar) {
        int c2 = (int) (((double) aVar.b().c().c()) * 0.01d);
        int min = Math.min(this.d, c2 / 2);
        long e2 = aVar.b().c().e() - aVar.a().c().d();
        return ((long) (min - c2)) <= e2 && ((long) min) >= e2;
    }

    /* access modifiers changed from: private */
    public Ul<a> a(Set<C3799jda> set, Nna nna) {
        C3799jda a2 = a(C7676xWa.a((Iterable) set, (Comparator) new s()), nna);
        return Vl.a(a2 != null ? new a(nna, a2) : null);
    }
}
