package com.soundcloud.android.foundation.playqueue;

@EVa(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\t\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/soundcloud/android/foundation/playqueue/PlayQueueEvent;", "", "collectionUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "(Lcom/soundcloud/android/foundation/domain/Urn;)V", "getCollectionUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "isAdsRemoved", "", "isAutoPlayEnabled", "isItemAdded", "isNewOrRestoredQueue", "isQueueReorder", "isQueueUpdate", "AdsRemoved", "AutoPlayEnabled", "NewQueue", "QueueInsert", "QueueReordered", "QueueUpdate", "QueueUpdateMoved", "QueueUpdateRemoved", "RestoredQueue", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueEvent$NewQueue;", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueEvent$RestoredQueue;", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueEvent$QueueUpdate;", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueEvent$AdsRemoved;", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueEvent$QueueUpdateMoved;", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueEvent$QueueUpdateRemoved;", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueEvent$QueueInsert;", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueEvent$AutoPlayEnabled;", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueEvent$QueueReordered;", "playqueue_release"}, mv = {1, 1, 15})
/* compiled from: PlayQueueEvent.kt */
public abstract class p {
    private final C3508cda a;

    /* compiled from: PlayQueueEvent.kt */
    public static final class a extends p {
        private C3508cda b;

        public a(C3508cda cda) {
            C7471uYa.b(cda, "collectionUrn");
            super(cda, null);
            this.b = cda;
        }

        public C3508cda a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.foundation.playqueue.p.a) r2).a()) != false) goto L_0x0019;
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
            C3508cda a = a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AdsRemoved(collectionUrn=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: PlayQueueEvent.kt */
    public static final class b extends p {
        private C3508cda b;

        public b(C3508cda cda) {
            C7471uYa.b(cda, "collectionUrn");
            super(cda, null);
            this.b = cda;
        }

        public C3508cda a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.foundation.playqueue.p.b) r2).a()) != false) goto L_0x0019;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda a = a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AutoPlayEnabled(collectionUrn=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: PlayQueueEvent.kt */
    public static final class c extends p {
        private C3508cda b;

        public c(C3508cda cda) {
            C7471uYa.b(cda, "collectionUrn");
            super(cda, null);
            this.b = cda;
        }

        public C3508cda a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.foundation.playqueue.p.c) r2).a()) != false) goto L_0x0019;
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
            C3508cda a = a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NewQueue(collectionUrn=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: PlayQueueEvent.kt */
    public static final class d extends p {
        private C3508cda b;

        public d(C3508cda cda) {
            C7471uYa.b(cda, "collectionUrn");
            super(cda, null);
            this.b = cda;
        }

        public C3508cda a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.foundation.playqueue.p.d) r2).a()) != false) goto L_0x0019;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda a = a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("QueueInsert(collectionUrn=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: PlayQueueEvent.kt */
    public static final class e extends p {
        private C3508cda b;

        public e(C3508cda cda) {
            C7471uYa.b(cda, "collectionUrn");
            super(cda, null);
            this.b = cda;
        }

        public C3508cda a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.foundation.playqueue.p.e) r2).a()) != false) goto L_0x0019;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof e) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda a = a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("QueueReordered(collectionUrn=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: PlayQueueEvent.kt */
    public static final class f extends p {
        private C3508cda b;

        public f(C3508cda cda) {
            C7471uYa.b(cda, "collectionUrn");
            super(cda, null);
            this.b = cda;
        }

        public C3508cda a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.foundation.playqueue.p.f) r2).a()) != false) goto L_0x0019;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof f) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda a = a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("QueueUpdate(collectionUrn=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: PlayQueueEvent.kt */
    public static final class g extends p {
        private C3508cda b;

        public g(C3508cda cda) {
            C7471uYa.b(cda, "collectionUrn");
            super(cda, null);
            this.b = cda;
        }

        public C3508cda a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.foundation.playqueue.p.g) r2).a()) != false) goto L_0x0019;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof g) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda a = a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("QueueUpdateMoved(collectionUrn=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: PlayQueueEvent.kt */
    public static final class h extends p {
        private C3508cda b;

        public h(C3508cda cda) {
            C7471uYa.b(cda, "collectionUrn");
            super(cda, null);
            this.b = cda;
        }

        public C3508cda a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.foundation.playqueue.p.h) r2).a()) != false) goto L_0x0019;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof h) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda a = a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("QueueUpdateRemoved(collectionUrn=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: PlayQueueEvent.kt */
    public static final class i extends p {
        private C3508cda b;

        public i(C3508cda cda) {
            C7471uYa.b(cda, "collectionUrn");
            super(cda, null);
            this.b = cda;
        }

        public C3508cda a() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.foundation.playqueue.p.i) r2).a()) != false) goto L_0x0019;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof i) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda a = a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RestoredQueue(collectionUrn=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    private p(C3508cda cda) {
        this.a = cda;
    }

    public C3508cda a() {
        return this.a;
    }

    public final boolean b() {
        return this instanceof a;
    }

    public final boolean c() {
        return this instanceof b;
    }

    public final boolean d() {
        return (this instanceof d) || (this instanceof b);
    }

    public final boolean e() {
        return (this instanceof c) || (this instanceof i);
    }

    public final boolean f() {
        return this instanceof e;
    }

    public final boolean g() {
        return this instanceof f;
    }

    public /* synthetic */ p(C3508cda cda, C7264rYa rya) {
        this(cda);
    }
}
