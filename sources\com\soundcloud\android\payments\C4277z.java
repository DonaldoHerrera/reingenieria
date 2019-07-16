package com.soundcloud.android.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.soundcloud.android.payments.z reason: case insensitive filesystem */
/* compiled from: AvailableProducts */
class C4277z {
    static final C7118pQa<C4277z, a> a = C4228a.a;
    public final List<a> b;

    /* renamed from: com.soundcloud.android.payments.z$a */
    /* compiled from: AvailableProducts */
    public static class a {
        public final String a;
        public final String b;

        @JsonCreator
        public a(@JsonProperty("id") String str, @JsonProperty("plan_id") String str2) {
            this.a = str;
            this.b = str2;
        }

        public static a a() {
            String str = "unavailable";
            return new a(str, str);
        }

        public boolean b() {
            return this.a.equals("unavailable");
        }
    }

    @JsonCreator
    public C4277z(@JsonProperty("collection") List<a> list) {
        this.b = list;
    }

    static /* synthetic */ a a(C4277z zVar) throws Exception {
        for (a aVar : zVar.b) {
            if (aVar.b.equals("high_tier")) {
                return aVar;
            }
        }
        return a.a();
    }
}
