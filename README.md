<h1 align="center">Android Developer Roadmap</h1></br>

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="https://github.com/skydoves/android-developer-roadmap/actions/workflows/build.yml"><img alt="Build Status" src="https://github.com/skydoves/android-developer-roadmap/actions/workflows/build.yml/badge.svg"/></a>
  <a href="https://mailchi.mp/kotlinweekly/kotlin-weekly-279"><img alt="Kotlin Weekly" src="https://skydoves.github.io/badges/kotlin-weekly2.svg"/></a>
  <a href="https://github.com/skydoves"><img alt="Profile" src="https://skydoves.github.io/badges/skydoves.svg"/></a>
  <a href="https://github.com/doveletter"><img alt="Profile" src="https://skydoves.github.io/badges/dove-letter.svg"/></a>
</p>
<p align="center">
<a href="/README_AR.md" target="_blank"> Arabic </a> | <a href="/README.md" target="_blank"> English </a> | <a href="/README_KR.md" target="_blank"> 한국어 </a> | <a href="/README_DE.md" target="_blank"> Deutsch </a>| <a href="/README_ES.md" target="_blank"> Español</a> | <a href="/README_TR.md" target="_blank"> Turkish</a> | <a href="/README_ID.md" target="_blank"> Bahasa Indonesia</a> | <a href="/README_FR.md" target="_blank"> Français</a> | <a href="/README_PT.md" target="_blank"> Portuguese</a> | <a href="/README_KHM.md" target="_blank">ភាសាខ្មែរ</a> | <a href="/README_VI.md" target="_blank">Vietnamese</a> | <a href="/README_CN.md" target="_blank">中文</a> | <a href="/README_JP.md" target="_blank">日本語</a> | <a href="/README_FA.md" target="_blank">فارسی</a> | <a href="/README_TH.md" target="_blank">ภาษาไทย</a> | <a href="/README_IT.md" target="_blank">Italiano</a>| <a href="/README_BD.md" target="_blank">Bengali</a>
</p>

Android Developer Roadmap suggests learning paths to understanding Android development. You can read the roadmap following the line path in the middle of the map. <br>

