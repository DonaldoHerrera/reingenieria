package com.soundcloud.android.stream;

import com.soundcloud.android.stream.C6109va.b;
import java.util.Date;

@EVa(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u0000 -2\u00020\u0001:\u0001-B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003JG\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\rHÖ\u0001J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0001H\u0016J\t\u0010,\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/soundcloud/android/stream/PlaylistStreamItem;", "Lcom/soundcloud/android/stream/StreamItem;", "id", "", "playlistItem", "Lcom/soundcloud/android/foundation/domain/playable/PlaylistItem;", "promoted", "", "createdAt", "Ljava/util/Date;", "avatarUrlTemplate", "", "position", "", "(JLcom/soundcloud/android/foundation/domain/playable/PlaylistItem;ZLjava/util/Date;Ljava/lang/String;I)V", "getAvatarUrlTemplate", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getId", "()Ljava/lang/Long;", "getPlaylistItem", "()Lcom/soundcloud/android/foundation/domain/playable/PlaylistItem;", "getPosition", "()Ljava/lang/Integer;", "getPromoted", "()Z", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "getUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "identityEquals", "streamItem", "toString", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.stream.s reason: case insensitive filesystem */
/* compiled from: StreamItem.kt */
public final class C6102s extends C6109va {
    public static final a d = new a(null);
    private final C3508cda e;
    private final long f;
    private final C3863rda g;
    private final boolean h;
    private final Date i;
    private final String j;
    private final int k;

    /* renamed from: com.soundcloud.android.stream.s$a */
    /* compiled from: StreamItem.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C6102s(long j2, C3863rda rda, boolean z, Date date, String str, int i2) {
        C7471uYa.b(rda, "playlistItem");
        C7471uYa.b(date, "createdAt");
        super(b.PLAYLIST, Long.valueOf(j2), null);
        this.f = j2;
        this.g = rda;
        this.h = z;
        this.i = date;
        this.j = str;
        this.k = i2;
        C3508cda a2 = this.g.a();
        C7471uYa.a((Object) a2, "playlistItem.urn");
        this.e = a2;
    }

    public boolean a(C6109va vaVar) {
        C7471uYa.b(vaVar, "streamItem");
        Long c = vaVar.c();
        return c != null && c.longValue() == c().longValue();
    }

    public Date b() {
        return this.i;
    }

    public Long c() {
        return Long.valueOf(this.f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6102s) {
                C6102s sVar = (C6102s) obj;
                if ((c().longValue() == sVar.c().longValue()) && C7471uYa.a((Object) this.g, (Object) sVar.g)) {
                    if ((this.h == sVar.h) && C7471uYa.a((Object) b(), (Object) sVar.b()) && C7471uYa.a((Object) this.j, (Object) sVar.j)) {
                        if (l().intValue() == sVar.l().intValue()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long longValue = c().longValue();
        int i2 = ((int) (longValue ^ (longValue >>> 32))) * 31;
        C3863rda rda = this.g;
        int i3 = 0;
        int hashCode = (i2 + (rda != null ? rda.hashCode() : 0)) * 31;
        boolean z = this.h;
        if (z) {
            z = true;
        }
        int i4 = (hashCode + (z ? 1 : 0)) * 31;
        Date b = b();
        int hashCode2 = (i4 + (b != null ? b.hashCode() : 0)) * 31;
        String str = this.j;
        if (str != null) {
            i3 = str.hashCode();
        }
        return ((hashCode2 + i3) * 31) + l().intValue();
    }

    public final String j() {
        return this.j;
    }

    public final C3863rda k() {
        return this.g;
    }

    public Integer l() {
        return Integer.valueOf(this.k);
    }

    public final boolean m() {
        return this.h;
    }

    public final C3508cda n() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaylistStreamItem(id=");
        sb.append(c());
        sb.append(", playlistItem=");
        sb.append(this.g);
        sb.append(", promoted=");
        sb.append(this.h);
        sb.append(", createdAt=");
        sb.append(b());
        sb.append(", avatarUrlTemplate=");
        sb.append(this.j);
        sb.append(", position=");
        sb.append(l());
        sb.append(")");
        return sb.toString();
    }
}
