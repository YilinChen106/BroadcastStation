> [!NOTE]
> this project is a **fork** of [syncmeow](https://github.com/RoootTheFox/syncmeow)
>
> This project is used to create a one-way broadcast client for anonymized and decentralized information dissemination.


# Broadcast Station

[![License: MPLv2](https://img.shields.io/badge/License-MPLv2-blue.svg)](https://opensource.org/licenses/MPL-2.0)

A personalized one - way sync client based on [Syncthing](https://github.com/syncthing/syncthing) for Android.

## Dependencies

1. Android SDK and NDK

2. Go (see https://docs.syncthing.net/dev/building#prerequisites for the
   required version)
3. Java version 17 (if not present in ``$PATH``, you might need to set
   ``$JAVA_HOME`` accordingly)
4. Python version 3

## Build instructions for Windows using Android Studio

### 1. Clone the project
Open the Command Prompt and run the following command to clone the project recursively:
```
git clone https://github.com/YilinChen106/BroadcastStation.git --recursive
```
If the project is already on your disk, navigate to the project folder in the Command Prompt and run:
```
git submodule init && git submodule update
```

### 2. Install and configure Go
- Install Go.
- After installation, add the Go binary directory to the `PATH` environment variable.

### 3. Install and configure Java
- Install JDK 17.
- Set the `JAVA_HOME` environment variable to the JDK installation directory (e.g., `C:\Program Files\Java\jdk - 17`).
- Add the `%JAVA_HOME%\bin` directory to the `PATH` environment variable.

### 4. Install and configure Android SDK and NDK
#### 4.1 Open Android Studio
Launch Android Studio and open your project if it's not already open.

#### 4.2 Open SDK Manager
After opening the project, click `Tools` > `SDK Manager`.

#### 4.3 Install SDK and NDK
- Normally, the SDK is already installed along with Android Studio.
- Switch to the `SDK Tools` tab. Here, check the box next to `NDK (Side by side)` to install the NDK. Then click `Apply`.
- Wait for the installation to complete. Once finished, click `Finish`.

#### 4.4 Configure environment variables
- Set the `ANDROID_HOME` environment variable to the path of the Android SDK folder. You can usually find it in the `AppData\Local\Android\Sdk` directory under your user profile.
- Set the `ANDROID_NDK_HOME` environment variable to the path of the Android NDK folder.

#### 4.5 Run App
- Click Run Button.

# License

The project is licensed under the [MPLv2](LICENSE).
