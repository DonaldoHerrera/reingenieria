package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* renamed from: ACb reason: default package */
/* compiled from: Ser */
final class ACb implements Externalizable {
    private byte a;
    private Object b;

    public ACb() {
    }

    private static void a(byte b2, Object obj, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(b2);
        switch (b2) {
            case 1:
                ((C7379tCb) obj).a((DataOutput) objectOutput);
                return;
            case 2:
                ((C7448uCb) obj).a((DataOutput) objectOutput);
                return;
            case 3:
                ((C6897mCb) obj).a((DataOutput) objectOutput);
                return;
            case 4:
                ((C6965nCb) obj).a((DataOutput) objectOutput);
                return;
            case 5:
                ((C7724yCb) obj).a((DataOutput) objectOutput);
                return;
            case 6:
                ((C7793zCb) obj).a((DataOutput) objectOutput);
                return;
            case 7:
                ((ECb) obj).a((DataOutput) objectOutput);
                return;
            case 8:
                ((FCb) obj).a((DataOutput) objectOutput);
                return;
            case 11:
                ((C6625iCb) obj).a((DataOutput) objectOutput);
                return;
            case 12:
                ((C5553aCb) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((C6489gCb) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        this.a = objectInput.readByte();
        this.b = a(this.a, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        a(this.a, this.b, objectOutput);
    }

    ACb(byte b2, Object obj) {
        this.a = b2;
        this.b = obj;
    }

    private static Object a(byte b2, ObjectInput objectInput) throws IOException, ClassNotFoundException {
        switch (b2) {
            case 1:
                return C7379tCb.a((DataInput) objectInput);
            case 2:
                return C7448uCb.a((DataInput) objectInput);
            case 3:
                return C6897mCb.a((DataInput) objectInput);
            case 4:
                return C6965nCb.a((DataInput) objectInput);
            case 5:
                return C7724yCb.a((DataInput) objectInput);
            case 6:
                return C7793zCb.a((DataInput) objectInput);
            case 7:
                return ECb.a((DataInput) objectInput);
            case 8:
                return FCb.a((DataInput) objectInput);
            case 11:
                return C6625iCb.a((DataInput) objectInput);
            case 12:
                return C5553aCb.readExternal(objectInput);
            case 13:
                return C6489gCb.readExternal(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }
}
