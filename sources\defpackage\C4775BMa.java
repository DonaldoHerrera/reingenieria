package defpackage;

import java.nio.charset.Charset;

/* renamed from: BMa reason: default package and case insensitive filesystem */
/* compiled from: StringLruCache */
class C4775BMa extends C7735yMa<String, String> {
    public C4775BMa(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int b(String str, String str2) {
        return str2.getBytes(Charset.defaultCharset()).length;
    }
}
