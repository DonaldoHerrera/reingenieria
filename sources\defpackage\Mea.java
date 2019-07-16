package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

@EVa(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J)\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\rH\u0016¢\u0006\u0002\u0010\u000eJ)\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\rH\u0016¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J(\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\t0\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\t0\u001bJ(\u0010\u001c\u001a\u00020\u0017\"\u0004\b\u0000\u0010\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\t0\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\t0\u001eJ\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/soundcloud/android/json/JacksonJsonTransformer;", "Lcom/soundcloud/android/json/JsonTransformer;", "()V", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "typeFactory", "Lcom/fasterxml/jackson/databind/type/TypeFactory;", "fromJson", "T", "json", "", "classToTransformTo", "Lcom/soundcloud/java/reflect/TypeToken;", "([BLcom/soundcloud/java/reflect/TypeToken;)Ljava/lang/Object;", "", "(Ljava/lang/String;Lcom/soundcloud/java/reflect/TypeToken;)Ljava/lang/Object;", "handleInvalidDefinitionException", "", "e", "Lcom/fasterxml/jackson/databind/exc/InvalidDefinitionException;", "typeName", "registerDeserializer", "", "clazz", "Ljava/lang/Class;", "deserializer", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "registerSerializer", "serializer", "Lcom/fasterxml/jackson/databind/JsonSerializer;", "toJson", "source", "", "Companion", "InvalidTypeDefinitionException", "json_release"}, mv = {1, 1, 15})
/* renamed from: Mea reason: default package */
/* compiled from: JacksonJsonTransformer.kt */
public final class Mea implements Nea {
    public static final a a = new a(null);
    private final TypeFactory b;
    private final ObjectMapper c;

    /* renamed from: Mea$a */
    /* compiled from: JacksonJsonTransformer.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final ObjectMapper a() {
            SimpleModule simpleModule = new SimpleModule();
            simpleModule.addDeserializer(C4928GKa.class, new Oea());
            simpleModule.addSerializer(C4928GKa.class, new Pea());
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(simpleModule);
            objectMapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.setDateFormat(new Kea());
            objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
            C7471uYa.a((Object) objectMapper, "ObjectMapper()\n         …amingStrategy.SNAKE_CASE)");
            return objectMapper;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: Mea$b */
    /* compiled from: JacksonJsonTransformer.kt */
    public static final class b extends RuntimeException {
        private final String a;
        private final Throwable b;

        public b(String str, Throwable th) {
            C7471uYa.b(str, "message");
            C7471uYa.b(th, "cause");
            super(str, th);
            this.a = str;
            this.b = th;
        }

        public Throwable getCause() {
            return this.b;
        }

        public String getMessage() {
            return this.a;
        }
    }

    public Mea(ObjectMapper objectMapper) {
        C7471uYa.b(objectMapper, "objectMapper");
        this.c = objectMapper;
        TypeFactory typeFactory = this.c.getTypeFactory();
        C7471uYa.a((Object) typeFactory, "objectMapper.typeFactory");
        this.b = typeFactory;
    }

    public <T> T a(String str, C4990IKa<T> iKa) throws IOException, Lea {
        C7471uYa.b(str, "json");
        C7471uYa.b(iKa, "classToTransformTo");
        try {
            return this.c.readValue(str, this.b.constructType(iKa.b()));
        } catch (InvalidDefinitionException e) {
            String iKa2 = iKa.toString();
            C7471uYa.a((Object) iKa2, "classToTransformTo.toString()");
            a(e, iKa2);
            throw null;
        } catch (JsonProcessingException e2) {
            throw new Lea((Exception) e2);
        }
    }

    public Mea() {
        this(a.a());
    }

    public <T> T a(byte[] bArr, C4990IKa<T> iKa) {
        C7471uYa.b(bArr, "json");
        C7471uYa.b(iKa, "classToTransformTo");
        try {
            return this.c.readValue(bArr, this.b.constructType(iKa.b()));
        } catch (InvalidDefinitionException e) {
            String iKa2 = iKa.toString();
            C7471uYa.a((Object) iKa2, "classToTransformTo.toString()");
            a(e, iKa2);
            throw null;
        } catch (JsonProcessingException e2) {
            throw new Lea((Exception) e2);
        }
    }

    public String a(Object obj) throws Lea {
        C7471uYa.b(obj, "source");
        try {
            String writeValueAsString = this.c.writeValueAsString(obj);
            C7471uYa.a((Object) writeValueAsString, "objectMapper.writeValueAsString(source)");
            return writeValueAsString;
        } catch (InvalidDefinitionException e) {
            String name = obj.getClass().getName();
            C7471uYa.a((Object) name, "source.javaClass.name");
            a(e, name);
            throw null;
        } catch (JsonProcessingException e2) {
            throw new Lea((Exception) e2);
        }
    }

    private final Void a(InvalidDefinitionException invalidDefinitionException, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid definition of the target type detected. Target type: ");
        sb.append(str);
        throw new b(sb.toString(), invalidDefinitionException);
    }

    public final <T> void a(Class<T> cls, JsonSerializer<T> jsonSerializer) {
        C7471uYa.b(cls, "clazz");
        C7471uYa.b(jsonSerializer, "serializer");
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(cls, jsonSerializer);
        this.c.registerModule(simpleModule);
    }

    public final <T> void a(Class<T> cls, JsonDeserializer<T> jsonDeserializer) {
        C7471uYa.b(cls, "clazz");
        C7471uYa.b(jsonDeserializer, "deserializer");
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addDeserializer(cls, jsonDeserializer);
        this.c.registerModule(simpleModule);
    }
}
