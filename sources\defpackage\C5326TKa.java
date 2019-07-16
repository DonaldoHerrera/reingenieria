package defpackage;

import android.database.Cursor;
import java.util.Date;

/* renamed from: TKa reason: default package and case insensitive filesystem */
/* compiled from: CursorReader */
public class C5326TKa {
    private final Cursor a;
    private final boolean b;

    C5326TKa(Cursor cursor, boolean z) {
        this.a = cursor;
        this.b = z;
    }

    public boolean a(String str) {
        return c(str) == 1;
    }

    public int b(C5085LLa lLa) {
        Cursor cursor = this.a;
        return cursor.getInt(cursor.getColumnIndex(e(lLa)));
    }

    public int c() {
        return this.a.getCount();
    }

    public String d(C5085LLa lLa) {
        Cursor cursor = this.a;
        return cursor.getString(cursor.getColumnIndex(e(lLa)));
    }

    public String e(String str) {
        Cursor cursor = this.a;
        return cursor.getString(cursor.getColumnIndex(str));
    }

    public boolean f(String str) {
        return this.a.getColumnIndex(str) != -1;
    }

    public String g(int i) {
        return this.a.getString(i);
    }

    public boolean h(String str) {
        Cursor cursor = this.a;
        return cursor.isNull(cursor.getColumnIndex(str));
    }

    public byte[] a(int i) {
        return this.a.getBlob(i);
    }

    public double b(int i) {
        return this.a.getDouble(i);
    }

    public int c(String str) {
        Cursor cursor = this.a;
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    public int d(int i) {
        return this.a.getInt(i);
    }

    public long e(int i) {
        return this.a.getLong(i);
    }

    public short f(int i) {
        return this.a.getShort(i);
    }

    public boolean g(String str) {
        return !h(str);
    }

    private String e(C5085LLa lLa) {
        return this.b ? lLa.b() : lLa.d();
    }

    public Date a(C5085LLa lLa) {
        return new Date(d(e(lLa)));
    }

    public Date b(String str) {
        return new Date(d(str));
    }

    public long c(C5085LLa lLa) {
        Cursor cursor = this.a;
        return cursor.getLong(cursor.getColumnIndex(e(lLa)));
    }

    public long d(String str) {
        Cursor cursor = this.a;
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.moveToNext();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (!this.a.isClosed()) {
            this.a.close();
        }
    }

    public float c(int i) {
        return this.a.getFloat(i);
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return !this.a.isLast() && !this.a.isAfterLast();
    }
}
