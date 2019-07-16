package com.soundcloud.android.stations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;

/* renamed from: com.soundcloud.android.stations.s reason: case insensitive filesystem */
/* compiled from: ApiStationMetadata */
public final class C6043s {
    public static final Function<C6043s, C3508cda> a = C5993b.a;
    private final C3508cda b;
    private final String c;
    private final String d;
    private final String e;
    private final C4928GKa<String> f;

    @JsonCreator
    C6043s(@JsonProperty("urn") C3508cda cda, @JsonProperty("title") String str, @JsonProperty("permalink_url") String str2, @JsonProperty("type") String str3, @JsonProperty("artwork_url_template") String str4) {
        this.b = cda;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = C4928GKa.b(str4);
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public C3508cda e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6043s.class != obj.getClass()) {
            return false;
        }
        return C4804CKa.a(this.b, ((C6043s) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public C4928GKa<String> a() {
        return this.f;
    }
}
