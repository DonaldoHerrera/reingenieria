package defpackage;

import java.util.List;

/* renamed from: QY reason: default package and case insensitive filesystem */
/* compiled from: StringListAdapter */
class C3454QY implements C6704jMa<List<String>, String> {
    private final Nea a;

    C3454QY(Nea nea) {
        this.a = nea;
    }

    /* renamed from: a */
    public List<String> decode(String str) {
        try {
            return (List) this.a.a(str, (C4990IKa<T>) new C3451PY<T>(this));
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public String encode(List<String> list) {
        try {
            return this.a.a(list);
        } catch (Lea e) {
            throw new IllegalStateException(e);
        }
    }
}
