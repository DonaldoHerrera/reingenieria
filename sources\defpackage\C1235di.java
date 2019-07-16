package defpackage;

import java.util.HashMap;

/* renamed from: di reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1235di extends HashMap<String, Object> {
    final /* synthetic */ C1265ei a;

    C1235di(C1265ei eiVar) {
        this.a = eiVar;
        put("session_id", this.a.a);
        put("generator", this.a.b);
        put("started_at_seconds", Long.valueOf(this.a.c));
    }
}
