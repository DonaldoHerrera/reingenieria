package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: Zzb reason: default package */
/* compiled from: Jdk9Platform */
final class Zzb extends _zb {
    final Method c;
    final Method d;

    Zzb(Method method, Method method2) {
        this.c = method;
        this.d = method2;
    }

    public static Zzb e() {
        try {
            return new Zzb(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List<C7509uyb> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List a = _zb.a(list);
            this.c.invoke(sSLParameters, new Object[]{a.toArray(new String[a.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        }
    }

    public String b(SSLSocket sSLSocket) {
        try {
            String str = (String) this.d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }
}
