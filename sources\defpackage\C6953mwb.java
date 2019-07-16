package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* renamed from: mwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaField.kt */
public final class C6953mwb extends C7091owb implements Rib {
    private final Field a;

    public C6953mwb(Field field) {
        C7471uYa.b(field, "member");
        this.a = field;
    }

    public Field I() {
        return this.a;
    }

    public boolean w() {
        return I().isEnumConstant();
    }

    public boolean x() {
        return false;
    }

    public C7436twb getType() {
        a aVar = C7436twb.a;
        Type genericType = I().getGenericType();
        C7471uYa.a((Object) genericType, "member.genericType");
        return aVar.a(genericType);
    }
}
