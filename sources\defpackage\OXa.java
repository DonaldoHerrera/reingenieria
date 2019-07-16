package defpackage;

/* renamed from: OXa reason: default package */
/* compiled from: KotlinReflectionNotSupportedError.kt */
public class OXa extends Error {
    public OXa() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
