<p align="center">
  <img src="https://user-images.githubusercontent.com/46753453/106399898-0190f280-63e1-11eb-9496-93c6e9f17dcc.jpg" />
</p>


The application will work with ```local``` and ```remote``` data sources. And for the remote data source, a ```third-party API``` for food recipes, called ```Spoonacular```, was used. I am going to teach you how to establish a connection between your application and the server. So basically we will send a ```GET request``` to our ```API ``` and receive a list of food recipes as a response. Also, the application will not be able to handle any internet connection and store or cache the data locally in the database when needed.

Also from the application we can search recipes directly from our API. So if you have your favorite flavor, you can search for it here and you will probably find a lot of amazing recipes. It will also have Favorites Fragment where we can save our favorite recipes to use later when we need them. And finally the app will have its fun side, and that's a food joke snippet.

## Built with 🛠

- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
  - [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - Generates a binding class for each XML layout file present in that module and allows you to more easily write code that interacts with views.
  - [Room](https://developer.android.com/topic/libraries/architecture/room) - SQLite object mapping library.
 - [Navigation Component](https://developer.android.com/guide/navigation/navigation-getting-started) Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content within your app.
    - [Safe args](https://developer.android.com/guide/navigation/navigation-pass-data#Safe-args) - Gradle plugin that provides type safety when navigating and passing data between destinations. 
- [Jetpack Security](https://developer.android.com/topic/security/)
    - [Encrypted SharedPreference](https://developer.android.com/topic/security/data) - Used to store key-value data using encryption.
- [DataStore](https://developer.android.com/topic/libraries/architecture/datastore) - Jetpack DataStore is a data storage solution that allows you to store key-value pairs or typed objects with protocol buffers.
- [Dependency Injection](https://developer.android.com/training/dependency-injection) - 
  - [Hilt-Dagger](https://dagger.dev/hilt/) - Standard library to incorporate Dagger dependency injection into an Android application.
  - [Hilt-ViewModel](https://developer.android.com/training/dependency-injection/hilt-jetpack) - DI for injecting `ViewModel`.
- [Retrofit 2](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [GSON Converter](https://github.com/square/retrofit/tree/master/retrofit-converters/gson) - A Converter which uses Gson for serialization to and from JSON.
- [Material Components for Android](https://github.com/material-components/material-components-android) - Modular and customizable Material Design UI components for Android.


## Architecture

This app uses [***MVVM (Model View View-Model)***](https://developer.android.com/jetpack/docs/guide#recommended-app-arch) architecture.

![ANDROID ROOM DB DIAGRAM](https://user-images.githubusercontent.com/46753453/134743519-83e2395d-3902-4683-96f4-0f06dbf8de77.jpg)

## Contact
Have an project? DM me at 👇

Drop a mail to:- maikolsoro.z1998@gmail.com


### Code Standards
 - Write code and comments in english
 - Try to follow android patterns and best practice [source 1] [best_practice] [source 2] [performace_android]

### Contributing
1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request and enjoy! :D


#  Foody ❤️
🌞 Light Mode
<table style="width:100%">
  <tr>
    <th>1. Splash Screen </th>
    <th>2. Recipes Screen </th> 
    <th>3. Meal Type </th>
    <th>4. Favorites Screen </th> 
    <th>5. Details Screen </th> 
    <th>6. Food Joke  </th> 
  </tr>
  <tr>
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676592-5f7f3a83-3937-4381-8c78-50179993a315.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676545-7c661447-55ab-4f99-ac48-3a3cb264aff3.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676559-11c72c31-c8f7-412b-9ec2-3bd9991b791a.png" /></td>
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676565-e2b1479c-4f40-46c3-b03f-0777497d173e.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676569-1465bf4a-b10e-4036-a6cd-3740dc8fbe0d.png"/></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676570-f0747940-3521-44ec-a795-bd8159e534bf.png"/></td> 
  </tr>
</table>

🌙 Dark Mode
<table style="width:100%">
  <tr>
    <th>1. Recipes Screen </th> 
    <th>2. Meal Type </th>
    <th>3. Favorites Screen </th> 
    <th>4. Details Screen </th> 
    <th>5. Food Joke  </th> 
    <th>6. Ingredients </th> 
    <th>7. Instructions  </th> 
  </tr>
  <tr>
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676686-8c9173ac-cc62-4a7b-b7b2-666e0e69bf44.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676703-f2248a7e-10b7-4495-99ae-8dffd5c5dcab.png" /></td>
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676710-4266e6e6-2522-4043-bd64-4e4fb8fbe29c.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676712-aacc9839-b92a-4d26-a94c-7cc5cca83a10.png"/></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676718-7778aac7-de41-42cb-b3a5-d8d455a68f13.png" /></td> 
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676726-849ab6d6-5fd6-4b74-a79d-c8770e6e487e.png" /></td>
    <td><img src = "https://user-images.githubusercontent.com/46753453/136676740-1a163ffc-62e3-4491-a814-4a115d609f30.png" /></td> 
  </tr>
</table>

[best_practice]: <https://www.youtube.com/playlist?list=PLWz5rJ2EKKc-lJo_RGGXL2Psr8vVCTWjM>
[performace_android]: <https://www.youtube.com/playlist?list=PLWz5rJ2EKKc9CBxr3BVjPTPoDPLdPIFCE>

### 🔖 License
```
MIT License

Copyright (c) 2021 Michael Soro Zúñiga

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
