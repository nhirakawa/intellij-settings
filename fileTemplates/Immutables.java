#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.immutables.value.Value;

import com.hubspot.immutables.styles.HubSpotStyle;

@Value.Immutable
@HubSpotStyle
public interface ${NAME}IF {

  @Value.Default  // doesn't need to be explicitly set in builder
  default int getWhatsit() {
    return 1;
  }

  @Value.Derived  // set on build after all other attributes set
  default int getWhosit() {
    return getWhatsit()*2;
  }

  @Value.Auxiliary   // this instance of the method is called every time it is used.
  default int getThingyMadoody() {
    return getWhosit()*3;
  }

  @Value.Lazy   // set only when called and excluded from hashcode,equals,toString
  default int getThingyMajig() {
    return getThingyMadoody()*4;
  }

  @Value.Check
  default void check() {
    Preconditions.checkState(getSomething().makeSense(), "something must something");
  }
}