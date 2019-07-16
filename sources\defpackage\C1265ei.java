package defpackage;

import java.io.FileOutputStream;
import org.json.JSONObject;

/* renamed from: ei reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1265ei implements e {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ C1874yi d;

    C1265ei(C1874yi yiVar, String str, String str2, long j) {
        this.d = yiVar;
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public void a(FileOutputStream fileOutputStream) throws Exception {
        fileOutputStream.write(new JSONObject(new C1235di(this)).toString().getBytes());
    }
}
