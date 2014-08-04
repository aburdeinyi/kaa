/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EndpointVersionInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EndpointVersionInfo\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"configVersion\",\"type\":\"int\"},{\"name\":\"profileVersion\",\"type\":\"int\",\"default\":\"1\"},{\"name\":\"systemNfVersion\",\"type\":\"int\",\"default\":\"0\"},{\"name\":\"userNfVersion\",\"type\":\"int\",\"default\":\"0\"},{\"name\":\"eventFamilyVersions\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EventClassFamilyVersionInfo\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"version\",\"type\":\"int\"}]}},\"null\"]},{\"name\":\"logSchemaVersion\",\"type\":\"int\",\"default\":\"0\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int configVersion;
   private int profileVersion;
   private int systemNfVersion;
   private int userNfVersion;
   private java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo> eventFamilyVersions;
   private int logSchemaVersion;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public EndpointVersionInfo() {}

  /**
   * All-args constructor.
   */
  public EndpointVersionInfo(java.lang.Integer configVersion, java.lang.Integer profileVersion, java.lang.Integer systemNfVersion, java.lang.Integer userNfVersion, java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo> eventFamilyVersions, java.lang.Integer logSchemaVersion) {
    this.configVersion = configVersion;
    this.profileVersion = profileVersion;
    this.systemNfVersion = systemNfVersion;
    this.userNfVersion = userNfVersion;
    this.eventFamilyVersions = eventFamilyVersions;
    this.logSchemaVersion = logSchemaVersion;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return configVersion;
    case 1: return profileVersion;
    case 2: return systemNfVersion;
    case 3: return userNfVersion;
    case 4: return eventFamilyVersions;
    case 5: return logSchemaVersion;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: configVersion = (java.lang.Integer)value$; break;
    case 1: profileVersion = (java.lang.Integer)value$; break;
    case 2: systemNfVersion = (java.lang.Integer)value$; break;
    case 3: userNfVersion = (java.lang.Integer)value$; break;
    case 4: eventFamilyVersions = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo>)value$; break;
    case 5: logSchemaVersion = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'configVersion' field.
   */
  public java.lang.Integer getConfigVersion() {
    return configVersion;
  }

  /**
   * Sets the value of the 'configVersion' field.
   * @param value the value to set.
   */
  public void setConfigVersion(java.lang.Integer value) {
    this.configVersion = value;
  }

  /**
   * Gets the value of the 'profileVersion' field.
   */
  public java.lang.Integer getProfileVersion() {
    return profileVersion;
  }

  /**
   * Sets the value of the 'profileVersion' field.
   * @param value the value to set.
   */
  public void setProfileVersion(java.lang.Integer value) {
    this.profileVersion = value;
  }

  /**
   * Gets the value of the 'systemNfVersion' field.
   */
  public java.lang.Integer getSystemNfVersion() {
    return systemNfVersion;
  }

  /**
   * Sets the value of the 'systemNfVersion' field.
   * @param value the value to set.
   */
  public void setSystemNfVersion(java.lang.Integer value) {
    this.systemNfVersion = value;
  }

  /**
   * Gets the value of the 'userNfVersion' field.
   */
  public java.lang.Integer getUserNfVersion() {
    return userNfVersion;
  }

  /**
   * Sets the value of the 'userNfVersion' field.
   * @param value the value to set.
   */
  public void setUserNfVersion(java.lang.Integer value) {
    this.userNfVersion = value;
  }

  /**
   * Gets the value of the 'eventFamilyVersions' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo> getEventFamilyVersions() {
    return eventFamilyVersions;
  }

  /**
   * Sets the value of the 'eventFamilyVersions' field.
   * @param value the value to set.
   */
  public void setEventFamilyVersions(java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo> value) {
    this.eventFamilyVersions = value;
  }

  /**
   * Gets the value of the 'logSchemaVersion' field.
   */
  public java.lang.Integer getLogSchemaVersion() {
    return logSchemaVersion;
  }

  /**
   * Sets the value of the 'logSchemaVersion' field.
   * @param value the value to set.
   */
  public void setLogSchemaVersion(java.lang.Integer value) {
    this.logSchemaVersion = value;
  }

  /** Creates a new EndpointVersionInfo RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder();
  }
  
  /** Creates a new EndpointVersionInfo RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder(other);
  }
  
  /** Creates a new EndpointVersionInfo RecordBuilder by copying an existing EndpointVersionInfo instance */
  public static org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo other) {
    return new org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder(other);
  }
  
  /**
   * RecordBuilder for EndpointVersionInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EndpointVersionInfo>
    implements org.apache.avro.data.RecordBuilder<EndpointVersionInfo> {

    private int configVersion;
    private int profileVersion;
    private int systemNfVersion;
    private int userNfVersion;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo> eventFamilyVersions;
    private int logSchemaVersion;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.configVersion)) {
        this.configVersion = data().deepCopy(fields()[0].schema(), other.configVersion);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.profileVersion)) {
        this.profileVersion = data().deepCopy(fields()[1].schema(), other.profileVersion);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.systemNfVersion)) {
        this.systemNfVersion = data().deepCopy(fields()[2].schema(), other.systemNfVersion);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.userNfVersion)) {
        this.userNfVersion = data().deepCopy(fields()[3].schema(), other.userNfVersion);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.eventFamilyVersions)) {
        this.eventFamilyVersions = data().deepCopy(fields()[4].schema(), other.eventFamilyVersions);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.logSchemaVersion)) {
        this.logSchemaVersion = data().deepCopy(fields()[5].schema(), other.logSchemaVersion);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing EndpointVersionInfo instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo other) {
            super(org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.SCHEMA$);
      if (isValidValue(fields()[0], other.configVersion)) {
        this.configVersion = data().deepCopy(fields()[0].schema(), other.configVersion);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.profileVersion)) {
        this.profileVersion = data().deepCopy(fields()[1].schema(), other.profileVersion);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.systemNfVersion)) {
        this.systemNfVersion = data().deepCopy(fields()[2].schema(), other.systemNfVersion);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.userNfVersion)) {
        this.userNfVersion = data().deepCopy(fields()[3].schema(), other.userNfVersion);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.eventFamilyVersions)) {
        this.eventFamilyVersions = data().deepCopy(fields()[4].schema(), other.eventFamilyVersions);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.logSchemaVersion)) {
        this.logSchemaVersion = data().deepCopy(fields()[5].schema(), other.logSchemaVersion);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'configVersion' field */
    public java.lang.Integer getConfigVersion() {
      return configVersion;
    }
    
    /** Sets the value of the 'configVersion' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder setConfigVersion(int value) {
      validate(fields()[0], value);
      this.configVersion = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'configVersion' field has been set */
    public boolean hasConfigVersion() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'configVersion' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder clearConfigVersion() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'profileVersion' field */
    public java.lang.Integer getProfileVersion() {
      return profileVersion;
    }
    
    /** Sets the value of the 'profileVersion' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder setProfileVersion(int value) {
      validate(fields()[1], value);
      this.profileVersion = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'profileVersion' field has been set */
    public boolean hasProfileVersion() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'profileVersion' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder clearProfileVersion() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'systemNfVersion' field */
    public java.lang.Integer getSystemNfVersion() {
      return systemNfVersion;
    }
    
    /** Sets the value of the 'systemNfVersion' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder setSystemNfVersion(int value) {
      validate(fields()[2], value);
      this.systemNfVersion = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'systemNfVersion' field has been set */
    public boolean hasSystemNfVersion() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'systemNfVersion' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder clearSystemNfVersion() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'userNfVersion' field */
    public java.lang.Integer getUserNfVersion() {
      return userNfVersion;
    }
    
    /** Sets the value of the 'userNfVersion' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder setUserNfVersion(int value) {
      validate(fields()[3], value);
      this.userNfVersion = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'userNfVersion' field has been set */
    public boolean hasUserNfVersion() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'userNfVersion' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder clearUserNfVersion() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'eventFamilyVersions' field */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo> getEventFamilyVersions() {
      return eventFamilyVersions;
    }
    
    /** Sets the value of the 'eventFamilyVersions' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder setEventFamilyVersions(java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo> value) {
      validate(fields()[4], value);
      this.eventFamilyVersions = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'eventFamilyVersions' field has been set */
    public boolean hasEventFamilyVersions() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'eventFamilyVersions' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder clearEventFamilyVersions() {
      eventFamilyVersions = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'logSchemaVersion' field */
    public java.lang.Integer getLogSchemaVersion() {
      return logSchemaVersion;
    }
    
    /** Sets the value of the 'logSchemaVersion' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder setLogSchemaVersion(int value) {
      validate(fields()[5], value);
      this.logSchemaVersion = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'logSchemaVersion' field has been set */
    public boolean hasLogSchemaVersion() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'logSchemaVersion' field */
    public org.kaaproject.kaa.common.endpoint.gen.EndpointVersionInfo.Builder clearLogSchemaVersion() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public EndpointVersionInfo build() {
      try {
        EndpointVersionInfo record = new EndpointVersionInfo();
        record.configVersion = fieldSetFlags()[0] ? this.configVersion : (java.lang.Integer) defaultValue(fields()[0]);
        record.profileVersion = fieldSetFlags()[1] ? this.profileVersion : (java.lang.Integer) defaultValue(fields()[1]);
        record.systemNfVersion = fieldSetFlags()[2] ? this.systemNfVersion : (java.lang.Integer) defaultValue(fields()[2]);
        record.userNfVersion = fieldSetFlags()[3] ? this.userNfVersion : (java.lang.Integer) defaultValue(fields()[3]);
        record.eventFamilyVersions = fieldSetFlags()[4] ? this.eventFamilyVersions : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo>) defaultValue(fields()[4]);
        record.logSchemaVersion = fieldSetFlags()[5] ? this.logSchemaVersion : (java.lang.Integer) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}