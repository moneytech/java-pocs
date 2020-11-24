/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.github.diegopacheco.serdebenchs.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class PersonIdentifier extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = 2744807184034062583L;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PersonIdentifier\",\"namespace\":\"com.github.diegopacheco.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"email\",\"type\":\"string\"}]}");
    public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<PersonIdentifier> ENCODER =
            new BinaryMessageEncoder<PersonIdentifier>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<PersonIdentifier> DECODER =
            new BinaryMessageDecoder<PersonIdentifier>(MODEL$, SCHEMA$);

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<PersonIdentifier> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<PersonIdentifier> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<PersonIdentifier> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<PersonIdentifier>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Serializes this PersonIdentifier to a ByteBuffer.
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /**
     * Deserializes a PersonIdentifier from a ByteBuffer.
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a PersonIdentifier instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static PersonIdentifier fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    @Deprecated public java.lang.CharSequence id;
    @Deprecated public java.lang.CharSequence name;
    @Deprecated public java.lang.CharSequence email;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public PersonIdentifier() {}

    /**
     * All-args constructor.
     * @param id The new value for id
     * @param name The new value for name
     * @param email The new value for email
     */
    public PersonIdentifier(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
    public org.apache.avro.Schema getSchema() { return SCHEMA$; }
    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0: return id;
            case 1: return name;
            case 2: return email;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0: id = (java.lang.CharSequence)value$; break;
            case 1: name = (java.lang.CharSequence)value$; break;
            case 2: email = (java.lang.CharSequence)value$; break;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    /**
     * Gets the value of the 'id' field.
     * @return The value of the 'id' field.
     */
    public java.lang.CharSequence getId() {
        return id;
    }


    /**
     * Sets the value of the 'id' field.
     * @param value the value to set.
     */
    public void setId(java.lang.CharSequence value) {
        this.id = value;
    }

    /**
     * Gets the value of the 'name' field.
     * @return The value of the 'name' field.
     */
    public java.lang.CharSequence getName() {
        return name;
    }


    /**
     * Sets the value of the 'name' field.
     * @param value the value to set.
     */
    public void setName(java.lang.CharSequence value) {
        this.name = value;
    }

    /**
     * Gets the value of the 'email' field.
     * @return The value of the 'email' field.
     */
    public java.lang.CharSequence getEmail() {
        return email;
    }


    /**
     * Sets the value of the 'email' field.
     * @param value the value to set.
     */
    public void setEmail(java.lang.CharSequence value) {
        this.email = value;
    }

    /**
     * Creates a new PersonIdentifier RecordBuilder.
     * @return A new PersonIdentifier RecordBuilder
     */
    public static com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder newBuilder() {
        return new com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder();
    }

    /**
     * Creates a new PersonIdentifier RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new PersonIdentifier RecordBuilder
     */
    public static com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder newBuilder(com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder other) {
        if (other == null) {
            return new com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder();
        } else {
            return new com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder(other);
        }
    }

    /**
     * Creates a new PersonIdentifier RecordBuilder by copying an existing PersonIdentifier instance.
     * @param other The existing instance to copy.
     * @return A new PersonIdentifier RecordBuilder
     */
    public static com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder newBuilder(com.github.diegopacheco.serdebenchs.avro.PersonIdentifier other) {
        if (other == null) {
            return new com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder();
        } else {
            return new com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder(other);
        }
    }

    /**
     * RecordBuilder for PersonIdentifier instances.
     */
    @org.apache.avro.specific.AvroGenerated
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PersonIdentifier>
            implements org.apache.avro.data.RecordBuilder<PersonIdentifier> {

        private java.lang.CharSequence id;
        private java.lang.CharSequence name;
        private java.lang.CharSequence email;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.name)) {
                this.name = data().deepCopy(fields()[1].schema(), other.name);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.email)) {
                this.email = data().deepCopy(fields()[2].schema(), other.email);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
        }

        /**
         * Creates a Builder by copying an existing PersonIdentifier instance
         * @param other The existing instance to copy.
         */
        private Builder(com.github.diegopacheco.serdebenchs.avro.PersonIdentifier other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.name)) {
                this.name = data().deepCopy(fields()[1].schema(), other.name);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.email)) {
                this.email = data().deepCopy(fields()[2].schema(), other.email);
                fieldSetFlags()[2] = true;
            }
        }

        /**
         * Gets the value of the 'id' field.
         * @return The value.
         */
        public java.lang.CharSequence getId() {
            return id;
        }


        /**
         * Sets the value of the 'id' field.
         * @param value The value of 'id'.
         * @return This builder.
         */
        public com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder setId(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.id = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'id' field has been set.
         * @return True if the 'id' field has been set, false otherwise.
         */
        public boolean hasId() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'id' field.
         * @return This builder.
         */
        public com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder clearId() {
            id = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'name' field.
         * @return The value.
         */
        public java.lang.CharSequence getName() {
            return name;
        }


        /**
         * Sets the value of the 'name' field.
         * @param value The value of 'name'.
         * @return This builder.
         */
        public com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder setName(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.name = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'name' field has been set.
         * @return True if the 'name' field has been set, false otherwise.
         */
        public boolean hasName() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'name' field.
         * @return This builder.
         */
        public com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder clearName() {
            name = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'email' field.
         * @return The value.
         */
        public java.lang.CharSequence getEmail() {
            return email;
        }


        /**
         * Sets the value of the 'email' field.
         * @param value The value of 'email'.
         * @return This builder.
         */
        public com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder setEmail(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.email = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'email' field has been set.
         * @return True if the 'email' field has been set, false otherwise.
         */
        public boolean hasEmail() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'email' field.
         * @return This builder.
         */
        public com.github.diegopacheco.serdebenchs.avro.PersonIdentifier.Builder clearEmail() {
            email = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public PersonIdentifier build() {
            try {
                PersonIdentifier record = new PersonIdentifier();
                record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.email = fieldSetFlags()[2] ? this.email : (java.lang.CharSequence) defaultValue(fields()[2]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<PersonIdentifier>
            WRITER$ = (org.apache.avro.io.DatumWriter<PersonIdentifier>)MODEL$.createDatumWriter(SCHEMA$);

    @Override public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<PersonIdentifier>
            READER$ = (org.apache.avro.io.DatumReader<PersonIdentifier>)MODEL$.createDatumReader(SCHEMA$);

    @Override public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    @Override protected boolean hasCustomCoders() { return true; }

    @Override public void customEncode(org.apache.avro.io.Encoder out)
            throws java.io.IOException
    {
        out.writeString(this.id);

        out.writeString(this.name);

        out.writeString(this.email);

    }

    @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException
    {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);

            this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

            this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);

        } else {
            for (int i = 0; i < 3; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
                        break;

                    case 1:
                        this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
                        break;

                    case 2:
                        this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }
}