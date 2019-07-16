package com.soundcloud.android.foundation.events;

import java.util.Map;

@EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/foundation/events/RepostsStatusEvent;", "", "reposts", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "Lcom/soundcloud/android/foundation/events/RepostsStatusEvent$RepostStatus;", "(Ljava/util/Map;)V", "getReposts", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RepostStatus", "events_release"}, mv = {1, 1, 15})
/* compiled from: RepostsStatusEvent.kt */
public final class C {
    private final Map<C3508cda, a> a;

    @EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/foundation/events/RepostsStatusEvent$RepostStatus;", "", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "repostCount", "", "(Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/Integer;)V", "getRepostCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "isReposted", "", "Reposted", "Unposted", "Lcom/soundcloud/android/foundation/events/RepostsStatusEvent$RepostStatus$Reposted;", "Lcom/soundcloud/android/foundation/events/RepostsStatusEvent$RepostStatus$Unposted;", "events_release"}, mv = {1, 1, 15})
    /* compiled from: RepostsStatusEvent.kt */
    public static abstract class a {
        private final C3508cda a;
        private final Integer b;

        /* renamed from: com.soundcloud.android.foundation.events.C$a$a reason: collision with other inner class name */
        /* compiled from: RepostsStatusEvent.kt */
        public static final class C0091a extends a {
            private final C3508cda c;
            private final Integer d;

            public C0091a(C3508cda cda, Integer num) {
                C7471uYa.b(cda, "urn");
                super(cda, num, null);
                this.c = cda;
                this.d = num;
            }

            public Integer a() {
                return this.d;
            }

            public C3508cda b() {
                return this.c;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) r3.a()) != false) goto L_0x0027;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0091a) {
                        C0091a aVar = (C0091a) obj;
                        if (C7471uYa.a((Object) b(), (Object) aVar.b())) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C3508cda b = b();
                int i = 0;
                int hashCode = (b != null ? b.hashCode() : 0) * 31;
                Integer a = a();
                if (a != null) {
                    i = a.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Reposted(urn=");
                sb.append(b());
                sb.append(", repostCount=");
                sb.append(a());
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C0091a(C3508cda cda, Integer num, int i, C7264rYa rya) {
                if ((i & 2) != 0) {
                    num = null;
                }
                this(cda, num);
            }
        }

        /* compiled from: RepostsStatusEvent.kt */
        public static final class b extends a {
            private final C3508cda c;
            private final Integer d;

            public b(C3508cda cda, Integer num) {
                C7471uYa.b(cda, "urn");
                super(cda, num, null);
                this.c = cda;
                this.d = num;
            }

            public Integer a() {
                return this.d;
            }

            public C3508cda b() {
                return this.c;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) r3.a()) != false) goto L_0x0027;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (C7471uYa.a((Object) b(), (Object) bVar.b())) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C3508cda b = b();
                int i = 0;
                int hashCode = (b != null ? b.hashCode() : 0) * 31;
                Integer a = a();
                if (a != null) {
                    i = a.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Unposted(urn=");
                sb.append(b());
                sb.append(", repostCount=");
                sb.append(a());
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ b(C3508cda cda, Integer num, int i, C7264rYa rya) {
                if ((i & 2) != 0) {
                    num = null;
                }
                this(cda, num);
            }
        }

        private a(C3508cda cda, Integer num) {
            this.a = cda;
            this.b = num;
        }

        public Integer a() {
            return this.b;
        }

        public C3508cda b() {
            return this.a;
        }

        public final boolean c() {
            if (this instanceof C0091a) {
                return true;
            }
            if (this instanceof b) {
                return false;
            }
            throw new FVa();
        }

        public /* synthetic */ a(C3508cda cda, Integer num, C7264rYa rya) {
            this(cda, num);
        }
    }

    public C(Map<C3508cda, ? extends a> map) {
        C7471uYa.b(map, "reposts");
        this.a = map;
    }

    public final Map<C3508cda, a> a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.foundation.events.C) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Map<C3508cda, a> map = this.a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RepostsStatusEvent(reposts=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
