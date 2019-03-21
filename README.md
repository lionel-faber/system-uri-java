# system-uri-java

Java bindings for the [system_uri](https://crates.io/crates/system_uri) rust crate using [jnr-ffi](https://github.com/jnr/jnr-ffi).

This library provides an API to register a custom URL protocol for an application on all desktop platforms. This can be used to open any application from a URL, optionally sending data via the url itself by passing it as an argument. 

For example, a music player application can register `mplayer` as a custom protocol and any url opened with that protocol will open the music player application.

 For implementation details refer the [maidsafe/system_uri repository](https://github.com/maidsafe/system_uri).

## Build instructions

#### Pre-requsites
- Gradle 4+
- Java 8

To build the jar file:

Get started by cloning the repository:
```bash
git clone https://github.com/lionel1704/system-uri-java
cd system-uri-java
```
Download the required native libraries and build the jar.
```bash
gradlew download-nativelibs
gradlew jar
```
_Note: Use gradlew.bat on windows_

The jar will be created in the `build/libs` folder.

