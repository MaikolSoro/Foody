<p align="center">
  <img src="https://user-images.githubusercontent.com/46753453/106399898-0190f280-63e1-11eb-9496-93c6e9f17dcc.jpg" />
</p>


The application will work with ```local``` and ```remote``` data sources. And for the remote data source, a ```third-party API``` for food recipes, called Spoonacular, was used. I am going to teach you how to establish a connection between your application and the server. So basically we will send a ```GET request``` to our ```API ``` and receive a list of food recipes as a response. Also, the application will not be able to handle any internet connection and store or cache the data locally in the database when needed.

Also from the application we can search recipes directly from our API. So if you have your favorite flavor, you can search for it here and you will probably find a lot of amazing recipes. It will also have Favorites Fragment where we can save our favorite recipes to use later when we need them. And finally the app will have its fun side, and that's a food joke snippet.

## Architecture and Libraries 📰📱
- Model-View-ViewModel (MVVM)
- SQLite
- Kotlin
- Retrofit
- Kotlin Coroutines
- Jetpack components like
  - Data Binding
  - Live Data
  - Room
- Dependency Injection - Dagger-Hilt
- Offline Cache
- Flow
- Navigation 
- RX Java and Android
- OkHttp
- Dark and Light Theme
- Night Mode
- Motion Layout
- Material Design
- ViewPager2
### Code Standards
 - Write code and comments in english
 - Try to follow android patterns and best practice [source 1] [best_practice] [source 2] [performace_android]


### Contributing
1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request and enjoy! :D


#  📷 Review
![68747470733a2f2f692e706f7374696d672e63632f36707430475435342f5468756d626e61696c2d312e706e67](https://user-images.githubusercontent.com/46753453/103448680-a1345700-4c62-11eb-9169-07e321385df2.png)

[best_practice]: <https://www.youtube.com/playlist?list=PLWz5rJ2EKKc-lJo_RGGXL2Psr8vVCTWjM>
[performace_android]: <https://www.youtube.com/playlist?list=PLWz5rJ2EKKc9CBxr3BVjPTPoDPLdPIFCE>

### License
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
