package defpackage;

import defpackage.MUa;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: MUa reason: default package */
/* compiled from: BaseTestConsumer */
public abstract class MUa<T, U extends MUa<T, U>> implements VPa {
    protected final CountDownLatch a = new CountDownLatch(1);
    protected final List<T> b = new KUa();
    protected final List<Throwable> c = new KUa();
    protected long d;
    protected Thread e;
    protected boolean f;
    protected int g;
    protected int h;
}
