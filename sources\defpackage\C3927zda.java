package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;

@EVa(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001UB·\u0001\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0016¢\u0006\u0002\u0010\u001dJ\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u0016HÆ\u0003J\t\u0010=\u001a\u00020\u0018HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u0016HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bHÆ\u0003J\t\u0010F\u001a\u00020\rHÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\t\u0010H\u001a\u00020\u0011HÆ\u0003J\t\u0010I\u001a\u00020\u0013HÆ\u0003J¹\u0001\u0010J\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00132\b\b\u0003\u0010\u0014\u001a\u00020\u00072\b\b\u0003\u0010\u0015\u001a\u00020\u00162\b\b\u0003\u0010\u0017\u001a\u00020\u00182\b\b\u0003\u0010\u0019\u001a\u00020\u00072\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\u001c\u001a\u00020\u0016HÆ\u0001J\u0013\u0010K\u001a\u00020\u00182\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0003J\b\u0010N\u001a\u00020\u0000H\u0016J\u0006\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u00020RJ\t\u0010S\u001a\u00020\rHÖ\u0001J\t\u0010T\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070&8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010)R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u001c\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006V"}, d2 = {"Lcom/soundcloud/android/foundation/domain/playlists/ApiPlaylist;", "Lcom/soundcloud/android/foundation/domain/ImageResource;", "Lcom/soundcloud/android/foundation/domain/ApiEntityHolder;", "Lcom/soundcloud/android/foundation/domain/playlists/ApiPlaylistHolder;", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "artworkUrlTemplate", "", "title", "genre", "tags", "", "trackCount", "", "relatedResources", "Lcom/soundcloud/android/foundation/domain/playlists/ApiPlaylist$RelatedResources;", "duration", "", "sharing", "Lcom/soundcloud/android/foundation/domain/Sharing;", "permalinkUrl", "createdAt", "Ljava/util/Date;", "isAlbum", "", "setType", "releaseDate", "secretToken", "updatedAt", "(Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/soundcloud/android/foundation/domain/playlists/ApiPlaylist$RelatedResources;JLcom/soundcloud/android/foundation/domain/Sharing;Ljava/lang/String;Ljava/util/Date;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "getArtworkUrlTemplate", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getDuration", "()J", "getGenre", "imageUrlTemplate", "Lcom/soundcloud/java/optional/Optional;", "getImageUrlTemplate", "()Lcom/soundcloud/java/optional/Optional;", "()Z", "getPermalinkUrl", "getRelatedResources", "()Lcom/soundcloud/android/foundation/domain/playlists/ApiPlaylist$RelatedResources;", "getReleaseDate", "getSecretToken", "getSetType", "getSharing", "()Lcom/soundcloud/android/foundation/domain/Sharing;", "getTags", "()Ljava/util/List;", "getTitle", "getTrackCount", "()I", "getUpdatedAt", "getUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "getApiPlaylist", "getStats", "Lcom/soundcloud/android/foundation/domain/playlists/PlaylistStats;", "getUser", "Lcom/soundcloud/android/foundation/domain/users/ApiUser;", "hashCode", "toString", "RelatedResources", "domain"}, mv = {1, 1, 15})
/* renamed from: zda reason: default package and case insensitive filesystem */
/* compiled from: ApiPlaylist.kt */
public final class C3927zda implements Vca, Sca, Ada {
    private final C3508cda a;
    private final String b;
    private final String c;
    private final String d;
    private final List<String> e;
    private final int f;
    private final a g;
    private final long h;
    private final C3492ada i;
    private final String j;
    private final Date k;
    private final boolean l;
    private final String m;
    private final String n;
    private final String o;
    private final Date p;

    /* renamed from: zda$a */
    /* compiled from: ApiPlaylist.kt */
    public static final class a {
        private final C3776gea a;
        private final Gda b;

        @JsonCreator
        public a(@JsonProperty("user") C3776gea gea, @JsonProperty("stats") Gda gda) {
            C7471uYa.b(gea, "user");
            C7471uYa.b(gda, "stats");
            this.a = gea;
            this.b = gda;
        }

