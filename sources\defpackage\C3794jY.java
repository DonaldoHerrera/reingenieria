package defpackage;

import java.util.List;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/soundcloud/android/discovery/DiscoveryCardViewModel;", "", "()V", "parentQueryUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "getParentQueryUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "EmptyCard", "MultipleContentSelectionCard", "PromotedTrackCard", "SingleContentSelectionCard", "UpsellHeaderCard", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModel$MultipleContentSelectionCard;", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModel$SingleContentSelectionCard;", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModel$UpsellHeaderCard;", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModel$PromotedTrackCard;", "Lcom/soundcloud/android/discovery/DiscoveryCardViewModel$EmptyCard;", "base_release"}, mv = {1, 1, 15})
/* renamed from: jY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryCardViewModel.kt */
public abstract class C3794jY {

    /* renamed from: jY$a */
    /* compiled from: DiscoveryCardViewModel.kt */
    public static final class a extends C3794jY {
        private final C3508cda a;
        private final Throwable b;

        public a() {
            this(null, 1, null);
        }

        public a(Throwable th) {
            super(null);
            this.b = th;
        }

        public C3508cda a() {
            return this.a;
        }

        public final Throwable b() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((defpackage.C3794jY.a) r2).b) != false) goto L_0x0015;
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
            Throwable th = this.b;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EmptyCard(throwable=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ a(Throwable th, int i, C7264rYa rya) {
            if ((i & 1) != 0) {
                th = null;
            }
            this(th);
        }
    }

    /* renamed from: jY$b */
    /* compiled from: DiscoveryCardViewModel.kt */
    public static final class b extends C3794jY {
        private final C3508cda a;
        private final C3508cda b;
        private final C3508cda c;
        private final String d;
        private final String e;
        private final String f;
        private final List<C3445NY> g;

        public b(C3508cda cda, C3508cda cda2, C3508cda cda3, String str, String str2, String str3, List<C3445NY> list) {
            C7471uYa.b(cda2, "selectionUrn");
            C7471uYa.b(list, "selectionItems");
            super(null);
            this.a = cda;
            this.b = cda2;
            this.c = cda3;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = list;
        }

        public C3508cda a() {
            return this.a;
        }

        public final String b() {
            return this.f;
        }

        public final List<C3445NY> c() {
            return this.g;
        }

        public final C3508cda d() {
            return this.b;
        }

        public final String e() {
            return this.e;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.g, (java.lang.Object) r3.g) != false) goto L_0x0055;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) a(), (Object) bVar.a())) {
                        if (C7471uYa.a((Object) this.b, (Object) bVar.b)) {
                            if (C7471uYa.a((Object) this.c, (Object) bVar.c)) {
                                if (C7471uYa.a((Object) this.d, (Object) bVar.d)) {
                                    if (C7471uYa.a((Object) this.e, (Object) bVar.e)) {
                                        if (C7471uYa.a((Object) this.f, (Object) bVar.f)) {
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

        public int hashCode() {
            C3508cda a2 = a();
            int i = 0;
            int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
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
            List<C3445NY> list = this.g;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MultipleContentSelectionCard(parentQueryUrn=");
            sb.append(a());
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
            sb.append(", selectionItems=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }

        public b(defpackage.C3503cY.b bVar, List<C3445NY> list) {
            C7471uYa.b(bVar, "card");
            C7471uYa.b(list, "selectionItems");
            this(bVar.b(), bVar.e(), bVar.c(), bVar.f(), bVar.g(), bVar.a(), list);
        }
    }

    /* renamed from: jY$c */
    /* compiled from: DiscoveryCardViewModel.kt */
    public static final class c extends C3794jY {
        private final C3508cda a;
        private final C3508cda b;
        private final String c;
        private final String d;
        private final String e;
        private final C3508cda f;
        private final String g;
        private final C3879tda h;

        public c(C3508cda cda, String str, String str2, String str3, C3508cda cda2, String str4, C3879tda tda) {
            C7471uYa.b(cda, "trackUrn");
            C7471uYa.b(str, "monetizationType");
            C7471uYa.b(str2, "title");
            C7471uYa.b(str3, "creator");
            C7471uYa.b(cda2, "creatorUrn");
            C7471uYa.b(tda, "promotedProperties");
            super(null);
            this.b = cda;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = cda2;
            this.g = str4;
            this.h = tda;
        }

        public C3508cda a() {
            return this.a;
        }

        public final String b() {
            return this.g;
        }

        public final String c() {
            return this.e;
        }

        public final C3508cda d() {
            return this.f;
        }

        public final C3879tda e() {
            return this.h;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.h, (java.lang.Object) r3.h) != false) goto L_0x0051;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.b, (Object) cVar.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) cVar.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) cVar.d)) {
                                if (C7471uYa.a((Object) this.e, (Object) cVar.e)) {
                                    if (C7471uYa.a((Object) this.f, (Object) cVar.f)) {
                                        if (C7471uYa.a((Object) this.g, (Object) cVar.g)) {
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

        public final C3508cda g() {
            return this.b;
        }

        public int hashCode() {
            C3508cda cda = this.b;
            int i = 0;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.e;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            C3508cda cda2 = this.f;
            int hashCode5 = (hashCode4 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
            String str4 = this.g;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
            C3879tda tda = this.h;
            if (tda != null) {
                i = tda.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PromotedTrackCard(trackUrn=");
            sb.append(this.b);
            sb.append(", monetizationType=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", creator=");
            sb.append(this.e);
            sb.append(", creatorUrn=");
            sb.append(this.f);
            sb.append(", artworkUrlTemplate=");
            sb.append(this.g);
            sb.append(", promotedProperties=");
            sb.append(this.h);
            sb.append(")");
            return sb.toString();
        }

        public c(defpackage.C3503cY.c cVar) {
            C7471uYa.b(cVar, "card");
            this(cVar.g(), cVar.d(), cVar.f(), cVar.b(), cVar.c(), cVar.a(), cVar.e());
        }
    }

    /* renamed from: jY$d */
    /* compiled from: DiscoveryCardViewModel.kt */
    public static final class d extends C3794jY {
        private final C3508cda a;
        private final C3508cda b;
        private final C3508cda c;
        private final String d;
        private final String e;
        private final String f;
        private final C3445NY g;
        private final String h;
        private final List<String> i;

        public d(C3508cda cda, C3508cda cda2, C3508cda cda3, String str, String str2, String str3, C3445NY ny, String str4, List<String> list) {
            C7471uYa.b(cda2, "selectionUrn");
            C7471uYa.b(ny, "selectionItem");
            C7471uYa.b(list, "socialProofAvatarUrlTemplates");
            super(null);
            this.a = cda;
            this.b = cda2;
            this.c = cda3;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = ny;
            this.h = str4;
            this.i = list;
        }

        public C3508cda a() {
            return this.a;
        }

        public final String b() {
            return this.f;
        }

        public final C3445NY c() {
            return this.g;
        }

        public final C3508cda d() {
            return this.b;
        }

        public final String e() {
            return this.h;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.i, (java.lang.Object) r3.i) != false) goto L_0x0069;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (C7471uYa.a((Object) a(), (Object) dVar.a())) {
                        if (C7471uYa.a((Object) this.b, (Object) dVar.b)) {
                            if (C7471uYa.a((Object) this.c, (Object) dVar.c)) {
                                if (C7471uYa.a((Object) this.d, (Object) dVar.d)) {
                                    if (C7471uYa.a((Object) this.e, (Object) dVar.e)) {
                                        if (C7471uYa.a((Object) this.f, (Object) dVar.f)) {
                                            if (C7471uYa.a((Object) this.g, (Object) dVar.g)) {
                                                if (C7471uYa.a((Object) this.h, (Object) dVar.h)) {
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

        public final List<String> f() {
            return this.i;
        }

        public final String g() {
            return this.e;
        }

        public int hashCode() {
            C3508cda a2 = a();
            int i2 = 0;
            int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
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
            C3445NY ny = this.g;
            int hashCode7 = (hashCode6 + (ny != null ? ny.hashCode() : 0)) * 31;
            String str4 = this.h;
            int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
            List<String> list = this.i;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode8 + i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SingleContentSelectionCard(parentQueryUrn=");
            sb.append(a());
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
            sb.append(", selectionItem=");
            sb.append(this.g);
            sb.append(", socialProof=");
            sb.append(this.h);
            sb.append(", socialProofAvatarUrlTemplates=");
            sb.append(this.i);
            sb.append(")");
            return sb.toString();
        }

        public d(defpackage.C3503cY.d dVar, C3445NY ny) {
            C7471uYa.b(dVar, "card");
            C7471uYa.b(ny, "selectionItem");
            this(dVar.b(), dVar.e(), dVar.c(), dVar.h(), dVar.i(), dVar.a(), ny, dVar.f(), dVar.g());
        }
    }

    /* renamed from: jY$e */
    /* compiled from: DiscoveryCardViewModel.kt */
    public static final class e extends C3794jY {
        private static final C3508cda a = null;
        public static final e b = new e();

        private e() {
            super(null);
        }

        public C3508cda a() {
            return a;
        }
    }

    private C3794jY() {
    }

    public abstract C3508cda a();

    public /* synthetic */ C3794jY(C7264rYa rya) {
        this();
    }
}
