package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: teb reason: default package and case insensitive filesystem */
/* compiled from: KotlinTarget.kt */
public enum C7409teb {
    CLASS("class", false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    
    private static final HashMap<String, C7409teb> Q = null;
    private static final Set<C7409teb> R = null;
    private static final Set<C7409teb> S = null;
    private static final Map<C6451feb, C7409teb> T = null;
    public static final a U = null;
    private final String V;
    private final boolean W;

    /* renamed from: teb$a */
    /* compiled from: KotlinTarget.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    static {
        C7409teb[] values;
        U = new a(null);
        Q = new HashMap<>();
        for (C7409teb teb : values()) {
            Q.put(teb.name(), teb);
        }
        C7409teb[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (C7409teb teb2 : values2) {
            if (teb2.W) {
                arrayList.add(teb2);
            }
        }
        R = C7676xWa.t(arrayList);
        S = C6578hWa.l(values());
        T = LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a(C6451feb.CONSTRUCTOR_PARAMETER, VALUE_PARAMETER), NVa.a(C6451feb.FIELD, FIELD), NVa.a(C6451feb.PROPERTY, PROPERTY), NVa.a(C6451feb.FILE, FILE), NVa.a(C6451feb.PROPERTY_GETTER, PROPERTY_GETTER), NVa.a(C6451feb.PROPERTY_SETTER, PROPERTY_SETTER), NVa.a(C6451feb.RECEIVER, VALUE_PARAMETER), NVa.a(C6451feb.SETTER_PARAMETER, VALUE_PARAMETER), NVa.a(C6451feb.PROPERTY_DELEGATE_FIELD, FIELD)});
    }

    private C7409teb(String str, boolean z) {
        this.V = str;
        this.W = z;
    }
}
