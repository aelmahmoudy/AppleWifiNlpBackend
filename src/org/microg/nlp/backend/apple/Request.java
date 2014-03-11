// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/apple_loc.proto
package org.microg.nlp.backend.apple;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

public final class Request extends Message {

  public static final List<RequestWifi> DEFAULT_WIFIS = Collections.emptyList();
  public static final Integer DEFAULT_UNKNOWN3 = 0;
  public static final Integer DEFAULT_UNKNOWN4 = 0;
  public static final String DEFAULT_SOURCE = "";

  @ProtoField(tag = 2, label = REPEATED)
  public final List<RequestWifi> wifis;

  @ProtoField(tag = 3, type = INT32)
  public final Integer unknown3;

  @ProtoField(tag = 4, type = INT32)
  public final Integer unknown4;

  @ProtoField(tag = 5, type = STRING)
  public final String source;

  private Request(Builder builder) {
    super(builder);
    this.wifis = immutableCopyOf(builder.wifis);
    this.unknown3 = builder.unknown3;
    this.unknown4 = builder.unknown4;
    this.source = builder.source;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Request)) return false;
    Request o = (Request) other;
    return equals(wifis, o.wifis)
        && equals(unknown3, o.unknown3)
        && equals(unknown4, o.unknown4)
        && equals(source, o.source);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = wifis != null ? wifis.hashCode() : 1;
      result = result * 37 + (unknown3 != null ? unknown3.hashCode() : 0);
      result = result * 37 + (unknown4 != null ? unknown4.hashCode() : 0);
      result = result * 37 + (source != null ? source.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Request> {

    public List<RequestWifi> wifis;
    public Integer unknown3;
    public Integer unknown4;
    public String source;

    public Builder() {
    }

    public Builder(Request message) {
      super(message);
      if (message == null) return;
      this.wifis = copyOf(message.wifis);
      this.unknown3 = message.unknown3;
      this.unknown4 = message.unknown4;
      this.source = message.source;
    }

    public Builder wifis(List<RequestWifi> wifis) {
      this.wifis = wifis;
      return this;
    }

    public Builder unknown3(Integer unknown3) {
      this.unknown3 = unknown3;
      return this;
    }

    public Builder unknown4(Integer unknown4) {
      this.unknown4 = unknown4;
      return this;
    }

    public Builder source(String source) {
      this.source = source;
      return this;
    }

    @Override
    public Request build() {
      return new Request(this);
    }
  }

  public static final class RequestWifi extends Message {

    public static final String DEFAULT_MAC = "";

    @ProtoField(tag = 1, type = STRING)
    public final String mac;

    private RequestWifi(Builder builder) {
      super(builder);
      this.mac = builder.mac;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof RequestWifi)) return false;
      return equals(mac, ((RequestWifi) other).mac);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      return result != 0 ? result : (hashCode = mac != null ? mac.hashCode() : 0);
    }

    public static final class Builder extends Message.Builder<RequestWifi> {

      public String mac;

      public Builder() {
      }

      public Builder(RequestWifi message) {
        super(message);
        if (message == null) return;
        this.mac = message.mac;
      }

      public Builder mac(String mac) {
        this.mac = mac;
        return this;
      }

      @Override
      public RequestWifi build() {
        return new RequestWifi(this);
      }
    }
  }
}
