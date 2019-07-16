package defpackage;

import com.soundcloud.flippernative.BuildConfig;
import java.util.Map;

/* renamed from: bG reason: default package and case insensitive filesystem */
/* compiled from: UPCAWriter */
public final class C2460bG implements C3027hF {
    private final C2348WF a = new C2348WF();

    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) throws C3046iF {
        if (_e == C2421_E.UPC_A) {
            return this.a.a(a(str), C2421_E.EAN_13, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode UPC-A, but got ");
        sb.append(_e);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String a(String str) {
        int length = str.length();
        if (length == 11) {
            int i = 0;
            for (int i2 = 0; i2 < 11; i2++) {
                i += (str.charAt(i2) - '0') * (i2 % 2 == 0 ? 3 : 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append((1000 - i) % 10);
            str = sb.toString();
        } else if (length != 12) {
            StringBuilder sb2 = new StringBuilder("Requested contents should be 11 or 12 digits long, but got ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(BuildConfig.VERSION_NAME);
        sb3.append(str);
        return sb3.toString();
    }
}
