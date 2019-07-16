package com.fasterxml.jackson.databind.type;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

public final class TypeFactory implements Serializable {
    private static final Class<?> CLS_BOOL = Boolean.TYPE;
    private static final Class<?> CLS_CLASS = Class.class;
    private static final Class<?> CLS_COMPARABLE = Comparable.class;
    private static final Class<?> CLS_ENUM = Enum.class;
    private static final Class<?> CLS_INT = Integer.TYPE;
    private static final Class<?> CLS_LONG = Long.TYPE;
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Class<?> CLS_STRING = String.class;
    protected static final SimpleType CORE_TYPE_BOOL = new SimpleType(CLS_BOOL);
    protected static final SimpleType CORE_TYPE_CLASS = new SimpleType(CLS_CLASS);
    protected static final SimpleType CORE_TYPE_COMPARABLE = new SimpleType(CLS_COMPARABLE);
    protected static final SimpleType CORE_TYPE_ENUM = new SimpleType(CLS_ENUM);
    protected static final SimpleType CORE_TYPE_INT = new SimpleType(CLS_INT);
    protected static final SimpleType CORE_TYPE_LONG = new SimpleType(CLS_LONG);
    protected static final SimpleType CORE_TYPE_OBJECT = new SimpleType(CLS_OBJECT);
    protected static final SimpleType CORE_TYPE_STRING = new SimpleType(CLS_STRING);
    protected static final TypeBindings EMPTY_BINDINGS = TypeBindings.emptyBindings();
    private static final JavaType[] NO_TYPES = new JavaType[0];
    protected static final TypeFactory instance = new TypeFactory();
    protected final ClassLoader _classLoader;
    protected final TypeModifier[] _modifiers;
    protected final TypeParser _parser;
    protected final LRUMap<Object, JavaType> _typeCache;

    private TypeFactory() {
        this(null);
    }

    private TypeBindings _bindingsForSubtype(JavaType javaType, int i, Class<?> cls) {
        PlaceholderForType[] placeholderForTypeArr = new PlaceholderForType[i];
        for (int i2 = 0; i2 < i; i2++) {
            placeholderForTypeArr[i2] = new PlaceholderForType(i2);
        }
        JavaType findSuperType = _fromClass(null, cls, TypeBindings.create(cls, (JavaType[]) placeholderForTypeArr)).findSuperType(javaType.getRawClass());
        if (findSuperType != null) {
            String _resolveTypePlaceholders = _resolveTypePlaceholders(javaType, findSuperType);
            if (_resolveTypePlaceholders == null) {
                JavaType[] javaTypeArr = new JavaType[i];
                for (int i3 = 0; i3 < i; i3++) {
                    JavaType actualType = placeholderForTypeArr[i3].actualType();
                    if (actualType == null) {
                        actualType = unknownType();
                    }
                    javaTypeArr[i3] = actualType;
                }
                return TypeBindings.create(cls, javaTypeArr);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to specialize base type ");
            sb.append(javaType.toCanonical());
            sb.append(" as ");
            sb.append(cls.getName());
            sb.append(", problem: ");
            sb.append(_resolveTypePlaceholders);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", new Object[]{javaType.getRawClass().getName(), cls.getName()}));
    }

    private JavaType _collectionType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType2;
        List typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType2 = _unknownType();
        } else if (typeParameters.size() == 1) {
            javaType2 = (JavaType) typeParameters.get(0);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Strange Collection type ");
            sb.append(cls.getName());
            sb.append(": cannot determine type parameters");
            throw new IllegalArgumentException(sb.toString());
        }
        return CollectionType.construct(cls, typeBindings, javaType, javaTypeArr, javaType2);
    }

    private JavaType _mapType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType2;
        JavaType javaType3;
        JavaType _unknownType;
        if (cls == Properties.class) {
            _unknownType = CORE_TYPE_STRING;
        } else {
            List typeParameters = typeBindings.getTypeParameters();
            int size = typeParameters.size();
            if (size == 0) {
                _unknownType = _unknownType();
            } else if (size == 2) {
                javaType2 = (JavaType) typeParameters.get(1);
                javaType3 = (JavaType) typeParameters.get(0);
                return MapType.construct(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Strange Map type ");
                sb.append(cls.getName());
                sb.append(": cannot determine type parameters");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        javaType3 = _unknownType;
        javaType2 = javaType3;
        return MapType.construct(cls, typeBindings, javaType, javaTypeArr, javaType3, javaType2);
    }

    private JavaType _referenceType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType2;
        List typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType2 = _unknownType();
        } else if (typeParameters.size() == 1) {
            javaType2 = (JavaType) typeParameters.get(0);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Strange Reference type ");
            sb.append(cls.getName());
            sb.append(": cannot determine type parameters");
            throw new IllegalArgumentException(sb.toString());
        }
        return ReferenceType.construct(cls, typeBindings, javaType, javaTypeArr, javaType2);
    }

