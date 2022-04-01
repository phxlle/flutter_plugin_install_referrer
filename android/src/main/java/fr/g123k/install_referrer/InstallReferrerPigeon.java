// Autogenerated from Pigeon (v2.0.2), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package fr.g123k.install_referrer;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class InstallReferrerPigeon {

  public enum IRInstallationType {
    appStore(0),
    test(1),
    debug(2),
    unknown(3);

    private int index;
    private IRInstallationType(final int index) {
      this.index = index;
    }
  }

  public enum IRInstallationPlatform {
    appleAppStore(0),
    appleTestflight(1),
    googlePlay(2),
    amazonAppStore(3),
    huaweiAppGallery(4),
    samsungAppShop(5),
    manually(6),
    unknown(7);

    private int index;
    private IRInstallationPlatform(final int index) {
      this.index = index;
    }
  }

  public enum IRPlatform {
    ios(0),
    android(1);

    private int index;
    private IRPlatform(final int index) {
      this.index = index;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class IRInstallationReferer {
    private @Nullable IRInstallationType type;
    public @Nullable IRInstallationType getType() { return type; }
    public void setType(@Nullable IRInstallationType setterArg) {
      this.type = setterArg;
    }

    private @Nullable IRInstallationPlatform installationPlatform;
    public @Nullable IRInstallationPlatform getInstallationPlatform() { return installationPlatform; }
    public void setInstallationPlatform(@Nullable IRInstallationPlatform setterArg) {
      this.installationPlatform = setterArg;
    }

    private @Nullable IRPlatform platform;
    public @Nullable IRPlatform getPlatform() { return platform; }
    public void setPlatform(@Nullable IRPlatform setterArg) {
      this.platform = setterArg;
    }

    private @Nullable String packageName;
    public @Nullable String getPackageName() { return packageName; }
    public void setPackageName(@Nullable String setterArg) {
      this.packageName = setterArg;
    }

    public static class Builder {
      private @Nullable IRInstallationType type;
      public @NonNull Builder setType(@Nullable IRInstallationType setterArg) {
        this.type = setterArg;
        return this;
      }
      private @Nullable IRInstallationPlatform installationPlatform;
      public @NonNull Builder setInstallationPlatform(@Nullable IRInstallationPlatform setterArg) {
        this.installationPlatform = setterArg;
        return this;
      }
      private @Nullable IRPlatform platform;
      public @NonNull Builder setPlatform(@Nullable IRPlatform setterArg) {
        this.platform = setterArg;
        return this;
      }
      private @Nullable String packageName;
      public @NonNull Builder setPackageName(@Nullable String setterArg) {
        this.packageName = setterArg;
        return this;
      }
      public @NonNull IRInstallationReferer build() {
        IRInstallationReferer pigeonReturn = new IRInstallationReferer();
        pigeonReturn.setType(type);
        pigeonReturn.setInstallationPlatform(installationPlatform);
        pigeonReturn.setPlatform(platform);
        pigeonReturn.setPackageName(packageName);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("type", type == null ? null : type.index);
      toMapResult.put("installationPlatform", installationPlatform == null ? null : installationPlatform.index);
      toMapResult.put("platform", platform == null ? null : platform.index);
      toMapResult.put("packageName", packageName);
      return toMapResult;
    }
    static @NonNull IRInstallationReferer fromMap(@NonNull Map<String, Object> map) {
      IRInstallationReferer pigeonResult = new IRInstallationReferer();
      Object type = map.get("type");
      pigeonResult.setType(type == null ? null : IRInstallationType.values()[(int)type]);
      Object installationPlatform = map.get("installationPlatform");
      pigeonResult.setInstallationPlatform(installationPlatform == null ? null : IRInstallationPlatform.values()[(int)installationPlatform]);
      Object platform = map.get("platform");
      pigeonResult.setPlatform(platform == null ? null : IRPlatform.values()[(int)platform]);
      Object packageName = map.get("packageName");
      pigeonResult.setPackageName((String)packageName);
      return pigeonResult;
    }
  }

  public interface Result<T> {
    void success(T result);
    void error(Throwable error);
  }
  private static class InstallReferrerInternalAPICodec extends StandardMessageCodec {
    public static final InstallReferrerInternalAPICodec INSTANCE = new InstallReferrerInternalAPICodec();
    private InstallReferrerInternalAPICodec() {}
    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return IRInstallationReferer.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value)     {
      if (value instanceof IRInstallationReferer) {
        stream.write(128);
        writeValue(stream, ((IRInstallationReferer) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface InstallReferrerInternalAPI {
    void detectReferrer(Result<IRInstallationReferer> result);

    /** The codec used by InstallReferrerInternalAPI. */
    static MessageCodec<Object> getCodec() {
      return InstallReferrerInternalAPICodec.INSTANCE;
    }

    /** Sets up an instance of `InstallReferrerInternalAPI` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, InstallReferrerInternalAPI api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.InstallReferrerInternalAPI.detectReferrer", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Result<IRInstallationReferer> resultCallback = new Result<IRInstallationReferer>() {
                public void success(IRInstallationReferer result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.detectReferrer(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}
