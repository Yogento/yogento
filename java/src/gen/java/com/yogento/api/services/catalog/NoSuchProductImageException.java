package com.yogento.api.services.catalog;

@SuppressWarnings({"serial"})
public class NoSuchProductImageException extends java.lang.Exception implements org.thryft.TBase<NoSuchProductImageException> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final NoSuchProductImageException other) {
            this.causeMessage = other.getCauseMessage();
            this.sku = other.getSku();
        }

        protected NoSuchProductImageException _build(final String causeMessage, final String sku) {
            return new NoSuchProductImageException(causeMessage, sku);
        }

        public NoSuchProductImageException build() {
            return _build(causeMessage, sku);
        }

        public Builder setCauseMessage(final String causeMessage) {
            this.causeMessage = causeMessage;
            return this;
        }

        public Builder setSku(final String sku) {
            this.sku = sku;
            return this;
        }

        private String causeMessage;
        private String sku;
    }

    public NoSuchProductImageException(final NoSuchProductImageException other) {
        this(other.getCauseMessage(), other.getSku());
    }

    public NoSuchProductImageException(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public NoSuchProductImageException(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        String causeMessage = null;
        String sku = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                iprot.readListBegin();
                causeMessage = iprot.readString();
                sku = iprot.readString();
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("cause_message")) {
                        causeMessage = iprot.readString();
                    } else if (ifield.name.equals("sku")) {
                        sku = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.catalog.NoSuchProductImageException: missing causeMessage");
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.NoSuchProductImageException: missing sku");
    }

    public NoSuchProductImageException(final String causeMessage, final String sku) {
        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.catalog.NoSuchProductImageException: missing causeMessage");
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.NoSuchProductImageException: missing sku");
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public int compareTo(final NoSuchProductImageException other) {
        if (other == null) {
            throw new NullPointerException();
        }

        int result;
        result = this.causeMessage.compareTo(other.causeMessage);
        if (result != 0) {
            return result;
        }

        result = this.sku.compareTo(other.sku);
        if (result != 0) {
            return result;
        }

        return 0;
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof NoSuchProductImageException)) {
            return false;
        }

        final NoSuchProductImageException other = (NoSuchProductImageException)otherObject;
        return
            getCauseMessage().equals(other.getCauseMessage()) &&
            getSku().equals(other.getSku());
    }

    public static NoSuchProductImageException fake() {
        return fakeBuilder().build();
    }

    public static Builder fakeBuilder() {
        Builder builder = new Builder();
        builder.setCauseMessage(org.thryft.Faker.Lorem.word());
        builder.setSku(org.thryft.Faker.Lorem.word());
        return builder;
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("cause_message")) {
            return getCauseMessage();
        } else if (fieldName.equals("sku")) {
            return getSku();
        }
        throw new IllegalArgumentException(fieldName);
    }

    public final String getCauseMessage() {
        return causeMessage;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    public final String getSku() {
        return sku;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCauseMessage().hashCode();
        hashCode = 31 * hashCode + getSku().hashCode();
        return hashCode;
    }

    public NoSuchProductImageException replaceCauseMessage(final String causeMessage) {
        return new NoSuchProductImageException(causeMessage, this.sku);
    }

    public NoSuchProductImageException replaceSku(final String sku) {
        return new NoSuchProductImageException(this.causeMessage, sku);
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("cause_message", getCauseMessage());
        helper.add("sku", getSku());
        return helper.toString();
    }

    @Override
    public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
        write(oprot, org.thryft.protocol.TType.STRUCT);
    }

    public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
        switch (writeAsTType) {
            case org.thryft.protocol.TType.VOID:
            case org.thryft.protocol.TType.LIST:
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 2));

                oprot.writeString(getCauseMessage());

                oprot.writeString(getSku());

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("NoSuchProductImageException"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("cause_message", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getCauseMessage());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getSku());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String causeMessage;

    private final String sku;
}
