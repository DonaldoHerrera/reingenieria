package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.Ja;
import com.google.android.gms.internal.firebase-perf.La;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Ja<MessageType extends Ja<MessageType, BuilderType>, BuilderType extends La<MessageType, BuilderType>> implements C0835ec {
    protected int zzmo = 0;

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    public final Oa c() {
        try {
            Wa n = Oa.n(g());
            a(n.b());
            return n.a();
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

    public final byte[] h() {
        try {
            byte[] bArr = new byte[g()];
            C0838fb a = C0838fb.a(bArr);
            a(a);
            a.b();
            return bArr;
        } catch (IOException e) {
            String str = "byte array";
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
    public int j() {
        throw new UnsupportedOperationException();
    }

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        C0897ub.a(iterable);
        String str = " is null.";
        String str2 = "Element at index ";
        if (iterable instanceof Lb) {
            List W = ((Lb) iterable).W();
            Lb lb = (Lb) list;
            int size = list.size();
            for (Object next : W) {
                if (next == null) {
                    int size2 = lb.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append(str2);
                    sb.append(size2);
                    sb.append(str);
                    String sb2 = sb.toString();
                    for (int size3 = lb.size() - 1; size3 >= size; size3--) {
                        lb.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof Oa) {
                    lb.a((Oa) next);
                } else {
                    lb.add((String) next);
                }
            }
        } else if (iterable instanceof C0871nc) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size() - size4;
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append(str2);
                    sb3.append(size5);
                    sb3.append(str);
                    String sb4 = sb3.toString();
                    for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }
}