    private String _resolveTypePlaceholders(JavaType javaType, JavaType javaType2) throws IllegalArgumentException {
        List typeParameters = javaType.getBindings().getTypeParameters();
        List typeParameters2 = javaType2.getBindings().getTypeParameters();
        int size = typeParameters.size();
        int i = 0;
        while (i < size) {
            JavaType javaType3 = (JavaType) typeParameters.get(i);
            JavaType javaType4 = (JavaType) typeParameters2.get(i);
            if (_verifyAndResolvePlaceholders(javaType3, javaType4) || javaType3.hasRawClass(Object.class) || ((i == 0 && javaType.hasRawClass(Map.class) && javaType4.hasRawClass(Object.class)) || (javaType3.isInterface() && javaType3.isTypeOrSuperTypeOf(javaType4.getRawClass())))) {
                i++;
            } else {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", new Object[]{Integer.valueOf(i + 1), Integer.valueOf(size), javaType3.toCanonical(), javaType4.toCanonical()});
            }
        }
        return null;
    }

    private boolean _verifyAndResolvePlaceholders(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof PlaceholderForType) {
            ((PlaceholderForType) javaType2).actualType(javaType);
            return true;
        } else if (javaType.getRawClass() != javaType2.getRawClass()) {
            return false;
        } else {
            List typeParameters = javaType.getBindings().getTypeParameters();
            List typeParameters2 = javaType2.getBindings().getTypeParameters();
            int size = typeParameters.size();
            for (int i = 0; i < size; i++) {
                if (!_verifyAndResolvePlaceholders((JavaType) typeParameters.get(i), (JavaType) typeParameters2.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static TypeFactory defaultInstance() {
        return instance;
    }

    public static JavaType unknownType() {
        return defaultInstance()._unknownType();
    }

    /* access modifiers changed from: protected */
    public JavaType _constructSimple(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        if (typeBindings.isEmpty()) {
            JavaType _findWellKnownSimple = _findWellKnownSimple(cls);
            if (_findWellKnownSimple != null) {
                return _findWellKnownSimple;
            }
        }
        return _newSimpleType(cls, typeBindings, javaType, javaTypeArr);
    }

    /* access modifiers changed from: protected */
    public Class<?> _findPrimitive(String str) {
        if ("int".equals(str)) {
            return Integer.TYPE;
        }
        if (Constants.LONG.equals(str)) {
            return Long.TYPE;
        }
        if ("float".equals(str)) {
            return Float.TYPE;
        }
        if ("double".equals(str)) {
            return Double.TYPE;
        }
        if ("boolean".equals(str)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(str)) {
            return Byte.TYPE;
        }
        if ("char".equals(str)) {
            return Character.TYPE;
        }
        if ("short".equals(str)) {
            return Short.TYPE;
        }
        if ("void".equals(str)) {
            return Void.TYPE;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JavaType _findWellKnownSimple(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == CLS_BOOL) {
                return CORE_TYPE_BOOL;
            }
            if (cls == CLS_INT) {
                return CORE_TYPE_INT;
            }
            if (cls == CLS_LONG) {
                return CORE_TYPE_LONG;
            }
        } else if (cls == CLS_STRING) {
            return CORE_TYPE_STRING;
        } else {
            if (cls == CLS_OBJECT) {
                return CORE_TYPE_OBJECT;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JavaType _fromAny(ClassStack classStack, Type type, TypeBindings typeBindings) {
        JavaType javaType;
        if (type instanceof Class) {
            javaType = _fromClass(classStack, (Class) type, EMPTY_BINDINGS);
        } else if (type instanceof ParameterizedType) {
            javaType = _fromParamType(classStack, (ParameterizedType) type, typeBindings);
        } else if (type instanceof JavaType) {
            return (JavaType) type;
        } else {
            if (type instanceof GenericArrayType) {
                javaType = _fromArrayType(classStack, (GenericArrayType) type, typeBindings);
            } else if (type instanceof TypeVariable) {
                javaType = _fromVariable(classStack, (TypeVariable) type, typeBindings);
            } else if (type instanceof WildcardType) {
                javaType = _fromWildcard(classStack, (WildcardType) type, typeBindings);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized Type: ");
                sb.append(type == null ? "[null]" : type.toString());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (this._modifiers != null) {
            TypeBindings bindings = javaType.getBindings();
            if (bindings == null) {
                bindings = EMPTY_BINDINGS;
            }
            TypeModifier[] typeModifierArr = this._modifiers;
            int length = typeModifierArr.length;
            JavaType javaType2 = javaType;
            int i = 0;
            while (i < length) {
                TypeModifier typeModifier = typeModifierArr[i];
                JavaType modifyType = typeModifier.modifyType(javaType2, type, bindings, this);
                if (modifyType != null) {
                    i++;
                    javaType2 = modifyType;
                } else {
                    throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", new Object[]{typeModifier, typeModifier.getClass().getName(), javaType2}));
                }
            }
            javaType = javaType2;
        }
        return javaType;
    }

    /* access modifiers changed from: protected */
    public JavaType _fromArrayType(ClassStack classStack, GenericArrayType genericArrayType, TypeBindings typeBindings) {
        return ArrayType.construct(_fromAny(classStack, genericArrayType.getGenericComponentType(), typeBindings), typeBindings);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a7  */
    public JavaType _fromClass(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        ClassStack classStack2;
        JavaType[] javaTypeArr;
        JavaType javaType;
        JavaType _newSimpleType;
        JavaType _findWellKnownSimple = _findWellKnownSimple(cls);
        if (_findWellKnownSimple != null) {
            return _findWellKnownSimple;
        }
        Object asKey = (typeBindings == null || typeBindings.isEmpty()) ? cls : typeBindings.asKey(cls);
        JavaType javaType2 = (JavaType) this._typeCache.get(asKey);
        if (javaType2 != null) {
            return javaType2;
        }
        if (classStack == null) {
            classStack2 = new ClassStack(cls);
        } else {
            ClassStack find = classStack.find(cls);
            if (find != null) {
                ResolvedRecursiveType resolvedRecursiveType = new ResolvedRecursiveType(cls, EMPTY_BINDINGS);
                find.addSelfReference(resolvedRecursiveType);
                return resolvedRecursiveType;
            }
            classStack2 = classStack.child(cls);
        }
        if (cls.isArray()) {
            _newSimpleType = ArrayType.construct(_fromAny(classStack2, cls.getComponentType(), typeBindings), typeBindings);
        } else {
            if (cls.isInterface()) {
                javaType = null;
                javaTypeArr = _resolveSuperInterfaces(classStack2, cls, typeBindings);
            } else {
                javaType = _resolveSuperClass(classStack2, cls, typeBindings);
                javaTypeArr = _resolveSuperInterfaces(classStack2, cls, typeBindings);
            }
            JavaType javaType3 = javaType;
            JavaType[] javaTypeArr2 = javaTypeArr;
            if (cls == Properties.class) {
                SimpleType simpleType = CORE_TYPE_STRING;
                javaType2 = MapType.construct(cls, typeBindings, javaType3, javaTypeArr2, simpleType, simpleType);
            } else if (javaType3 != null) {
                javaType2 = javaType3.refine(cls, typeBindings, javaType3, javaTypeArr2);
            }
            if (javaType2 == null) {
                javaType2 = _fromWellKnownClass(classStack2, cls, typeBindings, javaType3, javaTypeArr2);
                if (javaType2 == null) {
                    javaType2 = _fromWellKnownInterface(classStack2, cls, typeBindings, javaType3, javaTypeArr2);
                    if (javaType2 == null) {
                        _newSimpleType = _newSimpleType(cls, typeBindings, javaType3, javaTypeArr2);
                    }
                }
            }
            classStack2.resolveSelfReferences(javaType2);
            if (!javaType2.hasHandlers()) {
                this._typeCache.putIfAbsent(asKey, javaType2);
            }
            return javaType2;
        }
        javaType2 = _newSimpleType;
        classStack2.resolveSelfReferences(javaType2);
        if (!javaType2.hasHandlers()) {
        }
        return javaType2;
    }

    /* access modifiers changed from: protected */
    public JavaType _fromParamType(ClassStack classStack, ParameterizedType parameterizedType, TypeBindings typeBindings) {
        int i;
        TypeBindings typeBindings2;
        Class<?> cls = (Class) parameterizedType.getRawType();
        if (cls == CLS_ENUM) {
            return CORE_TYPE_ENUM;
        }
        if (cls == CLS_COMPARABLE) {
            return CORE_TYPE_COMPARABLE;
        }
        if (cls == CLS_CLASS) {
            return CORE_TYPE_CLASS;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments == null) {
            i = 0;
        } else {
            i = actualTypeArguments.length;
        }
        if (i == 0) {
            typeBindings2 = EMPTY_BINDINGS;
        } else {
            JavaType[] javaTypeArr = new JavaType[i];
            for (int i2 = 0; i2 < i; i2++) {
                javaTypeArr[i2] = _fromAny(classStack, actualTypeArguments[i2], typeBindings);
            }
            typeBindings2 = TypeBindings.create(cls, javaTypeArr);
        }
        return _fromClass(classStack, cls, typeBindings2);
    }

    /* access modifiers changed from: protected */
    public JavaType _fromVariable(ClassStack classStack, TypeVariable<?> typeVariable, TypeBindings typeBindings) {
        Type[] bounds;
        String name = typeVariable.getName();
        if (typeBindings != null) {
            JavaType findBoundType = typeBindings.findBoundType(name);
            if (findBoundType != null) {
                return findBoundType;
            }
            if (typeBindings.hasUnbound(name)) {
                return CORE_TYPE_OBJECT;
            }
            TypeBindings withUnboundVariable = typeBindings.withUnboundVariable(name);
            synchronized (typeVariable) {
                bounds = typeVariable.getBounds();
            }
            return _fromAny(classStack, bounds[0], withUnboundVariable);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Null `bindings` passed (type variable \"");
        sb.append(name);
        sb.append("\")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public JavaType _fromWellKnownClass(ClassStack classStack, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        if (typeBindings == null) {
            typeBindings = EMPTY_BINDINGS;
        }
        if (cls == Map.class) {
            return _mapType(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == Collection.class) {
            return _collectionType(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == AtomicReference.class) {
            return _referenceType(cls, typeBindings, javaType, javaTypeArr);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JavaType _fromWellKnownInterface(ClassStack classStack, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        for (JavaType refine : javaTypeArr) {
            JavaType refine2 = refine.refine(cls, typeBindings, javaType, javaTypeArr);
            if (refine2 != null) {
                return refine2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JavaType _fromWildcard(ClassStack classStack, WildcardType wildcardType, TypeBindings typeBindings) {
        return _fromAny(classStack, wildcardType.getUpperBounds()[0], typeBindings);
    }

    /* access modifiers changed from: protected */
    public JavaType _newSimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new SimpleType(cls, typeBindings, javaType, javaTypeArr);
    }

    /* access modifiers changed from: protected */
    public JavaType _resolveSuperClass(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        Type genericSuperclass = ClassUtil.getGenericSuperclass(cls);
        if (genericSuperclass == null) {
            return null;
        }
        return _fromAny(classStack, genericSuperclass, typeBindings);
    }

    /* access modifiers changed from: protected */
    public JavaType[] _resolveSuperInterfaces(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        Type[] genericInterfaces = ClassUtil.getGenericInterfaces(cls);
        if (genericInterfaces == null || genericInterfaces.length == 0) {
            return NO_TYPES;
        }
        int length = genericInterfaces.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i = 0; i < length; i++) {
            javaTypeArr[i] = _fromAny(classStack, genericInterfaces[i], typeBindings);
        }
        return javaTypeArr;
    }

    /* access modifiers changed from: protected */
    public JavaType _unknownType() {
        return CORE_TYPE_OBJECT;
    }

    /* access modifiers changed from: protected */
    public Class<?> classForName(String str, boolean z, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(str, true, classLoader);
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, Class<?> cls2) {
        return constructCollectionType(cls, _fromClass(null, cls2, EMPTY_BINDINGS));
    }

    public JavaType constructFromCanonical(String str) throws IllegalArgumentException {
        return this._parser.parse(str);
    }

    public JavaType constructGeneralizedType(JavaType javaType, Class<?> cls) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        JavaType findSuperType = javaType.findSuperType(cls);
        if (findSuperType != null) {
            return findSuperType;
        }
        if (!cls.isAssignableFrom(rawClass)) {
            throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", new Object[]{cls.getName(), javaType}));
        }
        throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", new Object[]{cls.getName(), javaType}));
    }

    public MapType constructMapType(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        JavaType javaType;
        JavaType javaType2;
        if (cls == Properties.class) {
            javaType2 = CORE_TYPE_STRING;
            javaType = javaType2;
        } else {
            javaType2 = _fromClass(null, cls2, EMPTY_BINDINGS);
            javaType = _fromClass(null, cls3, EMPTY_BINDINGS);
        }
        return constructMapType(cls, javaType2, javaType);
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        JavaType javaType2;
        Class<EnumSet> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        if (rawClass == Object.class) {
            javaType2 = _fromClass(null, cls, EMPTY_BINDINGS);
        } else if (!rawClass.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(String.format("Class %s not subtype of %s", new Object[]{cls.getName(), javaType}));
        } else if (javaType.getBindings().isEmpty()) {
            javaType2 = _fromClass(null, cls, EMPTY_BINDINGS);
        } else {
            if (javaType.isContainerType()) {
                if (javaType.isMapLikeType()) {
                    if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                        javaType2 = _fromClass(null, cls, TypeBindings.create(cls, javaType.getKeyType(), javaType.getContentType()));
                    }
                } else if (javaType.isCollectionLikeType()) {
                    if (cls == ArrayList.class || cls == LinkedList.class || cls == HashSet.class || cls == TreeSet.class) {
                        javaType2 = _fromClass(null, cls, TypeBindings.create(cls, javaType.getContentType()));
                    } else if (rawClass == EnumSet.class) {
                        return javaType;
                    }
                }
            }
            int length = cls.getTypeParameters().length;
            if (length == 0) {
                javaType2 = _fromClass(null, cls, EMPTY_BINDINGS);
            } else {
                javaType2 = _fromClass(null, cls, _bindingsForSubtype(javaType, length, cls));
            }
        }
        return javaType2.withHandlersFrom(javaType);
    }

    public JavaType constructType(Type type) {
        return _fromAny(null, type, EMPTY_BINDINGS);
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        if (str.indexOf(46) < 0) {
            Class<?> _findPrimitive = _findPrimitive(str);
            if (_findPrimitive != null) {
                return _findPrimitive;
            }
        }
        Throwable th = null;
        ClassLoader classLoader = getClassLoader();
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader != null) {
            try {
                return classForName(str, true, classLoader);
            } catch (Exception e) {
                th = ClassUtil.getRootCause(e);
            }
        }
        try {
            return classForName(str);
        } catch (Exception e2) {
            if (th == null) {
                th = ClassUtil.getRootCause(e2);
            }
            ClassUtil.throwIfRTE(th);
            throw new ClassNotFoundException(th.getMessage(), th);
        }
    }

    public JavaType[] findTypeParameters(JavaType javaType, Class<?> cls) {
        JavaType findSuperType = javaType.findSuperType(cls);
        if (findSuperType == null) {
            return NO_TYPES;
        }
        return findSuperType.getBindings().typeParameterArray();
    }

    public ClassLoader getClassLoader() {
        return this._classLoader;
    }

    @Deprecated
    public JavaType uncheckedSimpleType(Class<?> cls) {
        return _constructSimple(cls, EMPTY_BINDINGS, null, null);
    }

    protected TypeFactory(LRUMap<Object, JavaType> lRUMap) {
        if (lRUMap == null) {
            lRUMap = new LRUMap<>(16, 200);
        }
        this._typeCache = lRUMap;
        this._parser = new TypeParser(this);
        this._modifiers = null;
        this._classLoader = null;
    }

    /* access modifiers changed from: protected */
    public Class<?> classForName(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public JavaType constructType(Type type, TypeBindings typeBindings) {
        return _fromAny(null, type, typeBindings);
    }

    public JavaType constructType(TypeReference<?> typeReference) {
        return _fromAny(null, typeReference.getType(), EMPTY_BINDINGS);
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, JavaType javaType) {
        TypeBindings createIfNeeded = TypeBindings.createIfNeeded(cls, javaType);
        CollectionType collectionType = (CollectionType) _fromClass(null, cls, createIfNeeded);
        if (createIfNeeded.isEmpty() && javaType != null) {
            JavaType contentType = collectionType.findSuperType(Collection.class).getContentType();
            if (!contentType.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", new Object[]{ClassUtil.nameOf(cls), javaType, contentType}));
            }
        }
        return collectionType;
    }

    public MapType constructMapType(Class<? extends Map> cls, JavaType javaType, JavaType javaType2) {
        TypeBindings createIfNeeded = TypeBindings.createIfNeeded(cls, new JavaType[]{javaType, javaType2});
        MapType mapType = (MapType) _fromClass(null, cls, createIfNeeded);
        if (createIfNeeded.isEmpty()) {
            JavaType findSuperType = mapType.findSuperType(Map.class);
            JavaType keyType = findSuperType.getKeyType();
            if (keyType.equals(javaType)) {
                JavaType contentType = findSuperType.getContentType();
                if (!contentType.equals(javaType2)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", new Object[]{ClassUtil.nameOf(cls), javaType2, contentType}));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", new Object[]{ClassUtil.nameOf(cls), javaType, keyType}));
            }
        }
        return mapType;
    }
}
