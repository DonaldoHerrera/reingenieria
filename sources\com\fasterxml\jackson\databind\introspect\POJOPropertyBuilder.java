package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonSetter.Value;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class POJOPropertyBuilder extends BeanPropertyDefinition implements Comparable<POJOPropertyBuilder> {
    private static final ReferenceProperty NOT_REFEFERENCE_PROP = ReferenceProperty.managed("");
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final MapperConfig<?> _config;
    protected Linked<AnnotatedParameter> _ctorParameters;
    protected Linked<AnnotatedField> _fields;
    protected final boolean _forSerialization;
    protected Linked<AnnotatedMethod> _getters;
    protected final PropertyName _internalName;
    protected transient PropertyMetadata _metadata;
    protected final PropertyName _name;
    protected transient ReferenceProperty _referenceInfo;
    protected Linked<AnnotatedMethod> _setters;

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$10 reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access = new int[Access.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[Access.READ_ONLY.ordinal()] = 1;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[Access.READ_WRITE.ordinal()] = 2;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[Access.WRITE_ONLY.ordinal()] = 3;
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[Access.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    protected static final class Linked<T> {
        public final boolean isMarkedIgnored;
        public final boolean isNameExplicit;
        public final boolean isVisible;
        public final PropertyName name;
        public final Linked<T> next;
        public final T value;

        public Linked(T t, Linked<T> linked, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            this.value = t;
            this.next = linked;
            this.name = (propertyName == null || propertyName.isEmpty()) ? null : propertyName;
            if (z) {
                if (this.name == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                } else if (!propertyName.hasSimpleName()) {
                    z = false;
                }
            }
            this.isNameExplicit = z;
            this.isVisible = z2;
            this.isMarkedIgnored = z3;
        }

        /* access modifiers changed from: protected */
        public Linked<T> append(Linked<T> linked) {
            Linked<T> linked2 = this.next;
            if (linked2 == null) {
                return withNext(linked);
            }
            return withNext(linked2.append(linked));
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", new Object[]{this.value.toString(), Boolean.valueOf(this.isVisible), Boolean.valueOf(this.isMarkedIgnored), Boolean.valueOf(this.isNameExplicit)});
            if (this.next == null) {
                return format;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(", ");
            sb.append(this.next.toString());
            return sb.toString();
        }

        public Linked<T> trimByVisibility() {
            Linked<T> linked = this.next;
            if (linked == null) {
                return this;
            }
            Linked<T> trimByVisibility = linked.trimByVisibility();
            if (this.name != null) {
                if (trimByVisibility.name == null) {
                    return withNext(null);
                }
                return withNext(trimByVisibility);
            } else if (trimByVisibility.name != null) {
                return trimByVisibility;
            } else {
                boolean z = this.isVisible;
                if (z == trimByVisibility.isVisible) {
                    return withNext(trimByVisibility);
                }
                if (z) {
                    trimByVisibility = withNext(null);
                }
                return trimByVisibility;
            }
        }

        public Linked<T> withNext(Linked<T> linked) {
            if (linked == this.next) {
                return this;
            }
            Linked linked2 = new Linked(this.value, linked, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
            return linked2;
        }

        public Linked<T> withValue(T t) {
            if (t == this.value) {
                return this;
            }
            Linked linked = new Linked(t, this.next, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
            return linked;
        }

        public Linked<T> withoutIgnored() {
            if (this.isMarkedIgnored) {
                Linked<T> linked = this.next;
                return linked == null ? null : linked.withoutIgnored();
            }
            Linked<T> linked2 = this.next;
            if (linked2 != null) {
                Linked<T> withoutIgnored = linked2.withoutIgnored();
                if (withoutIgnored != this.next) {
                    return withNext(withoutIgnored);
                }
            }
            return this;
        }

        public Linked<T> withoutNext() {
            if (this.next == null) {
                return this;
            }
            Linked linked = new Linked(this.value, null, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
            return linked;
        }

        public Linked<T> withoutNonVisible() {
            Linked<T> linked = this.next;
            Linked<T> withoutNonVisible = linked == null ? null : linked.withoutNonVisible();
            return this.isVisible ? withNext(withoutNonVisible) : withoutNonVisible;
        }
    }

    protected static class MemberIterator<T extends AnnotatedMember> implements Iterator<T> {
        private Linked<T> next;

        public MemberIterator(Linked<T> linked) {
            this.next = linked;
        }

        public boolean hasNext() {
            return this.next != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public T next() {
            Linked<T> linked = this.next;
            if (linked != null) {
                T t = (AnnotatedMember) linked.value;
                this.next = linked.next;
                return t;
            }
            throw new NoSuchElementException();
        }
    }

    private interface WithMember<T> {
        T withMember(AnnotatedMember annotatedMember);
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z, propertyName, propertyName);
    }

    private <T> boolean _anyExplicitNames(Linked<T> linked) {
        while (linked != null) {
            if (linked.name != null && linked.isNameExplicit) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyExplicits(Linked<T> linked) {
        while (linked != null) {
            PropertyName propertyName = linked.name;
            if (propertyName != null && propertyName.hasSimpleName()) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyIgnorals(Linked<T> linked) {
        while (linked != null) {
            if (linked.isMarkedIgnored) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T> boolean _anyVisible(Linked<T> linked) {
        while (linked != null) {
            if (linked.isVisible) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    private <T extends AnnotatedMember> Linked<T> _applyAnnotations(Linked<T> linked, AnnotationMap annotationMap) {
        AnnotatedMember annotatedMember = (AnnotatedMember) ((AnnotatedMember) linked.value).withAnnotations(annotationMap);
        Linked<T> linked2 = linked.next;
        if (linked2 != null) {
            linked = linked.withNext(_applyAnnotations(linked2, annotationMap));
        }
        return linked.withValue(annotatedMember);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<?>, code=com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked, for r12v0, types: [com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<?>, com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked] */
    private void _explode(Collection<PropertyName> collection, Map<PropertyName, POJOPropertyBuilder> map, Linked linked) {
        for (Linked linked2 = linked; linked2 != null; linked2 = linked2.next) {
            PropertyName propertyName = linked2.name;
            if (linked2.isNameExplicit && propertyName != null) {
                POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) map.get(propertyName);
                if (pOJOPropertyBuilder == null) {
                    pOJOPropertyBuilder = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, this._internalName, propertyName);
                    map.put(propertyName, pOJOPropertyBuilder);
                }
                if (linked == this._fields) {
                    pOJOPropertyBuilder._fields = linked2.withNext(pOJOPropertyBuilder._fields);
                } else if (linked == this._getters) {
                    pOJOPropertyBuilder._getters = linked2.withNext(pOJOPropertyBuilder._getters);
                } else if (linked == this._setters) {
                    pOJOPropertyBuilder._setters = linked2.withNext(pOJOPropertyBuilder._setters);
                } else if (linked == this._ctorParameters) {
                    pOJOPropertyBuilder._ctorParameters = linked2.withNext(pOJOPropertyBuilder._ctorParameters);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Internal error: mismatched accessors, property: ");
                    sb.append(this);
                    throw new IllegalStateException(sb.toString());
                }
            } else if (linked2.isVisible) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Conflicting/ambiguous property name definitions (implicit name '");
                sb2.append(this._name);
                sb2.append("'): found multiple explicit names: ");
                sb2.append(collection);
                sb2.append(", but also implicit accessor: ");
                sb2.append(linked2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<? extends com.fasterxml.jackson.databind.introspect.AnnotatedMember>, code=com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked, for r2v0, types: [com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked<? extends com.fasterxml.jackson.databind.introspect.AnnotatedMember>, com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked] */
    private Set<PropertyName> _findExplicitNames(Linked linked, Set<PropertyName> set) {
        while (linked != null) {
            if (linked.isNameExplicit && linked.name != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(linked.name);
            }
            linked = linked.next;
        }
        return set;
    }

    private <T extends AnnotatedMember> AnnotationMap _getAllAnnotations(Linked<T> linked) {
        AnnotationMap allAnnotations = ((AnnotatedMember) linked.value).getAllAnnotations();
        Linked<T> linked2 = linked.next;
        return linked2 != null ? AnnotationMap.merge(allAnnotations, _getAllAnnotations(linked2)) : allAnnotations;
    }

    private AnnotationMap _mergeAnnotations(int i, Linked<? extends AnnotatedMember>... linkedArr) {
        AnnotationMap _getAllAnnotations = _getAllAnnotations(linkedArr[i]);
        do {
            i++;
            if (i >= linkedArr.length) {
                return _getAllAnnotations;
            }
        } while (linkedArr[i] == null);
        return AnnotationMap.merge(_getAllAnnotations, _mergeAnnotations(i, linkedArr));
    }

    private <T> Linked<T> _removeIgnored(Linked<T> linked) {
        return linked == null ? linked : linked.withoutIgnored();
    }

    private <T> Linked<T> _removeNonVisible(Linked<T> linked) {
        return linked == null ? linked : linked.withoutNonVisible();
    }

    private <T> Linked<T> _trimByVisibility(Linked<T> linked) {
        return linked == null ? linked : linked.trimByVisibility();
    }

    private static <T> Linked<T> merge(Linked<T> linked, Linked<T> linked2) {
        if (linked == null) {
            return linked2;
        }
        return linked2 == null ? linked : linked.append(linked2);
    }

    /* access modifiers changed from: protected */
    public String _findDefaultValue() {
        return (String) fromMemberAnnotations(new WithMember<String>() {
            public String withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDefaultValue(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public String _findDescription() {
        return (String) fromMemberAnnotations(new WithMember<String>() {
            public String withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDescription(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public Integer _findIndex() {
        return (Integer) fromMemberAnnotations(new WithMember<Integer>() {
            public Integer withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyIndex(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public Boolean _findRequired() {
        return (Boolean) fromMemberAnnotations(new WithMember<Boolean>() {
            public Boolean withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.hasRequiredMarker(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    public PropertyMetadata _getSetterInfo(PropertyMetadata propertyMetadata) {
        Nulls nulls;
        Value setterInfo;
        Boolean mergeable;
        AnnotatedMember primaryMember = getPrimaryMember();
        AnnotatedMember accessor = getAccessor();
        Nulls nulls2 = null;
        boolean z = true;
        if (primaryMember != null) {
            AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
            if (annotationIntrospector != null) {
                if (accessor != null) {
                    Boolean findMergeInfo = annotationIntrospector.findMergeInfo(primaryMember);
                    if (findMergeInfo != null) {
                        if (findMergeInfo.booleanValue()) {
                            propertyMetadata = propertyMetadata.withMergeInfo(MergeInfo.createForPropertyOverride(accessor));
                        }
                        z = false;
                    }
                }
                Value findSetterInfo = this._annotationIntrospector.findSetterInfo(primaryMember);
                if (findSetterInfo != null) {
                    nulls2 = findSetterInfo.nonDefaultValueNulls();
                    nulls = findSetterInfo.nonDefaultContentNulls();
                    if (z || nulls2 == null || nulls == null) {
                        ConfigOverride configOverride = this._config.getConfigOverride(getRawPrimaryType());
                        setterInfo = configOverride.getSetterInfo();
                        if (setterInfo != null) {
                            if (nulls2 == null) {
                                nulls2 = setterInfo.nonDefaultValueNulls();
                            }
                            if (nulls == null) {
                                nulls = setterInfo.nonDefaultContentNulls();
                            }
                        }
                        if (z && accessor != null) {
                            mergeable = configOverride.getMergeable();
                            if (mergeable != null) {
                                if (mergeable.booleanValue()) {
                                    propertyMetadata = propertyMetadata.withMergeInfo(MergeInfo.createForTypeOverride(accessor));
                                }
                                z = false;
                            }
                        }
                    }
                }
            }
            nulls = null;
            ConfigOverride configOverride2 = this._config.getConfigOverride(getRawPrimaryType());
            setterInfo = configOverride2.getSetterInfo();
            if (setterInfo != null) {
            }
            mergeable = configOverride2.getMergeable();
            if (mergeable != null) {
            }
        } else {
            nulls = null;
        }
        if (z || nulls2 == null || nulls == null) {
            Value defaultSetterInfo = this._config.getDefaultSetterInfo();
            if (nulls2 == null) {
                nulls2 = defaultSetterInfo.nonDefaultValueNulls();
            }
            if (nulls == null) {
                nulls = defaultSetterInfo.nonDefaultContentNulls();
            }
            if (z) {
                if (Boolean.TRUE.equals(this._config.getDefaultMergeable()) && accessor != null) {
                    propertyMetadata = propertyMetadata.withMergeInfo(MergeInfo.createForDefaults(accessor));
                }
            }
        }
        return (nulls2 == null && nulls == null) ? propertyMetadata : propertyMetadata.withNulls(nulls2, nulls);
    }

    /* access modifiers changed from: protected */
    public int _getterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (name.startsWith("get") && name.length() > 3) {
            return 1;
        }
        if (!name.startsWith("is") || name.length() <= 2) {
            return 3;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    public int _setterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        return (!name.startsWith("set") || name.length() <= 3) ? 2 : 1;
    }

    public void addAll(POJOPropertyBuilder pOJOPropertyBuilder) {
        this._fields = merge(this._fields, pOJOPropertyBuilder._fields);
        this._ctorParameters = merge(this._ctorParameters, pOJOPropertyBuilder._ctorParameters);
        this._getters = merge(this._getters, pOJOPropertyBuilder._getters);
        this._setters = merge(this._setters, pOJOPropertyBuilder._setters);
    }

    public void addCtor(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        Linked linked = new Linked(annotatedParameter, this._ctorParameters, propertyName, z, z2, z3);
        this._ctorParameters = linked;
    }

    public void addField(AnnotatedField annotatedField, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        Linked linked = new Linked(annotatedField, this._fields, propertyName, z, z2, z3);
        this._fields = linked;
    }

    public void addGetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        Linked linked = new Linked(annotatedMethod, this._getters, propertyName, z, z2, z3);
        this._getters = linked;
    }

    public void addSetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        Linked linked = new Linked(annotatedMethod, this._setters, propertyName, z, z2, z3);
        this._setters = linked;
    }

    public boolean anyIgnorals() {
        return _anyIgnorals(this._fields) || _anyIgnorals(this._getters) || _anyIgnorals(this._setters) || _anyIgnorals(this._ctorParameters);
    }

    public boolean anyVisible() {
        return _anyVisible(this._fields) || _anyVisible(this._getters) || _anyVisible(this._setters) || _anyVisible(this._ctorParameters);
    }

    public boolean couldDeserialize() {
        return (this._ctorParameters == null && this._setters == null && this._fields == null) ? false : true;
    }

    public boolean couldSerialize() {
        return (this._getters == null && this._fields == null) ? false : true;
    }

    public Collection<POJOPropertyBuilder> explode(Collection<PropertyName> collection) {
        HashMap hashMap = new HashMap();
        _explode(collection, hashMap, this._fields);
        _explode(collection, hashMap, this._getters);
        _explode(collection, hashMap, this._setters);
        _explode(collection, hashMap, this._ctorParameters);
        return hashMap.values();
    }

    public Access findAccess() {
        return (Access) fromMemberAnnotationsExcept(new WithMember<Access>() {
            public Access withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findPropertyAccess(annotatedMember);
            }
        }, Access.AUTO);
    }

    public Set<PropertyName> findExplicitNames() {
        Set<PropertyName> _findExplicitNames = _findExplicitNames(this._ctorParameters, _findExplicitNames(this._setters, _findExplicitNames(this._getters, _findExplicitNames(this._fields, null))));
        return _findExplicitNames == null ? Collections.emptySet() : _findExplicitNames;
    }

    public JsonInclude.Value findInclusion() {
        JsonInclude.Value value;
        AnnotatedMember accessor = getAccessor();
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            value = null;
        } else {
            value = annotationIntrospector.findPropertyInclusion(accessor);
        }
        return value == null ? JsonInclude.Value.empty() : value;
    }

    public ObjectIdInfo findObjectIdInfo() {
        return (ObjectIdInfo) fromMemberAnnotations(new WithMember<ObjectIdInfo>() {
            public ObjectIdInfo withMember(AnnotatedMember annotatedMember) {
                ObjectIdInfo findObjectIdInfo = POJOPropertyBuilder.this._annotationIntrospector.findObjectIdInfo(annotatedMember);
                return findObjectIdInfo != null ? POJOPropertyBuilder.this._annotationIntrospector.findObjectReferenceInfo(annotatedMember, findObjectIdInfo) : findObjectIdInfo;
            }
        });
    }

    public ReferenceProperty findReferenceType() {
        ReferenceProperty referenceProperty = this._referenceInfo;
        if (referenceProperty != null) {
            if (referenceProperty == NOT_REFEFERENCE_PROP) {
                referenceProperty = null;
            }
            return referenceProperty;
        }
        ReferenceProperty referenceProperty2 = (ReferenceProperty) fromMemberAnnotations(new WithMember<ReferenceProperty>() {
            public ReferenceProperty withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findReferenceType(annotatedMember);
            }
        });
        this._referenceInfo = referenceProperty2 == null ? NOT_REFEFERENCE_PROP : referenceProperty2;
        return referenceProperty2;
    }

    public Class<?>[] findViews() {
        return (Class[]) fromMemberAnnotations(new WithMember<Class<?>[]>() {
            public Class<?>[] withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.findViews(annotatedMember);
            }
        });
    }

    /* access modifiers changed from: protected */
    public <T> T fromMemberAnnotations(WithMember<T> withMember) {
        T t = null;
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                t = withMember.withMember((AnnotatedMember) linked.value);
            }
        } else {
            Linked<AnnotatedParameter> linked2 = this._ctorParameters;
            if (linked2 != null) {
                t = withMember.withMember((AnnotatedMember) linked2.value);
            }
            if (t == null) {
                Linked<AnnotatedMethod> linked3 = this._setters;
                if (linked3 != null) {
                    t = withMember.withMember((AnnotatedMember) linked3.value);
                }
            }
        }
        if (t != null) {
            return t;
        }
        Linked<AnnotatedField> linked4 = this._fields;
        return linked4 != null ? withMember.withMember((AnnotatedMember) linked4.value) : t;
    }

    /* access modifiers changed from: protected */
    public <T> T fromMemberAnnotationsExcept(WithMember<T> withMember, T t) {
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                T withMember2 = withMember.withMember((AnnotatedMember) linked.value);
                if (!(withMember2 == null || withMember2 == t)) {
                    return withMember2;
                }
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null) {
                T withMember3 = withMember.withMember((AnnotatedMember) linked2.value);
                if (!(withMember3 == null || withMember3 == t)) {
                    return withMember3;
                }
            }
            Linked<AnnotatedParameter> linked3 = this._ctorParameters;
            if (linked3 != null) {
                T withMember4 = withMember.withMember((AnnotatedMember) linked3.value);
                if (!(withMember4 == null || withMember4 == t)) {
                    return withMember4;
                }
            }
            Linked<AnnotatedMethod> linked4 = this._setters;
            if (linked4 != null) {
                T withMember5 = withMember.withMember((AnnotatedMember) linked4.value);
                if (withMember5 == null || withMember5 == t) {
                    return null;
                }
                return withMember5;
            }
            return null;
        }
        Linked<AnnotatedParameter> linked5 = this._ctorParameters;
        if (linked5 != null) {
            T withMember6 = withMember.withMember((AnnotatedMember) linked5.value);
            if (!(withMember6 == null || withMember6 == t)) {
                return withMember6;
            }
        }
        Linked<AnnotatedMethod> linked6 = this._setters;
        if (linked6 != null) {
            T withMember7 = withMember.withMember((AnnotatedMember) linked6.value);
            if (!(withMember7 == null || withMember7 == t)) {
                return withMember7;
            }
        }
        Linked<AnnotatedField> linked7 = this._fields;
        if (linked7 != null) {
            T withMember8 = withMember.withMember((AnnotatedMember) linked7.value);
            if (!(withMember8 == null || withMember8 == t)) {
                return withMember8;
            }
        }
        Linked<AnnotatedMethod> linked8 = this._getters;
        if (linked8 != null) {
            T withMember9 = withMember.withMember((AnnotatedMember) linked8.value);
            if (withMember9 == null || withMember9 == t) {
                return null;
            }
            return withMember9;
        }
        return null;
    }

    public AnnotatedParameter getConstructorParameter() {
        Linked linked = this._ctorParameters;
        if (linked == null) {
            return null;
        }
        while (!(((AnnotatedParameter) linked.value).getOwner() instanceof AnnotatedConstructor)) {
            linked = linked.next;
            if (linked == null) {
                return (AnnotatedParameter) this._ctorParameters.value;
            }
        }
        return (AnnotatedParameter) linked.value;
    }

    public Iterator<AnnotatedParameter> getConstructorParameters() {
        Linked<AnnotatedParameter> linked = this._ctorParameters;
        if (linked == null) {
            return ClassUtil.emptyIterator();
        }
        return new MemberIterator(linked);
    }

    public AnnotatedField getField() {
        Linked<AnnotatedField> linked = this._fields;
        if (linked == null) {
            return null;
        }
        AnnotatedField annotatedField = (AnnotatedField) linked.value;
        Linked<T> linked2 = linked.next;
        while (linked2 != null) {
            AnnotatedField annotatedField2 = (AnnotatedField) linked2.value;
            Class declaringClass = annotatedField.getDeclaringClass();
            Class declaringClass2 = annotatedField2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedField = annotatedField2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
                linked2 = linked2.next;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Multiple fields representing property \"");
            sb.append(getName());
            sb.append("\": ");
            sb.append(annotatedField.getFullName());
            sb.append(" vs ");
            sb.append(annotatedField2.getFullName());
            throw new IllegalArgumentException(sb.toString());
        }
        return annotatedField;
    }

    public PropertyName getFullName() {
        return this._name;
    }

    public AnnotatedMethod getGetter() {
        Linked linked = this._getters;
        if (linked == null) {
            return null;
        }
        Linked linked2 = linked.next;
        if (linked2 == null) {
            return (AnnotatedMethod) linked.value;
        }
        while (linked2 != null) {
            Class declaringClass = ((AnnotatedMethod) linked.value).getDeclaringClass();
            Class declaringClass2 = ((AnnotatedMethod) linked2.value).getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                linked = linked2;
                linked2 = linked2.next;
            }
            int _getterPriority = _getterPriority((AnnotatedMethod) linked2.value);
            int _getterPriority2 = _getterPriority((AnnotatedMethod) linked.value);
            if (_getterPriority != _getterPriority2) {
                if (_getterPriority >= _getterPriority2) {
                    linked2 = linked2.next;
                }
                linked = linked2;
                linked2 = linked2.next;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Conflicting getter definitions for property \"");
                sb.append(getName());
                sb.append("\": ");
                sb.append(((AnnotatedMethod) linked.value).getFullName());
                sb.append(" vs ");
                sb.append(((AnnotatedMethod) linked2.value).getFullName());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this._getters = linked.withoutNext();
        return (AnnotatedMethod) linked.value;
    }

    public String getInternalName() {
        return this._internalName.getSimpleName();
    }

    public PropertyMetadata getMetadata() {
        PropertyMetadata propertyMetadata;
        if (this._metadata == null) {
            Boolean _findRequired = _findRequired();
            String _findDescription = _findDescription();
            Integer _findIndex = _findIndex();
            String _findDefaultValue = _findDefaultValue();
            if (_findRequired == null && _findIndex == null && _findDefaultValue == null) {
                if (_findDescription == null) {
                    propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
                } else {
                    propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL.withDescription(_findDescription);
                }
                this._metadata = propertyMetadata;
            } else {
                this._metadata = PropertyMetadata.construct(_findRequired, _findDescription, _findIndex, _findDefaultValue);
            }
            if (!this._forSerialization) {
                this._metadata = _getSetterInfo(this._metadata);
            }
        }
        return this._metadata;
    }

    public String getName() {
        PropertyName propertyName = this._name;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    public AnnotatedMember getPrimaryMember() {
        if (this._forSerialization) {
            return getAccessor();
        }
        AnnotatedMember mutator = getMutator();
        if (mutator == null) {
            mutator = getAccessor();
        }
        return mutator;
    }

    public JavaType getPrimaryType() {
        if (this._forSerialization) {
            AnnotatedMethod getter = getGetter();
            if (getter != null) {
                return getter.getType();
            }
            AnnotatedField field = getField();
            if (field == null) {
                return TypeFactory.unknownType();
            }
            return field.getType();
        }
        Annotated constructorParameter = getConstructorParameter();
        if (constructorParameter == null) {
            AnnotatedMethod setter = getSetter();
            if (setter != null) {
                return setter.getParameterType(0);
            }
            constructorParameter = getField();
        }
        if (constructorParameter == null) {
            constructorParameter = getGetter();
            if (constructorParameter == null) {
                return TypeFactory.unknownType();
            }
        }
        return constructorParameter.getType();
    }

    public Class<?> getRawPrimaryType() {
        return getPrimaryType().getRawClass();
    }

    public AnnotatedMethod getSetter() {
        Linked linked = this._setters;
        if (linked == null) {
            return null;
        }
        Linked linked2 = linked.next;
        if (linked2 == null) {
            return (AnnotatedMethod) linked.value;
        }
        while (linked2 != null) {
            Class declaringClass = ((AnnotatedMethod) linked.value).getDeclaringClass();
            Class declaringClass2 = ((AnnotatedMethod) linked2.value).getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                linked = linked2;
                linked2 = linked2.next;
            }
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) linked2.value;
            AnnotatedMethod annotatedMethod2 = (AnnotatedMethod) linked.value;
            int _setterPriority = _setterPriority(annotatedMethod);
            int _setterPriority2 = _setterPriority(annotatedMethod2);
            if (_setterPriority != _setterPriority2) {
                if (_setterPriority >= _setterPriority2) {
                    linked2 = linked2.next;
                }
                linked = linked2;
                linked2 = linked2.next;
            } else {
                AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
                if (annotationIntrospector != null) {
                    AnnotatedMethod resolveSetterConflict = annotationIntrospector.resolveSetterConflict(this._config, annotatedMethod2, annotatedMethod);
                    if (resolveSetterConflict != annotatedMethod2) {
                        if (resolveSetterConflict != annotatedMethod) {
                        }
                        linked = linked2;
                        linked2 = linked2.next;
                    } else {
                        continue;
                        linked2 = linked2.next;
                    }
                }
                throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", new Object[]{getName(), ((AnnotatedMethod) linked.value).getFullName(), ((AnnotatedMethod) linked2.value).getFullName()}));
            }
        }
        this._setters = linked.withoutNext();
        return (AnnotatedMethod) linked.value;
    }

    public PropertyName getWrapperName() {
        AnnotatedMember primaryMember = getPrimaryMember();
        if (primaryMember != null) {
            AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
            if (annotationIntrospector != null) {
                return annotationIntrospector.findWrapperName(primaryMember);
            }
        }
        return null;
    }

    public boolean hasConstructorParameter() {
        return this._ctorParameters != null;
    }

    public boolean hasField() {
        return this._fields != null;
    }

    public boolean hasGetter() {
        return this._getters != null;
    }

    public boolean hasName(PropertyName propertyName) {
        return this._name.equals(propertyName);
    }

    public boolean hasSetter() {
        return this._setters != null;
    }

    public boolean isExplicitlyIncluded() {
        return _anyExplicits(this._fields) || _anyExplicits(this._getters) || _anyExplicits(this._setters) || _anyExplicitNames(this._ctorParameters);
    }

    public boolean isExplicitlyNamed() {
        return _anyExplicitNames(this._fields) || _anyExplicitNames(this._getters) || _anyExplicitNames(this._setters) || _anyExplicitNames(this._ctorParameters);
    }

    public boolean isTypeId() {
        Boolean bool = (Boolean) fromMemberAnnotations(new WithMember<Boolean>() {
            public Boolean withMember(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this._annotationIntrospector.isTypeId(annotatedMember);
            }
        });
        return bool != null && bool.booleanValue();
    }

    public void mergeAnnotations(boolean z) {
        if (z) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                this._getters = _applyAnnotations(this._getters, _mergeAnnotations(0, linked, this._fields, this._ctorParameters, this._setters));
                return;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null) {
                this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, linked2, this._ctorParameters, this._setters));
                return;
            }
            return;
        }
        Linked<AnnotatedParameter> linked3 = this._ctorParameters;
        if (linked3 != null) {
            this._ctorParameters = _applyAnnotations(this._ctorParameters, _mergeAnnotations(0, linked3, this._setters, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedMethod> linked4 = this._setters;
        if (linked4 != null) {
            this._setters = _applyAnnotations(this._setters, _mergeAnnotations(0, linked4, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedField> linked5 = this._fields;
        if (linked5 != null) {
            this._fields = _applyAnnotations(this._fields, _mergeAnnotations(0, linked5, this._getters));
        }
    }

    public void removeConstructors() {
        this._ctorParameters = null;
    }

    public void removeIgnored() {
        this._fields = _removeIgnored(this._fields);
        this._getters = _removeIgnored(this._getters);
        this._setters = _removeIgnored(this._setters);
        this._ctorParameters = _removeIgnored(this._ctorParameters);
    }

    public Access removeNonVisible(boolean z) {
        Access findAccess = findAccess();
        if (findAccess == null) {
            findAccess = Access.AUTO;
        }
        int i = AnonymousClass10.$SwitchMap$com$fasterxml$jackson$annotation$JsonProperty$Access[findAccess.ordinal()];
        if (i == 1) {
            this._setters = null;
            this._ctorParameters = null;
            if (!this._forSerialization) {
                this._fields = null;
            }
        } else if (i != 2) {
            if (i != 3) {
                this._getters = _removeNonVisible(this._getters);
                this._ctorParameters = _removeNonVisible(this._ctorParameters);
                if (!z || this._getters == null) {
                    this._fields = _removeNonVisible(this._fields);
                    this._setters = _removeNonVisible(this._setters);
                }
            } else {
                this._getters = null;
                if (this._forSerialization) {
                    this._fields = null;
                }
            }
        }
        return findAccess;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Property '");
        sb.append(this._name);
        sb.append("'; ctors: ");
        sb.append(this._ctorParameters);
        sb.append(", field(s): ");
        sb.append(this._fields);
        sb.append(", getter(s): ");
        sb.append(this._getters);
        sb.append(", setter(s): ");
        sb.append(this._setters);
        sb.append("]");
        return sb.toString();
    }

    public void trimByVisibility() {
        this._fields = _trimByVisibility(this._fields);
        this._getters = _trimByVisibility(this._getters);
        this._setters = _trimByVisibility(this._setters);
        this._ctorParameters = _trimByVisibility(this._ctorParameters);
    }

    public POJOPropertyBuilder withName(PropertyName propertyName) {
        return new POJOPropertyBuilder(this, propertyName);
    }

    public POJOPropertyBuilder withSimpleName(String str) {
        PropertyName withSimpleName = this._name.withSimpleName(str);
        return withSimpleName == this._name ? this : new POJOPropertyBuilder(this, withSimpleName);
    }

    protected POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this._config = mapperConfig;
        this._annotationIntrospector = annotationIntrospector;
        this._internalName = propertyName;
        this._name = propertyName2;
        this._forSerialization = z;
    }

    public int compareTo(POJOPropertyBuilder pOJOPropertyBuilder) {
        if (this._ctorParameters != null) {
            if (pOJOPropertyBuilder._ctorParameters == null) {
                return -1;
            }
        } else if (pOJOPropertyBuilder._ctorParameters != null) {
            return 1;
        }
        return getName().compareTo(pOJOPropertyBuilder.getName());
    }

    protected POJOPropertyBuilder(POJOPropertyBuilder pOJOPropertyBuilder, PropertyName propertyName) {
        this._config = pOJOPropertyBuilder._config;
        this._annotationIntrospector = pOJOPropertyBuilder._annotationIntrospector;
        this._internalName = pOJOPropertyBuilder._internalName;
        this._name = propertyName;
        this._fields = pOJOPropertyBuilder._fields;
        this._ctorParameters = pOJOPropertyBuilder._ctorParameters;
        this._getters = pOJOPropertyBuilder._getters;
        this._setters = pOJOPropertyBuilder._setters;
        this._forSerialization = pOJOPropertyBuilder._forSerialization;
    }
}
