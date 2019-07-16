package androidx.core.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Bundle;
import java.util.Set;

/* compiled from: RemoteInput */
public final class o {
    private final String a;
    private final CharSequence b;
    private final CharSequence[] c;
    private final boolean d;
    private final Bundle e;
    private final Set<String> f;

    public boolean a() {
        return this.d;
    }

    public Set<String> b() {
        return this.f;
    }

    public CharSequence[] c() {
        return this.c;
    }

    public Bundle d() {
        return this.e;
    }

    public CharSequence e() {
        return this.b;
    }

    public String f() {
        return this.a;
    }

    public boolean g() {
        return !a() && (c() == null || c().length == 0) && b() != null && !b().isEmpty();
    }

    static RemoteInput[] a(o[] oVarArr) {
        if (oVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[oVarArr.length];
        for (int i = 0; i < oVarArr.length; i++) {
            remoteInputArr[i] = a(oVarArr[i]);
        }
        return remoteInputArr;
    }

    static RemoteInput a(o oVar) {
        return new Builder(oVar.f()).setLabel(oVar.e()).setChoices(oVar.c()).setAllowFreeFormInput(oVar.a()).addExtras(oVar.d()).build();
    }
}
