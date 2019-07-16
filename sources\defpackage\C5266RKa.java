package defpackage;

import android.content.ContentValues;

/* renamed from: RKa reason: default package and case insensitive filesystem */
/* compiled from: ChangeResult */
public class C5266RKa extends C6499gLa {
    private final int b;

    public C5266RKa(int i) {
        this.b = i;
    }

    static C5266RKa a(String str, Throwable th, ContentValues contentValues) {
        C5266RKa d = d();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(str);
        sb.append(" failed");
        return (C5266RKa) d.a(new C5529_Ka(sb.toString(), th, contentValues.toString()));
    }

    static C5266RKa d() {
        return new C5266RKa(0);
    }

    public int c() {
        return this.b;
    }

    static C5266RKa a(String str, Throwable th) {
        C5266RKa d = d();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE from ");
        sb.append(str);
        sb.append(" failed");
        return (C5266RKa) d.a(new C5529_Ka(sb.toString(), th));
    }
}
