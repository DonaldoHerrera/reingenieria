package defpackage;

@EVa(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/playback/players/queue/MediaProvider;", "", "getCurrentQueueItem", "Lio/reactivex/Single;", "Lcom/soundcloud/android/playback/players/queue/PlaybackData;", "position", "", "(Ljava/lang/Long;)Lio/reactivex/Single;", "isQueueEmpty", "", "replaceQueueBasedOnMediaId", "Lio/reactivex/Completable;", "mediaId", "", "setQueueChangedListener", "", "listener", "Lcom/soundcloud/android/playback/players/queue/QueueChangedListener;", "skipToNextQueueItem", "Lcom/soundcloud/android/playback/players/queue/SkipResult;", "skipTrigger", "Lcom/soundcloud/android/playback/players/queue/SkipTrigger;", "skipToPreviousQueueItem", "players_release"}, mv = {1, 1, 15})
/* renamed from: lna reason: default package and case insensitive filesystem */
/* compiled from: MediaProvider.kt */
public interface C4609lna {

    /* renamed from: lna$a */
    /* compiled from: MediaProvider.kt */
    public static final class a {
        public static /* synthetic */ IPa a(C4609lna lna, Long l, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    l = null;
                }
                return lna.a(l);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrentQueueItem");
        }
    }

    IPa<C4625nna> a(Long l);

    C6979nPa a(String str);

    C4677tna a(C4686una una);

    void a(C4641pna pna);

    boolean a();

    C4677tna b(C4686una una);
}
