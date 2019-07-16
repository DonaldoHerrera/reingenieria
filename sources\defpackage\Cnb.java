package defpackage;

import defpackage.Wnb;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Cnb reason: default package */
/* compiled from: AbstractParser */
public abstract class Cnb<MessageType extends Wnb> implements Ynb<MessageType> {
    private static final Inb a = Inb.a();

    public MessageType c(InputStream inputStream, Inb inb) throws Onb {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return d(new C0139a(inputStream, Gnb.a(read, inputStream)), inb);
        } catch (IOException e) {
            throw new Onb(e.getMessage());
        }
    }

    public MessageType d(InputStream inputStream, Inb inb) throws Onb {
        Gnb a2 = Gnb.a(inputStream);
        MessageType messagetype = (Wnb) a(a2, inb);
        try {
            a2.a(0);
            return messagetype;
        } catch (Onb e) {
            e.a(messagetype);
            throw e;
        }
    }

    private C6461fob b(MessageType messagetype) {
        if (messagetype instanceof Bnb) {
            return ((Bnb) messagetype).f();
        }
        return new C6461fob(messagetype);
    }

    private MessageType a(MessageType messagetype) throws Onb {
        if (messagetype == null || messagetype.i()) {
            return messagetype;
        }
        Onb a2 = b(messagetype).a();
        a2.a(messagetype);
        throw a2;
    }

    public MessageType b(Fnb fnb, Inb inb) throws Onb {
        MessageType messagetype;
        try {
            Gnb i = fnb.i();
            messagetype = (Wnb) a(i, inb);
            i.a(0);
            return messagetype;
        } catch (Onb e) {
            e.a(messagetype);
            throw e;
        } catch (Onb e2) {
            throw e2;
        }
    }

    public MessageType a(Fnb fnb, Inb inb) throws Onb {
        MessageType b = b(fnb, inb);
        a(b);
        return b;
    }

    public MessageType a(InputStream inputStream, Inb inb) throws Onb {
        MessageType d = d(inputStream, inb);
        a(d);
        return d;
    }

    public MessageType a(InputStream inputStream) throws Onb {
        return a(inputStream, a);
    }

    public MessageType b(InputStream inputStream, Inb inb) throws Onb {
        MessageType c = c(inputStream, inb);
        a(c);
        return c;
    }
}
