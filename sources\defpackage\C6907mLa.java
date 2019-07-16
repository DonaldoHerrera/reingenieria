package defpackage;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;

/* renamed from: mLa reason: default package and case insensitive filesystem */
/* compiled from: Filter */
public final class C6907mLa implements C7113pLa {
    private final StringBuilder a = new StringBuilder(64);
    private Object[] b;

    private C6907mLa() {
    }

    public static C6907mLa a() {
        return new C6907mLa();
    }

    private String e(String str, Object[] objArr) {
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 2) + 5);
        sb.append(str);
        sb.append(" IN (");
        sb.append(TextUtils.join(",", Collections.nCopies(objArr.length, "?")));
        sb.append(')');
        return sb.toString();
    }

    private String f(String str, Object[] objArr) {
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 2) + 8);
        sb.append(str);
        sb.append(" NOT IN (");
        sb.append(TextUtils.join(",", Collections.nCopies(objArr.length, "?")));
        sb.append(')');
        return sb.toString();
    }

    public String[] C() {
        Object[] objArr = this.b;
        if (objArr == null) {
            return null;
        }
        return C7044oLa.a(objArr);
    }

    public String D() {
        return this.a.toString();
    }

    public C7113pLa b(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" < ?");
        return a(sb.toString(), obj);
    }

    public String build() {
        return this.a.toString();
    }

    public C7113pLa c(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" <= ?");
        return a(sb.toString(), obj);
    }

    public C7113pLa d(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" = ?");
        return a(sb.toString(), obj);
    }

    public C7113pLa a(String str, Object... objArr) {
        a("AND", str, objArr);
        return this;
    }

    public C7113pLa b(String str, Object... objArr) {
        return a(e(str, objArr), objArr);
    }

    public C7113pLa c(C5085LLa lLa, Object obj) {
        return a(lLa.e(), obj);
    }

    public C7113pLa d(String str, Object... objArr) {
        return a(f(str, objArr), objArr);
    }

    public C7113pLa a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > ?");
        return a(sb.toString(), obj);
    }

    public C7113pLa b(String str, Collection<?> collection) {
        return b(str, collection.toArray());
    }

    public C7113pLa c(String str, Object... objArr) {
        a("OR", str, objArr);
        return this;
    }

    public C7113pLa d(C5085LLa lLa, Object obj) {
        return c(lLa.e(), obj);
    }

    public C7113pLa a(String str, Collection<?> collection) {
        return d(str, collection.toArray());
    }

    public C7113pLa b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" IS NOT NULL");
        return a(sb.toString(), new Object[0]);
    }

    public C7113pLa c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" IS NOT NULL");
        return c(sb.toString(), new Object[0]);
    }

    public C7113pLa a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" IS NULL");
        return a(sb.toString(), new Object[0]);
    }

    public C7113pLa b(C5085LLa lLa, Object obj) {
        return b(lLa.e(), obj);
    }

    public C7113pLa c(C5085LLa lLa) {
        return c(lLa.e());
    }

    public C7113pLa a(C5085LLa lLa, Object obj) {
        return d(lLa.e(), obj);
    }

    public C7113pLa b(C5085LLa lLa) {
        StringBuilder sb = new StringBuilder();
        sb.append(lLa);
        sb.append(" IS NOT NULL");
        return a(sb.toString(), new Object[0]);
    }

    private Object[] b(Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] instanceof Boolean) {
                objArr[i] = Integer.valueOf(Boolean.TRUE.equals(objArr[i]) ? 1 : 0);
            }
        }
        return objArr;
    }

    public C7113pLa a(C5085LLa lLa, Object... objArr) {
        return b(lLa.e(), objArr);
    }

    public C7113pLa a(C5085LLa lLa, Collection<?> collection) {
        return a(lLa, collection.toArray());
    }

    public C7113pLa a(C5085LLa lLa) {
        return a(lLa.e());
    }

    private C7113pLa a(String str, String str2, Object... objArr) {
        a(str2, str);
        a(objArr);
        return this;
    }

    private void a(String str, String str2) {
        if (this.a.length() == 0) {
            this.a.append(str);
            return;
        }
        StringBuilder insert = this.a.insert(0, '(');
        insert.append(')');
        insert.append(' ');
        insert.append(str2);
        insert.append(' ');
        insert.append('(');
        insert.append(str);
        insert.append(')');
    }

    /* access modifiers changed from: 0000 */
    public void a(Object[] objArr) {
        b(objArr);
        Object[] objArr2 = this.b;
        if (objArr2 == null || objArr2.length == 0) {
            this.b = objArr;
            return;
        }
        Object[] objArr3 = new Object[(objArr2.length + objArr.length)];
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, this.b.length, objArr.length);
        this.b = objArr3;
    }
}
