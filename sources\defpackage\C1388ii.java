package defpackage;

import java.io.FileOutputStream;
import org.json.JSONObject;

/* renamed from: ii reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1388ii implements e {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;
    final /* synthetic */ C1874yi f;

    C1388ii(C1874yi yiVar, String str, String str2, String str3, String str4, int i) {
        this.f = yiVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public void a(FileOutputStream fileOutputStream) throws Exception {
        fileOutputStream.write(new JSONObject(new C1358hi(this)).toString().getBytes());
    }
}
