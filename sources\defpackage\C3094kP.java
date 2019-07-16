package defpackage;

import java.io.IOException;

/* renamed from: kP reason: default package and case insensitive filesystem */
/* compiled from: DefaultApiClientRx */
public class C3094kP implements efa {
    private final C3037hP a;

    public C3094kP(C3037hP hPVar) {
        this.a = hPVar;
    }

    public /* synthetic */ void a(hfa hfa, JPa jPa) throws Exception {
        jfa a2 = this.a.a(hfa);
        if (a2.g()) {
            jPa.onSuccess(a2);
        } else if (!jPa.a()) {
            jPa.a((Throwable) a2.a());
        }
    }

    public IPa<jfa> b(hfa hfa) {
        return IPa.a((LPa<T>) new C2207OO<T>(this, hfa));
    }

    public C6979nPa a(hfa hfa) {
        return b(hfa).e();
    }

    public <T> IPa<T> a(hfa hfa, C4990IKa<T> iKa) {
        return IPa.a((LPa<T>) new C2188NO<T>(this, hfa, iKa));
    }

    public /* synthetic */ void a(hfa hfa, C4990IKa iKa, JPa jPa) throws Exception {
        try {
            jfa a2 = this.a.a(hfa);
            if (a2.g()) {
                jPa.onSuccess(this.a.a(a2, iKa));
            } else if (!jPa.a()) {
                jPa.a((Throwable) a2.a());
            }
        } catch (Lea | ifa | IOException e) {
            jPa.a(e);
        }
    }

    public <T> IPa<T> a(hfa hfa, Class<T> cls) {
        return a(hfa, C4990IKa.a(cls));
    }
}
