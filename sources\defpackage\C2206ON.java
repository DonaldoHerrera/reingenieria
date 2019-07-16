package defpackage;

import android.content.res.Resources;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.firebase.d;

/* renamed from: ON reason: default package and case insensitive filesystem */
/* compiled from: FirebaseDynamicLinksApi */
public class C2206ON {
    private final d a;
    private final Resources b;
    private final C7440tyb c;
    private final Nea d;
    private final HPa e;

    /* renamed from: ON$a */
    /* compiled from: FirebaseDynamicLinksApi */
    private static class a {
        final String a;

        @JsonCreator
        a(@JsonProperty("shortLink") String str) {
            if (str != null) {
                this.a = str;
                return;
            }
            throw new IllegalArgumentException("Missing shortLink");
        }
    }

    C2206ON(d dVar, Resources resources, C7440tyb tyb, Nea nea, HPa hPa) {
        this.a = dVar;
        this.b = resources;
        this.c = tyb;
        this.d = nea;
        this.e = hPa;
    }
}
