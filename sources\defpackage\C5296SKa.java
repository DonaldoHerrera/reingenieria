package defpackage;

import android.content.ContentValues;

/* renamed from: SKa reason: default package and case insensitive filesystem */
/* compiled from: ContentValuesBuilder */
public final class C5296SKa {
    private final ContentValues a;

    private C5296SKa(ContentValues contentValues) {
        this.a = contentValues;
    }

    public static C5296SKa a(int i) {
        return new C5296SKa(new ContentValues(i));
    }

    public static C5296SKa b() {
        return new C5296SKa(new ContentValues());
    }

    public C5296SKa a(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public C5296SKa a(String str, int i) {
        this.a.put(str, Integer.valueOf(i));
        return this;
    }

    public C5296SKa a(String str, long j) {
        this.a.put(str, Long.valueOf(j));
        return this;
    }

    public C5296SKa a(C5085LLa lLa, String str) {
        this.a.put(lLa.d(), str);
        return this;
    }

    public C5296SKa a(C5085LLa lLa, int i) {
        this.a.put(lLa.d(), Integer.valueOf(i));
        return this;
    }

    public C5296SKa a(C5085LLa lLa, long j) {
        this.a.put(lLa.d(), Long.valueOf(j));
        return this;
    }

    public C5296SKa a(C5085LLa lLa, boolean z) {
        this.a.put(lLa.d(), Boolean.valueOf(z));
        return this;
    }

    public ContentValues a() {
        return this.a;
    }
}
