package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0784q;
import com.google.android.gms.internal.clearcut.r;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.q reason: case insensitive filesystem */
public abstract class C0784q<MessageType extends C0784q<MessageType, BuilderType>, BuilderType extends r<MessageType, BuilderType>> implements La {
    private static boolean zzey = false;
    protected int zzex = 0;

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    public final A b() {
        try {
            F m = A.m(d());
            a(m.b());
            return m.a();
        } catch (IOException e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + str.length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    public int e() {
        throw new UnsupportedOperationException();
    }
}
