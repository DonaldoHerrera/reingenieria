package defpackage;

/* renamed from: lxb reason: default package and case insensitive filesystem */
/* compiled from: Regex.kt */
public final class C6887lxb extends YVa<String> {
    final /* synthetic */ C7093oxb b;

    C6887lxb(C7093oxb oxb) {
        this.b = oxb;
    }

    public /* bridge */ boolean a(String str) {
        return super.contains(str);
    }

    public /* bridge */ int b(String str) {
        return super.indexOf(str);
    }

    public /* bridge */ int c(String str) {
        return super.lastIndexOf(str);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    public int f() {
        return this.b.c().groupCount() + 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return c((String) obj);
        }
        return -1;
    }

    public String get(int i) {
        String group = this.b.c().group(i);
        return group != null ? group : "";
    }
}