Each node indicates concepts of Android systems, Android SDK, and generally used libraries. It would be helpful to refer to the [Android Developers Reference](https://developer.android.com/reference) or GitHub for the specific terminologies. <br>

In addition, **you don't need to learn everything from this roadmap**. So we recommend only reading the sections that would be helpful to you.

## 🗺 Roadmap

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="images/android_developer_roadmap_dark.png">
  <img alt="Roadmap" src="images/android_developer_roadmap.png">
</picture>


  ##  Content list 
- - [ ]   **Application Fundamentals**  
  - - [ ]    Languages  
      - - [ ]    Kotlin  
      - - [ ]    Java  
      - - [ ]    C++ (JNI)  
  - - [ ]    Android Package  
      - - [ ]    APK  
      - - [ ]    AAB  
- - [ ]    **Android Operating System**  
  - - [ ]    Multi-User Linux  
  - - [ ]    File Permissions  
  - - [ ]    Resource Isolations  
  - - [ ]    Process Management  
- - [ ]    **Android Platform Architecture**  
  - - [ ]    The Linux Kernel  
  - - [ ]    Hardware Abstraction Layer  
  - - [ ]    Android Runtime  
  - - [ ]    Native Libraries  
  - - [ ]    Java API Framework  
  - - [ ]    System Apps  
- - [ ]    **App Manifest**  
  - - [ ]    Package  
  - - [ ]    Application ID  
- - [ ]    **App Components**  
  - - [ ]    Activity (detailed later)  
  - - [ ]    Service  
  - - [ ]    Broadcast Receiver  
  - - [ ]    Content Provider  
  - - [ ]    Intent  
      - - [ ]    Intent Filters  
      - - [ ]    Explicit Intents  
      - - [ ]    Implicit Intents  
- - [ ]    **App Architecture**  
- - [ ]    **App Entry Points**  
  - - [ ]    Activities  
      - - [ ]    Activity Lifecycles  
      - - [ ]    Activity State Changes  
      - - [ ]    Task and Back Stack  
      - - [ ]    Parcelables and Bundles  
  - - [ ]    App Shortcuts  
- - [ ]    **App Navigation**  
  - - [ ]    Navigation Component  
      - - [ ]    Navigation Graph  
      - - [ ]    Global Actions  
      - - [ ]    Destinations  
      - - [ ]    DeepLink  
  - - [ ]    Fragments  
      - - [ ]    DialogFragment  
      - - [ ]    BottomSheetDialogFragment  
      - - [ ]    Fragment Lifecycles  
      - - [ ]    Fragment State Changes  
      - - [ ]    Fragment Manager  
      - - [ ]    Fragment Transactions  
  - - [ ]    App Links  
      - - [ ]    TabLayout  
      - - [ ]    ViewPager  
      - - [ ]    ViewPager2  
      - - [ ]    Custom Back Navigation  
- - [ ]    **App Startup**  
- - [ ]    **Dependency Injection** (detailed later)  
- - [ ]    **Architecture Components**  
  - - [ ]    UI Layer  
      - - [ ]    ViewBinding  
      - - [ ]    DataBinding  
      - - [ ]    Lifecycle  
      - - [ ]    ViewModel  
      - - [ ]    LiveData  
      - - [ ]    Paging  
  - - [ ]    Data Layer  
      - - [ ]    Data Store  
      - - [ ]    WorkManager  
- - [ ]    **Design Patterns**  
  - - [ ]    Builder Pattern  
  - - [ ]    Factory Pattern  
  - - [ ]    Dependency Injection  
      - - [ ]    Dagger  
      - - [ ]    Hilt  
      - - [ ]    Koin  
      - - [ ]    Kodein  
  - - [ ]    Repository Pattern  
  - - [ ]    Observer Pattern  
      - - [ ]    Flow  
      - - [ ]    RxJava/RxKotlin  
      - - [ ]    LiveData  
- - [ ]    **Architecture**  
  - - [ ]    MVVM  
  - - [ ]    MVP  
  - - [ ]    MVI  
  - - [ ]    MVC  
  - - [ ]    Clean Architecture  
- - [ ]    **Network**  
  - - [ ]    OkHttp  
      - - [ ]    Interceptor  
  - - [ ]    Okio  
  - - [ ]    Retrofit  
  - - [ ]    Ktor  
  - - [ ]    Volley  
  - - [ ]    Apollo-Android  
- - [ ]    **Image Loading**  
  - - [ ]    Glide  
  - - [ ]    Fresco  
  - - [ ]    Coil  
  - - [ ]    Picasso  
- - [ ]    **Local Storage**  
  - - [ ]    SQLite  
      - - [ ]    SQLDelight  
      - - [ ]    Room  
  - - [ ]    DataStore  
  - - [ ]    Realm  
  - - [ ]    SharedPreferences  
- - [ ]    **Asynchronous**  
  - - [ ]    Coroutines  
  - - [ ]    RxJava/RxKotlin  
  - - [ ]    Thread  
  - - [ ]    WorkManager  
- - [ ]    **User Interface**  
  - - [ ]    Layouts  
      - - [ ]    ConstraintLayout  
      - - [ ]    MotionLayout  
      - - [ ]    LinearLayout  
      - - [ ]    FrameLayout  
      - - [ ]    Material  
      - - [ ]    RecyclerView  
  - - [ ]    Design Guides  
      - - [ ]    Material  
      - - [ ]    Material You  
      - - [ ]    Neumorphism  
  - - [ ]    Styles  
      - - [ ]    Light Theme  
      - - [ ]    Dark Theme  
  - - [ ]    Message  
      - - [ ]    Toast  
      - - [ ]    Snackbar  
      - - [ ]    Notification  
  - - [ ]    Animation  
      - - [ ]    ValueAnimator  
      - - [ ]    ObjectAnimator  
      - - [ ]    Lottie  
      - - [ ]    Material Motion  
- - [ ]    **Compose UI:**  
  - - [ ]    Recomposition  
      - - [ ]    Snapshot  
  - - [ ]    State:  
      - - [ ]    State Hoisting  
          - - [ ]    MutableState  
          - - [ ]    remember  
          - - [ ]    rememberSaveable  
  - - [ ]    Side-Effects:  
      - - [ ]    LaunchedEffect  
      - - [ ]    DisposableEffect  
      - - [ ]    produceState  
      - - [ ]    derivedStateOf  
      - - [ ]    snapshotFlow  
  - - [ ]    Theming:  
      - - [ ]    Material  
          - - [ ]    Color  
          - - [ ]    Typography  
          - - [ ]    Shape  
      - - [ ]    Custom  
          - - [ ]    Dimens  
          - - [ ]    Factories  
          - - [ ]    Data  
  - - [ ]    Modifier:  
      - - [ ]    Modifier Order  
      - - [ ]    Chaining  
      - - [ ]    Composed Modifier  
  - - [ ]    Layout:  
      - - [ ]    Column  
      - - [ ]    Box  
      - - [ ]    Row  
      - - [ ]    ConstraintLayout  
  - - [ ]    List:  
      - - [ ]    LazyColumn  
      - - [ ]    LazyRow  
      - - [ ]    LazyVerticalGrid  
      - - [ ]    LazyPagingItems  
  - - [ ]    Image:  
      - - [ ]    Icon  
      - - [ ]    Image  
          - - [ ]    coil-compose  
          - - [ ]    Landscapist  
  - - [ ]    Text:  
      - - [ ]    TextField  
      - - [ ]    OutlinedTextField  
      - - [ ]    ClickableText  
  - - [ ]    Graphics:  
      - - [ ]    Surface  
      - - [ ]    Canvas  
  - - [ ]    Gestures:  
      - - [ ]    Scrolling  
      - - [ ]    Dragging  
      - - [ ]    Swiping  
      - - [ ]    Zooming  
  - - [ ]    Animation:  
      - - [ ]    AnimatedVisibility  
      - - [ ]    AnimatedContent  
      - - [ ]    Crossfade  
      - - [ ]    rememberInfiniteTransition  
      - - [ ]    animateContentSize  
      - - [ ]    updateTransition  
      - - [ ]    animate*AsState  
      - - [ ]    AnimationState  
      - - [ ]    animate  
      - - [ ]    Animatable  
      - - [ ]    Animation  
  - - [ ]    CompositionLocal:  
      - - [ ]    CompositionLocalProvider  
      - - [ ]    compositionLocalOf  
      - - [ ]    staticCompositionLocalOf  
- - [ ]  **Service:**  
  - - [ ]    Google:  
      - - [ ]    Google Play Services  
      - - [ ]    Google Maps  
  - - [ ]    Firebase:  
      - - [ ]    Authentication  
      - - [ ]    Crashlytics  
      - - [ ]    Remote Config  
      - - [ ]    Cloud Messaging  
      - - [ ]    FiresStore  
      - - [ ]    Realtime Database  
  - - [ ]   Advertisements:  
 	  - - [ ]    Google AdMob  
	  - - [ ]    Meta Audience Network  
	  - - [ ]    MoPub  
 - - [ ]  **Code Analysis & Testing**:  
	- - [ ]    Linter:  
	  - - [ ]    Ktlint  
	  - - [ ]    Detekt  
	  - - [ ]    Android Lint  
	- - [ ]    Debugging:  
	  - - [ ]    Timber  
	  - - [ ]    LeakCanary  
	  - - [ ]    Stetho  
	  - - [ ]    Chucker  
	- - [ ]    Unit Testing:  
	  - - [ ]    Unit Test:  
	      - - [ ]    JUnit  
	      - - [ ]    Kluent  
	      - - [ ]    Mockk  
	  - - [ ]    Android Test:  
	      - - [ ]    Robolectric  
	      - - [ ]    Espresso  
	      - - [ ]    Kaspresso  
	- - [ ]    Benchmark  
- - [ ]  **CI/CD**:  
  - - [ ]    GitHub Actions  
  - - [ ]    Jenkins  
  - - [ ]    Travis CI  
  - - [ ]    Circle CI  
  - - [ ]    Bitrise  
- - [ ]  **QA & App Publishing**:  
  - - [ ]    Firebase App Distribution  
  - - [ ]    Google Play

## ✍️ Articles

<a href="https://getstream.io/blog/android-developer-roadmap/"><img src="images/article.png" /></a><br>

The Android Developer Roadmap is designed to give you a comprehensive understanding of the current Android ecosystem and provides suggested learning paths along the way to help you grasp the concepts.<br>

In this multipart series, you'll learn all about the Android development ecosystem following our Android Developer Roadmap, giving you a more holistic view of the Android community and how you can progress as a developer.

- **[The Android Platform: The 2022 Android Developer Roadmap – Part 1](https://getstream.io/blog/android-developer-roadmap?utm_source=Github&utm_medium=Jaewoong_OSS&utm_content=Developer&utm_campaign=Github_Dec2024_AndroidDeveloperRoadmap&utm_term=DevRelOss)**
- **[App Components: The Android Developer Roadmap – Part 2](https://getstream.io/blog/android-developer-roadmap-part-2?utm_source=Github&utm_medium=Jaewoong_OSS&utm_content=Developer&utm_campaign=Github_Dec2024_AndroidDeveloperRoadmap&utm_term=DevRelOss)**
- **[App Navigation and Jetpack: The Android Developer Roadmap – Part 3](https://getstream.io/blog/android-developer-roadmap-part-3?utm_source=Github&utm_medium=Jaewoong_OSS&utm_content=Developer&utm_campaign=Github_Dec2024_AndroidDeveloperRoadmap&utm_term=DevRelOss)**
- **[Design Patterns and Architecture: The Android Developer Roadmap – Part 4](https://getstream.io/blog/design-patterns-and-architecture-the-android-developer-roadmap-part-4?utm_source=Github&utm_medium=Jaewoong_OSS&utm_content=Developer&utm_campaign=Github_Dec2024_AndroidDeveloperRoadmap&utm_term=DevRelOss)**
- **[Jetpack Compose: The Android Developer Roadmap – Part 5](https://getstream.io/blog/android-developer-roadmap-part-5?utm_source=Github&utm_medium=Jaewoong_OSS&utm_content=Developer&utm_campaign=Github_Dec2024_AndroidDeveloperRoadmap&utm_term=DevRelOss)**

If you'd like to get notified as we release future posts, join the **[watchers](https://github.com/skydoves/android-developer-roadmap/watchers)** on GitHub or follow **[Stream](https://twitter.com/getstream_io)** on Twitter. You can also follow the __[author](https://github.com/skydoves)__ of this repository on GitHub.

<a href="https://github.com/doveletter">
<img src="https://github.com/user-attachments/assets/b1c938ec-1bfa-4e01-9c81-bcd67f926f63" width="13%" align="right"/>
</a>

## 🕊️ Dove Letter

If you're eager to dive deeper into Kotlin and Android, explore [Dove Letter](https://github.com/doveletter), a private subscription repository where you can learn, discuss, and share knowledge. To get more details about this unique opportunity, check out the [Learn Kotlin and Android With Dove Letter](https://medium.com/@skydoves/learn-kotlin-and-android-with-dove-letter-26265da11903) article.

<a href="https://getstream.io/tutorials/android-chat?utm_source=Github&utm_medium=Jaewoong_OSS&utm_content=Developer&utm_campaign=2022AndroidDeveloperRoadmap&utm_term=DevRelOss">
<img src="https://user-images.githubusercontent.com/24237865/138428440-b92e5fb7-89f8-41aa-96b1-71a5486c5849.png" align="right" width="12%"/>
</a>

## ⛴ Stream

If you're interested in building a robust chat, video/audio calls, or livestreaming feature, which is an easy-to-use, open-sourced, Kotlin-first, actively maintained, check out the __[Stream Chat for Android](https://getstream.io/tutorials/android-chat?utm_source=Github&utm_medium=Jaewoong_OSS&utm_content=Developer&utm_campaign=2022AndroidDeveloperRoadmap&utm_term=DevRelOss)__ and __[Stream Video SDK for Compose](https://getstream.io/video/sdk/android/tutorial/video-calling?utm_source=Github&utm_medium=Jaewoong_OSS&utm_content=Developer&utm_campaign=2022AndroidDeveloperRoadmap&utm_term=DevRelOss)__.

## 📱 Demo Application

This project includes a demo project which shows the roadmap image. You can download the latest APK on the [Releases](https://github.com/skydoves/android-developer-roadmap/releases).
  
## 🤝 Contribution

This project doesn't cover everything, so if something is missing or should be fixed, anyone can contribute to this project by following the [CONTRIBUTING](CONTRIBUTING.md) guides.

## 💡 Inspiration

This project is inspired by [Android Developer Roadmap 2020](https://github.com/mobile-roadmap/android-developer-roadmap). So thank you for the authors providing the roadmap ideas. Also, you can learn a lot of knowledge from the repository.

## Find this project useful? :heart:

Support it by joining __[stargazers](https://github.com/skydoves/android-developer-roadmap/stargazers)__ for this repository. :star: <br>
And __[follow](https://github.com/skydoves)__ me for my next creations! 🤩

## License
```
Copyright 2021 Stream.IO, Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
