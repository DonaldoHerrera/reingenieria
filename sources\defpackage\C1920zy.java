package defpackage;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* renamed from: zy reason: default package and case insensitive filesystem */
final class C1920zy {
    final It a;
    final StringBuilder b;
    final Mt c;
    final List<Type> d;

    public C1920zy(C1830wy wyVar, StringBuilder sb) {
        Class cls = wyVar.getClass();
        this.d = Arrays.asList(new Type[]{cls});
        this.c = Mt.a(cls, true);
        this.b = sb;
        this.a = new It(wyVar);
    }
}
