package defpackage;

import java.util.List;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0010¢\u0006\u0002\b\nR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/discovery/DiscoveryCard;", "", "()V", "parentQueryUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "getParentQueryUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "hasSelectionUrn", "", "selectionUrn", "hasSelectionUrn$base_release", "EmptyCard", "MultipleContentSelectionCard", "PromotedTrackCard", "SingleContentSelectionCard", "UpsellHeaderCard", "Lcom/soundcloud/android/discovery/DiscoveryCard$MultipleContentSelectionCard;", "Lcom/soundcloud/android/discovery/DiscoveryCard$SingleContentSelectionCard;", "Lcom/soundcloud/android/discovery/DiscoveryCard$PromotedTrackCard;", "Lcom/soundcloud/android/discovery/DiscoveryCard$EmptyCard;", "Lcom/soundcloud/android/discovery/DiscoveryCard$UpsellHeaderCard;", "base_release"}, mv = {1, 1, 15})
/* renamed from: cY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryCard.kt */
public abstract class C3503cY {

    /* renamed from: cY$a */
    /* compiled from: DiscoveryCard.kt */
    public static final class a extends C3503cY {
        private final Throwable a;
        private final C3508cda b;

        public a() {
            this(null, null, 3, null);
        }

        public /* synthetic */ a(Throwable th, C3508cda cda, int i, C7264rYa rya) {
            if ((i & 1) != 0) {
                th = null;
            }
            if ((i & 2) != 0) {
                cda = null;
            }
            this(th, cda);
        }

        public C3508cda a() {
            return this.b;
        }

