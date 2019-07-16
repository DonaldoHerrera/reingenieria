package defpackage;

/* renamed from: AUa reason: default package */
/* compiled from: BlockingHelper */
public final class AUa {
    public static void a() {
        if (!WUa.a()) {
            return;
        }
        if ((Thread.currentThread() instanceof C6576hUa) || WUa.b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempt to block on a Scheduler ");
            sb.append(Thread.currentThread().getName());
            sb.append(" that doesn't support blocking operators as they may lead to deadlock");
            throw new IllegalStateException(sb.toString());
        }
    }
}
