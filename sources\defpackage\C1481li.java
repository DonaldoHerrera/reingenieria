package defpackage;

import java.io.FileOutputStream;
import org.json.JSONObject;

/* renamed from: li reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1481li implements e {
    final /* synthetic */ boolean a;
    final /* synthetic */ C1874yi b;

    C1481li(C1874yi yiVar, boolean z) {
        this.b = yiVar;
        this.a = z;
    }

    public void a(FileOutputStream fileOutputStream) throws Exception {
        fileOutputStream.write(new JSONObject(new C1450ki(this)).toString().getBytes());
    }
}