        public final Gda a() {
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
            Gda gda = this.b;
            if (gda != null) {
                i = gda.hashCode();
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
    public C3927zda(@JsonProperty("urn") C3508cda cda, @JsonProperty("artwork_url_template") String str, @JsonProperty("title") String str2, @JsonProperty("genre") String str3, @JsonProperty("user_tags") List<String> list, @JsonProperty("track_count") int i2, @JsonProperty("_embedded") a aVar, @JsonProperty("duration") long j2, @JsonProperty("sharing") C3492ada ada, @JsonProperty("permalink_url") String str4, @JsonProperty("created_at") Date date, @JsonProperty("is_album") boolean z, @JsonProperty("set_type") String str5, @JsonProperty("release_date") String str6, @JsonProperty("secret_token") String str7, @JsonProperty("updated_at") Date date2) {
        C3508cda cda2 = cda;
        String str8 = str2;
        a aVar2 = aVar;
        C3492ada ada2 = ada;
        String str9 = str4;
        Date date3 = date;
        String str10 = str5;
        Date date4 = date2;
        C7471uYa.b(cda, "urn");
        C7471uYa.b(str2, "title");
        C7471uYa.b(aVar2, "relatedResources");
        C7471uYa.b(ada2, "sharing");
        C7471uYa.b(str9, "permalinkUrl");
        C7471uYa.b(date3, "createdAt");
        C7471uYa.b(str10, "setType");
        C7471uYa.b(date4, "updatedAt");
        this.a = cda2;
        this.b = str;
        this.c = str8;
        this.d = str3;
        this.e = list;
        this.f = i2;
        this.g = aVar2;
        this.h = j2;
        this.i = ada2;
        this.j = str9;
        this.k = date3;
        this.l = z;
        this.m = str10;
        this.n = str6;
        this.o = str7;
        this.p = date4;
    }

    public C3508cda a() {
        return this.a;
    }

    public C4928GKa<String> b() {
        C4928GKa<String> b2 = C4928GKa.b(this.b);
        C7471uYa.a((Object) b2, "Optional.fromNullable(artworkUrlTemplate)");
        return b2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3927zda) {
                C3927zda zda = (C3927zda) obj;
                if (C7471uYa.a((Object) a(), (Object) zda.a()) && C7471uYa.a((Object) this.b, (Object) zda.b) && C7471uYa.a((Object) this.c, (Object) zda.c) && C7471uYa.a((Object) this.d, (Object) zda.d) && C7471uYa.a((Object) this.e, (Object) zda.e)) {
                    if ((this.f == zda.f) && C7471uYa.a((Object) this.g, (Object) zda.g)) {
                        if ((this.h == zda.h) && C7471uYa.a((Object) this.i, (Object) zda.i) && C7471uYa.a((Object) this.j, (Object) zda.j) && C7471uYa.a((Object) this.k, (Object) zda.k)) {
                            if (!(this.l == zda.l) || !C7471uYa.a((Object) this.m, (Object) zda.m) || !C7471uYa.a((Object) this.n, (Object) zda.n) || !C7471uYa.a((Object) this.o, (Object) zda.o) || !C7471uYa.a((Object) this.p, (Object) zda.p)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C3927zda f() {
        return this;
    }

    public final Date g() {
        return this.k;
    }

    public final String getTitle() {
        return this.c;
    }

    public final long h() {
        return this.h;
    }

    public int hashCode() {
        C3508cda a2 = a();
        int i2 = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.e;
        int hashCode5 = (((hashCode4 + (list != null ? list.hashCode() : 0)) * 31) + this.f) * 31;
        a aVar = this.g;
        int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        long j2 = this.h;
        int i3 = (hashCode6 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C3492ada ada = this.i;
        int hashCode7 = (i3 + (ada != null ? ada.hashCode() : 0)) * 31;
        String str4 = this.j;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Date date = this.k;
        int hashCode9 = (hashCode8 + (date != null ? date.hashCode() : 0)) * 31;
        boolean z = this.l;
        if (z) {
            z = true;
        }
        int i4 = (hashCode9 + (z ? 1 : 0)) * 31;
        String str5 = this.m;
        int hashCode10 = (i4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.n;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.o;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Date date2 = this.p;
        if (date2 != null) {
            i2 = date2.hashCode();
        }
        return hashCode12 + i2;
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.j;
    }

    public final String k() {
        return this.n;
    }

    public final String l() {
        return this.o;
    }

    public final String m() {
        return this.m;
    }

    public final C3492ada n() {
        return this.i;
    }

    public final Gda o() {
        return this.g.a();
    }

    public final List<String> p() {
        return this.e;
    }

    public final int q() {
        return this.f;
    }

    public final Date r() {
        return this.p;
    }

    public final C3776gea s() {
        return this.g.b();
    }

    public final boolean t() {
        return this.l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiPlaylist(urn=");
        sb.append(a());
        sb.append(", artworkUrlTemplate=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", genre=");
        sb.append(this.d);
        sb.append(", tags=");
        sb.append(this.e);
        sb.append(", trackCount=");
        sb.append(this.f);
        sb.append(", relatedResources=");
        sb.append(this.g);
        sb.append(", duration=");
        sb.append(this.h);
        sb.append(", sharing=");
        sb.append(this.i);
        sb.append(", permalinkUrl=");
        sb.append(this.j);
        sb.append(", createdAt=");
        sb.append(this.k);
        sb.append(", isAlbum=");
        sb.append(this.l);
        sb.append(", setType=");
        sb.append(this.m);
        sb.append(", releaseDate=");
        sb.append(this.n);
        sb.append(", secretToken=");
        sb.append(this.o);
        sb.append(", updatedAt=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
