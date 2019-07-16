package defpackage;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.MediaMetadataCompat.Builder;
import com.soundcloud.android.playback.core.d;

@EVa(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/soundcloud/android/playback/players/queue/QueueManager;", "", "mediaProvider", "Lcom/soundcloud/android/playback/players/queue/MediaProvider;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "backgroundScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "(Lcom/soundcloud/android/playback/players/queue/MediaProvider;Lcom/soundcloud/android/playback/core/Logger;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "getCurrentItem", "Lio/reactivex/Single;", "Lcom/soundcloud/android/playback/players/queue/PlaybackData;", "position", "", "(Ljava/lang/Long;)Lio/reactivex/Single;", "isQueueEmpty", "", "loadInitialMediaMetadata", "", "defaultIfEmptyQueue", "Landroid/support/v4/media/MediaMetadataCompat;", "callback", "Lkotlin/Function1;", "replaceQueueBasedOnMediaId", "Lio/reactivex/Completable;", "mediaId", "", "skipToNext", "Lcom/soundcloud/android/playback/players/queue/SkipResult;", "skipTrigger", "Lcom/soundcloud/android/playback/players/queue/SkipTrigger;", "skipToPrevious", "Companion", "players_release"}, mv = {1, 1, 15})
/* renamed from: qna reason: default package and case insensitive filesystem */
/* compiled from: QueueManager.kt */
public class C4650qna {
    private static final MediaMetadataCompat a = new Builder().build();
    public static final a b = new a(null);
    private final C4609lna c;
    /* access modifiers changed from: private */
    public final d d;
    private final HPa e;
    private final HPa f;

    /* renamed from: qna$a */
    /* compiled from: QueueManager.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4650qna(C4609lna lna, d dVar, HPa hPa, HPa hPa2) {
        C7471uYa.b(lna, "mediaProvider");
        C7471uYa.b(dVar, "logger");
        C7471uYa.b(hPa, "backgroundScheduler");
        C7471uYa.b(hPa2, "mainThreadScheduler");
        this.c = lna;
        this.d = dVar;
        this.e = hPa;
        this.f = hPa2;
    }

    public C4677tna b(C4686una una) {
        C7471uYa.b(una, "skipTrigger");
        return this.c.a(una);
    }

    public IPa<C4625nna> a(Long l) {
        return this.c.a(l);
    }

    public boolean a() {
        return this.c.a();
    }

    public C4677tna a(C4686una una) {
        C7471uYa.b(una, "skipTrigger");
        return this.c.b(una);
    }

    public C6979nPa a(String str) {
        C7471uYa.b(str, "mediaId");
        return this.c.a(str);
    }

    public static /* synthetic */ void a(C4650qna qna, MediaMetadataCompat mediaMetadataCompat, _Xa _xa, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                mediaMetadataCompat = a;
                C7471uYa.a((Object) mediaMetadataCompat, "EMPTY_METADATA");
            }
            qna.a(mediaMetadataCompat, _xa);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadInitialMediaMetadata");
    }

    public void a(MediaMetadataCompat mediaMetadataCompat, _Xa<? super MediaMetadataCompat, RVa> _xa) {
        C7471uYa.b(mediaMetadataCompat, "defaultIfEmptyQueue");
        C7471uYa.b(_xa, "callback");
        defpackage.C4609lna.a.a(this.c, null, 1, null).d((C7118pQa<? super T, ? extends EPa<? extends R>>) C4659rna.a).b(mediaMetadataCompat).b(this.e).a(this.f).d((C6776kQa<? super T>) new C4668sna<Object>(this, _xa));
    }
}
