package defpackage;

/* renamed from: _Pa reason: default package */
/* compiled from: Exceptions */
public final class _Pa {
    public static RuntimeException a(Throwable th) {
        throw EUa.a(th);
    }

    public static void b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
