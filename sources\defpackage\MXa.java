package defpackage;

import com.adjust.sdk.Constants;
import java.lang.annotation.Annotation;

/* renamed from: MXa reason: default package */
/* compiled from: JvmClassMapping.kt */
public final class MXa {
    public static final <T> Class<T> a(C7472uZa<T> uza) {
        C7471uYa.b(uza, "$this$java");
        Class<T> a = ((C7057oYa) uza).a();
        if (a != null) {
            return a;
        }
        throw new OVa("null cannot be cast to non-null type java.lang.Class<T>");
    }

    public static final <T> Class<T> b(C7472uZa<T> uza) {
        C7471uYa.b(uza, "$this$javaObjectType");
        Class a = ((C7057oYa) uza).a();
        String str = "null cannot be cast to non-null type java.lang.Class<T>";
        if (a.isPrimitive()) {
            String name = a.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            a = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            a = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            a = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            a = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals(Constants.LONG)) {
                            a = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            a = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            a = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            a = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            a = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (a != null) {
                return a;
            }
            throw new OVa(str);
        } else if (a != null) {
            return a;
        } else {
            throw new OVa(str);
        }
    }

    public static final <T> Class<T> c(C7472uZa<T> uza) {
        Class<T> cls;
        C7471uYa.b(uza, "$this$javaPrimitiveType");
        Class<T> a = ((C7057oYa) uza).a();
        if (!a.isPrimitive()) {
            String name = a.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -2056817302:
                        if (name.equals("java.lang.Integer")) {
                            cls = Integer.TYPE;
                            break;
                        }
                    case -527879800:
                        if (name.equals("java.lang.Float")) {
                            cls = Float.TYPE;
                            break;
                        }
                    case -515992664:
                        if (name.equals("java.lang.Short")) {
                            cls = Short.TYPE;
                            break;
                        }
                    case 155276373:
                        if (name.equals("java.lang.Character")) {
                            cls = Character.TYPE;
                            break;
                        }
                    case 344809556:
                        if (name.equals("java.lang.Boolean")) {
                            cls = Boolean.TYPE;
                            break;
                        }
                    case 398507100:
                        if (name.equals("java.lang.Byte")) {
                            cls = Byte.TYPE;
                            break;
                        }
                    case 398795216:
                        if (name.equals("java.lang.Long")) {
                            cls = Long.TYPE;
                            break;
                        }
                    case 399092968:
                        if (name.equals("java.lang.Void")) {
                            cls = Void.TYPE;
                            break;
                        }
                    case 761287205:
                        if (name.equals("java.lang.Double")) {
                            cls = Double.TYPE;
                            break;
                        }
                }
            }
            cls = null;
            return cls;
        } else if (a != null) {
            return a;
        } else {
            throw new OVa("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }

    public static final <T> C7472uZa<T> a(Class<T> cls) {
        C7471uYa.b(cls, "$this$kotlin");
        return HYa.a((Class) cls);
    }

    public static final <T extends Annotation> C7472uZa<? extends T> a(T t) {
        C7471uYa.b(t, "$this$annotationClass");
        Class annotationType = t.annotationType();
        C7471uYa.a((Object) annotationType, "(this as java.lang.annot…otation).annotationType()");
        C7472uZa<? extends T> a = a(annotationType);
        if (a != null) {
            return a;
        }
        throw new OVa("null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
    }
}
