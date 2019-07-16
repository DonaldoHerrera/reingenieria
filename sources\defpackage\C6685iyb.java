package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: iyb reason: default package and case insensitive filesystem */
/* compiled from: Dns */
public final /* synthetic */ class C6685iyb {
    public static /* synthetic */ List a(String str) throws UnknownHostException {
        if (str != null) {
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Broken system behaviour for dns lookup of ");
                sb.append(str);
                UnknownHostException unknownHostException = new UnknownHostException(sb.toString());
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        } else {
            throw new UnknownHostException("hostname == null");
        }
    }
}
