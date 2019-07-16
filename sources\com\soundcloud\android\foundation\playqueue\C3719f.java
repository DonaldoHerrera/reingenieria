package com.soundcloud.android.foundation.playqueue;

import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.aa;

@EVa(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/soundcloud/android/foundation/playqueue/AdQueueItem;", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "()V", "Audio", "Video", "Lcom/soundcloud/android/foundation/playqueue/AdQueueItem$Audio;", "Lcom/soundcloud/android/foundation/playqueue/AdQueueItem$Video;", "playqueue_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.foundation.playqueue.f reason: case insensitive filesystem */
/* compiled from: AdQueueItem.kt */
public abstract class C3719f extends q {

    /* renamed from: com.soundcloud.android.foundation.playqueue.f$a */
    /* compiled from: AdQueueItem.kt */
    public static final class a extends C3719f {
        private final C3693u c;

        public a(C3693u uVar) {
            C7471uYa.b(uVar, "audioAdData");
            super(null);
            this.c = uVar;
        }

        public com.soundcloud.android.foundation.playqueue.q.b b() {
            return com.soundcloud.android.foundation.playqueue.q.b.AUDIO_AD;
        }

        public C3508cda c() {
            return ((C3676c) a().b()).f();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Audio(audioAdData=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.foundation.playqueue.f$b */
    /* compiled from: AdQueueItem.kt */
    public static final class b extends C3719f {
        private final aa c;

        public b(aa aaVar) {
            C7471uYa.b(aaVar, "videoAdData");
            super(null);
            this.c = aaVar;
        }

        public com.soundcloud.android.foundation.playqueue.q.b b() {
            return com.soundcloud.android.foundation.playqueue.q.b.VIDEO_AD;
        }

        public C3508cda c() {
            return ((C3676c) a().b()).f();
        }

        public final boolean l() {
            Object b = this.b.b();
            C7471uYa.a(b, "adData.get()");
            if (b instanceof aa) {
                return ((aa) b).M();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Input ");
            sb.append(b);
            sb.append(" not of type ");
            sb.append(aa.class.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Video(videoAdData=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    private C3719f() {
    }

    public /* synthetic */ C3719f(C7264rYa rya) {
        this();
    }
}
