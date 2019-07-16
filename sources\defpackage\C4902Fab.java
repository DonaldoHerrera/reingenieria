package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* renamed from: Fab reason: default package and case insensitive filesystem */
/* compiled from: KPropertyImpl.kt */
final class C4902Fab extends C7540vYa implements _Xa<Field, C7061obb<? extends Field>> {
    final /* synthetic */ a a;
    final /* synthetic */ boolean b;
    final /* synthetic */ C4871Eab c;
    final /* synthetic */ C4840Dab d;

    C4902Fab(a aVar, boolean z, C4871Eab eab, C4840Dab dab) {
        this.a = aVar;
        this.b = z;
        this.c = eab;
        this.d = dab;
        super(1);
    }

    /* renamed from: a */
    public final C7061obb<Field> invoke(Field field) {
        C7471uYa.b(field, "field");
        if (C4933Gab.b(this.a.e().i()) || !Modifier.isStatic(field.getModifiers())) {
            if (this.b) {
                if (this.a.k()) {
                    return new a(field, C4933Gab.a(this.a));
                }
                return new c(field);
            } else if (this.a.k()) {
                return new a(field, this.c.d(), C4933Gab.a(this.a));
            } else {
                return new c(field, this.c.d());
            }
        } else if (this.d.d()) {
            if (this.b) {
                if (this.a.k()) {
                    return new b(field);
                }
                return new d(field);
            } else if (this.a.k()) {
                return new b(field, this.c.d());
            } else {
                return new d(field, this.c.d());
            }
        } else if (this.b) {
            return new e(field);
        } else {
            return new e(field, this.c.d());
        }
    }
}
