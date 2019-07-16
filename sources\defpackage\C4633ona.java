package defpackage;

import com.soundcloud.android.playback.core.PlaybackItem;

@EVa(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/soundcloud/android/playback/players/queue/PlaybackItemFetchResult;", "", "()V", "Failure", "FailureReaction", "Success", "Lcom/soundcloud/android/playback/players/queue/PlaybackItemFetchResult$Success;", "Lcom/soundcloud/android/playback/players/queue/PlaybackItemFetchResult$Failure;", "players_release"}, mv = {1, 1, 15})
/* renamed from: ona reason: default package and case insensitive filesystem */
/* compiled from: PlaybackData.kt */
public abstract class C4633ona {

    /* renamed from: ona$a */
    /* compiled from: PlaybackData.kt */
    public static final class a extends C4633ona {
        private final b a;

        public a(b bVar) {
            C7471uYa.b(bVar, "reaction");
            super(null);
            this.a = bVar;
        }

        public final b a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C4633ona.a) r2).a) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar != null) {
                return bVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure(reaction=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    @EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/soundcloud/android/playback/players/queue/PlaybackItemFetchResult$FailureReaction;", "", "()V", "None", "Pause", "SkipNext", "Lcom/soundcloud/android/playback/players/queue/PlaybackItemFetchResult$FailureReaction$Pause;", "Lcom/soundcloud/android/playback/players/queue/PlaybackItemFetchResult$FailureReaction$SkipNext;", "Lcom/soundcloud/android/playback/players/queue/PlaybackItemFetchResult$FailureReaction$None;", "players_release"}, mv = {1, 1, 15})
    /* renamed from: ona$b */
    /* compiled from: PlaybackData.kt */
    public static abstract class b {

        /* renamed from: ona$b$a */
        /* compiled from: PlaybackData.kt */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: ona$b$b reason: collision with other inner class name */
        /* compiled from: PlaybackData.kt */
        public static final class C0136b extends b {
            public static final C0136b a = new C0136b();

            private C0136b() {
                super(null);
            }
        }

        /* renamed from: ona$b$c */
        /* compiled from: PlaybackData.kt */
        public static final class c extends b {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: ona$c */
    /* compiled from: PlaybackData.kt */
    public static final class c extends C4633ona {
        private final PlaybackItem a;

        public c(PlaybackItem playbackItem) {
            C7471uYa.b(playbackItem, "playbackItem");
            super(null);
            this.a = playbackItem;
        }

        public final PlaybackItem a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.C4633ona.c) r2).a) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            PlaybackItem playbackItem = this.a;
            if (playbackItem != null) {
                return playbackItem.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Success(playbackItem=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    private C4633ona() {
    }

    public /* synthetic */ C4633ona(C7264rYa rya) {
        this();
    }
}
