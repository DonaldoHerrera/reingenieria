package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;

/* renamed from: cda reason: default package and case insensitive filesystem */
/* compiled from: Urn */
public final class C3508cda implements Comparable<C3508cda> {
    public static final C3508cda a = new C3508cda(C3767fda.SOUNDCLOUD, C3751dda.UNKNOWN, -1);
    private final String b;
    private C3767fda c;
    private C3751dda d;
    private String e;
    private String f;
    private String g;
    private long h;

    public C3508cda(String str) {
        this.b = d(str);
    }

    public static C3508cda L() {
        return c(-System.currentTimeMillis());
    }

    private String N() {
        return C5206PKa.a(":").a((Object[]) new String[]{this.e, this.f, this.g});
    }

    private String O() {
        a(C3751dda.TRACKS);
        return N();
    }

    private boolean P() {
        return Q() && this.d == C3751dda.SOUNDS;
    }

    private boolean Q() {
        return this.c == C3767fda.SOUNDCLOUD;
    }

    public static C3508cda a(long j) {
        return new C3508cda(C3767fda.SOUNDCLOUD, C3751dda.ARTIST_STATIONS, j);
    }

    public static C3508cda c(long j) {
        return new C3508cda(j >= 0 ? C3767fda.SOUNDCLOUD : C3767fda.LOCAL, C3751dda.PLAYLISTS, j);
    }

    public static C3508cda d(long j) {
        return new C3508cda(C3767fda.SOUNDCLOUD, C3751dda.TRACKS, j);
    }

    public static C3508cda e(long j) {
        return new C3508cda(C3767fda.SOUNDCLOUD, C3751dda.TRACK_STATIONS, j);
    }

    public static C3508cda f(long j) {
        return new C3508cda(C3767fda.SOUNDCLOUD, C3751dda.USERS, j);
    }

    public boolean J() {
        return Q() && this.d == C3751dda.USERS;
    }

    public boolean K() {
        return J() && this.h > -1;
    }

    public String M() {
        try {
            return URLEncoder.encode(b(), C5053KKa.c.displayName());
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3508cda.class != obj.getClass()) {
            return false;
        }
        return C4804CKa.a(this.b, ((C3508cda) obj).b);
    }

    public boolean g() {
        return this.c == C3767fda.LOCAL;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return b();
    }

    public boolean u() {
        return this.d == C3751dda.PLAYLISTS && (Q() || g());
    }

    public boolean v() {
        if (Q()) {
            C3751dda dda = this.d;
            if (dda == C3751dda.STATIONS || dda == C3751dda.TRACK_STATIONS || dda == C3751dda.ARTIST_STATIONS) {
                return true;
            }
        }
        return false;
    }

    public boolean w() {
        return this.d == C3751dda.SYSTEM_PLAYLIST && Q();
    }

    public boolean x() {
        if (Q()) {
            C3751dda dda = this.d;
            if (dda == C3751dda.SOUNDS || dda == C3751dda.TRACKS) {
                return true;
            }
        }
        return false;
    }

    public boolean y() {
        return Q() && this.d == C3751dda.TRACK_STATIONS;
    }

    public static C3508cda a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str3 = ":";
        sb.append(str3);
        sb.append(C3751dda.ADS.a());
        sb.append(str3);
        sb.append(str2);
        return new C3508cda(sb.toString());
    }

    public static C3508cda b(String str, String str2) {
        return c(String.format("charts-%s:%s", new Object[]{str, str2}));
    }

    private void g(long j) {
        this.h = j;
        e(String.valueOf(j));
    }

    public String d() {
        return this.g;
    }

    public boolean e() {
        return this.d == C3751dda.ADS;
    }

    public boolean f() {
        return Q() && this.d == C3751dda.ARTIST_STATIONS;
    }

    public C3508cda(C3767fda fda, C3751dda dda, long j) {
        this.b = a(fda, dda, j);
    }

    public static C3508cda a(String str) {
        return new C3508cda(C3767fda.SOUNDCLOUD, C3751dda.GENRES, str);
    }

    public static C3508cda b(long j) {
        return new C3508cda(C3767fda.SOUNDCLOUD, C3751dda.COMMENTS, j);
    }

    public static C3508cda c(String str) {
        return new C3508cda(C3767fda.SOUNDCLOUD, C3751dda.SYSTEM_PLAYLIST, str);
    }

    private String d(String str) {
        if (str == null) {
            return a(C3767fda.OTHER, C3751dda.UNKNOWN, -1);
        }
        String[] split = str.split(":");
        c(split);
        a(split);
        b(split);
        if (P()) {
            str = O();
        }
        return str;
    }

    private void e(String str) {
        this.g = str;
    }

    public static C3508cda b(String str) {
        return new C3508cda(C3767fda.SOUNDCLOUD, C3751dda.NEW_FOR_YOU, str);
    }

    /* renamed from: a */
    public int compareTo(C3508cda cda) {
        return b().compareTo(cda.b());
    }

    @Deprecated
    public long c() {
        return this.h;
    }

    public C3508cda(C3767fda fda, C3751dda dda, String str) {
        this.b = a(fda, dda, str);
    }

    private void b(String[] strArr) {
        if (strArr.length > 2) {
            this.g = C5206PKa.a(":").a((Object[]) (String[]) Arrays.copyOfRange(strArr, 2, strArr.length));
            try {
                this.h = Long.valueOf(this.g).longValue();
            } catch (NumberFormatException unused) {
                this.h = -1;
            }
        } else {
            this.g = "";
            this.h = -1;
        }
    }

    private void c(String[] strArr) {
        if (strArr.length > 0) {
            this.c = C3767fda.a(strArr[0]);
            this.e = strArr[0];
            return;
        }
        a(C3767fda.OTHER);
    }

    /* access modifiers changed from: 0000 */
    public C3751dda a() {
        return this.d;
    }

    private void a(C3767fda fda) {
        this.c = fda;
        this.e = fda.a();
    }

    private void a(C3751dda dda) {
        this.d = dda;
        this.f = dda.a();
    }

    private String a(C3767fda fda, C3751dda dda, long j) {
        a(fda);
        a(dda);
        g(j);
        return N();
    }

    private String a(C3767fda fda, C3751dda dda, String str) {
        a(fda);
        a(dda);
        e(str);
        return N();
    }

    private void a(String[] strArr) {
        if (strArr.length > 1) {
            this.d = C3751dda.a(strArr[1]);
            this.f = strArr[1];
            return;
        }
        a(C3751dda.UNKNOWN);
    }
}
