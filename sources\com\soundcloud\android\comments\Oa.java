package com.soundcloud.android.comments;

@EVa(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/soundcloud/android/comments/LocalCommentUpdate;", "", "()V", "AddCommentUpdate", "DeleteCommentUpdate", "Lcom/soundcloud/android/comments/LocalCommentUpdate$AddCommentUpdate;", "Lcom/soundcloud/android/comments/LocalCommentUpdate$DeleteCommentUpdate;", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackCommentRepository.kt */
public abstract class Oa {

    /* compiled from: TrackCommentRepository.kt */
    public static final class a extends Oa {
        private final C3791ida a;

        public a(C3791ida ida) {
            C7471uYa.b(ida, "comment");
            super(null);
            this.a = ida;
        }

        public final C3791ida a() {
            return this.a;
        }
    }

    /* compiled from: TrackCommentRepository.kt */
    public static final class b extends Oa {
        private final C3508cda a;

        public b(C3508cda cda) {
            C7471uYa.b(cda, "urn");
            super(null);
            this.a = cda;
        }

        public final C3508cda a() {
            return this.a;
        }
    }

    private Oa() {
    }

    public /* synthetic */ Oa(C7264rYa rya) {
        this();
    }
}
