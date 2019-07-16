package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* renamed from: FBb reason: default package */
/* compiled from: Ser */
final class FBb implements Externalizable {
    private byte a;
    private Object b;

    public FBb() {
    }

    static void a(byte b2, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b2);
        if (b2 != 64) {
            switch (b2) {
                case 1:
                    ((C6419fBb) obj).a(dataOutput);
                    return;
                case 2:
                    ((C6623iBb) obj).a(dataOutput);
                    return;
                case 3:
                    ((C6827lBb) obj).a(dataOutput);
                    return;
                case 4:
                    ((C7032oBb) obj).a(dataOutput);
                    return;
                case 5:
                    ((C7239rBb) obj).a(dataOutput);
                    return;
                case 6:
                    ((TBb) obj).a(dataOutput);
                    return;
                case 7:
                    ((QBb) obj).b(dataOutput);
                    return;
                case 8:
                    ((PBb) obj).b(dataOutput);
                    return;
                default:
                    switch (b2) {
                        case 66:
                            ((DBb) obj).a(dataOutput);
                            return;
                        case 67:
                            ((IBb) obj).a(dataOutput);
                            return;
                        case 68:
                            ((LBb) obj).a(dataOutput);
                            return;
                        case 69:
                            ((BBb) obj).a(dataOutput);
                            return;
                        default:
                            throw new InvalidClassException("Unknown serialized type");
                    }
            }
        } else {
            ((C7653xBb) obj).a(dataOutput);
        }
    }

    private Object readResolve() {
        return this.b;
    }

    public void readExternal(ObjectInput objectInput) throws IOException {
        this.a = objectInput.readByte();
        this.b = a(this.a, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        a(this.a, this.b, objectOutput);
    }

    FBb(byte b2, Object obj) {
        this.a = b2;
        this.b = obj;
    }

    static Object a(DataInput dataInput) throws IOException {
        return a(dataInput.readByte(), dataInput);
    }

    private static Object a(byte b2, DataInput dataInput) throws IOException {
        if (b2 == 64) {
            return C7653xBb.a(dataInput);
        }
        switch (b2) {
            case 1:
                return C6419fBb.a(dataInput);
            case 2:
                return C6623iBb.a(dataInput);
            case 3:
                return C6827lBb.a(dataInput);
            case 4:
                return C7032oBb.a(dataInput);
            case 5:
                return C7239rBb.a(dataInput);
            case 6:
                return TBb.a(dataInput);
            case 7:
                return QBb.a(dataInput);
            case 8:
                return PBb.a(dataInput);
            default:
                switch (b2) {
                    case 66:
                        return DBb.a(dataInput);
                    case 67:
                        return IBb.a(dataInput);
                    case 68:
                        return LBb.a(dataInput);
                    case 69:
                        return BBb.a(dataInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }
}
