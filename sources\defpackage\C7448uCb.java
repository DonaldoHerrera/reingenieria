package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: uCb reason: default package and case insensitive filesystem */
/* compiled from: JapaneseEra */
public final class C7448uCb extends C5623bDb implements Serializable {
    public static final C7448uCb a = new C7448uCb(-1, C6827lBb.a(1868, 9, 8), "Meiji");
    public static final C7448uCb b = new C7448uCb(0, C6827lBb.a(1912, 7, 30), "Taisho");
    public static final C7448uCb c = new C7448uCb(1, C6827lBb.a(1926, 12, 25), "Showa");
    public static final C7448uCb d = new C7448uCb(2, C6827lBb.a(1989, 1, 8), "Heisei");
    private static final AtomicReference<C7448uCb[]> e = new AtomicReference<>(new C7448uCb[]{a, b, c, d});
    private final int f;
    private final transient C6827lBb g;
    private final transient String h;

    private C7448uCb(int i, C6827lBb lbb, String str) {
        this.f = i;
        this.g = lbb;
        this.h = str;
    }

    public static C7448uCb[] L() {
        C7448uCb[] ucbArr = (C7448uCb[]) e.get();
        return (C7448uCb[]) Arrays.copyOf(ucbArr, ucbArr.length);
    }

    public static C7448uCb a(int i) {
        C7448uCb[] ucbArr = (C7448uCb[]) e.get();
        if (i >= a.f && i <= ucbArr[ucbArr.length - 1].f) {
            return ucbArr[b(i)];
        }
        throw new C5687cBb("japaneseEra is invalid");
    }

    private static int b(int i) {
        return i + 1;
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return a(this.f);
        } catch (C5687cBb e2) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e2);
            throw invalidObjectException;
        }
    }

    private Object writeReplace() {
        return new ACb(2, this);
    }

    /* access modifiers changed from: 0000 */
    public C6827lBb J() {
        int b2 = b(this.f);
        C7448uCb[] L = L();
        if (b2 >= L.length - 1) {
            return C6827lBb.c;
        }
        return L[b2 + 1].K().a(1);
    }

    /* access modifiers changed from: 0000 */
    public C6827lBb K() {
        return this.g;
    }

    public int getValue() {
        return this.f;
    }

    public String toString() {
        return this.h;
    }

    static C7448uCb a(C6827lBb lbb) {
        if (!lbb.b((XBb) a.g)) {
            C7448uCb[] ucbArr = (C7448uCb[]) e.get();
            for (int length = ucbArr.length - 1; length >= 0; length--) {
                C7448uCb ucb = ucbArr[length];
                if (lbb.compareTo((XBb) ucb.g) >= 0) {
                    return ucb;
                }
            }
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Date too early: ");
        sb.append(lbb);
        throw new C5687cBb(sb.toString());
    }

    public FDb a(C7381tDb tdb) {
        if (tdb == C6423fDb.ERA) {
            return C7241rCb.f.a(C6423fDb.ERA);
        }
        return super.a(tdb);
    }

    /* access modifiers changed from: 0000 */
    public void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }

    static C7448uCb a(DataInput dataInput) throws IOException {
        return a((int) dataInput.readByte());
    }
}
