package com.soundcloud.android.collection.playhistory;

@EVa(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/soundcloud/android/collection/playhistory/PlayHistoryItem;", "", "kind", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryItem$Kind;", "(Lcom/soundcloud/android/collection/playhistory/PlayHistoryItem$Kind;)V", "getKind", "()Lcom/soundcloud/android/collection/playhistory/PlayHistoryItem$Kind;", "identityEquals", "", "other", "Kind", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryItemHeader;", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryItemEmpty;", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryItemTrack;", "base_release"}, mv = {1, 1, 15})
/* compiled from: PlayHistoryItem.kt */
public abstract class Q {
    private final a a;

    /* compiled from: PlayHistoryItem.kt */
    public enum a {
        HEADER,
        TRACK,
        EMPTY
    }

    private Q(a aVar) {
        this.a = aVar;
    }

    public a a() {
        return this.a;
    }

    public /* synthetic */ Q(a aVar, C7264rYa rya) {
        this(aVar);
    }
}
