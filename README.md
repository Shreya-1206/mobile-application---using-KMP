This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


# Kotlin Multiplatform Mobile App

This is a Kotlin Multiplatform Mobile (KMP) project. The following instructions will help you set up and run the project locally on your machine.

## Prerequisites

Make sure you have the following tools installed:

- **Java Development Kit (JDK)**: Version 11 or higher.
- **Android Studio**: With Kotlin Multiplatform support.
- **Xcode**: For iOS development (macOS only).
- **Kotlin Multiplatform Mobile (KMM) Plugin**: Installed in Android Studio.
- **CocoaPods**: Required for iOS dependencies, if you're using it.

## Cloning the Repository

Clone the repository to your local machine:

```bash
git clone <your-repo-url>
cd <your-repo-directory>

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…