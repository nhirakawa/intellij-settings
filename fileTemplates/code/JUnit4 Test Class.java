import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
#parse("File Header.java")
public class ${NAME} {

  @Test
  public void itWillPass() {
    assertThat(true).isTrue();
  }
  ${BODY}
}