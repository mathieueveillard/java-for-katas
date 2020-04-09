import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanTest {
  private final Roman roman = new Roman();

  @Test
  void one() {
    assertThat(roman.roman(1)).isEqualTo("I");
  }

}
