package defpackage;

/* renamed from: TSa reason: default package */
/* compiled from: ObservableLift */
public final class TSa<R, T> extends C6642iSa<T, R> {
    final DPa<? extends R, ? super T> b;

    public TSa(EPa<T> ePa, DPa<? extends R, ? super T> dPa) {
        super(ePa);
        this.b = dPa;
    }

    public void b(GPa<? super R> gPa) {
        try {
            GPa a = this.b.a(gPa);
            StringBuilder sb = new StringBuilder();
            sb.append("Operator ");
            sb.append(this.b);
            sb.append(" returned a null Observer");
            AQa.a(a, sb.toString());
            this.a.a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            _Pa.b(th);
            WUa.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