        public final Throwable b() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) r3.a()) != false) goto L_0x0023;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.a;
            int i = 0;
            int hashCode = (th != null ? th.hashCode() : 0) * 31;
            C3508cda a2 = a();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EmptyCard(throwable=");
            sb.append(this.a);
            sb.append(", parentQueryUrn=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }

        public a(Throwable th, C3508cda cda) {
            super(null);
            this.a = th;
            this.b = cda;
        }

        public a(C4928GKa<Throwable> gKa) {
            C7471uYa.b(gKa, "optionalThrowable");
            this((Throwable) gKa.d(), null, 2, null);
        }
    }

    /* renamed from: cY$b */
    /* compiled from: DiscoveryCard.kt */
    public static final class b extends C3503cY {
        private final C3508cda a;
        private final C3508cda b;
        private final C3508cda c;
        private final String d;
        private final String e;
        private final String f;
        private final String g;
        private final List<C3418EY> h;

        public b(C3508cda cda, C3508cda cda2, C3508cda cda3, String str, String str2, String str3, String str4, List<C3418EY> list) {
            C7471uYa.b(cda2, "selectionUrn");
            C7471uYa.b(list, "selectionItems");
            super(null);
            this.a = cda;
            this.b = cda2;
            this.c = cda3;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = list;
        }

        public final String a() {
            return this.f;
        }

        public C3508cda b() {
            return this.a;
        }

        public final C3508cda c() {
            return this.c;
        }

        public final List<C3418EY> d() {
            return this.h;
        }

        public final C3508cda e() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.h, (java.lang.Object) r3.h) != false) goto L_0x005f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) b(), (Object) bVar.b())) {
                        if (C7471uYa.a((Object) this.b, (Object) bVar.b)) {
                            if (C7471uYa.a((Object) this.c, (Object) bVar.c)) {
                                if (C7471uYa.a((Object) this.d, (Object) bVar.d)) {
                                    if (C7471uYa.a((Object) this.e, (Object) bVar.e)) {
                                        if (C7471uYa.a((Object) this.f, (Object) bVar.f)) {
                                            if (C7471uYa.a((Object) this.g, (Object) bVar.g)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final String f() {
            return this.d;
        }

        public final String g() {
            return this.e;
        }

        public final String h() {
            return this.g;
        }

        public int hashCode() {
            C3508cda b2 = b();
            int i = 0;
            int hashCode = (b2 != null ? b2.hashCode() : 0) * 31;
            C3508cda cda = this.b;
            int hashCode2 = (hashCode + (cda != null ? cda.hashCode() : 0)) * 31;
            C3508cda cda2 = this.c;
            int hashCode3 = (hashCode2 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
            String str = this.d;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.e;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f;
            int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.g;
            int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
            List<C3418EY> list = this.h;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode7 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MultipleContentSelectionCard(parentQueryUrn=");
            sb.append(b());
            sb.append(", selectionUrn=");
            sb.append(this.b);
            sb.append(", queryUrn=");
            sb.append(this.c);
            sb.append(", style=");
            sb.append(this.d);
            sb.append(", title=");
            sb.append(this.e);
            sb.append(", description=");
            sb.append(this.f);
            sb.append(", trackingFeatureName=");
            sb.append(this.g);
            sb.append(", selectionItems=");
            sb.append(this.h);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: cY$c */
    /* compiled from: DiscoveryCard.kt */
    public static final class c extends C3503cY {
        private final C3508cda a;
        private final String b;
        private final String c;
        private final String d;
        private final C3508cda e;
        private final String f;
        private final C3879tda g;

        public c(C3508cda cda, String str, String str2, String str3, C3508cda cda2, String str4, C3879tda tda) {
            C7471uYa.b(cda, "trackUrn");
            C7471uYa.b(str, "monetizationType");
            C7471uYa.b(str2, "title");
            C7471uYa.b(str3, "creator");
            C7471uYa.b(cda2, "creatorUrn");
            C7471uYa.b(tda, "promotedProperties");
            super(null);
            this.a = cda;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = cda2;
            this.f = str4;
            this.g = tda;
        }

        public final String a() {
            return this.f;
        }

        public final String b() {
            return this.d;
        }

        public final C3508cda c() {
            return this.e;
        }

        public final String d() {
            return this.b;
        }

        public final C3879tda e() {
            return this.g;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.g, (java.lang.Object) r3.g) != false) goto L_0x0051;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.a, (Object) cVar.a)) {
                        if (C7471uYa.a((Object) this.b, (Object) cVar.b)) {
                            if (C7471uYa.a((Object) this.c, (Object) cVar.c)) {
                                if (C7471uYa.a((Object) this.d, (Object) cVar.d)) {
                                    if (C7471uYa.a((Object) this.e, (Object) cVar.e)) {
                                        if (C7471uYa.a((Object) this.f, (Object) cVar.f)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final String f() {
            return this.c;
        }

        public final C3508cda g() {
            return this.a;
        }

        public int hashCode() {
            C3508cda cda = this.a;
            int i = 0;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            C3508cda cda2 = this.e;
            int hashCode5 = (hashCode4 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
            String str4 = this.f;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
            C3879tda tda = this.g;
            if (tda != null) {
                i = tda.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PromotedTrackCard(trackUrn=");
            sb.append(this.a);
            sb.append(", monetizationType=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", creator=");
            sb.append(this.d);
            sb.append(", creatorUrn=");
            sb.append(this.e);
            sb.append(", artworkUrlTemplate=");
            sb.append(this.f);
            sb.append(", promotedProperties=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: cY$d */
    /* compiled from: DiscoveryCard.kt */
    public static final class d extends C3503cY {
        private final C3508cda a;
        private final C3508cda b;
        private final String c;
        private final String d;
        private final String e;
        private final C3508cda f;
        private final C3418EY g;
        private final String h;
        private final String i;
        private final List<String> j;

        public d(C3508cda cda, C3508cda cda2, String str, String str2, String str3, C3508cda cda3, C3418EY ey, String str4, String str5, List<String> list) {
            C7471uYa.b(cda2, "selectionUrn");
            C7471uYa.b(ey, "selectionItem");
            C7471uYa.b(list, "socialProofAvatarUrlTemplates");
            super(null);
            this.a = cda;
            this.b = cda2;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = cda3;
            this.g = ey;
            this.h = str4;
            this.i = str5;
            this.j = list;
        }

        public final String a() {
            return this.e;
        }

        public C3508cda b() {
            return this.a;
        }

        public final C3508cda c() {
            return this.f;
        }

        public final C3418EY d() {
            return this.g;
        }

        public final C3508cda e() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.j, (java.lang.Object) r3.j) != false) goto L_0x0073;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (C7471uYa.a((Object) b(), (Object) dVar.b())) {
                        if (C7471uYa.a((Object) this.b, (Object) dVar.b)) {
                            if (C7471uYa.a((Object) this.c, (Object) dVar.c)) {
                                if (C7471uYa.a((Object) this.d, (Object) dVar.d)) {
                                    if (C7471uYa.a((Object) this.e, (Object) dVar.e)) {
                                        if (C7471uYa.a((Object) this.f, (Object) dVar.f)) {
                                            if (C7471uYa.a((Object) this.g, (Object) dVar.g)) {
                                                if (C7471uYa.a((Object) this.h, (Object) dVar.h)) {
                                                    if (C7471uYa.a((Object) this.i, (Object) dVar.i)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final String f() {
            return this.i;
        }

        public final List<String> g() {
            return this.j;
        }

        public final String h() {
            return this.c;
        }

        public int hashCode() {
            C3508cda b2 = b();
            int i2 = 0;
            int hashCode = (b2 != null ? b2.hashCode() : 0) * 31;
            C3508cda cda = this.b;
            int hashCode2 = (hashCode + (cda != null ? cda.hashCode() : 0)) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.d;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.e;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
            C3508cda cda2 = this.f;
            int hashCode6 = (hashCode5 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
            C3418EY ey = this.g;
            int hashCode7 = (hashCode6 + (ey != null ? ey.hashCode() : 0)) * 31;
            String str4 = this.h;
            int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.i;
            int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
            List<String> list = this.j;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode9 + i2;
        }

        public final String i() {
            return this.d;
        }

        public final String j() {
            return this.h;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SingleContentSelectionCard(parentQueryUrn=");
            sb.append(b());
            sb.append(", selectionUrn=");
            sb.append(this.b);
            sb.append(", style=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", description=");
            sb.append(this.e);
            sb.append(", queryUrn=");
            sb.append(this.f);
            sb.append(", selectionItem=");
            sb.append(this.g);
            sb.append(", trackingFeatureName=");
            sb.append(this.h);
            sb.append(", socialProof=");
            sb.append(this.i);
            sb.append(", socialProofAvatarUrlTemplates=");
            sb.append(this.j);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: cY$e */
    /* compiled from: DiscoveryCard.kt */
    public static final class e extends C3503cY {
        private final C3508cda a;

        public e() {
            this(null, 1, null);
        }

        public /* synthetic */ e(C3508cda cda, int i, C7264rYa rya) {
            if ((i & 1) != 0) {
                cda = null;
            }
            this(cda);
        }

        public C3508cda a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((defpackage.C3503cY.e) r2).a()) != false) goto L_0x0019;
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
            C3508cda a2 = a();
            if (a2 != null) {
                return a2.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpsellHeaderCard(parentQueryUrn=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }

        public e(C3508cda cda) {
            super(null);
            this.a = cda;
        }
    }

    private C3503cY() {
    }

    public /* synthetic */ C3503cY(C7264rYa rya) {
        this();
    }
}
