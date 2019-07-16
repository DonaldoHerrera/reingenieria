package defpackage;

/* renamed from: MZa reason: default package */
/* compiled from: exceptions.kt */
public final class MZa extends Exception {
    public MZa(IllegalAccessException illegalAccessException) {
        C7471uYa.b(illegalAccessException, "cause");
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
    }
}
