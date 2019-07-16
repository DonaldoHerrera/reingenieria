package bo.app;

import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

class g extends SSLSocketFactory {
    private static final String a = Hg.a(g.class);
    private SSLSocketFactory b;

    public g() {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, null, null);
        this.b = instance.getSocketFactory();
    }

    private Socket a(Socket socket) {
        String[] supportedProtocols;
        if (socket != null && (socket instanceof SSLSocket)) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            ArrayList arrayList = new ArrayList();
            for (String str : sSLSocket.getSupportedProtocols()) {
                if (!str.equals("SSLv3")) {
                    arrayList.add(str);
                }
            }
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Enabling SSL protocols: ");
            sb.append(arrayList);
            Hg.d(str2, sb.toString());
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        return socket;
    }

    public Socket createSocket() {
        Socket createSocket = this.b.createSocket();
        a(createSocket);
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return this.b.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.b.getSupportedCipherSuites();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.b.createSocket(socket, str, i, z);
        a(createSocket);
        return createSocket;
    }

    public Socket createSocket(String str, int i) {
        Socket createSocket = this.b.createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.b.createSocket(str, i, inetAddress, i2);
        a(createSocket);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.b.createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.b.createSocket(inetAddress, i, inetAddress2, i2);
        a(createSocket);
        return createSocket;
    }
}
