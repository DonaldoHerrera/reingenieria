package com.soundcloud.android.likes;

@EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/soundcloud/android/likes/TrackLikesUniflowItem;", "", "kind", "Lcom/soundcloud/android/likes/TrackLikesUniflowItem$Kind;", "(Lcom/soundcloud/android/likes/TrackLikesUniflowItem$Kind;)V", "getKind", "()Lcom/soundcloud/android/likes/TrackLikesUniflowItem$Kind;", "isSameIdentity", "", "other", "Kind", "Lcom/soundcloud/android/likes/TrackLikesHeaderUniflowItem;", "Lcom/soundcloud/android/likes/TrackLikesTrackUniflowItem;", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackLikesUniflowItem.kt */
public abstract class la {
    private final a a;

    /* compiled from: TrackLikesUniflowItem.kt */
    public enum a {
        HEADER,
        TRACK
    }

    private la(a aVar) {
        this.a = aVar;
    }

    public final a a() {
        return this.a;
    }

    public /* synthetic */ la(a aVar, C7264rYa rya) {
        this(aVar);
    }

    public final boolean a(la laVar) {
        C7471uYa.b(laVar, "other");
        if ((this instanceof S) && (laVar instanceof S)) {
            return true;
        }
        if (!(this instanceof V) || !(laVar instanceof V)) {
            return false;
        }
        return C7471uYa.a((Object) ((V) this).b().a(), (Object) ((V) laVar).b().a());
    }
}
