# Android Sample Application

The Trinsic Android sample application makes it easy to interact with the Trinsic API. The sample application is [located here](https://github.com/trinsic-id/sdk-examples/tree/main/android)

## Installation
1. Clone the `sdk-examples` [repository](https://github.com/trinsic-id/sdk-examples)
2. Open the folder `sdk-examples/android` in [Android Studio](https://developer.android.com/studio)
3. Run gradle build for the first time, it will take a while, but it should pull down all the required `.jar` files
4. You should be able to build and run the android application.
5. There is an `sdk-examples/android-controller` application written in Python which allows you to issue credentials/verify proofs outside of the android application for demonstration purposes.

!!! note Jar Download Note

    If you want to included the two required Trinsic `.jar` files in your own application (android or other java), be sure to copy the following lines. They allow you to specify a remote file location as a gradle `implementation` target as shown below:

<!--codeinclude-->
```java
[urlFile Sample](../../java/build.gradle) inside_block:urlFileSample
```
<!--/codeinclude-->

```java
dependencies {
    // other dependencies
    implementation urlFile('https://github.com/trinsic-id/sdk/releases/download/v1.10.0/trinsic-services-1.10.0.jar', 'trinsic-services-1.10.0')
}
```


