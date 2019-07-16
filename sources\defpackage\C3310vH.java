package defpackage;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: vH reason: default package and case insensitive filesystem */
public abstract class C3310vH extends C3330wH {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final double e;

    public C3310vH(b bVar, HashSet<String> hashSet, JSONObject jSONObject, double d2) {
        super(bVar);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = d2;
    }
}
