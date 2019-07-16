package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.type.WritableTypeId.Inclusion;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

public abstract class TypeSerializer {

    /* renamed from: com.fasterxml.jackson.databind.jsontype.TypeSerializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = new int[As.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[As.EXISTING_PROPERTY.ordinal()] = 1;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[As.EXTERNAL_PROPERTY.ordinal()] = 2;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[As.PROPERTY.ordinal()] = 3;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[As.WRAPPER_ARRAY.ordinal()] = 4;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[As.WRAPPER_OBJECT.ordinal()] = 5;
        }
    }

    public abstract TypeSerializer forProperty(BeanProperty beanProperty);

    public abstract String getPropertyName();

    public abstract As getTypeInclusion();

    public WritableTypeId typeId(Object obj, JsonToken jsonToken) {
        WritableTypeId writableTypeId = new WritableTypeId(obj, jsonToken);
        int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[getTypeInclusion().ordinal()];
        if (i == 1) {
            writableTypeId.include = Inclusion.PAYLOAD_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
        } else if (i == 2) {
            writableTypeId.include = Inclusion.PARENT_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
        } else if (i == 3) {
            writableTypeId.include = Inclusion.METADATA_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
        } else if (i == 4) {
            writableTypeId.include = Inclusion.WRAPPER_ARRAY;
        } else if (i == 5) {
            writableTypeId.include = Inclusion.WRAPPER_OBJECT;
        } else {
            VersionUtil.throwInternal();
            throw null;
        }
        return writableTypeId;
    }

    public abstract WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    public abstract WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    public WritableTypeId typeId(Object obj, JsonToken jsonToken, Object obj2) {
        WritableTypeId typeId = typeId(obj, jsonToken);
        typeId.id = obj2;
        return typeId;
    }

    public WritableTypeId typeId(Object obj, Class<?> cls, JsonToken jsonToken) {
        WritableTypeId typeId = typeId(obj, jsonToken);
        typeId.forValueType = cls;
        return typeId;
    }
}
