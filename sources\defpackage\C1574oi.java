package defpackage;

import java.io.FileOutputStream;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: oi reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1574oi implements e {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Map f;
    final /* synthetic */ int g;
    final /* synthetic */ C1874yi h;

    C1574oi(C1874yi yiVar, int i, int i2, long j, long j2, boolean z, Map map, int i3) {
        this.h = yiVar;
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = map;
        this.g = i3;
    }

    public void a(FileOutputStream fileOutputStream) throws Exception {
        fileOutputStream.write(new JSONObject(new C1543ni(this)).toString().getBytes());
    }
}
