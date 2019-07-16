package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;

@EVa(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001jB\u0002\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0017\u001a\u00020\n\u0012\b\b\u0001\u0010\u0018\u001a\u00020\n\u0012\b\b\u0001\u0010\u0019\u001a\u00020\n\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u001c\u001a\u00020\n\u0012\b\b\u0001\u0010\u001d\u001a\u00020\n\u0012\b\b\u0001\u0010\u001e\u001a\u00020\n\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010 \u001a\u00020\n\u0012\b\b\u0001\u0010!\u001a\u00020\"\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010$J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012HÆ\u0003J\t\u0010J\u001a\u00020\u0014HÆ\u0003J\t\u0010K\u001a\u00020\u0016HÆ\u0003J\t\u0010L\u001a\u00020\nHÆ\u0003J\t\u0010M\u001a\u00020\nHÆ\u0003J\t\u0010N\u001a\u00020\nHÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\nHÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\nHÆ\u0003J\t\u0010T\u001a\u00020\nHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010V\u001a\u00020\nHÆ\u0003J\t\u0010W\u001a\u00020\"HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\t\u0010[\u001a\u00020\nHÆ\u0003J\t\u0010\\\u001a\u00020\fHÆ\u0003J\t\u0010]\u001a\u00020\fHÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0002\u0010`\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0010\u001a\u00020\u00052\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u00142\b\b\u0003\u0010\u0015\u001a\u00020\u00162\b\b\u0003\u0010\u0017\u001a\u00020\n2\b\b\u0003\u0010\u0018\u001a\u00020\n2\b\b\u0003\u0010\u0019\u001a\u00020\n2\b\b\u0003\u0010\u001a\u001a\u00020\u00052\b\b\u0003\u0010\u001b\u001a\u00020\u00052\b\b\u0003\u0010\u001c\u001a\u00020\n2\b\b\u0003\u0010\u001d\u001a\u00020\n2\b\b\u0003\u0010\u001e\u001a\u00020\n2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010 \u001a\u00020\n2\b\b\u0003\u0010!\u001a\u00020\"2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010a\u001a\u00020\n2\b\u0010b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010c\u001a\u00020dJ\u0006\u0010e\u001a\u00020fJ\t\u0010g\u001a\u00020hHÖ\u0001J\t\u0010i\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0018\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0011\u0010 \u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010/R\u0011\u0010\u0019\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0011\u0010\u001c\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u0011\u0010\u001e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010&¨\u0006k"}, d2 = {"Lcom/soundcloud/android/foundation/domain/tracks/ApiTrack;", "", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "title", "", "genre", "relatedResources", "Lcom/soundcloud/android/foundation/domain/tracks/ApiTrack$RelatedResources;", "commentable", "", "snipDuration", "", "fullDuration", "waveformUrl", "artworkUrlTemplate", "permalinkUrl", "tags", "", "createdAt", "Ljava/util/Date;", "sharing", "Lcom/soundcloud/android/foundation/domain/Sharing;", "monetizable", "blocked", "snipped", "policy", "monetizationModel", "subMidTier", "subHighTier", "syncable", "description", "displayStats", "media", "Lcom/soundcloud/android/foundation/domain/tracks/ApiTrackMedia;", "secretToken", "(Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Ljava/lang/String;Lcom/soundcloud/android/foundation/domain/tracks/ApiTrack$RelatedResources;ZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Date;Lcom/soundcloud/android/foundation/domain/Sharing;ZZZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZLcom/soundcloud/android/foundation/domain/tracks/ApiTrackMedia;Ljava/lang/String;)V", "getArtworkUrlTemplate", "()Ljava/lang/String;", "getBlocked", "()Z", "getCommentable", "getCreatedAt", "()Ljava/util/Date;", "getDescription", "getDisplayStats", "getFullDuration", "()J", "getGenre", "getMedia", "()Lcom/soundcloud/android/foundation/domain/tracks/ApiTrackMedia;", "getMonetizable", "getMonetizationModel", "getPermalinkUrl", "getPolicy", "getRelatedResources", "()Lcom/soundcloud/android/foundation/domain/tracks/ApiTrack$RelatedResources;", "getSecretToken", "getSharing", "()Lcom/soundcloud/android/foundation/domain/Sharing;", "getSnipDuration", "getSnipped", "getSubHighTier", "getSubMidTier", "getSyncable", "getTags", "()Ljava/util/List;", "getTitle", "getUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getWaveformUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getStats", "Lcom/soundcloud/android/foundation/domain/tracks/ApiTrackStats;", "getUser", "Lcom/soundcloud/android/foundation/domain/users/ApiUser;", "hashCode", "", "toString", "RelatedResources", "domain"}, mv = {1, 1, 15})
/* renamed from: Yda reason: default package */
/* compiled from: ApiTrack.kt */
public final class Yda {
    private final C3508cda a;
    private final String b;
    private final String c;
    private final a d;
    private final boolean e;
    private final long f;
    private final long g;
    private final String h;
    private final String i;
    private final String j;
    private final List<String> k;
    private final Date l;
    private final C3492ada m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final String q;
    private final String r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final String v;
    private final boolean w;
    private final Zda x;
    private final String y;

