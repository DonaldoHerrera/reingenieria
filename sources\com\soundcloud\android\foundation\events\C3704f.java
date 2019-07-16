package com.soundcloud.android.foundation.events;

import java.util.List;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\n\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/soundcloud/android/foundation/events/AttributingActivity;", "", "resource", "Lcom/soundcloud/android/foundation/domain/Urn;", "(Lcom/soundcloud/android/foundation/domain/Urn;)V", "getResource", "()Lcom/soundcloud/android/foundation/domain/Urn;", "resourceString", "", "getResourceString", "()Ljava/lang/String;", "type", "getType", "isActive", "", "module", "Lcom/soundcloud/android/foundation/events/Module;", "Companion", "Posted", "Promoted", "Reposted", "Lcom/soundcloud/android/foundation/events/AttributingActivity$Posted;", "Lcom/soundcloud/android/foundation/events/AttributingActivity$Reposted;", "Lcom/soundcloud/android/foundation/events/AttributingActivity$Promoted;", "events_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.foundation.events.f reason: case insensitive filesystem */
/* compiled from: AttributingActivity.kt */
public abstract class C3704f {
    private static final List<String> a = C6850lWa.a("stream");
    public static final a b = new a(null);
    private final C3508cda c;

    /* renamed from: com.soundcloud.android.foundation.events.f$a */
    /* compiled from: AttributingActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: com.soundcloud.android.foundation.events.f$b */
    /* compiled from: AttributingActivity.kt */
    public static final class b extends C3704f {
        private final C3508cda d;

        public b(C3508cda cda) {
            super(cda, null);
            this.d = cda;
        }

        public C3508cda a() {
            return this.d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.foundation.events.C3704f.b) r2).a()) != false) goto L_0x0019;
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
            sb.append("Posted(resource=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.foundation.events.f$c */
    /* compiled from: AttributingActivity.kt */
    public static final class c extends C3704f {
        private final C3508cda d;

        public c(C3508cda cda) {
            super(cda, null);
            this.d = cda;
        }

        public C3508cda a() {
            return this.d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.foundation.events.C3704f.c) r2).a()) != false) goto L_0x0019;
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
            sb.append("Promoted(resource=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.foundation.events.f$d */
    /* compiled from: AttributingActivity.kt */
    public static final class d extends C3704f {
        private final C3508cda d;

        public d(C3508cda cda) {
            super(cda, null);
            this.d = cda;
        }

        public C3508cda a() {
            return this.d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.foundation.events.C3704f.d) r2).a()) != false) goto L_0x0019;
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
            sb.append("Reposted(resource=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    private C3704f(C3508cda cda) {
        this.c = cda;
    }

    public C3508cda a() {
        return this.c;
    }

    public final String b() {
        C3508cda a2 = a();
        if (a2 != null) {
            String b2 = a2.b();
            if (b2 != null) {
                return b2;
            }
        }
        return "";
    }

    public final String c() {
        if (this instanceof b) {
            return "posted";
        }
        if (this instanceof d) {
            return "reposted";
        }
        if (this instanceof c) {
            return "promoted";
        }
        throw new FVa();
    }

    public /* synthetic */ C3704f(C3508cda cda, C7264rYa rya) {
        this(cda);
    }

    public final boolean a(v vVar) {
        return C7676xWa.a((Iterable) a, (Object) vVar != null ? vVar.a() : null);
    }
}
