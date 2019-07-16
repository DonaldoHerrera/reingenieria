package defpackage;

import java.io.InputStream;

/* renamed from: Ynb reason: default package */
/* compiled from: Parser */
public interface Ynb<MessageType> {
    MessageType a(Fnb fnb, Inb inb) throws Onb;

    MessageType a(Gnb gnb, Inb inb) throws Onb;

    MessageType a(InputStream inputStream) throws Onb;

    MessageType a(InputStream inputStream, Inb inb) throws Onb;

    MessageType b(InputStream inputStream, Inb inb) throws Onb;
}
