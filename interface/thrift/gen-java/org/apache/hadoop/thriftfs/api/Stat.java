/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Information about a path in HDFS.
 * 
 * Modelled after org.apache.hadoop.fs.FileStatus
 */
public class Stat implements org.apache.thrift.TBase<Stat, Stat._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Stat");

  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IS_DIR_FIELD_DESC = new org.apache.thrift.protocol.TField("isDir", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField ATIME_FIELD_DESC = new org.apache.thrift.protocol.TField("atime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField MTIME_FIELD_DESC = new org.apache.thrift.protocol.TField("mtime", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField PERMS_FIELD_DESC = new org.apache.thrift.protocol.TField("perms", org.apache.thrift.protocol.TType.I16, (short)5);
  private static final org.apache.thrift.protocol.TField OWNER_FIELD_DESC = new org.apache.thrift.protocol.TField("owner", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("group", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField LENGTH_FIELD_DESC = new org.apache.thrift.protocol.TField("length", org.apache.thrift.protocol.TType.I64, (short)13);
  private static final org.apache.thrift.protocol.TField BLOCK_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("blockSize", org.apache.thrift.protocol.TType.I64, (short)14);
  private static final org.apache.thrift.protocol.TField REPLICATION_FIELD_DESC = new org.apache.thrift.protocol.TField("replication", org.apache.thrift.protocol.TType.I16, (short)15);

  /**
   * The path.
   */
  public String path;
  /**
   * True:  The path represents a file.
   * False: The path represents a directory.
   */
  public boolean isDir;
  /**
   * Access time (milliseconds since 1970-01-01 00:00 UTC).
   */
  public long atime;
  /**
   * Modification time (milliseconds since 1970-01-01 00:00 UTC).
   */
  public long mtime;
  /**
   * Access permissions
   */
  public short perms;
  /**
   * Owner
   */
  public String owner;
  /**
   * Group
   */
  public String group;
  /**
   * Length (in bytes).
   */
  public long length;
  /**
   * Block size (in bytes).
   */
  public long blockSize;
  /**
   * Replication factor.
   */
  public short replication;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The path.
     */
    PATH((short)1, "path"),
    /**
     * True:  The path represents a file.
     * False: The path represents a directory.
     */
    IS_DIR((short)2, "isDir"),
    /**
     * Access time (milliseconds since 1970-01-01 00:00 UTC).
     */
    ATIME((short)3, "atime"),
    /**
     * Modification time (milliseconds since 1970-01-01 00:00 UTC).
     */
    MTIME((short)4, "mtime"),
    /**
     * Access permissions
     */
    PERMS((short)5, "perms"),
    /**
     * Owner
     */
    OWNER((short)6, "owner"),
    /**
     * Group
     */
    GROUP((short)7, "group"),
    /**
     * Length (in bytes).
     */
    LENGTH((short)13, "length"),
    /**
     * Block size (in bytes).
     */
    BLOCK_SIZE((short)14, "blockSize"),
    /**
     * Replication factor.
     */
    REPLICATION((short)15, "replication");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PATH
          return PATH;
        case 2: // IS_DIR
          return IS_DIR;
        case 3: // ATIME
          return ATIME;
        case 4: // MTIME
          return MTIME;
        case 5: // PERMS
          return PERMS;
        case 6: // OWNER
          return OWNER;
        case 7: // GROUP
          return GROUP;
        case 13: // LENGTH
          return LENGTH;
        case 14: // BLOCK_SIZE
          return BLOCK_SIZE;
        case 15: // REPLICATION
          return REPLICATION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISDIR_ISSET_ID = 0;
  private static final int __ATIME_ISSET_ID = 1;
  private static final int __MTIME_ISSET_ID = 2;
  private static final int __PERMS_ISSET_ID = 3;
  private static final int __LENGTH_ISSET_ID = 4;
  private static final int __BLOCKSIZE_ISSET_ID = 5;
  private static final int __REPLICATION_ISSET_ID = 6;
  private BitSet __isset_bit_vector = new BitSet(7);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_DIR, new org.apache.thrift.meta_data.FieldMetaData("isDir", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ATIME, new org.apache.thrift.meta_data.FieldMetaData("atime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MTIME, new org.apache.thrift.meta_data.FieldMetaData("mtime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PERMS, new org.apache.thrift.meta_data.FieldMetaData("perms", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.OWNER, new org.apache.thrift.meta_data.FieldMetaData("owner", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GROUP, new org.apache.thrift.meta_data.FieldMetaData("group", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LENGTH, new org.apache.thrift.meta_data.FieldMetaData("length", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BLOCK_SIZE, new org.apache.thrift.meta_data.FieldMetaData("blockSize", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.REPLICATION, new org.apache.thrift.meta_data.FieldMetaData("replication", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Stat.class, metaDataMap);
  }

  public Stat() {
  }

  public Stat(
    String path,
    boolean isDir,
    long atime,
    long mtime,
    short perms,
    String owner,
    String group,
    long length,
    long blockSize,
    short replication)
  {
    this();
    this.path = path;
    this.isDir = isDir;
    setIsDirIsSet(true);
    this.atime = atime;
    setAtimeIsSet(true);
    this.mtime = mtime;
    setMtimeIsSet(true);
    this.perms = perms;
    setPermsIsSet(true);
    this.owner = owner;
    this.group = group;
    this.length = length;
    setLengthIsSet(true);
    this.blockSize = blockSize;
    setBlockSizeIsSet(true);
    this.replication = replication;
    setReplicationIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Stat(Stat other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetPath()) {
      this.path = other.path;
    }
    this.isDir = other.isDir;
    this.atime = other.atime;
    this.mtime = other.mtime;
    this.perms = other.perms;
    if (other.isSetOwner()) {
      this.owner = other.owner;
    }
    if (other.isSetGroup()) {
      this.group = other.group;
    }
    this.length = other.length;
    this.blockSize = other.blockSize;
    this.replication = other.replication;
  }

  public Stat deepCopy() {
    return new Stat(this);
  }

  @Override
  public void clear() {
    this.path = null;
    setIsDirIsSet(false);
    this.isDir = false;
    setAtimeIsSet(false);
    this.atime = 0;
    setMtimeIsSet(false);
    this.mtime = 0;
    setPermsIsSet(false);
    this.perms = 0;
    this.owner = null;
    this.group = null;
    setLengthIsSet(false);
    this.length = 0;
    setBlockSizeIsSet(false);
    this.blockSize = 0;
    setReplicationIsSet(false);
    this.replication = 0;
  }

  /**
   * The path.
   */
  public String getPath() {
    return this.path;
  }

  /**
   * The path.
   */
  public Stat setPath(String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been assigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  /**
   * True:  The path represents a file.
   * False: The path represents a directory.
   */
  public boolean isIsDir() {
    return this.isDir;
  }

  /**
   * True:  The path represents a file.
   * False: The path represents a directory.
   */
  public Stat setIsDir(boolean isDir) {
    this.isDir = isDir;
    setIsDirIsSet(true);
    return this;
  }

  public void unsetIsDir() {
    __isset_bit_vector.clear(__ISDIR_ISSET_ID);
  }

  /** Returns true if field isDir is set (has been assigned a value) and false otherwise */
  public boolean isSetIsDir() {
    return __isset_bit_vector.get(__ISDIR_ISSET_ID);
  }

  public void setIsDirIsSet(boolean value) {
    __isset_bit_vector.set(__ISDIR_ISSET_ID, value);
  }

  /**
   * Access time (milliseconds since 1970-01-01 00:00 UTC).
   */
  public long getAtime() {
    return this.atime;
  }

  /**
   * Access time (milliseconds since 1970-01-01 00:00 UTC).
   */
  public Stat setAtime(long atime) {
    this.atime = atime;
    setAtimeIsSet(true);
    return this;
  }

  public void unsetAtime() {
    __isset_bit_vector.clear(__ATIME_ISSET_ID);
  }

  /** Returns true if field atime is set (has been assigned a value) and false otherwise */
  public boolean isSetAtime() {
    return __isset_bit_vector.get(__ATIME_ISSET_ID);
  }

  public void setAtimeIsSet(boolean value) {
    __isset_bit_vector.set(__ATIME_ISSET_ID, value);
  }

  /**
   * Modification time (milliseconds since 1970-01-01 00:00 UTC).
   */
  public long getMtime() {
    return this.mtime;
  }

  /**
   * Modification time (milliseconds since 1970-01-01 00:00 UTC).
   */
  public Stat setMtime(long mtime) {
    this.mtime = mtime;
    setMtimeIsSet(true);
    return this;
  }

  public void unsetMtime() {
    __isset_bit_vector.clear(__MTIME_ISSET_ID);
  }

  /** Returns true if field mtime is set (has been assigned a value) and false otherwise */
  public boolean isSetMtime() {
    return __isset_bit_vector.get(__MTIME_ISSET_ID);
  }

  public void setMtimeIsSet(boolean value) {
    __isset_bit_vector.set(__MTIME_ISSET_ID, value);
  }

  /**
   * Access permissions
   */
  public short getPerms() {
    return this.perms;
  }

  /**
   * Access permissions
   */
  public Stat setPerms(short perms) {
    this.perms = perms;
    setPermsIsSet(true);
    return this;
  }

  public void unsetPerms() {
    __isset_bit_vector.clear(__PERMS_ISSET_ID);
  }

  /** Returns true if field perms is set (has been assigned a value) and false otherwise */
  public boolean isSetPerms() {
    return __isset_bit_vector.get(__PERMS_ISSET_ID);
  }

  public void setPermsIsSet(boolean value) {
    __isset_bit_vector.set(__PERMS_ISSET_ID, value);
  }

  /**
   * Owner
   */
  public String getOwner() {
    return this.owner;
  }

  /**
   * Owner
   */
  public Stat setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public void unsetOwner() {
    this.owner = null;
  }

  /** Returns true if field owner is set (has been assigned a value) and false otherwise */
  public boolean isSetOwner() {
    return this.owner != null;
  }

  public void setOwnerIsSet(boolean value) {
    if (!value) {
      this.owner = null;
    }
  }

  /**
   * Group
   */
  public String getGroup() {
    return this.group;
  }

  /**
   * Group
   */
  public Stat setGroup(String group) {
    this.group = group;
    return this;
  }

  public void unsetGroup() {
    this.group = null;
  }

  /** Returns true if field group is set (has been assigned a value) and false otherwise */
  public boolean isSetGroup() {
    return this.group != null;
  }

  public void setGroupIsSet(boolean value) {
    if (!value) {
      this.group = null;
    }
  }

  /**
   * Length (in bytes).
   */
  public long getLength() {
    return this.length;
  }

  /**
   * Length (in bytes).
   */
  public Stat setLength(long length) {
    this.length = length;
    setLengthIsSet(true);
    return this;
  }

  public void unsetLength() {
    __isset_bit_vector.clear(__LENGTH_ISSET_ID);
  }

  /** Returns true if field length is set (has been assigned a value) and false otherwise */
  public boolean isSetLength() {
    return __isset_bit_vector.get(__LENGTH_ISSET_ID);
  }

  public void setLengthIsSet(boolean value) {
    __isset_bit_vector.set(__LENGTH_ISSET_ID, value);
  }

  /**
   * Block size (in bytes).
   */
  public long getBlockSize() {
    return this.blockSize;
  }

  /**
   * Block size (in bytes).
   */
  public Stat setBlockSize(long blockSize) {
    this.blockSize = blockSize;
    setBlockSizeIsSet(true);
    return this;
  }

  public void unsetBlockSize() {
    __isset_bit_vector.clear(__BLOCKSIZE_ISSET_ID);
  }

  /** Returns true if field blockSize is set (has been assigned a value) and false otherwise */
  public boolean isSetBlockSize() {
    return __isset_bit_vector.get(__BLOCKSIZE_ISSET_ID);
  }

  public void setBlockSizeIsSet(boolean value) {
    __isset_bit_vector.set(__BLOCKSIZE_ISSET_ID, value);
  }

  /**
   * Replication factor.
   */
  public short getReplication() {
    return this.replication;
  }

  /**
   * Replication factor.
   */
  public Stat setReplication(short replication) {
    this.replication = replication;
    setReplicationIsSet(true);
    return this;
  }

  public void unsetReplication() {
    __isset_bit_vector.clear(__REPLICATION_ISSET_ID);
  }

  /** Returns true if field replication is set (has been assigned a value) and false otherwise */
  public boolean isSetReplication() {
    return __isset_bit_vector.get(__REPLICATION_ISSET_ID);
  }

  public void setReplicationIsSet(boolean value) {
    __isset_bit_vector.set(__REPLICATION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((String)value);
      }
      break;

    case IS_DIR:
      if (value == null) {
        unsetIsDir();
      } else {
        setIsDir((Boolean)value);
      }
      break;

    case ATIME:
      if (value == null) {
        unsetAtime();
      } else {
        setAtime((Long)value);
      }
      break;

    case MTIME:
      if (value == null) {
        unsetMtime();
      } else {
        setMtime((Long)value);
      }
      break;

    case PERMS:
      if (value == null) {
        unsetPerms();
      } else {
        setPerms((Short)value);
      }
      break;

    case OWNER:
      if (value == null) {
        unsetOwner();
      } else {
        setOwner((String)value);
      }
      break;

    case GROUP:
      if (value == null) {
        unsetGroup();
      } else {
        setGroup((String)value);
      }
      break;

    case LENGTH:
      if (value == null) {
        unsetLength();
      } else {
        setLength((Long)value);
      }
      break;

    case BLOCK_SIZE:
      if (value == null) {
        unsetBlockSize();
      } else {
        setBlockSize((Long)value);
      }
      break;

    case REPLICATION:
      if (value == null) {
        unsetReplication();
      } else {
        setReplication((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PATH:
      return getPath();

    case IS_DIR:
      return new Boolean(isIsDir());

    case ATIME:
      return new Long(getAtime());

    case MTIME:
      return new Long(getMtime());

    case PERMS:
      return new Short(getPerms());

    case OWNER:
      return getOwner();

    case GROUP:
      return getGroup();

    case LENGTH:
      return new Long(getLength());

    case BLOCK_SIZE:
      return new Long(getBlockSize());

    case REPLICATION:
      return new Short(getReplication());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PATH:
      return isSetPath();
    case IS_DIR:
      return isSetIsDir();
    case ATIME:
      return isSetAtime();
    case MTIME:
      return isSetMtime();
    case PERMS:
      return isSetPerms();
    case OWNER:
      return isSetOwner();
    case GROUP:
      return isSetGroup();
    case LENGTH:
      return isSetLength();
    case BLOCK_SIZE:
      return isSetBlockSize();
    case REPLICATION:
      return isSetReplication();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Stat)
      return this.equals((Stat)that);
    return false;
  }

  public boolean equals(Stat that) {
    if (that == null)
      return false;

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    boolean this_present_isDir = true;
    boolean that_present_isDir = true;
    if (this_present_isDir || that_present_isDir) {
      if (!(this_present_isDir && that_present_isDir))
        return false;
      if (this.isDir != that.isDir)
        return false;
    }

    boolean this_present_atime = true;
    boolean that_present_atime = true;
    if (this_present_atime || that_present_atime) {
      if (!(this_present_atime && that_present_atime))
        return false;
      if (this.atime != that.atime)
        return false;
    }

    boolean this_present_mtime = true;
    boolean that_present_mtime = true;
    if (this_present_mtime || that_present_mtime) {
      if (!(this_present_mtime && that_present_mtime))
        return false;
      if (this.mtime != that.mtime)
        return false;
    }

    boolean this_present_perms = true;
    boolean that_present_perms = true;
    if (this_present_perms || that_present_perms) {
      if (!(this_present_perms && that_present_perms))
        return false;
      if (this.perms != that.perms)
        return false;
    }

    boolean this_present_owner = true && this.isSetOwner();
    boolean that_present_owner = true && that.isSetOwner();
    if (this_present_owner || that_present_owner) {
      if (!(this_present_owner && that_present_owner))
        return false;
      if (!this.owner.equals(that.owner))
        return false;
    }

    boolean this_present_group = true && this.isSetGroup();
    boolean that_present_group = true && that.isSetGroup();
    if (this_present_group || that_present_group) {
      if (!(this_present_group && that_present_group))
        return false;
      if (!this.group.equals(that.group))
        return false;
    }

    boolean this_present_length = true;
    boolean that_present_length = true;
    if (this_present_length || that_present_length) {
      if (!(this_present_length && that_present_length))
        return false;
      if (this.length != that.length)
        return false;
    }

    boolean this_present_blockSize = true;
    boolean that_present_blockSize = true;
    if (this_present_blockSize || that_present_blockSize) {
      if (!(this_present_blockSize && that_present_blockSize))
        return false;
      if (this.blockSize != that.blockSize)
        return false;
    }

    boolean this_present_replication = true;
    boolean that_present_replication = true;
    if (this_present_replication || that_present_replication) {
      if (!(this_present_replication && that_present_replication))
        return false;
      if (this.replication != that.replication)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_path = true && (isSetPath());
    builder.append(present_path);
    if (present_path)
      builder.append(path);

    boolean present_isDir = true;
    builder.append(present_isDir);
    if (present_isDir)
      builder.append(isDir);

    boolean present_atime = true;
    builder.append(present_atime);
    if (present_atime)
      builder.append(atime);

    boolean present_mtime = true;
    builder.append(present_mtime);
    if (present_mtime)
      builder.append(mtime);

    boolean present_perms = true;
    builder.append(present_perms);
    if (present_perms)
      builder.append(perms);

    boolean present_owner = true && (isSetOwner());
    builder.append(present_owner);
    if (present_owner)
      builder.append(owner);

    boolean present_group = true && (isSetGroup());
    builder.append(present_group);
    if (present_group)
      builder.append(group);

    boolean present_length = true;
    builder.append(present_length);
    if (present_length)
      builder.append(length);

    boolean present_blockSize = true;
    builder.append(present_blockSize);
    if (present_blockSize)
      builder.append(blockSize);

    boolean present_replication = true;
    builder.append(present_replication);
    if (present_replication)
      builder.append(replication);

    return builder.toHashCode();
  }

  public int compareTo(Stat other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Stat typedOther = (Stat)other;

    lastComparison = Boolean.valueOf(isSetPath()).compareTo(typedOther.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path, typedOther.path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsDir()).compareTo(typedOther.isSetIsDir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsDir()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isDir, typedOther.isDir);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAtime()).compareTo(typedOther.isSetAtime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAtime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.atime, typedOther.atime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMtime()).compareTo(typedOther.isSetMtime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMtime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mtime, typedOther.mtime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPerms()).compareTo(typedOther.isSetPerms());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPerms()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.perms, typedOther.perms);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOwner()).compareTo(typedOther.isSetOwner());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwner()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.owner, typedOther.owner);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroup()).compareTo(typedOther.isSetGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.group, typedOther.group);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLength()).compareTo(typedOther.isSetLength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLength()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.length, typedOther.length);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBlockSize()).compareTo(typedOther.isSetBlockSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlockSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blockSize, typedOther.blockSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReplication()).compareTo(typedOther.isSetReplication());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReplication()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.replication, typedOther.replication);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // PATH
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.path = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // IS_DIR
          if (field.type == org.apache.thrift.protocol.TType.BOOL) {
            this.isDir = iprot.readBool();
            setIsDirIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ATIME
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.atime = iprot.readI64();
            setAtimeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // MTIME
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.mtime = iprot.readI64();
            setMtimeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // PERMS
          if (field.type == org.apache.thrift.protocol.TType.I16) {
            this.perms = iprot.readI16();
            setPermsIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // OWNER
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.owner = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // GROUP
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.group = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 13: // LENGTH
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.length = iprot.readI64();
            setLengthIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 14: // BLOCK_SIZE
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.blockSize = iprot.readI64();
            setBlockSizeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 15: // REPLICATION
          if (field.type == org.apache.thrift.protocol.TType.I16) {
            this.replication = iprot.readI16();
            setReplicationIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.path != null) {
      oprot.writeFieldBegin(PATH_FIELD_DESC);
      oprot.writeString(this.path);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(IS_DIR_FIELD_DESC);
    oprot.writeBool(this.isDir);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ATIME_FIELD_DESC);
    oprot.writeI64(this.atime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(MTIME_FIELD_DESC);
    oprot.writeI64(this.mtime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PERMS_FIELD_DESC);
    oprot.writeI16(this.perms);
    oprot.writeFieldEnd();
    if (this.owner != null) {
      oprot.writeFieldBegin(OWNER_FIELD_DESC);
      oprot.writeString(this.owner);
      oprot.writeFieldEnd();
    }
    if (this.group != null) {
      oprot.writeFieldBegin(GROUP_FIELD_DESC);
      oprot.writeString(this.group);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(LENGTH_FIELD_DESC);
    oprot.writeI64(this.length);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(BLOCK_SIZE_FIELD_DESC);
    oprot.writeI64(this.blockSize);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(REPLICATION_FIELD_DESC);
    oprot.writeI16(this.replication);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Stat(");
    boolean first = true;

    sb.append("path:");
    if (this.path == null) {
      sb.append("null");
    } else {
      sb.append(this.path);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isDir:");
    sb.append(this.isDir);
    first = false;
    if (!first) sb.append(", ");
    sb.append("atime:");
    sb.append(this.atime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("mtime:");
    sb.append(this.mtime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("perms:");
    sb.append(this.perms);
    first = false;
    if (!first) sb.append(", ");
    sb.append("owner:");
    if (this.owner == null) {
      sb.append("null");
    } else {
      sb.append(this.owner);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("group:");
    if (this.group == null) {
      sb.append("null");
    } else {
      sb.append(this.group);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("length:");
    sb.append(this.length);
    first = false;
    if (!first) sb.append(", ");
    sb.append("blockSize:");
    sb.append(this.blockSize);
    first = false;
    if (!first) sb.append(", ");
    sb.append("replication:");
    sb.append(this.replication);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