    /* renamed from: Yda$a */
    /* compiled from: ApiTrack.kt */
    public static final class a {
        private final C3776gea a;
        private final _da b;

        @JsonCreator
        public a(@JsonProperty("user") C3776gea gea, @JsonProperty("stats") _da _da) {
            C7471uYa.b(gea, "user");
            C7471uYa.b(_da, "stats");
            this.a = gea;
            this.b = _da;
        }

        public final _da a() {
            return this.b;
        }

        public final C3776gea b() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
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
            C3776gea gea = this.a;
            int i = 0;
            int hashCode = (gea != null ? gea.hashCode() : 0) * 31;
            _da _da = this.b;
            if (_da != null) {
                i = _da.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RelatedResources(user=");
            sb.append(this.a);
            sb.append(", stats=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    @JsonCreator
    public Yda(@JsonProperty("urn") C3508cda cda, @JsonProperty("title") String str, @JsonProperty("genre") String str2, @JsonProperty("_embedded") a aVar, @JsonProperty("commentable") boolean z, @JsonProperty("snip_duration") long j2, @JsonProperty("full_duration") long j3, @JsonProperty("waveform_url") String str3, @JsonProperty("artwork_url_template") String str4, @JsonProperty("permalink_url") String str5, @JsonProperty("user_tags") List<String> list, @JsonProperty("created_at") Date date, @JsonProperty("sharing") C3492ada ada, @JsonProperty("monetizable") boolean z2, @JsonProperty("blocked") boolean z3, @JsonProperty("snipped") boolean z4, @JsonProperty("policy") String str6, @JsonProperty("monetization_model") String str7, @JsonProperty("sub_mid_tier") boolean z5, @JsonProperty("sub_high_tier") boolean z6, @JsonProperty("syncable") boolean z7, @JsonProperty("description") String str8, @JsonProperty("display_stats") boolean z8, @JsonProperty("media") Zda zda, @JsonProperty("secret_token") String str9) {
        C3508cda cda2 = cda;
        String str10 = str;
        a aVar2 = aVar;
        String str11 = str3;
        String str12 = str5;
        Date date2 = date;
        C3492ada ada2 = ada;
        String str13 = str6;
        String str14 = str7;
        Zda zda2 = zda;
        C7471uYa.b(cda, "urn");
        C7471uYa.b(str, "title");
        C7471uYa.b(aVar2, "relatedResources");
        C7471uYa.b(str11, "waveformUrl");
        C7471uYa.b(str12, "permalinkUrl");
        C7471uYa.b(date2, "createdAt");
        C7471uYa.b(ada2, "sharing");
        C7471uYa.b(str13, "policy");
        C7471uYa.b(str14, "monetizationModel");
        C7471uYa.b(zda2, "media");
        this.a = cda2;
        this.b = str10;
        this.c = str2;
        this.d = aVar2;
        this.e = z;
        this.f = j2;
        this.g = j3;
        this.h = str11;
        this.i = str4;
        this.j = str12;
        this.k = list;
        this.l = date2;
        this.m = ada2;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = str13;
        this.r = str14;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = str8;
        this.w = z8;
        this.x = zda2;
        this.y = str9;
    }

    public final String a() {
        return this.i;
    }

    public final boolean b() {
        return this.o;
    }

    public final boolean c() {
        return this.e;
    }

    public final Date d() {
        return this.l;
    }

    public final String e() {
        return this.v;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Yda) {
                Yda yda = (Yda) obj;
                if (C7471uYa.a((Object) this.a, (Object) yda.a) && C7471uYa.a((Object) this.b, (Object) yda.b) && C7471uYa.a((Object) this.c, (Object) yda.c) && C7471uYa.a((Object) this.d, (Object) yda.d)) {
                    if (this.e == yda.e) {
                        if (this.f == yda.f) {
                            if ((this.g == yda.g) && C7471uYa.a((Object) this.h, (Object) yda.h) && C7471uYa.a((Object) this.i, (Object) yda.i) && C7471uYa.a((Object) this.j, (Object) yda.j) && C7471uYa.a((Object) this.k, (Object) yda.k) && C7471uYa.a((Object) this.l, (Object) yda.l) && C7471uYa.a((Object) this.m, (Object) yda.m)) {
                                if (this.n == yda.n) {
                                    if (this.o == yda.o) {
                                        if ((this.p == yda.p) && C7471uYa.a((Object) this.q, (Object) yda.q) && C7471uYa.a((Object) this.r, (Object) yda.r)) {
                                            if (this.s == yda.s) {
                                                if (this.t == yda.t) {
                                                    if ((this.u == yda.u) && C7471uYa.a((Object) this.v, (Object) yda.v)) {
                                                        if (!(this.w == yda.w) || !C7471uYa.a((Object) this.x, (Object) yda.x) || !C7471uYa.a((Object) this.y, (Object) yda.y)) {
                                                            return false;
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
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        return this.w;
    }

    public final long g() {
        return this.g;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i2 = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        a aVar = this.d;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z = this.e;
        if (z) {
            z = true;
        }
        int i3 = (hashCode4 + (z ? 1 : 0)) * 31;
        long j2 = this.f;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str3 = this.h;
        int hashCode5 = (i5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.i;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.j;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list = this.k;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        Date date = this.l;
        int hashCode9 = (hashCode8 + (date != null ? date.hashCode() : 0)) * 31;
        C3492ada ada = this.m;
        int hashCode10 = (hashCode9 + (ada != null ? ada.hashCode() : 0)) * 31;
        boolean z2 = this.n;
        if (z2) {
            z2 = true;
        }
        int i6 = (hashCode10 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.o;
        if (z3) {
            z3 = true;
        }
        int i7 = (i6 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.p;
        if (z4) {
            z4 = true;
        }
        int i8 = (i7 + (z4 ? 1 : 0)) * 31;
        String str6 = this.q;
        int hashCode11 = (i8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.r;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        boolean z5 = this.s;
        if (z5) {
            z5 = true;
        }
        int i9 = (hashCode12 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.t;
        if (z6) {
            z6 = true;
        }
        int i10 = (i9 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.u;
        if (z7) {
            z7 = true;
        }
        int i11 = (i10 + (z7 ? 1 : 0)) * 31;
        String str8 = this.v;
        int hashCode13 = (i11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        boolean z8 = this.w;
        if (z8) {
            z8 = true;
        }
        int i12 = (hashCode13 + (z8 ? 1 : 0)) * 31;
        Zda zda = this.x;
        int hashCode14 = (i12 + (zda != null ? zda.hashCode() : 0)) * 31;
        String str9 = this.y;
        if (str9 != null) {
            i2 = str9.hashCode();
        }
        return hashCode14 + i2;
    }

    public final Zda i() {
        return this.x;
    }

    public final boolean j() {
        return this.n;
    }

    public final String k() {
        return this.r;
    }

    public final String l() {
        return this.j;
    }

    public final String m() {
        return this.q;
    }

    public final a n() {
        return this.d;
    }

    public final String o() {
        return this.y;
    }

    public final C3492ada p() {
        return this.m;
    }

    public final long q() {
        return this.f;
    }

    public final boolean r() {
        return this.p;
    }

    public final boolean s() {
        return this.t;
    }

    public final boolean t() {
        return this.s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiTrack(urn=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", genre=");
        sb.append(this.c);
        sb.append(", relatedResources=");
        sb.append(this.d);
        sb.append(", commentable=");
        sb.append(this.e);
        sb.append(", snipDuration=");
        sb.append(this.f);
        sb.append(", fullDuration=");
        sb.append(this.g);
        sb.append(", waveformUrl=");
        sb.append(this.h);
        sb.append(", artworkUrlTemplate=");
        sb.append(this.i);
        sb.append(", permalinkUrl=");
        sb.append(this.j);
        sb.append(", tags=");
        sb.append(this.k);
        sb.append(", createdAt=");
        sb.append(this.l);
        sb.append(", sharing=");
        sb.append(this.m);
        sb.append(", monetizable=");
        sb.append(this.n);
        sb.append(", blocked=");
        sb.append(this.o);
        sb.append(", snipped=");
        sb.append(this.p);
        sb.append(", policy=");
        sb.append(this.q);
        sb.append(", monetizationModel=");
        sb.append(this.r);
        sb.append(", subMidTier=");
        sb.append(this.s);
        sb.append(", subHighTier=");
        sb.append(this.t);
        sb.append(", syncable=");
        sb.append(this.u);
        sb.append(", description=");
        sb.append(this.v);
        sb.append(", displayStats=");
        sb.append(this.w);
        sb.append(", media=");
        sb.append(this.x);
        sb.append(", secretToken=");
        sb.append(this.y);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        return this.u;
    }

    public final String v() {
        return this.b;
    }

    public final C3508cda w() {
        return this.a;
    }

    public final String x() {
        return this.h;
    }
}
