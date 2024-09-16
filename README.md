# KMP Demo
This is a Kotlin Multiplatform project targeting Android, iOS, Web, Desktop(partially).

## KMP Setup
- JDK (recommended JDK 17)
- [Android studio](https://developer.android.com/studio) with
[KMP plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform) installed.
Another option could be [fleet IDE](https://www.jetbrains.com/fleet/) from jetbrains for
polyglot programming (Swift, Kotlin and JS)
- [Xcode](https://developer.apple.com/xcode/) for iOS/Mac app development
- [kdoctor](https://github.com/Kotlin/kdoctor) for verifying if environment setup is complete.
Note that its not a hard requirement to have XCode installed. But to run the 
app in iOS simulator, its required.
CocoaPods is optional but a nice to have when few swift dependencies needs to be imported
![kdoctor.png](docs%2Fimages%2Fkdoctor.png)

Minimum setup with jdk and android studio with kmp plugin is required
to be able to at-least run android app

## Demo Screenshots

### Hello world
![hello-world.png](docs%2Fimages%2Fhello-world.png)
![hello-world-with-graphics.png](docs%2Fimages%2Fhello-world-with-graphics.png)

### Import a resource (VW logo) and display it
![hello-world-with-vw-logo.png](docs%2Fimages%2Fhello-world-with-vw-logo.png)

### Use a library in KMP (DateTime)
![kotlinx-datetime-lib.png](docs%2Fimages%2Fkotlinx-datetime-lib.png)

### Use third party API (Open Meteo Weather API) to display current temperature and wind speed
Weather implementation is in weather-data git branch
![weather-api.png](docs%2Fimages%2Fweather-api.png)

## KMP Project structure

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform,
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
[Kotlin/Wasm](https://kotl.in/wasm/)
You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle task.

## Links
- [Logo](https://upload.wikimedia.org/wikipedia/commons/6/6d/Volkswagen_logo_2019.svg)
- [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
- [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
- [Kotlin/Wasm](https://kotl.in/wasm/)
- [Weather api](https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current_weather=true&timezone=Europe%2FBerlin)