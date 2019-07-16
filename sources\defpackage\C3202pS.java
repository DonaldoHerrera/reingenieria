package defpackage;

import com.soundcloud.android.playback.core.d;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pS reason: default package and case insensitive filesystem */
/* compiled from: CastJsonHandler */
public class C3202pS {
    private C4806CMa<Nea> a;
    private d b;

    public C3202pS(C4806CMa<Nea> cMa, d dVar) {
        this.a = cMa;
        this.b = dVar;
    }

    public JSONObject a(C3261sS sSVar) {
        try {
            return new JSONObject(((Nea) this.a.get()).a(sSVar));
        } catch (Lea | JSONException e) {
            this.b.a("CastJsonHandler", "Unable to create json object");
            throw new IllegalArgumentException(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public C3261sS a(JSONObject jSONObject) throws IOException, Lea, JSONException {
        return (C3261sS) ((Nea) this.a.get()).a(jSONObject.get("queue_status").toString(), C4990IKa.a(C3261sS.class));
    }

    public String a(C3241rS rSVar) throws Lea {
        return ((Nea) this.a.get()).a(rSVar);
    }
}
