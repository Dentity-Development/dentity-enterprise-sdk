package trinsic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GrpcExceptionTest {

  @Test
  void assertSuccessfulResponse() {
    Assertions.assertDoesNotThrow(
        () -> GrpcException.assertSuccessfulResponse(0, "This should fail"));
    Assertions.assertThrows(
        GrpcException.class, () -> GrpcException.assertSuccessfulResponse(1, "This should fail"));
  }
}
