package defpackage;

import java.lang.reflect.Modifier;

@EVa(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaModifierListOwner;", "isAbstract", "", "()Z", "isFinal", "isStatic", "modifiers", "", "getModifiers", "()I", "visibility", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "getVisibility", "()Lorg/jetbrains/kotlin/descriptors/Visibility;", "descriptors.runtime"}, mv = {1, 1, 15})
/* renamed from: qwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaModifierListOwner.kt */
public interface C7229qwb extends Vib {

    /* renamed from: qwb$a */
    /* compiled from: ReflectJavaModifierListOwner.kt */
    public static final class a {
        public static C5583aeb a(C7229qwb qwb) {
            C5583aeb aeb;
            int modifiers = qwb.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                C5583aeb aeb2 = _db.e;
                C7471uYa.a((Object) aeb2, "Visibilities.PUBLIC");
                return aeb2;
            } else if (Modifier.isPrivate(modifiers)) {
                C5583aeb aeb3 = _db.a;
                C7471uYa.a((Object) aeb3, "Visibilities.PRIVATE");
                return aeb3;
            } else if (Modifier.isProtected(modifiers)) {
                if (Modifier.isStatic(modifiers)) {
                    aeb = C6521ggb.b;
                } else {
                    aeb = C6521ggb.c;
                }
                C7471uYa.a((Object) aeb, "if (Modifier.isStatic(mo…ies.PROTECTED_AND_PACKAGE");
                return aeb;
            } else {
                C5583aeb aeb4 = C6521ggb.a;
                C7471uYa.a((Object) aeb4, "JavaVisibilities.PACKAGE_VISIBILITY");
                return aeb4;
            }
        }

        public static boolean b(C7229qwb qwb) {
            return Modifier.isAbstract(qwb.getModifiers());
        }

        public static boolean c(C7229qwb qwb) {
            return Modifier.isFinal(qwb.getModifiers());
        }

        public static boolean d(C7229qwb qwb) {
            return Modifier.isStatic(qwb.getModifiers());
        }
    }

    int getModifiers();
}
