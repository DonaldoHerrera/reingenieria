package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* renamed from: yAb reason: default package and case insensitive filesystem */
/* compiled from: Okio */
public final class C7720yAb {
    static final Logger a = Logger.getLogger(C7720yAb.class.getName());

    private C7720yAb() {
    }

    public static C6961nAb a(HAb hAb) {
        return new CAb(hAb);
    }

    public static GAb b(File file) throws FileNotFoundException {
        if (file != null) {
            return a((OutputStream) new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static HAb c(File file) throws FileNotFoundException {
        if (file != null) {
            return a((InputStream) new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static C6893mAb a(GAb gAb) {
        return new AAb(gAb);
    }

    public static GAb a(OutputStream outputStream) {
        return a(outputStream, new JAb());
    }

    public static HAb b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            C6621iAb c = c(socket);
            return c.a(a(socket.getInputStream(), (JAb) c));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    private static C6621iAb c(Socket socket) {
        return new C7651xAb(socket);
    }

    private static GAb a(OutputStream outputStream, JAb jAb) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (jAb != null) {
            return new C7444uAb(jAb, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static GAb a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            C6621iAb c = c(socket);
            return c.a(a(socket.getOutputStream(), (JAb) c));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static HAb a(InputStream inputStream) {
        return a(inputStream, new JAb());
    }

    private static HAb a(InputStream inputStream, JAb jAb) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (jAb != null) {
            return new C7513vAb(jAb, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static GAb a(File file) throws FileNotFoundException {
        if (file != null) {
            return a((OutputStream) new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static GAb a() {
        return new C7582wAb();
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
